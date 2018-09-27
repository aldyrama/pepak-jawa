package org.d3ifcool.pepakjawa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import org.d3ifcool.pepakjawa.Model.TitleChild;
import org.d3ifcool.pepakjawa.Model.TitleCreator;
import org.d3ifcool.pepakjawa.Model.TitleParent;
import org.d3ifcool.pepakjawa.MyAdapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AksaraJawaActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ha", R.mipmap.ic_ha));
        words.add(new Word("na", R.mipmap.ic_na));
        words.add(new Word("ca", R.mipmap.ic_ca));
        words.add(new Word("ra", R.mipmap.ic_ra));
        words.add(new Word("ka", R.mipmap.ic_ka));
        words.add(new Word("da", R.mipmap.ic_daa));
        words.add(new Word("ta", R.mipmap.ic_ta));
        words.add(new Word("sa", R.mipmap.ic_sa));
        words.add(new Word("wa", R.mipmap.ic_wa));
        words.add(new Word("la", R.mipmap.ic_la));
        words.add(new Word("pa", R.mipmap.ic_pa));
        words.add(new Word("dha", R.mipmap.ic_dha));
        words.add(new Word("ja", R.mipmap.ic_ja));
        words.add(new Word("ya", R.mipmap.ic_ya));
        words.add(new Word("nya", R.mipmap.ic_nya));
        words.add(new Word("ma", R.mipmap.ic_ma));
        words.add(new Word("ga", R.mipmap.ic_ga));
        words.add(new Word("ba", R.mipmap.ic_ba));
        words.add(new Word("tha", R.mipmap.ic_tha));
        words.add(new Word("nga", R.mipmap.ic_nga));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorFlowerDark);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }




}
