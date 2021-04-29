package com.foxcoder.cvapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentSkillsBinding
import com.foxcoder.cvapplication.utils.coreSkills
import org.koin.android.ext.android.bind


class SkillsFragment : Fragment() {

    private var _binding: FragmentSkillsBinding? = null
    private val binding get() = _binding!!
    private val coreSkillAdapter= CoreSkillAdapter(coreSkills)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSkillsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setLightStatusBar(view, requireActivity())
        initViewItems()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initViewItems() {
        with(binding){
            rvCoreSkill.apply {
                hasFixedSize()
                isNestedScrollingEnabled=true
                adapter= coreSkillAdapter
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}