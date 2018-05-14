package com.oshi.genericsettings.kotlin.debug.switchable

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.TitleSwitchData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter

class SwitchableItemTestPresenter(recyclerView: RecyclerView) : BaseSettingsPresenter(recyclerView) {

    override fun getItems(context: Context): List<BaseViewTypeData> {
        val items = ArrayList<BaseViewTypeData>()

        for (i in 1..50) {
            val titleSwitchData = TitleSwitchData("Item $i")

            titleSwitchData.switchTrackUncheckedColor = R.color.red_disabled
            titleSwitchData.switchTrackCheckedColor = R.color.red_disabled


            titleSwitchData.key ="test_switch_$i"

            if (i in 10..20) {
                titleSwitchData.switchThumbUncheckedColor = R.color.grey_dark
                titleSwitchData.switchThumbCheckedColor = R.color.red
            }

            items.add(titleSwitchData)
        }

        return items
    }
}