package com.oshi.genericsettings.main.activity.basic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.adapter.SettingsAdapter;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class BasicTypesActivity extends AppCompatActivity {

    public static void show(Context context) {
        Intent intent = new Intent(context, BasicTypesActivity.class);
        context.startActivity(intent);
    }

    private ISettingsPresenter basicItemsPresenter;
    private ISettingsPresenter basicItemsWithDividerPresenter;
    private SettingsAdapter adapter;
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private CoordinatorLayout coordinatorLayout;
    private boolean isDividerEnabled = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_types);

        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        basicItemsPresenter = new BasicTypesPresenter(coordinatorLayout);
        basicItemsWithDividerPresenter = new BasicTypesDividerPresenter(coordinatorLayout);
        adapter = new SettingsAdapter(BasicTypesActivity.this, basicItemsPresenter);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == android.R.id.home) {
            onBackPressed();
            return true;
        } else if (itemId == R.id.divider) {
            toggleDivider();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_divider, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void toggleDivider() {
        isDividerEnabled = !isDividerEnabled;

        adapter.setPresenter(isDividerEnabled ? basicItemsWithDividerPresenter : basicItemsPresenter);
        adapter.notifyDataSetChanged();
    }
}
