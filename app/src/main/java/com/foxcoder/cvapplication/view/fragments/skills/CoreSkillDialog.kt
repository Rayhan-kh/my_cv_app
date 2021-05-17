package com.foxcoder.cvapplication.view.fragments.skills

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.foxcoder.cvapplication.databinding.CoreSkillDialogBinding
import com.foxcoder.cvapplication.utils.coreSkills
import com.foxcoder.cvapplication.utils.navigateUpOrFinish
import com.foxcoder.cvapplication.view.base_classes.BaseDialogFragment


class CoreSkillDialog : BaseDialogFragment() {

    private var _binding: CoreSkillDialogBinding? = null
    private val binding get() = _binding!!
    private val skillAdapter = CoreSkillAdapter(coreSkills)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = CoreSkillDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewItems()
    }

    private fun initViewItems() {
        with(binding) {
            ibBack.setOnClickListener {
                findNavController().navigateUpOrFinish(requireActivity())
            }

            rvCoreSkill.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = skillAdapter
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}