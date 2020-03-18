package com.mogmet.traveltest.fragment.countrylist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.mogmet.traveltest.R
import com.mogmet.traveltest.databinding.ItemCountryListBinding

class CountryListViewHolder(private val binding: ItemCountryListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(viewModel: CountryListViewModel, position: Int, lifecycleOwner: LifecycleOwner) {
        binding.viewModel = viewModel
        binding.position = position
        binding.lifecycleOwner = lifecycleOwner
        itemView.setOnClickListener {
            viewModel.onClickCountry(position)
        }
    }

    companion object {
        fun create(parent: ViewGroup) =
            CountryListViewHolder(
                DataBindingUtil.inflate<ItemCountryListBinding>(
                    LayoutInflater.from(
                        parent.context
                    ),
                    R.layout.item_country_list,
                    parent,
                    false
                )
            )
    }
}
