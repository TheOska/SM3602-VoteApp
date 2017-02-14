package com.theoska.sm3607assignment1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.theoska.sm3607assignment1.R;

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
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home, parent, false);
        return new HomePageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
