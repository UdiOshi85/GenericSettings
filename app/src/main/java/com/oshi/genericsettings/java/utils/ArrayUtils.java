package com.oshi.genericsettings.java.utils;


import com.oshi.libgenericsettings.data.CheckableSubItem;

import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

    public static List<String> getNewSimpleItemsList() {
        return Arrays.asList("First", "Rocket man", "Third!", "Last");
    }

    public static List<CheckableSubItem> getNewCheckableItemsList() {
        return Arrays.asList(
                new CheckableSubItem("First"),
                new CheckableSubItem("Second"),
                new CheckableSubItem("Third"));
    }

}
