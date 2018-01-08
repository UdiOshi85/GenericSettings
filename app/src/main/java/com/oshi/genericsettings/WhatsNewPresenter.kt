package com.oshi.genericsettings

import android.content.Context
import com.oshi.genericsettings.kotlin.utils.ArrayUtils
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class WhatsNewPresenter : BaseSettingsPresenter() {

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val items = ArrayList<BaseViewTypeData>()

        val whatsNewItems = ArrayUtils.createSimpleItemsArray("Added expandables with BULLETS", "We migrated to Kotlin!", "Added some awesome layout design to example app")
        val whats_new_1_3 = ExpandableTitleBulletItemsData("Version 1.3", whatsNewItems)
        items.add(whats_new_1_3)

        return items
    }


}