package com.foxcoder.cvapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.databinding.FragmentSkillsBinding
import com.foxcoder.cvapplication.utils.*


class SkillsFragment : Fragment() {

    private var _binding: FragmentSkillsBinding? = null
    private val binding get() = _binding!!
    private val coreSkillAdapter = CoreSkillAdapter(coreSkills)
    private val ideAdapter = FlexItemAdapter(ide)
    private val osAdapter = FlexItemAdapter(os)
    private val programmingLangAdapter = FlexItemAdapter(programmingLanguages)
    private val designPatternAdapter = FlexItemAdapter(designPattern)
    private val designToolAdapter = FlexItemAdapter(designTools)
    private val vcsAdapter= FlexItemAdapter(vsc)

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
        with(binding) {
            rvCoreSkill.apply {
                hasFixedSize()
                isNestedScrollingEnabled = false
                adapter = coreSkillAdapter
            }

            rvProgrammingLangs.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = programmingLangAdapter
            }
            rvDesignPatterns.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = designPatternAdapter
            }
            rvDesignTools.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = designToolAdapter
            }
            rvIde.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = ideAdapter
            }
            rvOperatingSystem.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = osAdapter
            }
            rvVersionControls.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = vcsAdapter
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}