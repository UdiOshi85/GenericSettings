package com.oshi.genericsettings.kotlin.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsPresenter = MainScreenPresenter(recyclerView)
        val adapter = SettingsAdapter(this, settingsPresenter)
        recyclerView.adapter = adapter
    }
}