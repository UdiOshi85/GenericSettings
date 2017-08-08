package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

/**
 * Created by udioshi on 8/7/2017.
 */

public class TitleViewHolder extends BaseSettingsViewHolder<TitleData> {

    public TitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
