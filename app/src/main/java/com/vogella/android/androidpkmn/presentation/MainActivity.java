package com.vogella.android.androidpkmn.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.vogella.android.androidpkmn.R;
import com.vogella.android.androidpkmn.controller.MainController;
import com.vogella.android.androidpkmn.controller.OnItemClickListener;
import com.vogella.android.androidpkmn.model.Pokemon;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainController controller;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.myRView);

        controller = new MainController(this);
        controller.onCreate();

    }

    public void showList(List<Pokemon> input) {
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input, new OnItemClickListener() {
            @Override
            public void onItemClick(Pokemon pkmn) {
                Intent details = new Intent(MainActivity.this, ActivityDetails.class);
                Gson gson = new Gson();
                details.putExtra("pkmnId", gson.toJson(pkmn));
                startActivity(details);
            }
        });
        recyclerView.setAdapter(mAdapter);

    }
}
