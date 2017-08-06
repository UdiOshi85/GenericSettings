package com.udioshi85.libgenericsettings.viewholder;


import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;

public abstract class BaseSettingsViewHolder<T> extends RecyclerView.ViewHolder {

    public abstract void onBind(T data, ISettingsPresenter presenter, int position);

    protected ViewDataBinding viewDataBinding;

    public BaseSettingsViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
    }




}
