package com.oshi.genericsettings.kotlin.basic

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class BasicTypesPresenter(recyclerView: RecyclerView, var coordinatorLayout: CoordinatorLayout) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_HEADER = 0
        private const val POSITION_SINGLE_TITLE = 1
        private const val POSITION_TWO_ROWS = 2
        private const val POSITION_THREE_ROWS = 3
        private const val POSITION_TITLE_SUBTITLE = 4
        private const val POSITION_COLORED_HEADER = 5
        private const val POSITION_COLORED_SINGLE_TITLE = 6
        private const val POSITION_COLORED_TWO_ROWS = 7
        private const val POSITION_COLORED_THREE_ROWS = 8
        private const val POSITION_COLORED_TITLE_SUBTITLE = 9
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val headerData = HeaderData("BASIC ITEMS")
        items.add(POSITION_HEADER, headerData)

        val titleData = TitleData("Single title")
        items.add(POSITION_SINGLE_TITLE, titleData)

        val titleSubtitleData = TitleSubtitleData("Two rows example", "Simple as that")
        items.add(POSITION_TWO_ROWS, titleSubtitleData)

        val titleSubtitleExtraData = TitleSubtitleExtraData("Three lines ahead", "subtitle is here", "An extra text")
        items.add(POSITION_THREE_ROWS, titleSubtitleExtraData)

        val titleSecondaryTitleData = TitleSecondaryTitleData("Title & secondary text", "SECONDARY")
        items.add(POSITION_TITLE_SUBTITLE, titleSecondaryTitleData)

        val coloredHeader = HeaderData("CUSTOMIZED BASIC ITEMS")
        coloredHeader.headerColor = R.color.red
        items.add(POSITION_COLORED_HEADER, coloredHeader)

        val coloredTitleData = TitleData("Single title")
        coloredTitleData.titleColor = R.color.red
        items.add(POSITION_COLORED_SINGLE_TITLE, coloredTitleData)

        val coloredTitleSubtitleData = TitleSubtitleData("Two rows example", "Simple as that")
        coloredTitleSubtitleData.titleColor = R.color.red
        coloredTitleSubtitleData.subtitleColor = R.color.red
        items.add(POSITION_COLORED_TWO_ROWS, coloredTitleSubtitleData)

        val coloredTitleSubtitleExtraData = TitleSubtitleExtraData("Three lines ahead", "subtitle is here", "An extra text")
        coloredTitleSubtitleExtraData.titleColor = R.color.red
        coloredTitleSubtitleExtraData.subtitleColor = R.color.red
        coloredTitleSubtitleExtraData.extraColor = R.color.red
        items.add(POSITION_COLORED_THREE_ROWS, coloredTitleSubtitleExtraData)

        val coloredTitleSecondaryTitleData = TitleSecondaryTitleData("Title & secondary text","SECONDARY")
        coloredTitleSecondaryTitleData.titleColor = R.color.red
        coloredTitleSecondaryTitleData.secondaryTitleColor = R.color.red
        items.add(POSITION_COLORED_TITLE_SUBTITLE, coloredTitleSecondaryTitleData)

        return items
    }

    override fun onTitleClick(view: View, data: TitleData, position: Int) {
        if (position == POSITION_SINGLE_TITLE) {
            Snackbar.make(coordinatorLayout, "Single title clicked", Snackbar.LENGTH_SHORT).show()
        } else if (position == POSITION_COLORED_SINGLE_TITLE) {
            Snackbar.make(coordinatorLayout, "Colored single title clicked", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onTitleSubtitleClick(view: View, data: TitleSubtitleData, position: Int) {
        if (position == POSITION_TWO_ROWS) {
            Snackbar.make(coordinatorLayout, "Two rows clicked", Snackbar.LENGTH_SHORT).show()
        } else if (position == POSITION_COLORED_TWO_ROWS) {
            Snackbar.make(coordinatorLayout, "Colored two rows clicked", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraData, position: Int) {
        if (position == POSITION_THREE_ROWS) {
            Snackbar.make(coordinatorLayout, "Three rows clicked", Snackbar.LENGTH_SHORT).show()
        } else if (position == POSITION_COLORED_THREE_ROWS) {
            Snackbar.make(coordinatorLayout, "Colored three rows clicked", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onTitleSecondaryTitleClick(view: View, data: TitleSecondaryTitleData, position: Int) {
        if (position == POSITION_TITLE_SUBTITLE) {
            Snackbar.make(coordinatorLayout, "Title & Secondary title clicked", Snackbar.LENGTH_SHORT).show()
        } else if (position == POSITION_COLORED_TITLE_SUBTITLE) {
            Snackbar.make(coordinatorLayout, "Colored Title & Secondary title clicked", Snackbar.LENGTH_SHORT).show()
        }
    }
}
