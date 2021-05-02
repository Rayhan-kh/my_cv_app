package com.foxcoder.cvapplication.view.fragments.experience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentMainBinding
import com.foxcoder.cvapplication.utils.clearLightStatusBar
import com.foxcoder.cvapplication.utils.myExperiences
import com.foxcoder.cvapplication.utils.setLightStatusBar
import com.foxcoder.cvapplication.view.base_classes.BaseFragment


class ExperienceFragment : BaseFragment(), ExperienceClickListener {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val experienceAdapter = ExperienceAdapter(this, experiences = myExperiences)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setLightStatusBar(view,requireActivity())
        initViewItems()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initViewItems() {
        with(binding)
        {
            rvExperiences.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = experienceAdapter
            }


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}