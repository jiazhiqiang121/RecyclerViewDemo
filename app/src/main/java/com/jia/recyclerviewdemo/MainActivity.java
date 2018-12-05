package com.jia.recyclerviewdemo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.jia.recyclerviewdemo.recyclerview.GridSpacingItemDecoration;
import com.jia.recyclerviewdemo.recyclerview.RecyclerListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mRecyclerView = findViewById(R.id.recycler_view);

        int spacing = (Utils.getWidthPixels() - (Utils.dp2px(70) * 3) - (Utils.dp2px(16) * 2 * 3)) / 2;
        Log.e("--->" + spacing, spacing + "");
        mRecyclerView.addItemDecoration(new GridSpacingItemDecoration(3, spacing, false));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mAdapter = new RecyclerListAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addAll(getDataList());
    }

    private List<RecyclerListData> getDataList() {
        List<RecyclerListData> listData = new ArrayList<>();
        listData.add(new RecyclerListData("TEST1", "http://img.ytsg.cn/images/1/3/9787535894113.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        listData.add(new RecyclerListData("TEST2", "http://img.ytsg.cn/ebooks/images/9/8/1534841726998.jpg"));
        return listData;
    }
}
