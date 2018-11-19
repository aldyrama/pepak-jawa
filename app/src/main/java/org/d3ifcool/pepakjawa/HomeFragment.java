package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Context;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ListView home;
    ArrayList<String> al;
    ArrayAdapter<String> aa;
    Animation bounce;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_home, container, false);
//        home = (ListView) v.findViewById(R.id.list_home);
//        al = new ArrayList<String>();
//        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, al);
//        home.setAdapter(aa);


        //INTENT MATERI PRAMASASTRA
        CardView pramasastra = (CardView) v.findViewById(R.id.paramasastra);
        pramasastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ParamasastraActivity.class);
                startActivity(intent);
                TabButton1();
               getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

            }
        });

        //INTENT MATERI RUPA KAWRUH
        CardView rupakawruh = (CardView) v.findViewById(R.id.rupa_kawruh);
        rupakawruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RupaKawruhActivity.class);
                startActivity(intent);
                TapButton2();
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        //INTENT MATERI KAWRUH BASA
        CardView kawruhbasa = (CardView) v.findViewById(R.id.kawruh_basa);
        kawruhbasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), KawruhBasaActivity.class);
                startActivity(intent);
                TabButton3();
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        //INTENT MATERI KESUSASTRAAN
        CardView kesusastraan = (CardView) v.findViewById(R.id.kasusastra);
        kesusastraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), KesusastraanActivity.class);
                startActivity(intent);
                TabButton4();
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        //INTENT MATERI AKSARA JAWA
        CardView aksarajawa = (CardView) v.findViewById(R.id.aksara);
        aksarajawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AksaraJawaActivity.class);
                startActivity(intent);
                TabButton5();
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        //INTENT MATERI WAYANG
        CardView wayang = (CardView) v.findViewById(R.id.wayang);
        wayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WayangPoin.class);
                startActivity(intent);
                TabButton6();
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });


//        home = (ListView) v.findViewById(R.id.list_home);
//        al = new ArrayList<String>();
//        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, al);
//        home.setAdapter(aa);
//        al.add("Paramasastra");
//        al.add("Rupa Kawruh");
//        al.add("Kawruh Basa");
//        al.add("Kasusastra");
//        al.add("Aksara");
//        al.add("Wayang");
//
//        home.setOnItemClickListener( new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                switch (position){
//                    case 0 :
//                        Intent myinntent = new Intent( view.getContext(),ParamasastraActivity.class );
//                        startActivity( myinntent );
//                        break;
//                    case 1 :
//                        myinntent = new Intent( view.getContext(),RupaKawruhActivity.class );
//                        startActivity( myinntent );
//                        break;
//                    case 2 :
//                        myinntent = new Intent( view.getContext(),KawruhBasaActivity.class );
//                        startActivity( myinntent );
//                        break;
//                    case 3 :
//                        myinntent = new Intent( view.getContext(),KesusastraanActivity.class );
//                        startActivity( myinntent );
//                        break;
//                    case 4 :
//                        myinntent = new Intent( view.getContext(),AksaraJawaActivity.class );
//                        startActivity( myinntent );
//                        break;
//                    case 5 :
//                        myinntent = new Intent( view.getContext(),WayangPoin.class );
//                        startActivity( myinntent );
//                        break;
//
//                }
//            }
//        } );
        return v;

    }

    private void TabButton6() {
        CardView wayang = (CardView) getView().findViewById(R.id.wayang);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        wayang.startAnimation(myAnim);
    }

    private void TabButton5() {
        CardView aksara = (CardView) getView().findViewById(R.id.aksara);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        aksara.startAnimation(myAnim);
    }

    private void TabButton4() {
        CardView kesusastraan = (CardView) getView().findViewById(R.id.kasusastra);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        kesusastraan.startAnimation(myAnim);
    }

    private void TabButton3() {
        CardView kawruhbasa = (CardView) getView().findViewById(R.id.kawruh_basa);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        kawruhbasa.startAnimation(myAnim);
    }

    private void TapButton2() {
        CardView rupakawruh = (CardView) getView().findViewById(R.id.rupa_kawruh);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        rupakawruh.startAnimation(myAnim);
    }

    private void TabButton1() {
        CardView pramasastra = (CardView) getView().findViewById(R.id.paramasastra);
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        pramasastra.startAnimation(myAnim);
    }

}
