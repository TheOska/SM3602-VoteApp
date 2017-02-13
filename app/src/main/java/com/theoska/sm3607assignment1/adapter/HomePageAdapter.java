package com.theoska.sm3607assignment1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by theoska on 2/13/17.
 */

public class HomePageAdapter extends RecyclerView.Adapter {

    class HomePageViewHolder extends RecyclerView.ViewHolder{
        public HomePageViewHolder(View view){
            super(view);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
