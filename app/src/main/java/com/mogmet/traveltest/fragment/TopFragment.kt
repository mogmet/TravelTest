package com.mogmet.traveltest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mogmet.traveltest.R
import com.mogmet.traveltest.databinding.FragmentTopBinding
import org.koin.android.viewmodel.ext.android.viewModel

class TopFragment : Fragment() {

    companion object {
        fun newInstance() = TopFragment()
    }

    private val viewModel: TopViewModel by viewModel()
    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            viewModel.updateView(binding.textInputLayout.editText?.text.toString())
        }
        binding.goToAmericaButton.setOnClickListener {
            val action = TopFragmentDirections.actionTopFragmentToAmericaFragment(viewModel.submitText.value ?: "")
            findNavController().navigate(action)
        }
        binding.countryButton.setOnClickListener {
            findNavController().navigate(R.id.action_topFragment_to_nested_nav_graph_detail)
        }
    }
}

