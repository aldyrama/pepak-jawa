package org.d3ifcool.pepakjawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WayangPoin extends AppCompatActivity {

    List<Wayang> listwayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wayang_poin);

        listwayang = new ArrayList<>();
        listwayang.add(new Wayang("Kresna","Categorie Wayang",getString(R.string.kresna),R.drawable.kresna));
        listwayang.add(new Wayang("Sadewa","Categorie Wayang",getString(R.string.sadewa),R.drawable.sadewa));
        listwayang.add(new Wayang("Bima","Categorie Wayang",getString(R.string.bima),R.drawable.bima));
        listwayang.add(new Wayang("Laksamana","Categorie Wayang",getString(R.string.laksamana),R.drawable.laksamana));
        listwayang.add(new Wayang("Sinta","Categorie Wayang",getString(R.string.sinta),R.drawable.sinta));
        listwayang.add(new Wayang("Rama Wijaya","Categorie Wayang","Description ",R.drawable.ramawijaya));
        listwayang.add(new Wayang("Bagong","Categorie Wayang","Description ",R.drawable.bagong));
        listwayang.add(new Wayang("Petruk","Categorie Wayang","Description ",R.drawable.petruk));
        listwayang.add(new Wayang("Semar","Categorie Wayang","Description ",R.drawable.semar));
        listwayang.add(new Wayang("Gareng","Categorie Wayang","Description ",R.drawable.gareng));
        listwayang.add(new Wayang("Arjuna","Categorie Wayang","Description ",R.drawable.arjuna));
        listwayang.add(new Wayang("Werkundara","Categorie Wayang","Description ",R.drawable.werkudara));
        listwayang.add(new Wayang("GatotKaca","Categorie Wayang","Description ",R.drawable.gatotkaca));
        listwayang.add(new Wayang("Kumbakarna","Categorie Wayang","Description ",R.drawable.kumbakarna));
        listwayang.add(new Wayang("Hanoman","Categorie Wayang","Description ",R.drawable.hanoman));
        listwayang.add(new Wayang("Rahwana","Categorie Wayang","Description ",R.drawable.rahwana));
        listwayang.add(new Wayang("Duryudana","Categorie Wayang","Description ",R.drawable.duryudana));
        listwayang.add(new Wayang("Baladewa","Categorie Wayang","Description ",R.drawable.baladewa));
        listwayang.add(new Wayang("Parikesit","Categorie Wayang","Description ",R.drawable.parikesit));
        listwayang.add(new Wayang("Antareja","Categorie Wayang","Description ",R.drawable.antareja));
        listwayang.add(new Wayang("Antasena","Categorie Wayang","Description ",R.drawable.antasena));
        listwayang.add(new Wayang("Jatayu","Categorie Wayang","Description ",R.drawable.jatayu));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, listwayang);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
