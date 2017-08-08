package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckbox;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class CheckBoxTitleSubtitleViewHolder extends BaseSettingsViewHolder<TitleSubtitleCheckbox> {

    public CheckBoxTitleSubtitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSubtitleCheckbox data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.checkboxTitleSubtitle, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
