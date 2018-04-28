package com.oshi.genericsettings.kotlin.expandable

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast
import com.oshi.genericsettings.R
import com.oshi.genericsettings.kotlin.utils.ArrayUtils
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class ExpandableTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS = 1
        private const val POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 2
        private const val POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 3
        private const val POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 4
        private const val POSITION_EXPANDABLE_TITLE_BULLET_ITEMS = 5
        private const val POSITION_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS = 6
        private const val POSITION_COLORED_HEADER = 7
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS = 8
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 9
        private const val POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 10
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 11
        private const val POSITION_COLORED_EXPANDABLE_TITLE_BULLET_ITEMS = 12
        private const val POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS = 13
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

        val expandableTitleBulletItemsData = ExpandableTitleBulletItemsData("Expandable title with BULLET items", ArrayUtils.getNewSimpleItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_BULLET_ITEMS, expandableTitleBulletItemsData)

        val expandableTitleSubtitleBulletItemsData = ExpandableTitleSubtitleBulletItemsData("Expandable title, Subtitle & BULLET items", "I'm just a simple subtitle", ArrayUtils.getNewSimpleItemsList())
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS, expandableTitleSubtitleBulletItemsData)

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
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, coloredExpandableTitleSubtitleCheckableItemsData)

        val coloredExpandableTitleBulletItemsData = ExpandableTitleBulletItemsData("Colored Expandable title with BULLET items", ArrayUtils.getNewSimpleItemsList())
        coloredExpandableTitleBulletItemsData.titleColor = R.color.orange
        coloredExpandableTitleBulletItemsData.iconColor = R.color.orange
        coloredExpandableTitleBulletItemsData.itemsColor = R.color.orange
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_BULLET_ITEMS, coloredExpandableTitleBulletItemsData)

        val coloredExpandableTitleSubtitleBulletItemsData = ExpandableTitleSubtitleBulletItemsData("Colored title & subtitle", "Color bullets!", ArrayUtils.getNewSimpleItemsList())
        coloredExpandableTitleSubtitleBulletItemsData.titleColor = R.color.red
        coloredExpandableTitleSubtitleBulletItemsData.subtitleColor = R.color.red
        coloredExpandableTitleSubtitleBulletItemsData.dividerColor = R.color.red
        coloredExpandableTitleSubtitleBulletItemsData.iconColor = R.color.red
        coloredExpandableTitleSubtitleBulletItemsData.itemsColor = R.color.red
        coloredExpandableTitleSubtitleBulletItemsData.shouldShowDivider = true
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS, coloredExpandableTitleSubtitleBulletItemsData)

        return items
    }

    override fun onExpandableSimpleItemClicked(view: View, data: ExpandableTitleSimpleItemsData, parentPosition: Int, subItemPosition: Int) {
        super.onExpandableSimpleItemClicked(view, data, parentPosition, subItemPosition)
        Log.d(ExpandableTypesPresenter::javaClass.name, "onExpandableSimpleItemClicked: Position: $parentPosition, Sub item: $subItemPosition")
        Toast.makeText(view.context, data.items[subItemPosition] + " Selected", Toast.LENGTH_SHORT).show()
    }

    override fun onExpandableBulletItemClicked(view: View, data: ExpandableTitleBulletItemsData, parentPosition: Int, subItemPosition: Int) {
        super.onExpandableBulletItemClicked(view, data, parentPosition, subItemPosition)
        Toast.makeText(view.context, data.items[subItemPosition] + " Selected", Toast.LENGTH_SHORT).show()
    }

}