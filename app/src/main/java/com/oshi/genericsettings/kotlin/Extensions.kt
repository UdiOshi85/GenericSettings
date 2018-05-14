package com.oshi.genericsettings.kotlin

import android.content.Context
import android.content.Intent
import com.oshi.genericsettings.kotlin.basic.BasicTypeActivity
import com.oshi.genericsettings.kotlin.checkable.CheckableSwitchableTypesActivity
import com.oshi.genericsettings.kotlin.debug.checkable.CheckableItemTestActivity
import com.oshi.genericsettings.kotlin.debug.switchable.SwitchableItemTestActivity
import com.oshi.genericsettings.kotlin.main.MainActivity
import com.oshi.genericsettings.kotlin.seekbar.SeekBarTypesActivity

/**
 * Extensions helpers
 */
fun Context.startBasicTypeActivity() = Intent(this, BasicTypeActivity::class.java).apply(this::startActivity)
fun Context.startCheckableSwitchableTypesActivity() = Intent(this, CheckableSwitchableTypesActivity::class.java).apply(this::startActivity)
fun Context.startSeekbarTypesActivity() = Intent(this, SeekBarTypesActivity::class.java).apply(this::startActivity)
fun Context.startMainKotlinActivity() = Intent(this, MainActivity::class.java).apply (this::startActivity)
fun Context.startCheckableItemTestActivity() = Intent(this, CheckableItemTestActivity::class.java).apply (this::startActivity)
fun Context.startSwitchableItemTestActivity() = Intent(this, SwitchableItemTestActivity::class.java).apply (this::startActivity)