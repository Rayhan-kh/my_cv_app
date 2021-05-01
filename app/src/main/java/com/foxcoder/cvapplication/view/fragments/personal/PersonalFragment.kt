package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment() {

    private var _binding: FragmentPersonalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initViewItems()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initViewItems() {

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }


}