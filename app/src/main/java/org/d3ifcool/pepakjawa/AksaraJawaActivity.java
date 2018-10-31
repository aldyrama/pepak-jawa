package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.squareup.picasso.Picasso;

import org.d3ifcool.pepakjawa.Model.TitleChild;
import org.d3ifcool.pepakjawa.Model.TitleCreator;
import org.d3ifcool.pepakjawa.Model.TitleParent;
import org.d3ifcool.pepakjawa.MyAdapter.Adapter;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AksaraJawaActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //Instansiasi object ImageView
    //Aksara Jawa
    ImageView ha, na, ca, ra, ka, da, ta, sa, wa, la, pa, dha, ja,
            ya, nya, ma, ga, ba, tha, nga;
    //Shandangan
    ImageView i, u, e, o, r, h, ng, pangkon, re, raa;
    //Aksara Murda
    ImageView naa, kaa, taa, saa, paa, nyaa, gaa, baa;
    //Aksara Swara
    ImageView a, ii, uu, ee, oo;
    //Wilangan
    ImageView satu, two, three, four, five, six, seven, eight, nine, ten, pangkat;
    //Aksara Rekan
    ImageView kha, fa, dza, gha, za;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inisialisasi font aplikasi
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_aksara_jawa);

        //Linkage object dengan view layout
        //Aksara Jawa
        ha = (ImageView) findViewById(R.id.ha);
        na = (ImageView) findViewById(R.id.na);
        ca = (ImageView) findViewById(R.id.ca);
        ra = (ImageView) findViewById(R.id.ra);
        ka = (ImageView) findViewById(R.id.ka);
        da = (ImageView) findViewById(R.id.da);
        ta = (ImageView) findViewById(R.id.ta);
        sa = (ImageView) findViewById(R.id.sa);
        wa = (ImageView) findViewById(R.id.wa);
        la = (ImageView) findViewById(R.id.la);
        pa = (ImageView) findViewById(R.id.pa);
        dha = (ImageView) findViewById(R.id.dha);
        ja = (ImageView) findViewById(R.id.ja);
        ya = (ImageView) findViewById(R.id.ya);
        nya = (ImageView) findViewById(R.id.nya);
        ma = (ImageView) findViewById(R.id.ma);
        ga = (ImageView) findViewById(R.id.ga);
        //Shandangan
        ba = (ImageView) findViewById(R.id.ba);
        tha = (ImageView) findViewById(R.id.tha);
        nga = (ImageView) findViewById(R.id.nga);
        i = (ImageView) findViewById(R.id.i);
        u = (ImageView) findViewById(R.id.u);
        e = (ImageView) findViewById(R.id.e);
        o = (ImageView) findViewById(R.id.o);
        r = (ImageView) findViewById(R.id.r);
        h = (ImageView) findViewById(R.id.h);
        ng = (ImageView) findViewById(R.id.ng);
        pangkon = (ImageView) findViewById(R.id.pangkon);
        re = (ImageView) findViewById(R.id.re);
        raa = (ImageView) findViewById(R.id.raa);
        // Aksara Murda
        naa = (ImageView) findViewById(R.id.naa);
        kaa = (ImageView) findViewById(R.id.kaa);
        taa = (ImageView) findViewById(R.id.taa);
        saa = (ImageView) findViewById(R.id.saa);
        paa = (ImageView) findViewById(R.id.paa);
        nyaa = (ImageView) findViewById(R.id.nyaa);
        gaa = (ImageView) findViewById(R.id.gaa);
        baa = (ImageView) findViewById(R.id.baa);
        //Aksara Swara
        a = (ImageView) findViewById(R.id.a);
        ii = (ImageView) findViewById(R.id.ii);
        uu = (ImageView) findViewById(R.id.uu);
        ee = (ImageView) findViewById(R.id.ee);
        oo = (ImageView) findViewById(R.id.oo);
        //Wilangan
        satu = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        seven = (ImageView) findViewById(R.id.seven);
        eight = (ImageView) findViewById(R.id.eight);
        nine = (ImageView) findViewById(R.id.nine);
        ten = (ImageView) findViewById(R.id.ten);
        pangkat = (ImageView) findViewById(R.id.pangkat);
        //Aksara Rekan
        kha = (ImageView) findViewById(R.id.kha);
        fa = (ImageView) findViewById(R.id.fa);
        dza = (ImageView) findViewById(R.id.dza);
        gha = (ImageView) findViewById(R.id.gha);
        za = (ImageView) findViewById(R.id.za);

        //Load gambar ke layout menggunakan library picasso
        //Aksara Jawa
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha.png").into(ha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/na.png").into(na);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca.png").into(ca);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra.png").into(ra);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka.png").into(ka);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/da.png").into(da);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta.png").into(ta);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa.png").into(sa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa.png").into(wa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/la.png").into(la);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa.png").into(pa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha.png").into(dha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja.png").into(ja);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya.png").into(ya);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya.png").into(nya);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma.png").into(ma);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga.png").into(ga);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba.png").into(ba);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha.png").into(tha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga.png").into(nga);

        //Shandangan
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/i.png").into(i);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/u.png").into(u);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/e.png").into(e);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/o.png").into(o);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/r.png").into(r);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/h.png").into(h);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ng.png").into(ng);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pangkon.png").into(pangkon);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/re.png").into(re);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/raa.png").into(raa);

        //Aksara Murda
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nam.png").into(naa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/kam.png").into(kaa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/tam.png").into(taa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/sam.png").into(saa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pam.png").into(paa);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nyam.png").into(nyaa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/gam.png").into(gaa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/bam.png").into(baa);

        //Aksara Swara
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/a.png").into(a);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ii.png").into(ii);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/uu.png").into(uu);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ee.png").into(ee);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/oo.png").into(oo);

        //Wilangan
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/one.png").into(satu);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/two.png").into(two);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/three.png").into(three);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/four.png").into(four);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/five.png").into(five);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/six.png").into(six);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/seven.png").into(seven);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/eight.png").into(eight);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nine.png").into(nine);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/zero.png").into(ten);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pangkat.png").into(pangkat);

        //Aksara rekan
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/kha.png").into(kha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/fa.png").into(fa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/dza.png").into(dza);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/gha.png").into(gha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/za.png").into(za);
    }

    //Implementasi font aplikasi
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    //Handle Inset --> per aksara
    public void Ha(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 1);
        startActivity(i);
    }

    public void Na(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 2);
        startActivity(i);
    }

    public void Ca(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 3);
        startActivity(i);
    }

    public void Ra(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 4);
        startActivity(i);
    }

    public void Ka(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 5);
        startActivity(i);
    }

    public void Da(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 6);
        startActivity(i);
    }

    public void Ta(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 7);
        startActivity(i);
    }

    public void Sa(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 8);
        startActivity(i);
    }

    public void Wa(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 9);
        startActivity(i);
    }

    public void La(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 10);
        startActivity(i);
    }

    public void Pa(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 11);
        startActivity(i);
    }

    public void Dha(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 12);
        startActivity(i);
    }

    public void Ja(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 13);
        startActivity(i);
    }

    public void Ya(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 14);
        startActivity(i);
    }

    public void Nya(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 15);
        startActivity(i);
    }

    public void Ma(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 16);
        startActivity(i);
    }

    public void Ga(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 17);
        startActivity(i);
    }

    public void Ba(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 18);
        startActivity(i);
    }

    public void Tha(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 19);
        startActivity(i);
    }

    public void Nga(View V){
        Intent i = new Intent(AksaraJawaActivity.this, InsetAksara.class);
        i.putExtra("aksara", 20);
        startActivity(i);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}