package com.oshi.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

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
