package com.oshi.genericsettings.kotlin.launcher

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.oshi.genericsettings.R
import com.oshi.genericsettings.databinding.ActivityMainLauncherBinding

import com.oshi.genericsettings.kotlin.startMainKotlinActivity
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.helper.GLog

class MainLauncherActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainLauncherBinding
    private lateinit var viewpagerAdapter : ExamplesViewPagerAdapter
    private var isViewPagerPlaying = false
    private val autoScrollDelay = 5000L

    private val autoScrollHandler = Handler()
    private val autoScrollRunnable = object : Runnable {
        override fun run() {
            moveToNextPage()
            autoScrollHandler.postDelayed(this, autoScrollDelay)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_launcher)

        binding.startKotlin.setOnClickListener {
            startMainKotlinActivity()
        }

        binding.rewindButton.setOnClickListener(this)
        binding.playPauseButton.setOnClickListener(this)
        binding.forwardButton.setOnClickListener(this)

        binding.version.text = getVersionName()

        initExamplesViewPager()
    }

    override fun onClick(v: View) {
        when (v.id) {
            binding.rewindButton.id -> onRewindClick()
            binding.playPauseButton.id -> onPlayPauseClick()
            binding.forwardButton.id -> onForwardClick()
        }
    }

    private fun onForwardClick() {
        pauseAutoScroll()
        moveToNextPage()
    }

    private fun onRewindClick() {
        pauseAutoScroll()
        val previousPage = if (binding.examplesViewPager.currentItem == 0) viewpagerAdapter.count-1 else binding.examplesViewPager.currentItem-1
        GLog.d("Moving to previous page=$previousPage")
        binding.examplesViewPager.setCurrentItem(previousPage, true)
    }

    private fun moveToNextPage() {
        val nextPage = if (viewpagerAdapter.count == (binding.examplesViewPager.currentItem+1)) 0 else ++binding.examplesViewPager.currentItem
        GLog.d("Moving to next page=$nextPage")
        binding.examplesViewPager.setCurrentItem(nextPage, true)
    }

    private fun onPlayPauseClick() {
        isViewPagerPlaying = !isViewPagerPlaying

        if (isViewPagerPlaying) {
            playAutoScroll()
        } else {
            pauseAutoScroll()
        }
    }

    private fun pauseAutoScroll() {
        autoScrollHandler.removeCallbacks(autoScrollRunnable)
        binding.playPauseButton.setImageResource(R.drawable.ic_play_arrow_black_24dp)
    }

    private fun playAutoScroll() {
        binding.playPauseButton.setImageResource(R.drawable.ic_pause_black_24dp)
        autoScrollHandler.postDelayed(autoScrollRunnable, autoScrollDelay)
    }

    private fun getVersionName() : String {
        val pInfo = packageManager.getPackageInfo(packageName, 0)
        return "v" + pInfo.versionName
    }

    private fun initExamplesViewPager() {

        val filteredItems = BaseViewTypeData.Companion.SettingsViewTypes.values().filter {  it.ordinal != BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_HEADER.ordinal &&
                    it.ordinal != BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_DIVIDER.ordinal
        }

        viewpagerAdapter = ExamplesViewPagerAdapter(supportFragmentManager, filteredItems)
        binding.examplesViewPager.adapter = viewpagerAdapter

        onPlayPauseClick()
    }
}