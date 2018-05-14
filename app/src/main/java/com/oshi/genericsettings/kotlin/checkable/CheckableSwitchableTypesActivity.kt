package com.oshi.genericsettings.kotlin.checkable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import kotlinx.android.synthetic.main.activity_checkable_types.*


class CheckableSwitchableTypesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkable_types)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val checkableSwitchableTypesPresenter = CheckableSwitchableTypesPresenter(recyclerView, coordinatorLayout)

        val adapter = SettingsAdapter(this, checkableSwitchableTypesPresenter)
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