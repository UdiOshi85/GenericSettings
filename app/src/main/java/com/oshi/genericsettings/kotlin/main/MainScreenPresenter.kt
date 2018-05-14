package com.oshi.genericsettings.kotlin.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.genericsettings.BuildConfig
import com.oshi.genericsettings.kotlin.*
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.HeaderData
import com.oshi.libgenericsettings.data.TitleData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class MainScreenPresenter(recyclerView: RecyclerView) : BaseSettingsPresenter(recyclerView) {

    companion object {
        private const val POSITION_GENERIC_TYPES = 0
        private const val POSITION_CHECKABLE_SWITCHABLE_TYPES = 1
        private const val POSITION_SEEK_BAR_TYPES = 2
        private const val POSITION_CHECKABLE_ITEM_TEST = 5
        private const val POSITION_SWITCHABLE_ITEM_TEST = 6
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val dataList = ArrayList<BaseViewTypeData>()

        val genericViewsData = TitleData("Basic types")
        dataList.add(POSITION_GENERIC_TYPES, genericViewsData)

        val checkableViewsData = TitleData("Checkable & Switchable types")
        dataList.add(POSITION_CHECKABLE_SWITCHABLE_TYPES, checkableViewsData)

        val seekBarTypes = TitleData("SeeBar types")
        dataList.add(POSITION_SEEK_BAR_TYPES, seekBarTypes)

        val expandableTypes = TitleData("Expandable types")
        dataList.add(expandableTypes)

        if (BuildConfig.DEBUG) {
            val headerData = HeaderData("DEBUG")
            dataList.add(headerData)

            val checkableItemTest = TitleData("Checkable Items Test")
            dataList.add(checkableItemTest)

            val switchableItemTest = TitleData("Switchable Items Test")
            dataList.add(switchableItemTest)
        }


        return dataList
    }

    override fun onTitleClick(view: View, data: TitleData, position: Int) {
        super.onTitleClick(view, data, position)

        when (position) {
            POSITION_GENERIC_TYPES -> {
                view.context.startBasicTypeActivity()
            }
            POSITION_CHECKABLE_SWITCHABLE_TYPES -> {
                view.context.startCheckableSwitchableTypesActivity()
            }
            POSITION_SEEK_BAR_TYPES -> {
                view.context.startSeekbarTypesActivity()
            }
            POSITION_CHECKABLE_ITEM_TEST -> {
                view.context.startCheckableItemTestActivity()
            }
            POSITION_SWITCHABLE_ITEM_TEST -> {
                view.context.startSwitchableItemTestActivity()
            }
        }
    }
}