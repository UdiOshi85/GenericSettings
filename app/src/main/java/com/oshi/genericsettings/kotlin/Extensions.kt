package com.oshi.genericsettings.kotlin

import android.content.Context
import android.content.Intent
import com.oshi.genericsettings.java.expandable.ExpandableTypesActivity
import com.oshi.genericsettings.java.main.MainActivity
import com.oshi.genericsettings.kotlin.basic.BasicTypeActivity
import com.oshi.genericsettings.kotlin.checkable.CheckableTypesActivity
import com.oshi.genericsettings.kotlin.seekbar.SeekBarTypesActivity
import com.oshi.genericsettings.kotlin.switchable.SwitchableTypesActivity

/**
 * Extensions helpers
 */
fun Context.startBasicTypeActivity() = Intent(this, BasicTypeActivity::class.java).apply(this::startActivity)
fun Context.startCheckableTypesActivity() = Intent(this, CheckableTypesActivity::class.java).apply(this::startActivity)
fun Context.startExpandableTypesActivity() = Intent(this, ExpandableTypesActivity::class.java).apply(this::startActivity)
fun Context.startSeekbarTypesActivity() = Intent(this, SeekBarTypesActivity::class.java).apply(this::startActivity)
fun Context.startSwitchableTypesActivity() = Intent(this, SwitchableTypesActivity::class.java).apply(this::startActivity)
fun Context.startMainJavaActivity() = Intent(this, MainActivity::class.java).apply(this::startActivity)
fun Context.startMainKotlinActivity() = Intent(this, com.oshi.genericsettings.kotlin.main.MainActivity::class.java).apply (this::startActivity)