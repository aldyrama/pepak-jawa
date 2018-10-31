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
        listwayang.add(new Wayang("Shinta","Categorie Wayang",getString(R.string.sinta),R.drawable.shinta));
        listwayang.add(new Wayang("Rama Wijaya","Categorie Wayang", getString(R.string.ramawijaya),R.drawable.ramawijaya));
        listwayang.add(new Wayang("Bagong","Categorie Wayang", getString(R.string.bagong),R.drawable.bagong));
        listwayang.add(new Wayang("Petruk","Categorie Wayang", getString(R.string.petruk),R.drawable.petruk));
        listwayang.add(new Wayang("Semar","Categorie Wayang", getString(R.string.samar),R.drawable.semar));
        listwayang.add(new Wayang("Gareng","Categorie Wayang", getString(R.string.gareng),R.drawable.gareng));
        listwayang.add(new Wayang("Arjuna","Categorie Wayang",getString(R.string.arjuna),R.drawable.arjuna));
        listwayang.add(new Wayang("GatotKaca","Categorie Wayang",getString(R.string.gatotkaca),R.drawable.gatotkaca));
        listwayang.add(new Wayang("Kumbakarna","Categorie Wayang", getString(R.string.kumbakarna),R.drawable.kumbakarna));
        listwayang.add(new Wayang("Hanoman","Categorie Wayang",getString(R.string.hanoman),R.drawable.hanoman));
        listwayang.add(new Wayang("Rahwana","Categorie Wayang",getString(R.string.rahwana),R.drawable.rahwana));
        listwayang.add(new Wayang("Duryudana","Categorie Wayang",getString(R.string.duryudana),R.drawable.duryudana));
        listwayang.add(new Wayang("Baladewa","Categorie Wayang",getString(R.string.baladewa),R.drawable.baladewa));
        listwayang.add(new Wayang("Parikesit","Categorie Wayang",getString(R.string.parikesit),R.drawable.parikesit));
        listwayang.add(new Wayang("Antareja","Categorie Wayang",getString(R.string.antareja),R.drawable.antareja));
        listwayang.add(new Wayang("Antasena","Categorie Wayang",getString(R.string.antasena),R.drawable.antasena));
        listwayang.add(new Wayang("Jatayu","Categorie Wayang",getString(R.string.jatayu),R.drawable.jatayu));
        listwayang.add(new Wayang("Citraksa","Categorie Wayang",getString(R.string.citraksa),R.drawable.citraksa));
        listwayang.add(new Wayang("Citraksi","Categorie Wayang",getString(R.string.citraksi),R.drawable.citraksi));
        listwayang.add(new Wayang("Dursasana","Categorie Wayang",getString(R.string.dursasana),R.drawable.dursasana));
        listwayang.add(new Wayang("Gardapati","Categorie Wayang",getString(R.string.gardapati),R.drawable.gardapati));
        listwayang.add(new Wayang("Gendari","Categorie Wayang",getString(R.string.gendari),R.drawable.gendari));
        listwayang.add(new Wayang("Dewi Madrim","Categorie Wayang",getString(R.string.dewimadrim),R.drawable.dewimadrim));
        listwayang.add(new Wayang("Dewi Kunti","Categorie Wayang",getString(R.string.dewikunthi),R.drawable.dewikunthi));
        listwayang.add(new Wayang("Destarata","Categorie Wayang",getString(R.string.destarata),R.drawable.destarata));
        listwayang.add(new Wayang("Karna","Categorie Wayang",getString(R.string.karna),R.drawable.karna));
        listwayang.add(new Wayang("Sangkuni","Categorie Wayang",getString(R.string.sangkuni),R.drawable.sangkuni));
        listwayang.add(new Wayang("Pandu Dewananta","Categorie Wayang",getString(R.string.pandudewananta),R.drawable.pandudewananta));
        listwayang.add(new Wayang("Werkundara","Categorie Wayang",getString(R.string.werkundara),R.drawable.werkundara));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, listwayang);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
