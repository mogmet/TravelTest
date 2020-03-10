package com.mogmet.traveltest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.mogmet.traveltest.databinding.FragmentAmericaBinding

class AmericaFragment : Fragment() {

    companion object {
        fun newInstance() = AmericaFragment()
    }

    private lateinit var viewModel: AmericaViewModel
    private lateinit var binding: FragmentAmericaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAmericaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AmericaViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
