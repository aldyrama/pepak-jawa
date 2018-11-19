package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void wayangall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.Vecteezy.com/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void icon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freepik.com/free-vector/6-clock-icons_995776.htm"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wayang.wordpress.com"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tokohpewayanganjawa.blogspot.com//"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel3(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://caritawayang.blogspot.com/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel4(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nuradiwibowo02.blogspot.com/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void background(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pngtree.com/freebackground/shrine-temple-building-place-of-worship-background_135544.html"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://deviyohanna.wordpress.com/2014/06/14/deskripsi-tokoh-wayang-indonesia/ artikel"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


    public void artikel16(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://freesound.org/people/Bertrof/sounds/131657/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel17(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://freesound.org/people/LittleRainySeasons/sounds/335908/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void sound(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freepik.com/free-vector/colorful-origami-banner-collection_1230245.htm"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void artikel18(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alangalangkumitir.wordpress.com/kamus-jawa-%E2%80%93-indonesia/"));
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


}
