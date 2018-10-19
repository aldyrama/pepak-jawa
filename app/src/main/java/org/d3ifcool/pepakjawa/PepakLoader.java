package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import org.d3ifcool.pepakjawa.Model.ItemDetail;

import java.util.List;

public class PepakLoader extends AsyncTaskLoader<List<ItemDetail>> {
    private static  final String LOG_TAG = PepakLoader.class.getSimpleName();

    private String mUrl;

    public PepakLoader(@NonNull Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<ItemDetail> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<ItemDetail> itemDetails = QueryUtils.fetchEarthquakeData(mUrl);
        return  itemDetails;

    }
}
