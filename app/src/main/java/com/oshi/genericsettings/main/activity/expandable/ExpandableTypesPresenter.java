package com.oshi.genericsettings.main.activity.expandable;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.CheckableSubItem;
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleSimpleItemsData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExpandableTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS = 1;
    private static final int POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 2;
    private static final int POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 3;
    private static final int POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 4;
    private static final int POSITION_COLORED_HEADER = 5;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS = 6;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 7;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 8;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 9;


    private CoordinatorLayout coordinatorLayout;
    private OnSettingsChangedListener onSettingsChangedListener;

    public ExpandableTypesPresenter(CoordinatorLayout coordinatorLayout, OnSettingsChangedListener l) {
        this.coordinatorLayout = coordinatorLayout;
        this.onSettingsChangedListener = l;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> items = new ArrayList<>();

        HeaderData headerData = new HeaderData("EXPANDABLE TYPES");
        items.add(POSITION_HEADER, headerData);


        List<String> simpleItemsList = Arrays.asList("First", "Second", "Third");
        List<CheckableSubItem> checkableItemsList = Arrays.asList(
                new CheckableSubItem("First"),
                new CheckableSubItem("Second"),
                new CheckableSubItem("Third"));

        ExpandableTitleSimpleItemsData expandableTitleSimpleItemsData = new ExpandableTitleSimpleItemsData("Expandable title with simple items", simpleItemsList);
        items.add(POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS, expandableTitleSimpleItemsData);

        ExpandableTitleSubtitleSimpleItemsData expandableTitleSubtitleSimpleItemsData = new ExpandableTitleSubtitleSimpleItemsData("Expandable title & subtitle", "Simple items", simpleItemsList);
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, expandableTitleSubtitleSimpleItemsData);

        ExpandableTitleCheckableItemsData expandableTitleCheckableItemsData = new ExpandableTitleCheckableItemsData("Expandable title with checkable items", checkableItemsList);
        items.add(POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS, expandableTitleCheckableItemsData);

        ExpandableTitleSubtitleCheckableItemsData expandableTitleSubtitleCheckableItemsData = new ExpandableTitleSubtitleCheckableItemsData("Expandable title with subtitle", "Checkable items", checkableItemsList);
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, expandableTitleSubtitleCheckableItemsData);

        HeaderData coloredHeaderData = new HeaderData("COLORED EXPANDABLE TYPES", R.color.blue);
        items.add(POSITION_COLORED_HEADER, coloredHeaderData);

        ExpandableTitleSimpleItemsData coloredExpandableTitleSimpleItemsData = new ExpandableTitleSimpleItemsData("Colored title with simple colored items", simpleItemsList);
        coloredExpandableTitleSimpleItemsData.setTitleColor(R.color.blue);
        coloredExpandableTitleSimpleItemsData.setIconColor(R.color.blue);
        coloredExpandableTitleSimpleItemsData.setItemsColor(R.color.blue);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS, coloredExpandableTitleSimpleItemsData);

        ExpandableTitleSubtitleSimpleItemsData coloredExpandableTitleSubtitleSimpleItemsData = new ExpandableTitleSubtitleSimpleItemsData("Colored title with subtitle", "Simple Items", simpleItemsList);
        coloredExpandableTitleSubtitleSimpleItemsData.setTitleColor(R.color.blue);
        coloredExpandableTitleSubtitleSimpleItemsData.setSubtitleColor(R.color.red_text);
        coloredExpandableTitleSubtitleSimpleItemsData.setIconColor(R.color.light_green);
        coloredExpandableTitleSubtitleSimpleItemsData.setItemsColor(R.color.orange);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, coloredExpandableTitleSubtitleSimpleItemsData);

        ExpandableTitleCheckableItemsData coloredExpandableTitleCheckableItemsData = new ExpandableTitleCheckableItemsData("Colored title with checkable colored", checkableItemsList);
        coloredExpandableTitleCheckableItemsData.setTitleColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setItemsColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setCheckboxColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setIconColor(R.color.purple);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS, coloredExpandableTitleCheckableItemsData);

        return items;
    }

    @Override
    public void onExpandableCheckableItemClicked(View view, ExpandableTitleCheckableItemsData data, int parentPosition, int subItemPosition) {
        boolean oldVal = data.getItems().get(subItemPosition).isChecked();
        boolean newVal = !oldVal;
        data.getItems().get(subItemPosition).setChecked(newVal);
        onSettingsChangedListener.notifyItemChanged(parentPosition);
    }

    @Override
    public void onExpandableSimpleItemClicked(View view, ExpandableTitleSimpleItemsData data, int parentPosition, int subItemPosition) {
        super.onExpandableSimpleItemClicked(view, data, parentPosition, subItemPosition);
    }
}
