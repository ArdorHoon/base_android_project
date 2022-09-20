package com.ardor.baseproject.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.ardor.baseproject.R
import com.ardor.baseproject.base.BaseFragment
import com.ardor.baseproject.databinding.FragmentHomeBinding
import com.ardor.baseproject.viewmodel.SampleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, SampleViewModel>(R.layout.fragment_home) {

    override val viewModel: SampleViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG , viewModel.add(10,10).toString())
    }

    companion object {
        const val TAG = "HomeFragment"
    }
}