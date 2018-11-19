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

public class RupaKawruhActivity extends AppCompatActivity {
    private List<Category> categoryList = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupa_kawruh);
        initData();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandable_rupakawruh);

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

        category1 = createCategory("Jenenge Kembang", "Namanya kembang", 0);
        category1.setItemDetails(createItems1()); categoryList.add(category1);

        category2 = createCategory("Jenenge Pentil", "Namanya buah muda",1);
        category2.setItemDetails(createItems2()); categoryList.add(category2);

        category3 = createCategory("Jenenge Woh", "Namanya buah", 2);
        category3.setItemDetails(createItems3()); categoryList.add(category3);

        category4 = createCategory("Jenenge Isi", "Namanya isi", 3);
        category4.setItemDetails(createItems4()); categoryList.add(category4);

        category5 = createCategory("Jenenge Godhong", "Namanya daun", 4);
        category5.setItemDetails(createItems5()); categoryList.add(category5);

        category6 = createCategory("Jenenge Wit", "Namanya pohon", 5);
        category6.setItemDetails(createItems6()); categoryList.add(category6);

//        category7 = createCategory("Jenise Wit-Witan", "Namanya pepohonan", 6);
//        category7.setItemDetails(createItems7()); categoryList.add(category7);

//        category8 = createCategory("Jenenge Pala", "Namanya tanaman", 7);
//        category8.setItemDetails(createItems8()); categoryList.add(category8);

        category9 = createCategory("Jenenge Anak Kewan", "Namanya anak hewan", 8);
        category9.setItemDetails(createItems9()); categoryList.add(category9);

//        category10 = createCategory("Jenenge Turunane Kewan", "Namanya turunan hewan", 9);
//        category10.setItemDetails(createItems10()); categoryList.add(category10);

        category11 = createCategory("Jenenge Gaman Kewan", "Namanya senjata hewan", 10);
        category11.setItemDetails(createItems11()); categoryList.add(category11);

        category12 = createCategory("Kabiyasan Solahe Kewan", "Kebiasaan perilaku hewan", 10);
        category12.setItemDetails(createItems12()); categoryList.add(category12);

        category13 = createCategory("Swarane Kewan", "Suaranya hewan", 10);
        category13.setItemDetails(createItems13()); categoryList.add(category13);

        category14 = createCategory("Swara Ngundang Kewan", "Suara memanggil hewan", 10);
        category14.setItemDetails(createItems14()); categoryList.add(category14);

//        category15 = createCategory("Ulese/Rupane Kewan", "Wujudnya hewan", 10);
//        category15.setItemDetails(createItems15()); categoryList.add(category15);

        category16 = createCategory("Sebutane Mangan", "Sebutannya makan", 10);
        category16.setItemDetails(createItems16()); categoryList.add(category16);
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
                if (currentItemDetail.getString("category").equals("Jenenge Kembang")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Pentil")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Woh")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Isi")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Godhong")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Kembang")){
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
                if (currentItemDetail.getString("category").equals("Jenise Wit-Witan")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Pala")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Anak Kewan")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Turunane Kewan")){
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
                if (currentItemDetail.getString("category").equals("Jenenge Gaman Kewan")){
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
    private ArrayList<ItemDetail> createItems12() {
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
                if (currentItemDetail.getString("category").equals("Kabiyasan Solahe Kewan")){
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
    private ArrayList<ItemDetail> createItems13() {
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
                if (currentItemDetail.getString("category").equals("Swarane Kewan")){
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
    private ArrayList<ItemDetail> createItems14() {
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
                if (currentItemDetail.getString("category").equals("Swara Ngundang Kewan")){
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
    private ArrayList<ItemDetail> createItems15() {
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
                if (currentItemDetail.getString("category").equals("Ulese/Rupane Kewan")){
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
    private ArrayList<ItemDetail> createItems16(){
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
                if (currentItemDetail.getString("category").equals("Sebutane Mangan")){
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
