package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.DividerData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

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
