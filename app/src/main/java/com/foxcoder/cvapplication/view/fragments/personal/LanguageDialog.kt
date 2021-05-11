package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentLanguageDialogBinding
import com.foxcoder.cvapplication.utils.languagesISpeak
import com.foxcoder.cvapplication.utils.navigateUpOrFinish
import com.foxcoder.cvapplication.view.base_classes.BaseDialogFragment
import com.foxcoder.cvapplication.view.fragments.personal.adapters.LanguageAdapter


class LanguageDialog : BaseDialogFragment() {

    private var _binding: FragmentLanguageDialogBinding? = null
    private val binding get() = _binding!!
    private val languageAdapter= LanguageAdapter(languagesISpeak)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLanguageDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
            rvLanguage.apply {
                hasFixedSize()
                isNestedScrollingEnabled=true
                adapter= languageAdapter
            }

            ibBack.setOnClickListener {
                findNavController().navigateUpOrFinish(requireActivity())
            }
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}