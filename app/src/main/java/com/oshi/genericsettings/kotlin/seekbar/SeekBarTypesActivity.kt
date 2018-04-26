package com.oshi.genericsettings.kotlin.seekbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import kotlinx.android.synthetic.main.activity_seekbar_types.*


class SeekBarTypesActivity : AppCompatActivity() {

    lateinit var adapter: SettingsAdapter
    private lateinit var seekBarTypesPresenter : ISettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar_types)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        seekBarTypesPresenter = SeekBarTypesPresenter(recyclerView, coordinatorLayout)

        adapter = SettingsAdapter(this, seekBarTypesPresenter)
        recyclerView.adapter = adapter

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val itemId = item.itemId

        if (itemId == android.R.id.home) {
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected(item)
    }


}