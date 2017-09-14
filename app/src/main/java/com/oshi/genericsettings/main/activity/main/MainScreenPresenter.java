package com.oshi.genericsettings.main.activity.main;

import android.content.Context;
import android.view.View;

import com.oshi.genericsettings.main.activity.basic.BasicTypesActivity;
import com.oshi.genericsettings.main.activity.checkable.CheckableTypesActivity;
import com.oshi.genericsettings.main.activity.expandable.ExpandableTypesActivity;
import com.oshi.genericsettings.main.activity.seekbar.SeekBarTypesActivity;
import com.oshi.genericsettings.main.activity.switchable.SwitchableTypesActivity;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udioshi on 9/3/2017.
 */
public class MainScreenPresenter extends BaseSettingsPresenter {

    private static int POSITION_GENERIC_TYPES = 0;
    private static int POSITION_CHECKABLE_TYPES = 1;
    private static int POSITION_SWITCHABLE_TYPES = 2;
    private static int POSITION_SEEKBAR_TYPES = 3;
    private static int POSITION_EXPANDABLE_TYPES = 4;
    private static int POSITION_CUSTOM_TYPES = 5;


    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> dataList = new ArrayList<>();

        TitleData genericViewsData = new TitleData("Basic types");
        dataList.add(POSITION_GENERIC_TYPES, genericViewsData);

        TitleData checkableViewsData = new TitleData("Checkable types");
        dataList.add(POSITION_CHECKABLE_TYPES, checkableViewsData);

        TitleData switchableViewsData = new TitleData("Switchable types");
        dataList.add(POSITION_SWITCHABLE_TYPES, switchableViewsData);

        TitleData seekBarTypes = new TitleData("SeeBar types");
        dataList.add(POSITION_SEEKBAR_TYPES, seekBarTypes);

        TitleData expandableTypes = new TitleData("Expandable types");
        dataList.add(expandableTypes);

        TitleData customViewsData = new TitleData("Custom types");
        dataList.add(POSITION_CUSTOM_TYPES, customViewsData);

        return dataList;
    }

    @Override
    public void onTitleClick(View view, TitleData data, int position) {
        super.onTitleClick(view, data, position);

        if (position == POSITION_GENERIC_TYPES) {
            BasicTypesActivity.show(view.getContext());
        } else if (position == POSITION_CHECKABLE_TYPES) {
            CheckableTypesActivity.show(view.getContext());
        } else if (position == POSITION_SWITCHABLE_TYPES) {
            SwitchableTypesActivity.show(view.getContext());
        } else if (position == POSITION_SEEKBAR_TYPES) {
            SeekBarTypesActivity.show(view.getContext());
        } else if (position == POSITION_EXPANDABLE_TYPES) {
            ExpandableTypesActivity.show(view.getContext());
        }
    }
}
