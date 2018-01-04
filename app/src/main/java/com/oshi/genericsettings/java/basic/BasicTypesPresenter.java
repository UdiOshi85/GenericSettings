package com.oshi.genericsettings.java.basic;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;


public class BasicTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_SINGLE_TITLE = 1;
    private static final int POSITION_TWO_ROWS = 2;
    private static final int POSITION_THREE_ROWS = 3;
    private static final int POSITION_TITLE_STITLE = 4;
    private static final int POSITION_COLORED_HEADER = 5;
    private static final int POSITION_COLORED_SINGLE_TITLE = 6;
    private static final int POSITION_COLORED_TWO_ROWS = 7;
    private static final int POSITION_COLORED_THREE_ROWS = 8;
    private static final int POSITION_COLORED_TITLE_STITLE = 9;

    private CoordinatorLayout coordinatorLayout;

    public BasicTypesPresenter(CoordinatorLayout coordinatorLayout) {
        this.coordinatorLayout = coordinatorLayout;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> items = new ArrayList<>();

        HeaderData headerData = new HeaderData("BASIC ITEMS");
        items.add(POSITION_HEADER, headerData);

        TitleData titleData = new TitleData("Single title");
        items.add(POSITION_SINGLE_TITLE, titleData);

        TitleSubtitleData titleSubtitleData = new TitleSubtitleData("Two rows example", "Simple as that");
        items.add(POSITION_TWO_ROWS, titleSubtitleData);

        TitleSubtitleExtraData titleSubtitleExtraData = new TitleSubtitleExtraData("Three lines ahead", "subtitle is here", "An extra text");
        items.add(POSITION_THREE_ROWS, titleSubtitleExtraData);

        TitleSecondaryTitleData titleSecondaryTitleData = new TitleSecondaryTitleData("Title & secondary text", "SECONDARY");
        items.add(POSITION_TITLE_STITLE, titleSecondaryTitleData);

        HeaderData coloredHeader = new HeaderData("COLORED BASIC ITEMS");
        coloredHeader.setHeaderColor(R.color.blue);
        items.add(POSITION_COLORED_HEADER, coloredHeader);

        TitleData coloredTitleData = new TitleData("Single title");
        coloredTitleData.setTitleColor(R.color.red);
        items.add(POSITION_COLORED_SINGLE_TITLE, coloredTitleData);

        TitleSubtitleData coloredTitleSubtitleData = new TitleSubtitleData("Two rows example", "Simple as that");
        coloredTitleSubtitleData.setTitleColor(R.color.blue);
        coloredTitleSubtitleData.setSubtitleColor(R.color.green);
        items.add(POSITION_COLORED_TWO_ROWS, coloredTitleSubtitleData);

        TitleSubtitleExtraData coloredTitleSubtitleExtraData = new TitleSubtitleExtraData("Three lines ahead", "subtitle is here", "An extra text");
        coloredTitleSubtitleExtraData.setTitleColor(R.color.red);
        coloredTitleSubtitleExtraData.setSubtitleColor(R.color.green);
        coloredTitleSubtitleExtraData.setExtraColor(R.color.blue);
        items.add(POSITION_COLORED_THREE_ROWS, coloredTitleSubtitleExtraData);

        TitleSecondaryTitleData coloredTitleSecondaryTitleData = new TitleSecondaryTitleData("Title & secondary text","SECONDARY");
        coloredTitleSecondaryTitleData.setTitleColor(R.color.red);
        coloredTitleSecondaryTitleData.setSecondaryTitleColor(R.color.blue);
        items.add(POSITION_COLORED_TITLE_STITLE, coloredTitleSecondaryTitleData);

        return items;
    }

    @Override
    public void onTitleClick(View view, TitleData data, int position) {

        if (position == POSITION_SINGLE_TITLE) {
            Snackbar.make(coordinatorLayout, "Single title clicked", Snackbar.LENGTH_SHORT).show();
        } else if (position == POSITION_COLORED_SINGLE_TITLE) {
            Snackbar.make(coordinatorLayout, "Colored single title clicked", Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTitleSubtitleClick(View view, TitleSubtitleData data, int position) {

        if (position == POSITION_TWO_ROWS) {
            Snackbar.make(coordinatorLayout, "Two rows clicked", Snackbar.LENGTH_SHORT).show();
        } else if (position == POSITION_COLORED_TWO_ROWS) {
            Snackbar.make(coordinatorLayout, "Colored two rows clicked", Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTitleSubtitleExtraClick(View view, TitleSubtitleExtraData data, int position) {

        if (position == POSITION_THREE_ROWS) {
            Snackbar.make(coordinatorLayout, "Three rows clicked", Snackbar.LENGTH_SHORT).show();
        } else if (position == POSITION_COLORED_THREE_ROWS) {
            Snackbar.make(coordinatorLayout, "Colored three rows clicked", Snackbar.LENGTH_SHORT).show();
        }

    }
}
