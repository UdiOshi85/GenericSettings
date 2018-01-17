package com.oshi.genericsettings.kotlin.seekbar

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SeekBarTypesActivity : AppCompatActivity() {

    lateinit var adapter: SettingsAdapter
    lateinit var recyclerView : RecyclerView
    lateinit var toolbar : Toolbar
    lateinit var coordinatorLayout : CoordinatorLayout
    lateinit var seekBarTypesPresenter : ISettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar_types)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)

        seekBarTypesPresenter = SeekBarTypesPresenter(coordinatorLayout, object : ISettingsPresenter.OnSettingsChangedListener {
            override fun notifyItemChanged(position: Int) {
                adapter.notifyItemChanged(position)
            }
        })

        adapter = SettingsAdapter(this, seekBarTypesPresenter)
        recyclerView.adapter = adapter

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val itemId = item?.itemId

        if (itemId == android.R.id.home) {
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected(item)
    }


}