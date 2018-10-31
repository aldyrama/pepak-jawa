package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import org.d3ifcool.pepakjawa.Model.Category;
import org.d3ifcool.pepakjawa.Model.ItemDetail;
import org.d3ifcool.pepakjawa.MyAdapter.ExpandableAdapter;

import java.util.ArrayList;
import java.util.List;


public class ParamasastraActivity extends AppCompatActivity{
    private List<Category> categoryList = new ArrayList<Category>();
    private ExpandableListView expandableListView;
    private ExpandableAdapter expandableAdapter;
    String name;
    String descr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        setContentView(R.layout.activity_paramasastra);

        expandableListView = (ExpandableListView) findViewById(R.id.expandable);

        expandableAdapter = new ExpandableAdapter(categoryList, this);

        expandableListView.setAdapter(expandableAdapter);

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

//        // Get details on the currently active default data network
//        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
//
//        // If there is a network connection, fetch data
//        if (networkInfo != null && networkInfo.isConnected()) {
//            // Get a reference to the LoaderManager, in order to interact with loaders.
//            LoaderManager loaderManager = getSupportLoaderManager();
//
//            // Initialize the loader. Pass in the int ID constant defined above and pass in null for
//            // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
//            // because this activity implements the LoaderCallbacks interface).
//            loaderManager.initLoader(LOADER_ID, null, this);
//        } else {
//            // Otherwise, display error
//            // First, hide loading indicator so error message will be visible
////            View loadingIndicator = findViewById(R.id.loading_indicator);
////            loadingIndicator.setVisibility(View.GONE);
//
//            // Update empty state with no connection error message
////            mEmptyStateTextView.setText(R.string.no_internet_connection);
//        }
    }

    private Category createCategory(String name, String descr, long id) {
        return new Category(id, name, descr);
    }

    private void initData() {
        Category category1, category2, category3, category4, category5, category6, category7, category8, category9, category10, category11;

        category1 = createCategory("Tembung Lan Jinise", "Kata dan jenisnya", 1);
        category1.setItemDetails(createItems1()); categoryList.add(category1);

        category2 = createCategory("Pamilahane Tembung", "Pembagian kata", 1);
        category2.setItemDetails(createItems2("","",10)); categoryList.add(category2);

        category3 = createCategory("Tembung Tanggap", "Kata pasif", 2);
        category3.setItemDetails(createItems3("","",10)); categoryList.add(category3);

        category4 = createCategory("Tembung Tanduk", "Kata aktif", 3);
        category4.setItemDetails(createItems4("","",10)); categoryList.add(category4);

        category5 = createCategory("Tembung Camboran Wutuh", "Gabungan kata secara utuh", 4);
        category5.setItemDetails(createItems5("","",10)); categoryList.add(category5);

        category6 = createCategory("Tembung Camboran Tugel", "Gabungan kata dengan perubahan", 5);
        category7 = createCategory("Pamilahe Ukara", "Pembagian kalimat", 6);
        category8 = createCategory("Ukara Tanduk", "Kalimat pasif", 7);
        category9 = createCategory("Ukara Tanggap", "Kalimat aktif", 8);
        category10 = createCategory("Ukara Lamba", "Kalimat tunggal", 9);
        category11 = createCategory("Ukara Camboran", "Kalimat majemuk", 10);

    }



    private ArrayList<ItemDetail> createItems1(){
        final String[] jawa = new String[]{"Tembung Aran","Tembung Kriya","Tembung Ganti","Tembung Wilangan","Tembung Sipat","Tembung Katrangan","Tembung Pangguwuh","Tembung Sandhangan","Tembung Panyambung","Tembung Pangarep"};
        final String[] translate = new String[]{"Kata benda","Kata kerja","Kata ganti","Kata Bilangan","Kata sifat","Kata keterangan","Kata seru","Kata sandhang","Kata sambung","Kata depan"};
        final ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < jawa.length; i++) {
            name = jawa[i];
            descr = translate[i];

            ItemDetail item = new ItemDetail(i, name, descr);
            result.add(item);
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems2(String name, String descr, int num){
        final String[] jawa = new String[]{"Tembung Lingga","Tembung Andhahan","Tembung Rangkep"};
        final String[] translate = new String[]{"Kata asli yang belum diberi imbuhan","Kata yang sudah diberi imbuhan","Kata ganda"};
        ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < jawa.length; i++) {
            name = jawa[i];
            descr = translate[i];

            ItemDetail item = new ItemDetail(i, name, descr);
            result.add(item);
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems3(String name, String descr, int num){
        final String[] jawa = new String[]{"Dakombe(Da+ombe)","Koombe(Ko+ombe)","Diombe(Di+ombe)","Dakpakani(Dipakani+i)","Dakpakakake(Dapkani+ake)"};
        final String[] translate = new String[]{"Aku minum(Kata ganti orang pertama)","Kau minum(Kata ganti orang kedua)","Dia minum(Kata ganti orang ketiga)","Aku makan(Kata kerja pasif)","Aku memakan(Kata kerja pasif)"};
        ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < jawa.length; i++) {
            name = jawa[i];
            descr = translate[i];

            ItemDetail item = new ItemDetail(i, name, descr);
            result.add(item);
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems4(String name, String descr, int num){
        final String[] jawa = new String[]{"Mangan(M+pangan)","Nata(N+tata)","Ngarang(Ng+karang)","Nyathet(Ny+cathet)","Nanduri(Nanduri+i)","Nyilihake(Nyilih+ake)"};
        final String[] translate = new String[]{"Makan(Kata aktif)","Menata(Kata aktif)","Mengarang(Kata aktif)","Mencatat(Kata aktif)","Menanam(Kata kerja aktif)","Meminjamkan(Kata kerja aktif)"};
        ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < jawa.length; i++) {
            name = jawa[i];
            descr = translate[i];

            ItemDetail item = new ItemDetail(i, name, descr);
            result.add(item);
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems5(String name, String descr, int num) {
        final String[] na = new String[]{"Ajur ajer","Bibit kawit","Cekak aos"};
        final String[] nsda = new String[]{"Melebur mencair","Asal usul", "Padat berisi"};

        final ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < na.length; i++) {
            name = na[i];
            descr = nsda[i];

            ItemDetail item1 = new ItemDetail(i, name, descr);
            result.add(item1);

        }
        return result ;
    }

    private ArrayList<ItemDetail> createItems6(String name, String descr, int num) {
        final String[] na = new String[]{"Ajur ajer","Bibit kawit","Cekak aos"};
        final String[] nsda = new String[]{"Melebur mencair","Asal usul", "Padat berisi"};

        final ArrayList<ItemDetail> result = new ArrayList<ItemDetail>();
        for (int i = 0; i < na.length; i++) {
            name = na[i];
            descr = nsda[i];

            ItemDetail item1 = new ItemDetail(i, name, descr);
            result.add(item1);

        }
        return result ;
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}

