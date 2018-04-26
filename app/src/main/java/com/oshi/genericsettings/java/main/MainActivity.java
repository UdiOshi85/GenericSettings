package com.oshi.genericsettings.java.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.adapter.SettingsAdapter;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ISettingsPresenter settingsPresenter = new MainScreenPresenter(recyclerView);
        SettingsAdapter adapter = new SettingsAdapter(MainActivity.this, settingsPresenter);
        recyclerView.setAdapter(adapter);
    }
}
