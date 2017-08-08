package com.oshi.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSwitchData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;


public class TitleSwitchViewHolder extends BaseSettingsViewHolder<TitleSwitchData> {


    public TitleSwitchViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSwitchData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleSwitchData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
