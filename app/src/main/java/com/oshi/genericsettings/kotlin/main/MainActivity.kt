package com.oshi.genericsettings.kotlin.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val settingsPresenter = MainScreenPresenter()
        val adapter = SettingsAdapter(this, settingsPresenter)
        recyclerView.adapter = adapter
    }
}