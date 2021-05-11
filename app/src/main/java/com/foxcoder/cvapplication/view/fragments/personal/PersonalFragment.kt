package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentPersonalBinding
import com.foxcoder.cvapplication.utils.personalDataItems
import com.foxcoder.cvapplication.utils.setLightStatusBar
import com.foxcoder.cvapplication.view.fragments.personal.adapters.PersonalItemClickListener
import com.foxcoder.cvapplication.view.fragments.personal.adapters.PersonalListAdapter

class PersonalFragment : Fragment(), PersonalItemClickListener {

    private var _binding: FragmentPersonalBinding? = null
    private val binding get() = _binding!!
    private val personalListAdapter = PersonalListAdapter(personalDataItems, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setLightStatusBar(view, requireActivity())
        initViewItems()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initViewItems() {
        binding.rvPersonals.apply {
            hasFixedSize()
            isNestedScrollingEnabled = true
            adapter = personalListAdapter
        }


    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onPersonalItemLicked(position: Int) {
        when (position) {
            0 -> {
                findNavController().navigate(R.id.academic_dialog)
            }
            1 -> {
                findNavController().navigate(R.id.training_dialog)
            }
            2 -> {
                findNavController().navigate(R.id.language_dialog)
            }
        }
    }


}