package com.oshi.genericsettings.kotlin.debug.checkable

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.TitleCheckboxData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter

class CheckableItemTestPresenter(recyclerView: RecyclerView) : BaseSettingsPresenter(recyclerView) {

    /**
     * 50 Items.
     * Checking recycling.
     * First 10 - Blank and regular
     * 10-20 - Reds
     * 20-30 - Blues
     * 30-40 - Blanks
     * 40-50 - Reds
     */
    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        for (i in 1..50) {

            val titleCheckboxData = TitleCheckboxData("Item $i")

            if (i in 10..20) {
                titleCheckboxData.checkboxColor = R.color.red
            }

            if (i in 20..30) {
                titleCheckboxData.checkboxColor = R.color.blue
            }

            if (i in 40..50) {
                titleCheckboxData.checkboxColor = R.color.red
            }

            items.add(titleCheckboxData)
        }

        return items
    }
}