package com.oshi.genericsettings.kotlin.main

import android.content.Context
import android.view.View
import com.oshi.genericsettings.kotlin.*
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.TitleData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class MainScreenPresenter : BaseSettingsPresenter() {


    companion object {
        private const val POSITION_GENERIC_TYPES = 0
        private const val POSITION_CHECKABLE_TYPES = 1
        private const val POSITION_SWITCHABLE_TYPES = 2
        private const val POSITION_SEEKBAR_TYPES = 3
        private const val POSITION_EXPANDABLE_TYPES = 4
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val dataList = ArrayList<BaseViewTypeData>()

        val genericViewsData = TitleData("Basic types")
        dataList.add(POSITION_GENERIC_TYPES, genericViewsData)

        val checkableViewsData = TitleData("Checkable types")
        dataList.add(POSITION_CHECKABLE_TYPES, checkableViewsData)

        val switchableViewsData = TitleData("Switchable types")
        dataList.add(POSITION_SWITCHABLE_TYPES, switchableViewsData)

        val seekBarTypes = TitleData("SeeBar types")
        dataList.add(POSITION_SEEKBAR_TYPES, seekBarTypes)

        val expandableTypes = TitleData("Expandable types")
        dataList.add(expandableTypes)

        return dataList
    }

    override fun onTitleClick(view: View, data: TitleData, position: Int) {
        super.onTitleClick(view, data, position)

        when (position) {
            POSITION_GENERIC_TYPES -> {
                view.context.startBasicTypeActivity()
            }
            POSITION_CHECKABLE_TYPES -> {
                view.context.startCheckableTypesActivity()
            }
            POSITION_EXPANDABLE_TYPES -> {
                view.context.startExpandableTypesActivity()
            }
            POSITION_SEEKBAR_TYPES -> {
                view.context.startSeekbarTypesActivity()
            }
            POSITION_SWITCHABLE_TYPES -> {
                view.context.startSwitchableTypesActivity()
            }
        }
    }



}