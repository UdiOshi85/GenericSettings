package com.udioshi85.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.udioshi85.libgenericsettings.BR;
import com.udioshi85.libgenericsettings.data.HeaderData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

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
