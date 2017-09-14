package com.oshi.genericsettings.main.activity.expandable;

import android.content.Context;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by udioshi on 9/12/2017.
 */

public class ExpandableTypesPresenter extends BaseSettingsPresenter {

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> items = new ArrayList<>();

        // #1 Expandable title with simple items
        List<String> simpleItemsList = Collections.
        ExpandableTitleSimpleItemsData expandableTitleSimpleItemsData = new ExpandableTitleSimpleItemsData("Expandable title with simple items");



        return items;
    }
}
