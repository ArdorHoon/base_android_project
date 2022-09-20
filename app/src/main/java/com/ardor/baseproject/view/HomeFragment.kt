package com.ardor.baseproject.view

import androidx.fragment.app.activityViewModels
import com.ardor.baseproject.R
import com.ardor.baseproject.base.BaseFragment
import com.ardor.baseproject.databinding.FragmentHomeBinding
import com.ardor.baseproject.viewmodel.SampleViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding, SampleViewModel>(R.layout.fragment_home) {

    override val viewModel: SampleViewModel by activityViewModels()

}