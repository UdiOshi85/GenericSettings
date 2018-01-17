package com.oshi.genericsettings

import android.content.Context
import com.oshi.genericsettings.kotlin.utils.ArrayUtils
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData
import com.oshi.libgenericsettings.helper.VERSIONS
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter


class WhatsNewPresenter : BaseSettingsPresenter() {

    override fun getItems(context: Context): List<BaseViewTypeData> {

        val values = VERSIONS.values()
        val items = ArrayList<BaseViewTypeData>()

        values.forEach {
            val item = ExpandableTitleBulletItemsData(it.versionName, it.whatsNewItems)
            items.add(item)
        }

        return items
    }

}