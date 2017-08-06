package com.udioshi85.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;

import com.udioshi85.libgenericsettings.BR;
import com.udioshi85.libgenericsettings.data.TitleSubtitleSwitchData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleSubtitleSwitchViewHolder extends BaseSettingsViewHolder<TitleSubtitleSwitchData> {


    public SettingsTitleSubtitleSwitchViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSubtitleSwitchData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleSubtitleSwitchData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
