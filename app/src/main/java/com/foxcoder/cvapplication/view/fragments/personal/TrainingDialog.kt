package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.TransitionListenerAdapter
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentTrainingDialogBinding
import com.foxcoder.cvapplication.utils.trainings
import com.foxcoder.cvapplication.view.base_classes.BaseDialogFragment
import com.foxcoder.cvapplication.view.fragments.personal.adapters.TrainingListAdapter
import org.koin.android.ext.android.bind


class TrainingDialog : BaseDialogFragment() {

    private var _binding: FragmentTrainingDialogBinding? = null
    private val binding get() = _binding!!
    private val trainingListAdapter = TrainingListAdapter(trainings)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrainingDialogBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        with(binding)
        {
            rvTraining.apply {
                hasFixedSize()
                isNestedScrollingEnabled = true
                adapter = trainingListAdapter
            }

            ibBack.setOnClickListener {
                dismiss()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}