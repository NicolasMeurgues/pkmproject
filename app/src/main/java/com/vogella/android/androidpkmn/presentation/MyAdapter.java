package com.vogella.android.androidpkmn.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vogella.android.androidpkmn.R;
import com.vogella.android.androidpkmn.controller.OnItemClickListener;
import com.vogella.android.androidpkmn.model.Pokemon;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final OnItemClickListener listener;
    private final List<Pokemon> localDataset;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public MyViewHolder(View v){
            super(v);
            layout=v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
        }
    }



    public MyAdapter(List<Pokemon> input, OnItemClickListener listener) {
        localDataset = input;
        this.listener = listener;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell, parent, false);

       MyViewHolder viewHolder = new MyViewHolder(v);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Pokemon pkmn = localDataset.get(position);
        holder.txtHeader.setText(pkmn.getSpecies());
        holder.txtFooter.setText("Je suis le prof Chen");

        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(pkmn);
            }
        });
        holder.txtFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(pkmn);
            }
        });
    }

    @Override
    public int getItemCount() {
        return localDataset.size();
    }
}
