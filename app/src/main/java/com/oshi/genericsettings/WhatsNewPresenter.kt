package com.oshi.genericsettings

import android.content.Context
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleBulletItemsData
import com.oshi.libgenericsettings.helper.VERSIONS
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter
import java.util.*


class WhatsNewPresenter : BaseSettingsPresenter() {

    override fun getItems(context: Context): List<BaseViewTypeData> {

        var values : Array<VERSIONS> = VERSIONS.values()
        values = values.reversedArray()

        val items = ArrayList<BaseViewTypeData>()

        values.forEach {
            val item = ExpandableTitleSubtitleBulletItemsData(it.versionName, it.versionSubtitle, it.whatsNewItems)
            item.isExpanded = true
            items.add(item)
        }

        return items
    }

}