package com.udioshi85.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.udioshi85.libgenericsettings.BR;
import com.udioshi85.libgenericsettings.data.DividerData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsDividerViewHolder extends BaseSettingsViewHolder<DividerData> {

    public SettingsDividerViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(DividerData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.dividerData, data);
        viewDataBinding.executePendingBindings();
    }
}
