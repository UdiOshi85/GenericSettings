package com.oshi.genericsettings.kotlin.utils

import com.oshi.libgenericsettings.data.CheckableSubItem
import java.util.*

/**
 * Created by udioshi on 1/2/2018.
 */
class ArrayUtils {

    companion object {
        fun getNewSimpleItemsList() : List<String> {
            return Arrays.asList("First", "Rocket man", "Third!", "Last")
        }

        fun getNewCheckableItemsList() : List<CheckableSubItem> {
            return Arrays.asList(
                    CheckableSubItem("First"),
                    CheckableSubItem("Second"),
                    CheckableSubItem("Third"))
        }
    }

}