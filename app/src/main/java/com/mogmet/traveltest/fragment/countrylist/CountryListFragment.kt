package com.mogmet.traveltest.fragment.countrylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.mogmet.traveltest.databinding.FragmentCountryListBinding
import org.koin.android.viewmodel.ext.android.viewModel

class CountryListFragment : Fragment() {
    private val viewModel: CountryListViewModel by viewModel()
    private lateinit var binding: FragmentCountryListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.countryRecyclerView.adapter = CountryListAdapter(viewModel, this)
        binding.countryRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        viewModel.goOut.observe(this) {
            val action =
                CountryListFragmentDirections.actionCountryListFragmentToAmericaFragment(it)
            findNavController().navigate(action)
        }
        viewModel.setup()
    }
}
