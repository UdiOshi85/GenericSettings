package com.udioshi85.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;

import com.udioshi85.libgenericsettings.BR;
import com.udioshi85.libgenericsettings.data.TitleSwitchData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

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
