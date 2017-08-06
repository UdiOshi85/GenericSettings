package com.udioshi85.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;

import com.udioshi85.libgenericsettings.BR;
import com.udioshi85.libgenericsettings.data.TitleSubtitleData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleSubtitleViewHolder extends BaseSettingsViewHolder<TitleSubtitleData> {


    public SettingsTitleSubtitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSubtitleData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleSubtitleData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
