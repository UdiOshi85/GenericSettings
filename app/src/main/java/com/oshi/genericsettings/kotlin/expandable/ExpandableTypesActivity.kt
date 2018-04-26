package com.oshi.genericsettings.kotlin.expandable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.genericsettings.java.expandable.ExpandableTypesPresenter
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import kotlinx.android.synthetic.main.activity_expandables_types.*


class ExpandableTypesActivity : AppCompatActivity() {

    lateinit var adapter : SettingsAdapter
    private lateinit var expandableTypesPresenter : ISettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandables_types)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        expandableTypesPresenter = ExpandableTypesPresenter(recyclerView)
        adapter = SettingsAdapter(this, expandableTypesPresenter)
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