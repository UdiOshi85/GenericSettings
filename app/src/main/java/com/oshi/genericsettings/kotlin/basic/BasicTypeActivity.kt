package com.oshi.genericsettings.kotlin.basic

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class BasicTypeActivity : AppCompatActivity() {

    private lateinit var basicItemsPresenter : ISettingsPresenter
    private lateinit var basicItemsWithDividerPresenter : ISettingsPresenter
    private lateinit var adapter : SettingsAdapter
    lateinit var recyclerView : RecyclerView
    lateinit var toolbar : Toolbar
    lateinit var coordinatorLayout : CoordinatorLayout
    private var isDividerEnabled : Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_types)

        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        basicItemsPresenter = BasicTypesPresenter(coordinatorLayout)
        basicItemsWithDividerPresenter = BasicTypesDividerPresenter(coordinatorLayout)
        adapter = SettingsAdapter(this, basicItemsPresenter)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_divider, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {


        var itemId = item?.itemId

        if (itemId == android.R.id.home) {
            onBackPressed()
            return true
        } else if (itemId == R.id.divider) {
            toggleDivider()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun toggleDivider() {
        Log.d("BasicTypesActivity", "Toggling divider...")
        isDividerEnabled = !isDividerEnabled

        val presenter = if (isDividerEnabled) basicItemsWithDividerPresenter else basicItemsPresenter
        adapter.replacePresenterAndNotify(presenter)
    }
}