package com.oshi.genericsettings.kotlin.debug.checkable

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.genericsettings.databinding.ActivityCheckableItemTestBinding
import com.oshi.libgenericsettings.adapter.SettingsAdapter

class CheckableItemTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCheckableItemTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_checkable_item_test)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val presenter = CheckableItemTestPresenter(binding.recyclerView)
        val adapter = SettingsAdapter(this, presenter)
        binding.recyclerView.adapter = adapter
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