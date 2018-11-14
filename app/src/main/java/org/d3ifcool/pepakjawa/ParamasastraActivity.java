package org.d3ifcool.pepakjawa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import org.d3ifcool.pepakjawa.Model.Category;
import org.d3ifcool.pepakjawa.Model.ItemDetail;
import org.d3ifcool.pepakjawa.MyAdapter.ExpandableAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ParamasastraActivity extends AppCompatActivity{

    private List<Category> categoryList = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paramasastra);
        initData();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandable_paramasastra);

        ExpandableAdapter expandableAdapter = new ExpandableAdapter(categoryList, this);

        expandableListView.setAdapter(expandableAdapter);
    }

    private Category createCategory(String name, String descr, long id) {
        return new Category(id, name, descr);
    }

    private void initData() {
        Category category1, category2, category3, category4, category5, category6, category7, category8, category9, category10, category11;

        category1 = createCategory("Tembung Lan Jinise", "Kata dan jenisnya", 0);
        category1.setItemDetails(createItems1()); categoryList.add(category1);

        category2 = createCategory("Pamilahane Tembung", "Pembagian kata",1);
        category2.setItemDetails(createItems2()); categoryList.add(category2);

        category3 = createCategory("Tembung Tanggap", "Kata pasif", 2);
        category3.setItemDetails(createItems3()); categoryList.add(category3);

        category4 = createCategory("Tembung Tanduk", "Kata aktif", 3);
        category4.setItemDetails(createItems4()); categoryList.add(category4);

        category5 = createCategory("Tembung Camboran Wutuh", "Gabungan kata secara utuh", 4);
        category5.setItemDetails(createItems5()); categoryList.add(category5);

        category6 = createCategory("Tembung Camboran Tugel", "Gabungan kata dengan perubahan", 5);
        category6.setItemDetails(createItems6()); categoryList.add(category6);

        category7 = createCategory("Pamilahe Ukara", "Pembagian kalimat", 6);
        category7.setItemDetails(createItems7()); categoryList.add(category7);

        category8 = createCategory("Ukara Tanduk", "Kalimat pasif", 7);
        category8.setItemDetails(createItems8()); categoryList.add(category8);

        category9 = createCategory("Ukara Tanggap", "Kalimat aktif", 8);
        category9.setItemDetails(createItems9()); categoryList.add(category9);

        category10 = createCategory("Ukara Lamba", "Kalimat tunggal", 9);
        category10.setItemDetails(createItems10()); categoryList.add(category10);

//        category11 = createCategory("Ukara Camboran", "Kalimat majemuk", 10);
//        category11.setItemDetails(createItems11()); categoryList.add(category11);
    }

    private ArrayList<ItemDetail> createItems1() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Lan Jinise")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems2() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Pamilahane Tembung")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }

    private ArrayList<ItemDetail> createItems3() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Tanggap")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems4() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Tanduk")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems5() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Camboran Wutuh")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems6() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Camboran Tugel")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems7() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Pamilahe Ukara")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems8() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Ukara Tanduk")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems9() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Ukara Tanggap")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems10() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tembung Lan Jinise")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
    private ArrayList<ItemDetail> createItems11() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size =is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Ukara Lamba")){
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        }catch (IOException ignored){ }
        catch (JSONException e) { e.printStackTrace(); }
        return result;
    }
}

