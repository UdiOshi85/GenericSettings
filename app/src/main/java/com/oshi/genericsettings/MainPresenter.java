package com.oshi.genericsettings;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.DividerData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckbox;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;
import com.oshi.libgenericsettings.data.TitleUpDownValueData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter extends BaseSettingsPresenter {

    private static int POSITION_TITLE_ONLY_EXAMPLE = 1;
    private static int POSITION_TITLE_SUBTITLE_EXAMPLE = 3;
    private static int POSITION_ICON_WITH_TITLE_EXAMPLE = 5;
    private static int POSITION_TITLE_WITH_SWITCH_EXAMPLE = 7;
    private static int POSITION_TITLE_SUBTITLE_SWITCH_EXAMPLE = 9;
    private static int POSITION_TITLE_SUBTITLE_CHECKBOX_EXAMPLE = 11;
    private static int POSITION_TITLE_SECONDARY_TITLE_EXAMPLE = 13;
    private static int POSITION_TITLE_ICON_SEEKBAR_TEXT_EXAMPLE = 15;
    private static int POSITION_TITLE_UP_DOWN_VALUE = 17;

    private OnSettingsChangedListener listener;

    public MainPresenter(OnSettingsChangedListener l) {
        this.listener = l;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> dataList = new ArrayList<>();

        // Simple header
        HeaderData firstHeader = new HeaderData("Simple header");
        dataList.add(firstHeader);

        // Title only
        TitleData titleData = new TitleData("Title only");
        dataList.add(POSITION_TITLE_ONLY_EXAMPLE, titleData);

        dataList.add(DividerData.create());

        // Title & Subtitle, Subtitle is red!
        TitleSubtitleData titleSubtitleData = new TitleSubtitleData("Title & Subtitle", "Subtitle is red!");
        titleSubtitleData.setSubtitleColor(R.color.red);
        dataList.add(POSITION_TITLE_SUBTITLE_EXAMPLE, titleSubtitleData);

        dataList.add(DividerData.create());

        // Icon & title
        IconTitleData iconTitleData = new IconTitleData("Icon & title");
        iconTitleData.setIconResId(R.drawable.ic_android_black_24dp);
        dataList.add(POSITION_ICON_WITH_TITLE_EXAMPLE, iconTitleData);

        // Colored header
        HeaderData coloredHeader = new HeaderData("Colored header", R.color.red);
        dataList.add(coloredHeader);

        // Title & Switch
        TitleSwitchData titleSwitchData = new TitleSwitchData("Title & Switch", false);
        dataList.add(POSITION_TITLE_WITH_SWITCH_EXAMPLE, titleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Switch
        TitleSubtitleSwitchData titleSubtitleSwitchData = new TitleSubtitleSwitchData("Title, Subtitle & Switch", "Subtitle is here", false);
        dataList.add(POSITION_TITLE_SUBTITLE_SWITCH_EXAMPLE, titleSubtitleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Checkbox
        TitleSubtitleCheckbox titleSubtitleCheckbox = new TitleSubtitleCheckbox("Title, Subtitle & Checkbox", "Subtitle is here", false);
        dataList.add(POSITION_TITLE_SUBTITLE_CHECKBOX_EXAMPLE, titleSubtitleCheckbox);

        dataList.add(DividerData.create());

        // Title & Secondary title
        TitleSecondaryTitleData titleSecondaryTitleData = new TitleSecondaryTitleData("Title & Secondary title", "8");
        dataList.add(POSITION_TITLE_SECONDARY_TITLE_EXAMPLE, titleSecondaryTitleData);

        dataList.add(DividerData.create());

        // Title, Icon, SeekBar & Text
        TitleIconSeekBarTextData titleIconSeekBarTextData = new TitleIconSeekBarTextData(R.drawable.ic_android_black_24dp, "Title, Icon, SeekBar & Text");
        titleIconSeekBarTextData.setSeekBarMaximumValue(1000);
        titleIconSeekBarTextData.setSeekBarColor(ContextCompat.getColor(context, R.color.red));
        titleIconSeekBarTextData.setSeekBarThumbColor(ContextCompat.getColor(context, R.color.blue));
        dataList.add(POSITION_TITLE_ICON_SEEKBAR_TEXT_EXAMPLE, titleIconSeekBarTextData);

        dataList.add(DividerData.create());

        // Title, Up & Down buttons and Text
        TitleUpDownValueData titleUpDownValueData = new TitleUpDownValueData("Title, Up & Down buttons and Text");
        titleUpDownValueData.setCurrentValue(50);
        dataList.add(POSITION_TITLE_UP_DOWN_VALUE, titleUpDownValueData);

        return dataList;
    }

    @Override
    public void onTitleClick(View view, TitleData data, int position) {
        super.onTitleClick(view, data, position);

        if (position == POSITION_TITLE_ONLY_EXAMPLE) {
            Toast.makeText(view.getContext(), "Clicked on title only at position = " + position, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTitleSubtitleClick(View view, TitleSubtitleData data, int position) {
        super.onTitleSubtitleClick(view, data, position);

        if (position == POSITION_TITLE_SUBTITLE_EXAMPLE) {
            Toast.makeText(view.getContext(), "Clicked on Title & Subtitle only at position = " + position, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onIconTitleClick(View view, IconTitleData data, int position) {
        super.onIconTitleClick(view, data, position);

        if (position == POSITION_ICON_WITH_TITLE_EXAMPLE) {
            Toast.makeText(view.getContext(), "Clicked on Icon & title at position = " + position, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTitleSwitchClick(View view, TitleSwitchData data, int position) {
        super.onTitleSwitchClick(view, data, position);

        if (position == POSITION_TITLE_WITH_SWITCH_EXAMPLE) {
            Toast.makeText(view.getContext(), "Title & Switch at position = " + position, Toast.LENGTH_SHORT).show();
            boolean oldVal = data.isSwitchOn();
            boolean newVal = !oldVal;

            data.setSwitchOn(newVal);

            listener.notifyItemChanged(position);
        }
    }

    @Override
    public void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position) {
        super.onTitleSubtitleSwitchClick(view, data, position);

        if (position == POSITION_TITLE_SUBTITLE_SWITCH_EXAMPLE) {
            Toast.makeText(view.getContext(), "Title, Subtitle & Switch at position = " + position, Toast.LENGTH_SHORT).show();
            boolean oldVal = data.isSwitchOn();
            boolean newVal = !oldVal;

            data.setSwitchOn(newVal);

            listener.notifyItemChanged(position);
        }
    }

    @Override
    public void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckbox data, int position) {
        super.onCheckboxTitleSubtitleClick(view, data, position);

        if (position == POSITION_TITLE_SUBTITLE_CHECKBOX_EXAMPLE) {

            Toast.makeText(view.getContext(), "Title, Subtitle & Checkbox at position = " + position, Toast.LENGTH_SHORT).show();
            boolean oldVal = data.isEnabled();
            boolean newVal = !oldVal;

            data.setEnabled(newVal);

            listener.notifyItemChanged(position);
        }
    }

    @Override
    public void onTitleSecondaryTitleClick(View view, TitleSecondaryTitleData data, int position) {
        super.onTitleSecondaryTitleClick(view, data, position);

        if (position == POSITION_TITLE_SECONDARY_TITLE_EXAMPLE) {
            Toast.makeText(view.getContext(), "Title & Secondary title at position = " + position, Toast.LENGTH_SHORT).show();
            int secondary = Integer.parseInt(data.getSecondaryTitle());
            secondary++;
            data.setSecondaryTitle(Integer.toString(secondary));

            listener.notifyItemChanged(position);
        }
    }

    @Override
    public void onTitleIconSeekBarTextChanged(View view, TitleIconSeekBarTextData data, int position) {
        super.onTitleIconSeekBarTextChanged(view, data, position);

        if (position == POSITION_TITLE_ICON_SEEKBAR_TEXT_EXAMPLE) {
            Toast.makeText(view.getContext(), "Title, Icon, SeekBar & Text value changed = " + data.getSeekBarCurrentProgress(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTitleUpDownValueChanged(View view, TitleUpDownValueData data, int position) {
        super.onTitleUpDownValueChanged(view, data, position);

        if (position == POSITION_TITLE_UP_DOWN_VALUE) {
            Toast.makeText(view.getContext(), "Title, Up & Down buttons and Text value changed = " + data.getCurrentValue(), Toast.LENGTH_SHORT).show();
        }
    }
}
