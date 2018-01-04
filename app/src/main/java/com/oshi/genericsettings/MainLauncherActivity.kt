package com.oshi.genericsettings

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.oshi.genericsettings.kotlin.startMainActivity
import kotlinx.android.synthetic.main.activity_main_launcher.*

class MainLauncherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_launcher)

        seeExamplesButton.setOnClickListener {
            startMainActivity()
        }
    }

}