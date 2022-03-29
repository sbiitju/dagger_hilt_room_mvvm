package com.shahinbasahr.room.ui.fragment.input.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shahinbasahr.room.R
import com.shahinbasahr.room.databinding.FragmentAddNoteBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AddNoteFragment : Fragment() {
    private lateinit var binding: FragmentAddNoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAddNoteBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

}