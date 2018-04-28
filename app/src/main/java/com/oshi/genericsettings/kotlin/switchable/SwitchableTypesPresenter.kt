package com.oshi.genericsettings.kotlin.switchable

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SwitchCompat
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter

class SwitchableTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_TITLE_SWITCH = 1
        private const val POSITION_TITLE_SUBTITLE_SWITCH = 2
        private const val POSITION_TITLE_SUBTITLE_EXTRA_SWITCH = 3
        private const val POSITION_COLORED_HEADER = 4
        private const val POSITION_COLORED_TITLE_SWITCH = 5
        private const val POSITION_COLORED_TITLE_SUBTITLE_SWITCH = 6
        private const val POSITION_COLORED_TITLE_SUBTITLE_EXTRA_SWITCH = 7
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("SWITCHABLE TYPES")
        items.add(POSITION_HEADER, headerData)

        val titleSwitchData = TitleSwitchData("Single title with switch")
        titleSwitchData.key = "switch_1"
        items.add(POSITION_TITLE_SWITCH, titleSwitchData)

        val titleSubtitleSwitchData = TitleSubtitleSwitchData("Two rows with a switch", "An extra subtitle row")
        titleSubtitleSwitchData.key = "switch_2"
        items.add(POSITION_TITLE_SUBTITLE_SWITCH , titleSubtitleSwitchData)

        val titleSubtitleExtraSwitchData = TitleSubtitleExtraSwitchData("Third rows example", "Subtitle is here", "An extra text")
        titleSubtitleExtraSwitchData.key = "switch_3"
        items.add(POSITION_TITLE_SUBTITLE_EXTRA_SWITCH, titleSubtitleExtraSwitchData)

        val coloredHeaderData = HeaderData("COLORING SWITCHABLE TYPES")
        coloredHeaderData.headerColor = R.color.purple
        items.add(POSITION_COLORED_HEADER, coloredHeaderData)

        val coloredTitleSwitchData = TitleSwitchData("Colored title & switch")
        coloredTitleSwitchData.titleColor = R.color.orange
        coloredTitleSwitchData.switchThumbUncheckedColor = R.color.grey
        coloredTitleSwitchData.switchThumbCheckedColor = R.color.orange
        coloredTitleSwitchData.switchTrackUncheckedColor = R.color.green
        coloredTitleSwitchData.switchTrackCheckedColor = R.color.orange
        items.add(POSITION_COLORED_TITLE_SWITCH, coloredTitleSwitchData)

        val coloredTitleSubtitleSwitchData = TitleSubtitleSwitchData("Coloring with subtitle", "All is green")
        coloredTitleSubtitleSwitchData.titleColor = R.color.green_dark
        coloredTitleSubtitleSwitchData.subtitleColor = R.color.green_dark
        coloredTitleSubtitleSwitchData.switchThumbUncheckedColor = R.color.grey
        coloredTitleSubtitleSwitchData.switchTrackUncheckedColor = R.color.red
        coloredTitleSubtitleSwitchData.switchTrackCheckedColor = R.color.green
        coloredTitleSubtitleSwitchData.switchThumbCheckedColor = R.color.green
        items.add(POSITION_COLORED_TITLE_SUBTITLE_SWITCH, coloredTitleSubtitleSwitchData)


        val coloredTitleSubtitleExtraSwitchData = TitleSubtitleExtraSwitchData("Coloring Three rows", "All is red", "toggle switch colors")
        coloredTitleSubtitleExtraSwitchData.titleColor = R.color.red_text
        coloredTitleSubtitleExtraSwitchData.subtitleColor = R.color.red_text
        coloredTitleSubtitleExtraSwitchData.extraColor = R.color.red_text
        coloredTitleSubtitleExtraSwitchData.switchTrackUncheckedColor = R.color.red_disabled
        coloredTitleSubtitleExtraSwitchData.switchThumbUncheckedColor = R.color.red_disabled
        coloredTitleSubtitleExtraSwitchData.switchThumbCheckedColor = R.color.red
        coloredTitleSubtitleExtraSwitchData.switchTrackCheckedColor = R.color.green
        items.add(POSITION_COLORED_TITLE_SUBTITLE_EXTRA_SWITCH, coloredTitleSubtitleExtraSwitchData)

        return items
    }
}