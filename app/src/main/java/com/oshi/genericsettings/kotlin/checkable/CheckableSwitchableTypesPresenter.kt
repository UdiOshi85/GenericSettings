package com.oshi.genericsettings.kotlin.checkable

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.genericsettings.kotlin.switchable.SwitchableTypesPresenter
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class CheckableSwitchableTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {


    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        // -------------- CHECKABLE TYPES ---------------------
        val checkableHeader = HeaderData("CHECKABLE TYPES")
        items.add(checkableHeader)

        val titleCheckboxData = TitleCheckboxData("Title & Checkbox")
        titleCheckboxData.key = "title_checkbox"
        items.add(titleCheckboxData)

        val titleSubtitleCheckboxData = TitleSubtitleCheckboxData("Title, Subtitle & Checkbox", "Subtitle example")
        titleSubtitleCheckboxData.key = "title_subtitle_checkbox"
        items.add(titleSubtitleCheckboxData)

        val titleSubtitleExtraCheckboxData = TitleSubtitleExtraCheckboxData("Title, Subtitle, Extra & Checkbox", "Subtitle example", "Extra example")
        titleSubtitleExtraCheckboxData.key = "title_subtitle_extra_checkbox"
        items.add(titleSubtitleExtraCheckboxData)

        // --------------- END OF CHECKABLE TYPES ---------------


        // ----------- SWITCHABLE TYPES ---------------
        val switchableHeader = HeaderData("SWITCHABLE TYPES")
        items.add(switchableHeader)

        val titleSwitchData = TitleSwitchData("Title & Switch")
        titleSwitchData.key = "title_switch"
        items.add(titleSwitchData)

        val titleSubtitleSwitchData = TitleSubtitleSwitchData("Title, Subtitle & Switch", "Subtitle example")
        titleSubtitleSwitchData.key = "title_subtitle_switch"
        items.add(titleSubtitleSwitchData)

        val titleSubtitleExtraSwitchData = TitleSubtitleExtraSwitchData("Title, Subtitle, Extra & Switch", "Subtitle example", "Extra example")
        titleSubtitleExtraSwitchData.key = "title_subtitle_extra_switch"
        items.add(titleSubtitleExtraSwitchData)

        // ----------- END OF SWITCHABLE TYPES ---------------

        // -------------- CUSTOMIZED CHECKABLE TYPES --------------------
        val colorSectionHeaderData = HeaderData("CUSTOMIZED CHECKABLE TYPES")
        colorSectionHeaderData.headerColor = R.color.red
        items.add(colorSectionHeaderData)

        val coloredTitleCheckboxData = TitleCheckboxData("Customized Title & Checkbox")
        coloredTitleCheckboxData.key = "customized_title_checkbox"
        coloredTitleCheckboxData.titleColor = R.color.red
        coloredTitleCheckboxData.checkboxColor = R.color.red
        items.add(coloredTitleCheckboxData)

        val coloredTitleSubtitleCheckboxData = TitleSubtitleCheckboxData("Customized Title, Subtitle & Checkbox", "Subtitle example")
        coloredTitleSubtitleCheckboxData.titleColor = R.color.red
        coloredTitleSubtitleCheckboxData.subtitleColor = R.color.red
        coloredTitleSubtitleCheckboxData.checkboxColor = R.color.red
        coloredTitleSubtitleCheckboxData.key = "customized_title_subtitle_checkbox"
        items.add(coloredTitleSubtitleCheckboxData)

        val coloredTitleSubtitleExtraCheckbox = TitleSubtitleExtraCheckboxData("Customized Title, Subtitle, Extra & Checkbox", "Subtitle example", "Extra example")
        coloredTitleSubtitleExtraCheckbox.titleColor = R.color.red
        coloredTitleSubtitleExtraCheckbox.subtitleColor = R.color.red
        coloredTitleSubtitleExtraCheckbox.extraColor = R.color.red
        coloredTitleSubtitleExtraCheckbox.checkboxColor = R.color.red
        coloredTitleSubtitleExtraCheckbox.key = "customized_title_subtitle_extra_checkbox"
        items.add(coloredTitleSubtitleExtraCheckbox)

        // -------------- END OF CUSTOMIZED CHECKABLE TYPES --------------------

        // ----------- CUSTOMIZED SWITCHABLE TYPES ---------------
        val coloredCustomizedSwitchableHeaderSection = HeaderData("CUSTOMIZED SWITCHABLE TYPES")
        coloredCustomizedSwitchableHeaderSection.headerColor = R.color.red
        items.add(coloredCustomizedSwitchableHeaderSection)

        val customizedTitleSwitchData = TitleSwitchData("Customized Title & Switch")
        customizedTitleSwitchData.key = "customized_title_switch"
        customizedTitleSwitchData.titleColor = R.color.red
        customizedTitleSwitchData.switchThumbCheckedColor = R.color.red
        customizedTitleSwitchData.switchThumbUncheckedColor = R.color.red
        customizedTitleSwitchData.switchTrackCheckedColor = R.color.red_disabled
        customizedTitleSwitchData.switchTrackUncheckedColor = R.color.red_disabled
        items.add(customizedTitleSwitchData)

        val customizedTitleSubtitleSwitchData = TitleSubtitleSwitchData("Customized Title, Subtitle & Switch", "Subtitle example")
        customizedTitleSubtitleSwitchData.key = "customized_title_subtitle_switch"
        customizedTitleSubtitleSwitchData.titleColor = R.color.red
        customizedTitleSubtitleSwitchData.subtitleColor = R.color.red
        customizedTitleSubtitleSwitchData.switchThumbCheckedColor = R.color.red
        customizedTitleSubtitleSwitchData.switchThumbUncheckedColor = R.color.red
        customizedTitleSubtitleSwitchData.switchTrackCheckedColor = R.color.red_disabled
        customizedTitleSubtitleSwitchData.switchTrackUncheckedColor = R.color.red_disabled
        items.add(customizedTitleSubtitleSwitchData)

        val customizedTitleSubtitleExtraSwitchData = TitleSubtitleExtraSwitchData("Customized Title, Subtitle, Extra & Switch", "Subtitle example", "Extra example")
        customizedTitleSubtitleExtraSwitchData.key = "customized_title_subtitle_extra_switch"
        customizedTitleSubtitleExtraSwitchData.titleColor = R.color.red
        customizedTitleSubtitleExtraSwitchData.subtitleColor = R.color.red
        customizedTitleSubtitleExtraSwitchData.extraColor = R.color.red
        customizedTitleSubtitleExtraSwitchData.switchThumbCheckedColor = R.color.red
        customizedTitleSubtitleExtraSwitchData.switchThumbUncheckedColor = R.color.red
        customizedTitleSubtitleExtraSwitchData.switchTrackCheckedColor = R.color.red_disabled
        customizedTitleSubtitleExtraSwitchData.switchTrackUncheckedColor = R.color.red_disabled
        items.add(customizedTitleSubtitleExtraSwitchData)
        // ----------- END OF CUSTOMIZED SWITCHABLE TYPES ---------------
        return items
    }
}