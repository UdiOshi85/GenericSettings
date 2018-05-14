package com.oshi.genericsettings.kotlin.launcher

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import com.oshi.libgenericsettings.data.BaseViewTypeData

class ExamplesViewPagerAdapter(fm: FragmentManager, var items: List<BaseViewTypeData.Companion.SettingsViewTypes>) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return ExampleFragment.newInstance(items[position])
    }

    override fun getCount(): Int {
        return items.size
    }

}