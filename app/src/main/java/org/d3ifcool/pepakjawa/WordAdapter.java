package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28-Sep-18.
 */

public class WordAdapter  {
//
//    private int mColorResourceId;
//
//    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorResourceId) {
//        super(context, 0, objects);
//        mColorResourceId = colorResourceId;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if an existing view is being reused, otherwise inflate the view
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.activity_aksara_jawa, parent, false);
//        }
//
//        Word currentWord = getItem(position);
//
//        TextView javaTextView = (TextView) listItemView.findViewById(R.id.java_text_view);
//
//        javaTextView.setText(currentWord.getJavaTranslation());
//
//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
//
//        if (currentWord.hasImage()) {
//            imageView.setImageResource(currentWord.getImageResourceId());
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            imageView.setVisibility(View.GONE);
//        }
//
//        View textContainer = listItemView.findViewById(R.id.text_container);
//
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//
//        textContainer.setBackgroundColor(color);
//
//        return listItemView;
//    }
}
