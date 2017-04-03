package com.vengalrao.android.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScrollActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        mRecyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerView.Adapter<ViewHolder>(){

            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                LayoutInflater inflater=LayoutInflater.from(parent.getContext());
                View v=inflater.inflate(R.layout.recycler_item,parent,false);
                ViewHolder viewHolder=new ViewHolder(v);
                return viewHolder;
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                //holder.mTextView.setText("hello");
            }

            @Override
            public int getItemCount() {
                return 10;
            }
        });
    }

    private static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        View mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView=itemView.findViewById(R.id.text_list);
        }

        @Override
        public void onClick(View v) {

        }
    }
}


