package com.theoska.sm3607assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.theoska.sm3607assignment1.adapter.HomePageAdapter;

public class MainActivity extends AppCompatActivity {

    private ImageView ivSingleVote;
    private ImageView ivMultVote;
    private ImageView ivStatics;
    private RecyclerView rvHomePage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }


    private void initView() {
        ivSingleVote = (ImageView) findViewById(R.id.iv_single_vote);
        ivMultVote = (ImageView) findViewById(R.id.iv_mult_vote);
        ivStatics = (ImageView) findViewById(R.id.iv_statics);
    }
    private void initListener() {
        ivSingleVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ivMultVote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        ivStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}
