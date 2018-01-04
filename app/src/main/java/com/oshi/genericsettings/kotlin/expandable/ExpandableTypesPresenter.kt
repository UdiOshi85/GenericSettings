package com.oshi.genericsettings.kotlin.expandable

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.util.Log
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.genericsettings.kotlin.utils.ArrayUtils
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class ExpandableTypesPresenter(var coordinatorLayout: CoordinatorLayout, var listener : ISettingsPresenter.OnSettingsChangedListener) : BaseSettingsPresenter() {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS = 1
        private const val POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 2
        private const val POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 3
        private const val POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 4
        private const val POSITION_COLORED_HEADER = 5
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS = 6
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 7
        private const val POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 8
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 9
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("EXPANDABLE TYPES")
        items.add(POSITION_HEADER, headerData)

        val expandableTitleSimpleItemsData = ExpandableTitleSimpleItemsData("Expandable title with simple items", ArrayUtils.getNewSimpleItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS, expandableTitleSimpleItemsData)

        val expandableTitleSubtitleSimpleItemsData = ExpandableTitleSubtitleSimpleItemsData("Expandable title & subtitle", "Simple items",  ArrayUtils.getNewSimpleItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, expandableTitleSubtitleSimpleItemsData)

        val expandableTitleCheckableItemsData = ExpandableTitleCheckableItemsData("Expandable title with checkable items", ArrayUtils.getNewCheckableItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS, expandableTitleCheckableItemsData)

        val expandableTitleSubtitleCheckableItemsData = ExpandableTitleSubtitleCheckableItemsData("Expandable title with subtitle", "Checkable items", ArrayUtils.getNewCheckableItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, expandableTitleSubtitleCheckableItemsData)

        val coloredHeaderData = HeaderData("COLORED EXPANDABLE TYPES")
        coloredHeaderData.headerColor = R.color.blue
        items.add(POSITION_COLORED_HEADER, coloredHeaderData)

        val coloredExpandableTitleSimpleItemsData = ExpandableTitleSimpleItemsData("Colored title with simple colored items",  ArrayUtils.getNewSimpleItemsList())
        coloredExpandableTitleSimpleItemsData.titleColor = R.color.blue
        coloredExpandableTitleSimpleItemsData.iconColor = R.color.blue
        coloredExpandableTitleSimpleItemsData.itemsColor = R.color.blue
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS, coloredExpandableTitleSimpleItemsData)

        val coloredExpandableTitleSubtitleSimpleItemsData = ExpandableTitleSubtitleSimpleItemsData("Colored title with subtitle", "Simple Items",  ArrayUtils.getNewSimpleItemsList())
        coloredExpandableTitleSubtitleSimpleItemsData.titleColor = R.color.blue
        coloredExpandableTitleSubtitleSimpleItemsData.subtitleColor = R.color.red_text
        coloredExpandableTitleSubtitleSimpleItemsData.iconColor = R.color.light_green
        coloredExpandableTitleSubtitleSimpleItemsData.itemsColor = R.color.orange
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, coloredExpandableTitleSubtitleSimpleItemsData)

        val coloredExpandableTitleCheckableItemsData = ExpandableTitleCheckableItemsData("Colored title with checkable colored", ArrayUtils.getNewCheckableItemsList())
        coloredExpandableTitleCheckableItemsData.titleColor = R.color.purple
        coloredExpandableTitleCheckableItemsData.itemsColor = R.color.purple
        coloredExpandableTitleCheckableItemsData.checkboxColor = R.color.purple
        coloredExpandableTitleCheckableItemsData.iconColor = R.color.purple
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS, coloredExpandableTitleCheckableItemsData)

        val coloredExpandableTitleSubtitleCheckableItemsData = ExpandableTitleSubtitleCheckableItemsData("Colored title & subtitle", "Checkable Items", ArrayUtils.getNewCheckableItemsList())
        coloredExpandableTitleSubtitleCheckableItemsData.titleColor = R.color.colorPrimary
        coloredExpandableTitleSubtitleCheckableItemsData.subtitleColor = R.color.colorPrimary
        coloredExpandableTitleSubtitleCheckableItemsData.checkboxColor = R.color.orange
        coloredExpandableTitleSubtitleCheckableItemsData.dividerColor = R.color.red
        coloredExpandableTitleSubtitleCheckableItemsData.shouldShowDivider = true
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, coloredExpandableTitleSubtitleCheckableItemsData);

        return items
    }

    override fun onExpandableCheckableItemClicked(view: View, data: ExpandableTitleCheckableItemsData, parentPosition: Int, subItemPosition: Int) {
        Log.d(ExpandableTypesPresenter::javaClass.name, "onExpandableCheckableItemClicked: Position: $parentPosition, Sub item: $subItemPosition")
        val oldVal = data.items[subItemPosition].isChecked
        val newVal = !oldVal
        data.items[subItemPosition].isChecked = newVal
        listener.notifyItemChanged(parentPosition)
    }

    override fun onExpandableSimpleItemClicked(view: View, data: ExpandableTitleSimpleItemsData, parentPosition: Int, subItemPosition: Int) {
        super.onExpandableSimpleItemClicked(view, data, parentPosition, subItemPosition)
        Log.d(ExpandableTypesPresenter::javaClass.name, "onExpandableSimpleItemClicked: Position: $parentPosition, Sub item: $subItemPosition")
    }

}