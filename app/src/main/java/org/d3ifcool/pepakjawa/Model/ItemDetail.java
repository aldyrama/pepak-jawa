package org.d3ifcool.pepakjawa.Model;

public class ItemDetail {

    private long id;
    private String jawa;
    private String translate;

    public ItemDetail(String jawa, String translate) {
        this.jawa = jawa;
        this.translate = translate;
    }

    public ItemDetail(long id, String jawa, String translate) {
        this.id = id;
        this.jawa = jawa;
        this.translate = translate;
    }

    public long getId() {
        return id;
    }

    public String getJawa() {
        return jawa;
    }

    public String getTranslate() {
        return translate;
    }
}
