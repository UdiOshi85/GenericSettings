package com.udioshi85.genericsettings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.udioshi85.libgenericsettings.adapter.SettingsAdapter;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SettingsAdapter adapter;
    private ISettingsPresenter settingsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        settingsPresenter = new MainPresenter();
        adapter = new SettingsAdapter(settingsPresenter);
        recyclerView.setAdapter(adapter);


    }
}
