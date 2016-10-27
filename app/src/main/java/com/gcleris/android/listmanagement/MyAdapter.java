package com.gcleris.android.listmanagement;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by gcler on 2016-10-01.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context context;
    ArrayList<Item> items = new ArrayList<Item>();

    public MyAdapter(Context context, ArrayList<Item> items)  {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.tvItemDescription.setText(items.get(position).getItemNom());
        holder.tvItemQty.setText(String.valueOf(items.get(position).getQty()));
        holder.cbLow.setChecked(items.get(position).getNivInventaire());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
