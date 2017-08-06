package com.udioshi85.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;


import com.udioshi85.libgenericsettings.data.CheckboxTitleSubtitleData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public class CheckBoxTitleSubtitleViewHolder extends BaseSettingsViewHolder<CheckboxTitleSubtitleData> {

    public CheckBoxTitleSubtitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(CheckboxTitleSubtitleData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.checkboxTitleSubtitle, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
