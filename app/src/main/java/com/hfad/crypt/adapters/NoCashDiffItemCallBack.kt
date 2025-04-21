package com.hfad.crypt.adapters

import androidx.recyclerview.widget.DiffUtil
import com.hfad.crypt.data.NocushCurrenceRate
import com.hfad.crypt.data.NocushCurrenceRateItem
import com.hfad.crypt.data.cushCurrencyRateItem

class NoCashDiffItemCallBack: DiffUtil.ItemCallback<NocushCurrenceRateItem>() {
    override fun areItemsTheSame(
        oldItem: NocushCurrenceRateItem,
        newItem: NocushCurrenceRateItem): Boolean
    = (oldItem.ccy == newItem.ccy)


    override fun areContentsTheSame(
        oldItem: NocushCurrenceRateItem,
        newItem: NocushCurrenceRateItem
    ): Boolean = oldItem == newItem
}