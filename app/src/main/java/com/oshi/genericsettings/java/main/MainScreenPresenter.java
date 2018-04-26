package com.oshi.genericsettings.java.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.oshi.genericsettings.java.basic.BasicTypesActivity;
import com.oshi.genericsettings.java.checkable.CheckableTypesActivity;
import com.oshi.genericsettings.java.expandable.ExpandableTypesActivity;
import com.oshi.genericsettings.java.seekbar.SeekBarTypesActivity;
import com.oshi.genericsettings.java.switchable.SwitchableTypesActivity;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MainScreenPresenter extends BaseSettingsPresenter {

    private static int POSITION_GENERIC_TYPES = 0;
    private static int POSITION_CHECKABLE_TYPES = 1;
    private static int POSITION_SWITCHABLE_TYPES = 2;
    private static int POSITION_SEEKBAR_TYPES = 3;
    private static int POSITION_EXPANDABLE_TYPES = 4;

    MainScreenPresenter(@NotNull RecyclerView recyclerView) {
        super(recyclerView);
    }


    @NonNull
    @Override
    public List<BaseViewTypeData> getItems(@NonNull Context context) {

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
        dataList.add(POSITION_EXPANDABLE_TYPES, expandableTypes);


        return dataList;
    }

    @Override
    public void onTitleClick(@NonNull View view, @NonNull TitleData data, int position) {
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
