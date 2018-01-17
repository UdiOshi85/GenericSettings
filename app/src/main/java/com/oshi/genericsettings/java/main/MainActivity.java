package com.oshi.genericsettings.java.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.adapter.SettingsAdapter;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SettingsAdapter adapter;
    private ISettingsPresenter settingsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        settingsPresenter = new MainScreenPresenter();
        adapter = new SettingsAdapter(MainActivity.this, settingsPresenter);
        recyclerView.setAdapter(adapter);
    }
}
