package com.oshi.genericsettings.java.expandable;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.genericsettings.java.utils.ArrayUtils;
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleBulletItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleSimpleItemsData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class ExpandableTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS = 1;
    private static final int POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 2;
    private static final int POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 3;
    private static final int POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 4;
    private static final int POSITION_EXPANDABLE_TITLE_BULLET_ITEMS = 5;
    private static final int POSITION_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS = 6;
    private static final int POSITION_COLORED_HEADER = 7;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS = 8;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 9;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 10;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 11;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_BULLET_ITEMS = 12;
    private static final int POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS = 13;


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


        ExpandableTitleSimpleItemsData expandableTitleSimpleItemsData = new ExpandableTitleSimpleItemsData("Expandable title with simple items", ArrayUtils.getNewSimpleItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_SIMPLE_ITEMS, expandableTitleSimpleItemsData);

        ExpandableTitleSubtitleSimpleItemsData expandableTitleSubtitleSimpleItemsData = new ExpandableTitleSubtitleSimpleItemsData("Expandable title & subtitle", "Simple items",  ArrayUtils.getNewSimpleItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, expandableTitleSubtitleSimpleItemsData);

        ExpandableTitleCheckableItemsData expandableTitleCheckableItemsData = new ExpandableTitleCheckableItemsData("Expandable title with checkable items", ArrayUtils.getNewCheckableItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_CHECKABLE_ITEMS, expandableTitleCheckableItemsData);

        ExpandableTitleSubtitleCheckableItemsData expandableTitleSubtitleCheckableItemsData = new ExpandableTitleSubtitleCheckableItemsData("Expandable title with subtitle", "Checkable items", ArrayUtils.getNewCheckableItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, expandableTitleSubtitleCheckableItemsData);

        ExpandableTitleBulletItemsData expandableTitleBulletItemsData = new ExpandableTitleBulletItemsData("Expandable title with BULLET items", ArrayUtils.getNewSimpleItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_BULLET_ITEMS, expandableTitleBulletItemsData);

        ExpandableTitleSubtitleBulletItemsData expandableTitleSubtitleBulletItemsData = new ExpandableTitleSubtitleBulletItemsData("Expandable title, Subtitle & BULLET items", "I'm just a simple subtitle", ArrayUtils.getNewSimpleItemsList());
        items.add(POSITION_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS, expandableTitleSubtitleBulletItemsData);

        HeaderData coloredHeaderData = new HeaderData("COLORED EXPANDABLE TYPES");
        coloredHeaderData.setHeaderColor(R.color.blue);
        items.add(POSITION_COLORED_HEADER, coloredHeaderData);

        ExpandableTitleSimpleItemsData coloredExpandableTitleSimpleItemsData = new ExpandableTitleSimpleItemsData("Colored title with simple colored items",  ArrayUtils.getNewSimpleItemsList());
        coloredExpandableTitleSimpleItemsData.setTitleColor(R.color.blue);
        coloredExpandableTitleSimpleItemsData.setIconColor(R.color.blue);
        coloredExpandableTitleSimpleItemsData.setItemsColor(R.color.blue);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SIMPLE_ITEMS, coloredExpandableTitleSimpleItemsData);

        ExpandableTitleSubtitleSimpleItemsData coloredExpandableTitleSubtitleSimpleItemsData = new ExpandableTitleSubtitleSimpleItemsData("Colored title with subtitle", "Simple Items",  ArrayUtils.getNewSimpleItemsList());
        coloredExpandableTitleSubtitleSimpleItemsData.setTitleColor(R.color.blue);
        coloredExpandableTitleSubtitleSimpleItemsData.setSubtitleColor(R.color.red_text);
        coloredExpandableTitleSubtitleSimpleItemsData.setIconColor(R.color.light_green);
        coloredExpandableTitleSubtitleSimpleItemsData.setItemsColor(R.color.orange);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS, coloredExpandableTitleSubtitleSimpleItemsData);

        ExpandableTitleCheckableItemsData coloredExpandableTitleCheckableItemsData = new ExpandableTitleCheckableItemsData("Colored title with checkable colored", ArrayUtils.getNewCheckableItemsList());
        coloredExpandableTitleCheckableItemsData.setTitleColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setItemsColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setCheckboxColor(R.color.purple);
        coloredExpandableTitleCheckableItemsData.setIconColor(R.color.purple);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_CHECKABLE_ITEMS, coloredExpandableTitleCheckableItemsData);

        ExpandableTitleSubtitleCheckableItemsData coloredExpandableTitleSubtitleCheckableItemsData = new ExpandableTitleSubtitleCheckableItemsData("Colored title & subtitle", "Checkable Items", ArrayUtils.getNewCheckableItemsList());
        coloredExpandableTitleSubtitleCheckableItemsData.setTitleColor(R.color.colorPrimary);
        coloredExpandableTitleSubtitleCheckableItemsData.setSubtitleColor(R.color.colorPrimary);
        coloredExpandableTitleSubtitleCheckableItemsData.setCheckboxColor(R.color.orange);
        coloredExpandableTitleSubtitleCheckableItemsData.setDividerColor(R.color.red);
        coloredExpandableTitleSubtitleCheckableItemsData.setShouldShowDivider(true);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS, coloredExpandableTitleSubtitleCheckableItemsData);

        ExpandableTitleBulletItemsData coloredExpandableTitleBulletItemsData = new ExpandableTitleBulletItemsData("Colored Expandable title with BULLET items", ArrayUtils.getNewSimpleItemsList());
        coloredExpandableTitleBulletItemsData.setTitleColor(R.color.orange);
        coloredExpandableTitleBulletItemsData.setIconColor(R.color.orange);
        coloredExpandableTitleBulletItemsData.setItemsColor(R.color.orange);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_BULLET_ITEMS, coloredExpandableTitleBulletItemsData);

        ExpandableTitleSubtitleBulletItemsData coloredExpandableTitleSubtitleBulletItemsData = new ExpandableTitleSubtitleBulletItemsData("Colored title & subtitle", "Color bullets!", ArrayUtils.getNewSimpleItemsList());
        coloredExpandableTitleSubtitleBulletItemsData.setTitleColor(R.color.red);
        coloredExpandableTitleSubtitleBulletItemsData.setSubtitleColor(R.color.red);
        coloredExpandableTitleSubtitleBulletItemsData.setDividerColor(R.color.red);
        coloredExpandableTitleSubtitleBulletItemsData.setIconColor(R.color.red);
        coloredExpandableTitleSubtitleBulletItemsData.setItemsColor(R.color.red);
        coloredExpandableTitleSubtitleBulletItemsData.setShouldShowDivider(true);
        items.add(POSITION_COLORED_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS, coloredExpandableTitleSubtitleBulletItemsData);

        return items;
    }

    @Override
    public void onExpandableCheckableItemClicked(@NonNull View view, @NonNull ExpandableTitleCheckableItemsData data, int parentPosition, int subItemPosition) {
        Log.d(ExpandableTypesPresenter.class.getSimpleName(), "onExpandableCheckableItemClicked: Position: " + parentPosition + ", Sub item: " + subItemPosition);
        boolean oldVal = data.getItems().get(subItemPosition).isChecked();
        boolean newVal = !oldVal;
        data.getItems().get(subItemPosition).setChecked(newVal);
        onSettingsChangedListener.notifyItemChanged(parentPosition);
    }

    @Override
    public void onExpandableSimpleItemClicked(@NonNull View view, @NonNull ExpandableTitleSimpleItemsData data, int parentPosition, int subItemPosition) {
        super.onExpandableSimpleItemClicked(view, data, parentPosition, subItemPosition);
        Log.d(ExpandableTypesPresenter.class.getSimpleName(), "onExpandableSimpleItemClicked: Position: " + parentPosition + ", Sub item: " + subItemPosition);
        Toast.makeText(view.getContext(), data.getItems().get(subItemPosition) + " Selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onExpandableBulletItemClicked(@NotNull View view, @NotNull ExpandableTitleBulletItemsData data, int parentPosition, int subItemPosition) {
        super.onExpandableBulletItemClicked(view, data, parentPosition, subItemPosition);
        Toast.makeText(view.getContext(), data.getItems().get(subItemPosition) + " Selected", Toast.LENGTH_SHORT).show();
    }
}
