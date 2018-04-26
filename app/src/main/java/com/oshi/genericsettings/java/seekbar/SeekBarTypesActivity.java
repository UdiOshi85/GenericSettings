package com.oshi.genericsettings.java.seekbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.adapter.SettingsAdapter;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SeekBarTypesActivity extends AppCompatActivity {

    public static void show(Context context) {
        Intent intent = new Intent(context, SeekBarTypesActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_types);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinatorLayout);

        ISettingsPresenter seekBarTypesPresenter = new SeekBarTypesPresenter(recyclerView, coordinatorLayout);

        SettingsAdapter adapter = new SettingsAdapter(SeekBarTypesActivity.this, seekBarTypesPresenter);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
