package com.jia.recyclerviewdemo.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jia.recyclerviewdemo.R;
import com.jia.recyclerviewdemo.RecyclerListData;
import com.jia.recyclerviewdemo.glide.GlideApp;
import com.jia.recyclerviewdemo.glide.GlideRoundTransform;

import java.util.ArrayList;
import java.util.List;

public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.RecyclerListViewHolder> {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<RecyclerListData> mDataList;

    public RecyclerListAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mDataList = new ArrayList<>();
    }

    public void addAll(List<RecyclerListData> dataList) {
        mDataList.addAll(dataList);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = mInflater.inflate(R.layout.view_recycler_list_item, viewGroup, false);
        return new RecyclerListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerListViewHolder viewHolder, int position) {
        viewHolder.mNameTv.setText(mDataList.get(position).mName);
        GlideApp.with(mContext)
                .asBitmap()
                .load(mDataList.get(position).mImage)
                .centerCrop()
                .transform(new GlideRoundTransform(5, GlideRoundTransform.CornerType.ALL))
                .into(viewHolder.mImageIv);
    }


    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    static class RecyclerListViewHolder extends RecyclerView.ViewHolder {

        TextView mNameTv;
        ImageView mImageIv;

        RecyclerListViewHolder(@NonNull View itemView) {
            super(itemView);
            mNameTv = itemView.findViewById(R.id.recycler_item_name_tv);
            mImageIv = itemView.findViewById(R.id.recycler_item_pic_iv);
        }
    }
}
