package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {

    SharedPreferences mypref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mypref = PreferenceManager.getDefaultSharedPreferences(this);
        // INTENT MATERI PRAMASASTRA
        LinearLayout pramasastra = (LinearLayout) findViewById(R.id.pramasastra);
        pramasastra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ParamasastraActivity.class);
                        startActivity(intent);
                }
            });
        ImageView imgpramasastra = (ImageView) findViewById(R.id.img_pramasastra);
        imgpramasastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParamasastraActivity.class);
                startActivity(intent);
            }
        });
        TextView textpramasastra = (TextView) findViewById(R.id.text_pramasastra);
        textpramasastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParamasastraActivity.class);
                startActivity(intent);
            }
        });

        //INTENT MATERI RUPA KAWRUH
        LinearLayout rupakawruh = (LinearLayout) findViewById(R.id.rupa_kawruh);
        rupakawruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RupaKawruhActivity.class);
                startActivity(intent);
            }
        });
        ImageView imgkawruh = (ImageView) findViewById(R.id.img_rupa_kawruh);
        imgkawruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RupaKawruhActivity.class);
                startActivity(intent);
            }
        });
        TextView textkawruh = (TextView) findViewById(R.id.text_rupa_kawruh);
        textkawruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RupaKawruhActivity.class);
                startActivity(intent);
            }
        });
        //INTENT MATERI KAWRUH BASA
        LinearLayout kawruhbasa = (LinearLayout) findViewById(R.id.kawruh_basa);
        kawruhbasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KawruhBasaActivity.class);
                startActivity(intent);
            }
        });
        ImageView imgbasa = (ImageView) findViewById(R.id.img_kawruh_basa);
        imgbasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KawruhBasaActivity.class);
                startActivity(intent);
            }
        });
        TextView textbasa = (TextView) findViewById(R.id.text_kawruh_basa);
        textkawruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KawruhBasaActivity.class);
                startActivity(intent);
            }
        });

        //INTENT MATERI KESUSASTRAAN
        LinearLayout kesusastraan = (LinearLayout) findViewById(R.id.kasusastra);
        kesusastraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KesusastraanActivity.class);
                startActivity(intent);
            }
        });
        ImageView imgkesusastraan = (ImageView) findViewById(R.id.img_kasusastra);
        imgkesusastraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KesusastraanActivity.class);
                startActivity(intent);
            }
        });
        TextView textkesustraan = (TextView) findViewById(R.id.text_kasusastra);
        textkesustraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KesusastraanActivity.class);
                startActivity(intent);
            }
        });

        //INTENT MATERI AKSARA JAWA
        LinearLayout aksarajawa = (LinearLayout) findViewById(R.id.aksara_jawa);
        aksarajawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AksaraJawaActivity.class);
                startActivity(intent);
            }
        });
        ImageView imgaksarajawa = (ImageView) findViewById(R.id.img_aksara_jawa);
        imgaksarajawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AksaraJawaActivity.class);
                startActivity(intent);
            }
        });
        TextView textaksarajawa = (TextView) findViewById(R.id.text_aksara_jawa);
        textaksarajawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AksaraJawaActivity.class);
                startActivity(intent);
            }
        });

        //INTENT MATERI WAYANG
        LinearLayout wayang = (LinearLayout) findViewById(R.id.wayang);
        wayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WayangPoin.class);
                startActivity(intent);
            }
        });
        ImageView imgwayang = (ImageView) findViewById(R.id.img_wayang);
        imgwayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WayangPoin.class);
                startActivity(intent);
            }
        });
        TextView textwayang = (TextView) findViewById(R.id.text_wayang);
        textwayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WayangPoin.class);
                startActivity(intent);
            }
        });

        // KUIS
        FButton kuis = (FButton) findViewById(R.id.kuis);
        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StartQuiz.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_account, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Intent intent = new Intent(Intent.ACTION_SEND);

                final String appPackageName = getApplicationContext().getPackageName();
                String startAppLink = "";

                try{
                    startAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
                }
                catch (android.content.ActivityNotFoundException anfe){
                    startAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
                }

                intent.setType("text/link");
                String shareBody = "Hallo!" + "\n" + "Ini adalah aplikasi Pepak Jawa sangat cocok buat kalian yang ingin mengetahui budaya jawa, dan ada fitur kuis juga lo!" +
                        "AYO COBAIN KESERUAN BELAJAR BAHASA DAN BUDAYA JAWA DI APLIKASI PEPAK JAWA!" + "\n" + "Skore Kuis Saya :" + "\t\t"
                        + (String.valueOf(mypref.getInt("highscore", 0))) + "\n" + "" + startAppLink;
                String shareSub = "App Name";
                intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(intent, "Bagikan dengan"));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }


    public void about(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
