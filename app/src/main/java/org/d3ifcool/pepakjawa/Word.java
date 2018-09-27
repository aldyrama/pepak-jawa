package org.d3ifcool.pepakjawa;

/**
 * Created by ASUS on 28-Sep-18.
 */

public class Word {

    private String mJavaTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String JavaTranslation) {
        mJavaTranslation = JavaTranslation;
    }

    public Word(String JavaTranslation, int imageResourceId) {
        mJavaTranslation = JavaTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getJavaTranslation() { return mJavaTranslation; }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
