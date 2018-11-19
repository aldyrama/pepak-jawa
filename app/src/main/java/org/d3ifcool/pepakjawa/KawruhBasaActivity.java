package org.d3ifcool.pepakjawa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class KawruhBasaActivity extends AppCompatActivity {
    private List<Category> categoryList = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kawruh_basa);
        initData();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandable_kawruhbasa);

        ExpandableAdapter expandableAdapter = new ExpandableAdapter(categoryList, this);

        expandableListView.setAdapter(expandableAdapter);
    }

    private Category createCategory(String name, String descr, long id) {
        return new Category(id, name, descr);
    }

    private void initData() {
        Category    category1, category2, category3, category4, category5,
                category6, category7, category8, category9, category10,
                category11, category12, category13, category14, category15,
                category16;

        category1 = createCategory("Tembung Ngoko Perangane Awak", "Kata ngoko bagian tubuh", 0);
        category1.setItemDetails(createItems1()); categoryList.add(category1);

        category2 = createCategory("Tembung Krama Madya Perangane Awak", "Kata krama madya bagian tubuh", 0);
        category2.setItemDetails(createItems2()); categoryList.add(category2);

        category3 = createCategory("Tembung Krama Inggil Perangane Awak", "Kata krama inggil bagian tubuh", 0);
        category3.setItemDetails(createItems3()); categoryList.add(category3);

        category4 = createCategory("Tembung Ngoko Liyane", "Kata ngoko lainnya", 0);
        category4.setItemDetails(createItems4()); categoryList.add(category4);

        category5 = createCategory("Tembung Krama Madya Liyane", "Kata krama madya lainnya", 0);
        category5.setItemDetails(createItems5()); categoryList.add(category5);

        category6 = createCategory("Tembung Krama Inggil Liyane", "Kata krama inggil Lainnya", 0);
        category6.setItemDetails(createItems6()); categoryList.add(category6);

        category7 = createCategory("Tembung Padha Tegese", "Kata sinonim", 0);
        category7.setItemDetails(createItems7()); categoryList.add(category7);

        category8 = createCategory("Tembung Kosok Balen", "Kata antonim", 0);
        category8.setItemDetails(createItems8()); categoryList.add(category8);
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
                if (currentItemDetail.getString("category").equals("Tembung Ngoko Perangane Awak ")){
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
                if (currentItemDetail.getString("category").equals("Tembung Krama Madya Perangane Awak")){
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
                if (currentItemDetail.getString("category").equals("Tembung Krama Inggil Perangane Awak")){
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
                if (currentItemDetail.getString("category").equals("Tembung Ngoko Liyane")){
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
                if (currentItemDetail.getString("category").equals("Tembung Krama Madya Liyane")){
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
                if (currentItemDetail.getString("category").equals("Tembung Krama Inggil Liyane")){
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
                if (currentItemDetail.getString("category").equals("Tembung Padha Tegese")){
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
                if (currentItemDetail.getString("category").equals("Tembung Kosok Balen")){
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

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
