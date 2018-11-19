package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class KamusFragment extends Fragment {
    ListView kamus;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_kamus, container, false);
        kamus = (ListView) v.findViewById(R.id.list_kamus);
        al = new ArrayList<String>();
        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, al);
        kamus.setAdapter(aa);
        al.add("Indonesia ke Jawa");
        al.add("Jawa ke Indonesia");

        kamus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        Intent myinntent = new Intent(view.getContext(), IndonesiaJawaActivity.class);
                        startActivity(myinntent);
                        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                    case 1:
                        myinntent = new Intent(view.getContext(), JawaIndonesiaActivity.class);
                        startActivity(myinntent);
                        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                }
            }
        });
        return v;
    }
}
