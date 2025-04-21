package com.hfad.crypt.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
import com.hfad.crypt.R
import com.hfad.crypt.adapters.NoCashFragmentAdapter
import com.hfad.crypt.databinding.FragmentCashInfoBinding
import com.hfad.crypt.databinding.FragmentNocashInfoBinding
import com.hfad.crypt.viewmodel.noCaashViewModel
import kotlin.concurrent.thread


class NocashInfoFragment : Fragment() {

    private var binding : FragmentNocashInfoBinding? = null
    private val _binding: FragmentNocashInfoBinding
        get() = binding!!
    lateinit var viewModel: ViewModel
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNocashInfoBinding.inflate(layoutInflater)
        val view = _binding.root
        val viewModel = ViewModelProvider(this)
            .get(noCaashViewModel::class.java)

        val adapter = NoCashFragmentAdapter()
        recyclerView = _binding.resNoCash
        recyclerView.adapter = adapter

        viewModel.getDataFromRep()

        viewModel.NocashList.observe(viewLifecycleOwner, Observer { list ->
            list.body()?.let { adapter.submitList(it)}
        })


        return view
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}