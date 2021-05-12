package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentHobbyDialogBinding
import com.foxcoder.cvapplication.utils.myHobbies
import com.foxcoder.cvapplication.utils.navigateUpOrFinish
import com.foxcoder.cvapplication.view.base_classes.BaseDialogFragment
import com.foxcoder.cvapplication.view.fragments.personal.adapters.HobbiesAdapter


class HobbyDialog : BaseDialogFragment() {

    private var _binding: FragmentHobbyDialogBinding? = null
    private val binding get() = _binding!!
    private val hobbiesAdapter = HobbiesAdapter(myHobbies)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHobbyDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            ibBack.setOnClickListener {
                findNavController().navigateUpOrFinish(requireActivity())

            }
            rvHobbies.apply {
                hasFixedSize()
                isNestedScrollingEnabled = false
                adapter = hobbiesAdapter
            }

        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}