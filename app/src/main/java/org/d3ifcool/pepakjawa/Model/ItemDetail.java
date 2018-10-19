package org.d3ifcool.pepakjawa.Model;

public class ItemDetail {

    private long id;
    private String jawa;
    private String describe;

    public ItemDetail(long id, String jawa, String translate) {
        this.id = id;
        this.jawa = jawa;
        this.describe = translate;
    }

    public long getId() {
        return id;
    }

    public String getJawa() {
        return jawa;
    }

    public String getDescribe() {
        return describe;
    }
}
