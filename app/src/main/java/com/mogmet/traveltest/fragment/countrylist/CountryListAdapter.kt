package com.mogmet.traveltest.fragment.countrylist

import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView

class CountryListAdapter(
    private val viewModel: CountryListViewModel,
    private val parentLifecycleOwner: LifecycleOwner
) :
    RecyclerView.Adapter<CountryListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryListViewHolder {
        return CountryListViewHolder.create(parent)
    }

    override fun getItemCount(): Int {
        return viewModel.countries.size
    }

    override fun onBindViewHolder(holder: CountryListViewHolder, position: Int) {
        holder.onBind(viewModel, position, parentLifecycleOwner)
    }
}