package com.hfad.crypt.adapters

import androidx.recyclerview.widget.DiffUtil
import com.hfad.crypt.data.cushCurrencyRate
import com.hfad.crypt.data.cushCurrencyRateItem

class CashDiffItemCallback:DiffUtil.ItemCallback<cushCurrencyRateItem>() {

    override fun areItemsTheSame(oldItem: cushCurrencyRateItem, newItem: cushCurrencyRateItem) =
        (oldItem.ccy == newItem.ccy)

    override fun areContentsTheSame(oldItem: cushCurrencyRateItem, newItem: cushCurrencyRateItem) =
        (oldItem == newItem)
}