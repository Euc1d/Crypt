package com.hfad.crypt.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hfad.crypt.data.cushCurrencyRateItem
import com.hfad.crypt.databinding.ActivityMainBinding
import com.hfad.crypt.databinding.ResItemBinding

class CashFragmentAdapter:ListAdapter<cushCurrencyRateItem, CashFragmentAdapter.CashViewHolder>(CashDiffItemCallback()) {
    class CashViewHolder(val binding: ResItemBinding): RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun inflateFrom(parent: ViewGroup): CashViewHolder {
                 val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ResItemBinding.inflate(layoutInflater,parent,false)
                return CashViewHolder(binding)
            }
        }
        fun bind(item: cushCurrencyRateItem){
            binding.cashName.text = item.ccy
            binding.cashCcy.text = item.buy
            binding.cashSale.text = item.sale
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CashFragmentAdapter.CashViewHolder = CashViewHolder.inflateFrom(parent)
    override fun onBindViewHolder(holder: CashFragmentAdapter.CashViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}