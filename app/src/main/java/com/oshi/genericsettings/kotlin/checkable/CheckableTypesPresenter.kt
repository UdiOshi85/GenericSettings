package com.oshi.genericsettings.kotlin.checkable

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.AppCompatCheckBox
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class CheckableTypesPresenter(var coordinatorLayout: CoordinatorLayout, var onSettingsChangedListener : ISettingsPresenter.OnSettingsChangedListener) : BaseSettingsPresenter() {


    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_TITLE_CHECKBOX = 1
        private const val POSITION_TITLE_SUBTITLE_CHECKBOX = 2
        private const val POSITION_TITLE_SUBTITLE_EXTRA_CHECKBOX = 3
        private const val POSITION_COLOR_SECTION_HEADER = 4
        private const val POSITION_COLOR_TITLE_CHECKBOX = 5
        private const val POSITION_COLOR_TITLE_SUBTITLE_CHECKBOX = 6
        private const val POSITION_COLOR_TITLE_SUBTITLE_EXTRA_CHECKBOX = 7
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("CHECKABLE TYPES")
        items.add(POSITION_HEADER, headerData)

        val titleCheckboxData = TitleCheckboxData("Checkable Single text")
        items.add(POSITION_TITLE_CHECKBOX, titleCheckboxData)

        val titleSubtitleCheckboxData = TitleSubtitleCheckboxData("Checkable title & subtitle", "An extra text if needed")
        items.add(POSITION_TITLE_SUBTITLE_CHECKBOX, titleSubtitleCheckboxData)

        val titleSubtitleExtraCheckboxData = TitleSubtitleExtraCheckboxData("Three rows item", "Subtitle placeholder", "An extra text")
        items.add(POSITION_TITLE_SUBTITLE_EXTRA_CHECKBOX, titleSubtitleExtraCheckboxData)

        val colorSectionHeaderData = HeaderData("COLORING CHECKABLE TYPES")
        items.add(POSITION_COLOR_SECTION_HEADER, colorSectionHeaderData)

        val coloredTitleCheckboxData = TitleCheckboxData("Colored Checkable Single text")
        coloredTitleCheckboxData.checkboxColor = R.color.red
        items.add(POSITION_COLOR_TITLE_CHECKBOX, coloredTitleCheckboxData)

        val coloredTitleSubtitleCheckboxData = TitleSubtitleCheckboxData("Colored Checkable title & subtitle", "An extra text if needed")
        coloredTitleSubtitleCheckboxData.titleColor = R.color.blue
        coloredTitleSubtitleCheckboxData.subtitleColor = R.color.blue
        coloredTitleSubtitleCheckboxData.checkboxColor = R.color.blue
        items.add(POSITION_COLOR_TITLE_SUBTITLE_CHECKBOX, coloredTitleSubtitleCheckboxData)

        val coloredTitleSubtitleExtraCheckbox = TitleSubtitleExtraCheckboxData("Colored Three rows item", "Subtitle placeholder", "An extra text")
        coloredTitleSubtitleExtraCheckbox.titleColor = R.color.colorAccent
        coloredTitleSubtitleExtraCheckbox.subtitleColor = R.color.colorAccent
        coloredTitleSubtitleExtraCheckbox.extraColor = R.color.colorAccent
        coloredTitleSubtitleExtraCheckbox.checkboxColor = R.color.colorAccent
        items.add(POSITION_COLOR_TITLE_SUBTITLE_EXTRA_CHECKBOX, coloredTitleSubtitleExtraCheckbox)

        return items
    }

    override fun onTitleCheckboxClick(view: View, data: TitleCheckboxData, position: Int) {
        val oldValue = data.isEnabled
        val newValue = !oldValue

        data.isEnabled = newValue

        val checkBox = view.findViewById<AppCompatCheckBox>(R.id.checkbox)
        checkBox.isChecked = newValue

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }

    override fun onCheckboxTitleSubtitleClick(view: View, data: TitleSubtitleCheckboxData, position: Int) {
        val oldValue = data.isEnabled
        val newValue = !oldValue

        data.isEnabled = newValue

        val checkBox = view.findViewById<AppCompatCheckBox>(R.id.checkbox)
        checkBox.isChecked = newValue

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }

    override fun onTitleSubtitleExtraCheckboxClick(view: View, data: TitleSubtitleExtraCheckboxData, position: Int) {
        val oldValue = data.isEnabled
        val newValue = !oldValue;

        data.isEnabled = newValue

        val checkBox = view.findViewById<AppCompatCheckBox>(R.id.checkbox);
        checkBox.isChecked = newValue

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }



}