package com.oshi.genericsettings

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.oshi.genericsettings.kotlin.startMainJavaActivity
import com.oshi.genericsettings.kotlin.startMainKotlinActivity
import com.oshi.libgenericsettings.adapter.SettingsAdapter
import kotlinx.android.synthetic.main.activity_main_launcher.*

class MainLauncherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_launcher)

        startJava.setOnClickListener {
            startMainJavaActivity()
        }

        startKotlin.setOnClickListener {
            startMainKotlinActivity()
        }

        initWhatsNewList()
    }

    private fun initWhatsNewList() {

        val adapter = SettingsAdapter(this, WhatsNewPresenter(whatsNewList))
        whatsNewList.layoutManager = LinearLayoutManager(this)
        whatsNewList.adapter = adapter

        version.text = getVersionName()
    }

    private fun getVersionName() : String {
        val pInfo = packageManager.getPackageInfo(packageName, 0)
        return "v" + pInfo.versionName
    }
}