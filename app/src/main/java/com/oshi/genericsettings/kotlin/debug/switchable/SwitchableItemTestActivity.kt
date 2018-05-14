package com.oshi.genericsettings.kotlin.debug.switchable

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.oshi.genericsettings.R
import com.oshi.genericsettings.databinding.ActivitySwitchableItemTestBinding
import com.oshi.genericsettings.kotlin.debug.checkable.CheckableItemTestPresenter
import com.oshi.libgenericsettings.adapter.SettingsAdapter

class SwitchableItemTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySwitchableItemTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_switchable_item_test)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val presenter = SwitchableItemTestPresenter(binding.recyclerView)
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