package com.mogmet.traveltest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.mogmet.traveltest.databinding.FragmentAmericaBinding
import org.koin.android.viewmodel.ext.android.viewModel

class AmericaFragment : Fragment() {

    companion object {
        fun newInstance() = AmericaFragment()
    }

    private val viewModel: AmericaViewModel by viewModel()
    private val args: AmericaFragmentArgs by navArgs()
    private lateinit var binding: FragmentAmericaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAmericaBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setupLabel(args.content)
    }
}
