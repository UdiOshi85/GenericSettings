package com.oshi.genericsettings.kotlin.seekbar

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.HeaderData
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter

class SeekBarTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_ICON_TITLE_SEEK_BAR_VALUE = 1
        private const val POSITION_COLORED_HEADER = 2
        private const val POSITION_COLORED_ICON_TITLE_SEEK_BAR_VALUE = 3
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("SEEKBAR TYPES")
        items.add(POSITION_HEADER, headerData)

        val titleIconSeekBarTextData = TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Icon, Title, SeekBar & Value text")
        titleIconSeekBarTextData.key = "seekbar_example"
        titleIconSeekBarTextData.initialSeekBarValue = 25
        items.add(POSITION_ICON_TITLE_SEEK_BAR_VALUE, titleIconSeekBarTextData)

        val coloredHeaderData = HeaderData("COLORED SEEKBAR TYPES")
        coloredHeaderData.headerColor = R.color.red
        items.add(POSITION_COLORED_HEADER, coloredHeaderData)

        val coloredTitleIconSeekBarTextData = TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Colored Icon, Title, SeekBar & Value")
        coloredTitleIconSeekBarTextData.seekBarThumbColor = R.color.blue
        coloredTitleIconSeekBarTextData.seekBarColor = R.color.cyan
        coloredTitleIconSeekBarTextData.progressTextColor = R.color.blue
        coloredTitleIconSeekBarTextData.titleColor = R.color.blue
        items.add(POSITION_COLORED_ICON_TITLE_SEEK_BAR_VALUE, coloredTitleIconSeekBarTextData)

        return items
    }
}