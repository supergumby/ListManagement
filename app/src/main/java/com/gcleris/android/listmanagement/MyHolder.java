package com.gcleris.android.listmanagement;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by gcler on 2016-10-11.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvItemDescription;
        CheckBox cbLow;
        ItemClickListener itemClickListener;

        public MyHolder(View itemView) {
            super(itemView);
            tvItemDescription = (TextView) itemView.findViewById(R.id.textViewItemDescription);
            cbLow = (CheckBox) itemView.findViewById(R.id.checkboxLow);
        }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
