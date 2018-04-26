package com.oshi.genericsettings.kotlin.seekbar

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.HeaderData
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter

class SeekBarTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_ICON_TITLE_SEEK_BAR_VALUE = 1
        private const val POSITION_TITLE_SEEK_BAR_MIN_MAX = 2
        private const val POSITION_COLORED_HEADER = 3
        private const val POSITION_COLORED_ICON_TITLE_SEEK_BAR_VALUE = 4
        private const val POSITION_COLORED_TITLE_SEEK_BAR_MIN_MAX = 5
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("SEEKBAR TYPES")
        items.add(POSITION_HEADER, headerData)

        val titleIconSeekBarTextData = TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Icon, Title, SeekBar & Value text")
        items.add(POSITION_ICON_TITLE_SEEK_BAR_VALUE, titleIconSeekBarTextData)

        val titleSeekBarMinMaxData = TitleSeekBarMinMaxData("Min & Max SeekBar", -80, -20, -50)
        items.add(POSITION_TITLE_SEEK_BAR_MIN_MAX, titleSeekBarMinMaxData)

        val coloredHeaderData = HeaderData("COLORED SEEKBAR TYPES")
        coloredHeaderData.headerColor = R.color.red
        items.add(POSITION_COLORED_HEADER, coloredHeaderData)

        val coloredTitleIconSeekBarTextData = TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Colored Icon, Title, SeekBar & Value")
        coloredTitleIconSeekBarTextData.seekBarThumbColor = R.color.blue
        coloredTitleIconSeekBarTextData.seekBarColor = R.color.cyan
        coloredTitleIconSeekBarTextData.progressTextColor = R.color.blue
        coloredTitleIconSeekBarTextData.titleColor = R.color.blue
        items.add(POSITION_COLORED_ICON_TITLE_SEEK_BAR_VALUE, coloredTitleIconSeekBarTextData)

        val coloredTitleSeekBarMinMaxData = TitleSeekBarMinMaxData("Colored Min & Max SeekBar", 20, 80, 50)
        coloredTitleSeekBarMinMaxData.titleColor = R.color.orange
        coloredTitleSeekBarMinMaxData.seekBarColor = R.color.lights_orange
        coloredTitleSeekBarMinMaxData.seekBarThumbColor = R.color.orange
        coloredTitleSeekBarMinMaxData.minMaxColor = R.color.red
        items.add(POSITION_COLORED_TITLE_SEEK_BAR_MIN_MAX, coloredTitleSeekBarMinMaxData)

        return items
    }

    override fun onTitleSeekBarMinMaxChanged(view: View, data: TitleSeekBarMinMaxData, position: Int) {
        super.onTitleSeekBarMinMaxChanged(view, data, position)
        Snackbar.make(coordinatorLayout, "Progress changed: " + data.getRealProgress(), Snackbar.LENGTH_SHORT).show()
    }

    override fun onTitleIconSeekBarTextChanged(view: View, data: TitleIconSeekBarTextData, position: Int) {
        super.onTitleIconSeekBarTextChanged(view, data, position)
        Snackbar.make(coordinatorLayout, "Progress changed: " + data.seekBarCurrentProgress, Snackbar.LENGTH_SHORT).show()
    }

}