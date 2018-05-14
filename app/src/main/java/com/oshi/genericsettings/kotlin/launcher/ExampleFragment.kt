package com.oshi.genericsettings.kotlin.launcher

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.oshi.genericsettings.R
import com.oshi.genericsettings.databinding.FragmentExampleBinding
import com.oshi.libgenericsettings.data.BaseViewTypeData

class ExampleFragment : Fragment() {

    private lateinit var binding : FragmentExampleBinding
    private lateinit var settingsItem : BaseViewTypeData.Companion.SettingsViewTypes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settingsItem = arguments?.getSerializable(KEY_ITEM) as BaseViewTypeData.Companion.SettingsViewTypes
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_example, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val settingsItemView = LayoutInflater.from(view.context).inflate(settingsItem.layoutResId, null)
        binding.container.removeAllViews()
        binding.container.addView(settingsItemView)
    }


    companion object {

        private const val KEY_ITEM = "KEY_ITEM"

        fun newInstance(item : BaseViewTypeData.Companion.SettingsViewTypes) : Fragment {
            val fragment = ExampleFragment()

            val bundle = Bundle().apply {
                putSerializable(KEY_ITEM, item)
            }

            fragment.arguments = bundle
            return fragment
        }
    }
}