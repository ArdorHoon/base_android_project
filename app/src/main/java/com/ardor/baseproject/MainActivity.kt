package com.ardor.baseproject

import androidx.activity.viewModels
import com.ardor.baseproject.base.BaseActivity
import com.ardor.baseproject.databinding.ActivityMainBinding
import com.ardor.baseproject.viewmodel.SampleViewModel

class MainActivity :
    BaseActivity<ActivityMainBinding, SampleViewModel>(R.layout.activity_main) {
    override val viewModel: SampleViewModel by viewModels()

    }