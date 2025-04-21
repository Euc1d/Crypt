package com.hfad.crypt.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.hfad.crypt.data.NocushCurrenceRateItem
import com.hfad.crypt.databinding.FragmentNocashInfoBinding
import com.hfad.crypt.databinding.ResItemBinding

class NoCashFragmentAdapter: ListAdapter<NocushCurrenceRateItem, NoCashFragmentAdapter.NoCashViewHolder>(NoCashDiffItemCallBack()) {

    class NoCashViewHolder(val binding: ResItemBinding):RecyclerView.ViewHolder(binding.root) {
        companion object{
            fun inflateFrom(parent: ViewGroup):NoCashViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val b = ResItemBinding.inflate(layoutInflater,parent,false);
                return NoCashViewHolder(b)
            }
        }
        fun bind(item: NocushCurrenceRateItem){
            binding.cashName.text = item.ccy
            binding.cashCcy.text = item.buy
            binding.cashSale.text = item.sale
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoCashViewHolder = NoCashViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: NoCashViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}