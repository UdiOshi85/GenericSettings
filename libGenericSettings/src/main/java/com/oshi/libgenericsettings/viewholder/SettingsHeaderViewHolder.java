package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsHeaderViewHolder extends BaseSettingsViewHolder<HeaderData> {


    public SettingsHeaderViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(HeaderData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.headerData, data);
        viewDataBinding.executePendingBindings();

    }
}
