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

    public void arjunavextor(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vecteezy.com/"));
        startActivity(intent);
    }

    public void sintavextor(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vecteezy.com"));
        startActivity(intent);
    }

    public void wayangall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.Vecteezy.com"));
        startActivity(intent);
    }

    public void icon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freepik.com/free-vector/6-clock-icons_995776.htm"));
        startActivity(intent);
    }

    public void artikelsadewa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dalang666.blogspot.com/2011/09/sadewa.html"));
        startActivity(intent);
    }

    public void artikelbima(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wayang.wordpress.com/2006/10/26/bima-werkudara/"));
        startActivity(intent);
    }

    public void artikellaksamana(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wayangku.id/nama-tokoh-wayang-lesmana-laksmana-widagda/"));
        startActivity(intent);
    }
}
