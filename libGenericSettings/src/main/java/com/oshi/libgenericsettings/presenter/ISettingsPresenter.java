package com.oshi.libgenericsettings.presenter;

import android.content.Context;
import android.view.View;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckbox;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;

import java.util.List;


public interface ISettingsPresenter {

    interface OnSettingsChangedListener {
        void notifyItemChanged(int position);
    }

    void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position);

    void onTitleSubtitleClick(View view, TitleSubtitleData data, int position);

    void onTitleSwitchClick(View view, TitleSwitchData data, int position);

    void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckbox data, int position);

    void onTitleClick(View view, TitleData data, int position);

    void onIconTitleClick(View view, IconTitleData data, int position);

    void onTitleSecondaryTitleClick(View view, TitleSecondaryTitleData data, int position);

    List<BaseViewTypeData> getItems(Context context);

}
