package org.d3ifcool.pepakjawa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import org.d3ifcool.pepakjawa.Model.TitleChild;
import org.d3ifcool.pepakjawa.Model.TitleCreator;
import org.d3ifcool.pepakjawa.Model.TitleParent;
import org.d3ifcool.pepakjawa.MyAdapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class WayangActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((Adapter)recyclerView.getAdapter()).onSaveInstanceState(outState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wayang);

     //RECYCLERVIEW
    recyclerView = (RecyclerView)findViewById(R.id.rupaRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    Adapter adapter = new Adapter(this,initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
}

    private List<ParentObject> initData() {
        TitleCreator titleCreator = TitleCreator.get(this);
        List<TitleParent> titles = titleCreator.getAll();
        List<ParentObject> parentObject = new ArrayList<>();
        for(TitleParent title:titles)
        {
            List<Object> childList = new ArrayList<>();
            childList.add(new TitleChild("Description","Translate"));
            title.setChildObjectList(childList);
            parentObject.add(title);
        }
        return parentObject;

    }

}
