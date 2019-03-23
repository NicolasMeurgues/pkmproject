package com.vogella.android.androidpkmn.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.vogella.android.androidpkmn.R;
import com.vogella.android.androidpkmn.controller.MainController;

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
        controller.onStart();

    }
}
