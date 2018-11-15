package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.nav_home :
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_quiz :
                            selectedFragment = new QuizFragment();
                            break;
                        case R.id.nav_kamus :
                            selectedFragment = new KamusFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

//        //INTENT MATERI PRAMASASTRA
//        CardView pramasastra = (CardView) findViewById(R.id.paramasastra);
//        pramasastra.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ParamasastraActivity.class);
//                startActivity(intent);
////                TabButton1();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//
//            }
//        });
//
//        //INTENT MATERI RUPA KAWRUH
//        CardView rupakawruh = (CardView) findViewById(R.id.rupa_kawruh);
//        rupakawruh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, RupaKawruhActivity.class);
//                startActivity(intent);
////                TapButton2();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });
//
//        //INTENT MATERI KAWRUH BASA
//        CardView kawruhbasa = (CardView) findViewById(R.id.kawruh_basa);
//        kawruhbasa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, KawruhBasaActivity.class);
//                startActivity(intent);
////                TabButton3();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });
//
//        //INTENT MATERI KESUSASTRAAN
//        CardView kesusastraan = (CardView) findViewById(R.id.kasusastra);
//        kesusastraan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, KesusastraanActivity.class);
//                startActivity(intent);
////                TabButton4();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });
//
//        //INTENT MATERI AKSARA JAWA
//        CardView aksarajawa = (CardView) findViewById(R.id.aksara);
//        aksarajawa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, AksaraJawaActivity.class);
//                startActivity(intent);
////                TabButton5();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });
//
//        //INTENT MATERI WAYANG
//        CardView wayang = (CardView) findViewById(R.id.wayang);
//        wayang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, WayangPoin.class);
//                startActivity(intent);
////                TabButton6();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });

//        // KUIS
//        CardView kuis = (CardView) findViewById(R.id.quis);
//        kuis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, StartQuiz.class);
//                startActivity(intent);
////                TabButton7();
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });


//    private void TabButton7() {
//        CardView kuis = (CardView) findViewById(R.id.quiz);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        kuis.startAnimation(myAnim);
//    }
//
//    private void TabButton6() {
//        CardView wayang = (CardView) findViewById(R.id.wayang);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        wayang.startAnimation(myAnim);
//    }
//
//    private void TabButton5() {
//        CardView aksarajawa = (CardView) findViewById(R.id.aksara);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        aksarajawa.startAnimation(myAnim);
//    }
//
//    private void TabButton4() {
//        CardView kesusastraan = (CardView) findViewById(R.id.kasusastra);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        kesusastraan.startAnimation(myAnim);
//    }
//
//    private void TabButton3() {
//        CardView kawruhbasa = (CardView) findViewById(R.id.kawruh_basa);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        kawruhbasa.startAnimation(myAnim);
//    }
//
//    private void TabButton1() {
//        CardView pramasastra = (CardView) findViewById(R.id.paramasastra);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        pramasastra.startAnimation(myAnim);
//    }
//
//    private void TapButton2() {
//        CardView rupakawruh = (CardView) findViewById(R.id.rupa_kawruh);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        rupakawruh.startAnimation(myAnim);
//    }


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
                String shareBody = "Hallo!" + "\n" + "Ini adalah aplikasi Pepak Jawa sangat cocok buat kalian yang ingin mengetahui bahasa dan budaya jawa, " +
                        "dan ada fitur kuis juga lo!" + "AYO COBAIN KESERUAN BELAJAR BAHASA DAN BUDAYA JAWA DI APLIKASI PEPAK JAWA!" + "\n" + "Skore Kuis Saya :" + "\t\t"
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
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
