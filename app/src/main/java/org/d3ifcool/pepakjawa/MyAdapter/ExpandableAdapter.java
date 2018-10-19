package org.d3ifcool.pepakjawa.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.d3ifcool.pepakjawa.Model.Category;
import org.d3ifcool.pepakjawa.Model.ItemDetail;
import org.d3ifcool.pepakjawa.R;

import java.util.List;

public class ExpandableAdapter extends BaseExpandableListAdapter {

    private List<Category> categoryList;
    private int groupLayoutId;
    private int itemLayoutId;
    private Context context;



    public ExpandableAdapter(List<Category> categoryList,Context context) {
        this.categoryList = categoryList;
        this.groupLayoutId = R.layout.category_layout;
        this.itemLayoutId = R.layout.item_layout;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return categoryList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        int size = categoryList.get(groupPosition).getItemDetails().size();
        System.out.println("Child for group ["+groupPosition+"] is ["+size+"]");
        return size;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return categoryList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return categoryList.get(groupPosition).getItemDetails().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return categoryList.get(groupPosition).hashCode();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return categoryList.get(groupPosition).getItemDetails().get(childPosition).hashCode();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.category_layout,parent,false);
        }

        TextView categoryName = (TextView) view.findViewById(R.id.categoryName);
        TextView categoryDescr = (TextView) view.findViewById(R.id.categoryDescr);

        Category category = categoryList.get(groupPosition);

        categoryName.setText(category.getName());
        categoryDescr.setText(category.getDescribe());

        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_layout,parent,false);
        }

        TextView itemName = (TextView) view.findViewById(R.id.itemName);
        TextView itemDescr = (TextView) view.findViewById(R.id.itemDescr);

        ItemDetail itemDetail = categoryList.get(groupPosition).getItemDetails().get(childPosition);

        itemName.setText(itemDetail.getJawa());
        itemDescr.setText(itemDetail.getDescribe());

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
