package com.shahinbasahr.room.ui.fragment.main.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.shahinbasahr.room.R
import com.shahinbasahr.room.databinding.FragmentMainBinding
import com.shahinbasahr.room.ui.fragment.main.viewmodel.MainViewModel
import com.shahinbasahr.room.util.CommonAuthListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(),CommonAuthListener {
    private lateinit var binding:FragmentMainBinding
    private lateinit var viewmodel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        viewmodel=ViewModelProvider(this)[MainViewModel::class.java]
        binding.viewmodel=viewmodel
        return binding.root
    }

    override fun onNavigate() {
        TODO("Not yet implemented")
    }

}