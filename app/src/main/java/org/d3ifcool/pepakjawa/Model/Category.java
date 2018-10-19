package org.d3ifcool.pepakjawa.Model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private long id;
    private String name;
    private String describe;

    private List<ItemDetail> itemDetails = new ArrayList<ItemDetail>();

    public Category(long id, String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public List<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }
}
