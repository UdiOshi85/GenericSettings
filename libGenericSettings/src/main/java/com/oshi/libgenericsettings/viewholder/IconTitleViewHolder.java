package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class IconTitleViewHolder extends BaseSettingsViewHolder<IconTitleData> {

    public IconTitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(IconTitleData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.iconTitleData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
