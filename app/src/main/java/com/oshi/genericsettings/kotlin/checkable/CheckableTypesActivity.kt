package com.oshi.genericsettings.kotlin.checkable

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class CheckableTypesActivity : AppCompatActivity() {

    lateinit var adapter: SettingsAdapter
    lateinit var recyclerView : RecyclerView
    lateinit var toolbar : Toolbar
    lateinit var coordinatorLayout : CoordinatorLayout

    lateinit var checkableTypesPresenter : ISettingsPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkable_types)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)

        checkableTypesPresenter = CheckableTypesPresenter(coordinatorLayout, object : ISettingsPresenter.OnSettingsChangedListener {

            override fun notifyItemChanged(position: Int) {
                adapter.notifyItemChanged(position)
            }
        })

        adapter = SettingsAdapter(this, checkableTypesPresenter)
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