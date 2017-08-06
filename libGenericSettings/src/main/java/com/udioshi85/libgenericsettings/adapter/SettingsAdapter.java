package com.udioshi85.libgenericsettings.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.udioshi85.libgenericsettings.data.BaseViewTypeData;
import com.udioshi85.libgenericsettings.presenter.ISettingsPresenter;
import com.udioshi85.libgenericsettings.viewholder.BaseSettingsViewHolder;
import com.udioshi85.libgenericsettings.viewholder.CheckBoxTitleSubtitleViewHolder;
import com.udioshi85.libgenericsettings.viewholder.SettingsDividerViewHolder;
import com.udioshi85.libgenericsettings.viewholder.SettingsHeaderViewHolder;
import com.udioshi85.libgenericsettings.viewholder.SettingsTitleSubtitleSwitchViewHolder;
import com.udioshi85.libgenericsettings.viewholder.SettingsTitleSubtitleViewHolder;
import com.udioshi85.libgenericsettings.viewholder.TitleSwitchViewHolder;

import java.util.List;


public class SettingsAdapter extends RecyclerView.Adapter<BaseSettingsViewHolder> {

    private List<BaseViewTypeData> dataList;
    private ISettingsPresenter presenter;

    public SettingsAdapter(ISettingsPresenter presenter) {

        this.dataList = presenter.getItems();

        if (this.dataList == null) {
            throw new IllegalStateException("Cannot initiate SettingsAdapter with null items list");
        }

        this.presenter = presenter;
    }

    @Override
    public BaseSettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_HEADER) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_header, parent, false);
            return new SettingsHeaderViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_subtitle_switch, parent, false);
            return new SettingsTitleSubtitleSwitchViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_subtitle, parent, false);
            return new SettingsTitleSubtitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_DIVIDER) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_divider, parent, false);
            return new SettingsDividerViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SWITCH) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_switch, parent, false);

            return new TitleSwitchViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_checkbox_title_subtitle, parent, false);
            return new CheckBoxTitleSubtitleViewHolder(binding);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(BaseSettingsViewHolder holder, int position) {
        BaseViewTypeData item = dataList.get(position);
        holder.onBind(item, presenter, position);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getViewType();
    }
}
