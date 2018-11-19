package org.d3ifcool.pepakjawa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import org.d3ifcool.pepakjawa.Model.Category;
import org.d3ifcool.pepakjawa.Model.ItemDetail;
import org.d3ifcool.pepakjawa.MyAdapter.ExpandableAdapter2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KesusastraanActivity extends AppCompatActivity {

    private List<Category> categoryList = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesusastraan);

        initData();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandable_kesusastraan);

        ExpandableAdapter2 expandableAdapter = new ExpandableAdapter2(categoryList, this);

        expandableListView.setAdapter(expandableAdapter);
    }

    private Category createCategory(String name, String descr, long id) {
        return new Category(id, name, descr);
    }

    private void initData() {
        Category category1, category2, category3, category4, category5,
                category6, category7, category8, category9, category10,
                category11, category12, category13, category14, category15,
                category16;

        category1 = createCategory("Parikan", "Pantun", 0);
        category1.setItemDetails(createItems1());
        categoryList.add(category1);

        category2 = createCategory("Wangsalan", "Teka-teki", 0);
        category2.setItemDetails(createItems2());
        categoryList.add(category2);

        category3 = createCategory("Purwakanthi Guru Swara", "Rima yang runtut suaranya ", 0);
        category3.setItemDetails(createItems3());
        categoryList.add(category3);

        category4 = createCategory("Purwakanthi Guru Sastra", "Rima yang runtut suaranya ", 0);
        category4.setItemDetails(createItems4());
        categoryList.add(category4);

        category5 = createCategory("Purwakanthi Lumaksita", "Rima yang runtut suaranya ", 0);
        category5.setItemDetails(createItems5());
        categoryList.add(category5);

        category6 = createCategory("Cangkriman", "Rima yang runtut suaranya ", 0);
        category6.setItemDetails(createItems6());
        categoryList.add(category6);

        category3 = createCategory("Paribasan", "Paribasan", 0);
        category3.setItemDetails(createItems3());
        categoryList.add(category3);

        category3 = createCategory("Tembang", "Paribasan", 0);
        category3.setItemDetails(createItems3());
        categoryList.add(category3);

        category3 = createCategory("Coba Lagokna", "Paribasan", 0);
        category3.setItemDetails(createItems3());
        categoryList.add(category3);

        category10 = createCategory("Wujude Gamelan", "Paribasan", 0);
        category10.setItemDetails(createItems10());
        categoryList.add(category10);

        category11 = createCategory("Swarane Gamelan", "Paribasan", 0);
        category11.setItemDetails(createItems11());
        categoryList.add(category11);

        category12 = createCategory("Perangane Gamelan", "Paribasan", 0);
        category12.setItemDetails(createItems12());
        categoryList.add(category12);

        category13 = createCategory("Gaweyane", "Paribasan", 0);
        category13.setItemDetails(createItems13());
        categoryList.add(category13);

        category14 = createCategory("Arane gendhing-gendhing", "Paribasan", 0);
        category14.setItemDetails(createItems14());
        categoryList.add(category14);

        category15 = createCategory("Tembung Tumrap Gamelan", "Paribasan", 0);
        category15.setItemDetails(createItems15());
        categoryList.add(category15);


    }

    private ArrayList<ItemDetail> createItems1() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Parikan")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems2() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Wangsalan")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems3() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Guru Swara")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems4() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Guru Sastra")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems5() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Lukmasita")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems6() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Cengkriman")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems10() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Wujude Gamelan")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems11() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Swarane Gamelan")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems12() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Perangane Gamelan")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems13() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Gaweyane")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems14() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Gendhing")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    private ArrayList<ItemDetail> createItems15() {
        String json;
        final ArrayList<ItemDetail> result = new ArrayList<>();
        try {
            InputStream is = getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray baseJsonResponse = new JSONArray(json);
            for (int i = 0; i < baseJsonResponse.length(); i++) {

                JSONObject currentItemDetail = baseJsonResponse.getJSONObject(i);
                if (currentItemDetail.getString("category").equals("Tumrap")) {
                    String jawa = currentItemDetail.getString("jawa");
                    String translate = currentItemDetail.getString("translate");
                    ItemDetail item = new ItemDetail(jawa, translate);
                    result.add(item);
                }
            }
        } catch (IOException ignored) {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}









