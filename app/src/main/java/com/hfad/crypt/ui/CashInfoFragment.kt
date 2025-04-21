package com.hfad.crypt.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.hfad.crypt.R
import com.hfad.crypt.adapters.CashFragmentAdapter
import com.hfad.crypt.databinding.FragmentCashInfoBinding
import com.hfad.crypt.databinding.ResItemBinding
import com.hfad.crypt.viewmodel.cashViewModel

class CashInfoFragment : Fragment() {
    private var binding : FragmentCashInfoBinding? = null
    private val _binding: FragmentCashInfoBinding
        get() = binding!!

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CashFragmentAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCashInfoBinding.inflate(layoutInflater,container,false)

        val viewModel = ViewModelProvider(this)
            .get(cashViewModel::class.java)
        val view = _binding.root

        recyclerView = _binding.resCash
        adapter = CashFragmentAdapter()
        recyclerView.adapter = adapter

        viewModel.getCryptoData()
        viewModel.cryptoList.observe(viewLifecycleOwner, Observer {
            list -> list.body()?.let { adapter.submitList(it) }
        })

        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}