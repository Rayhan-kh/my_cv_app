package com.foxcoder.cvapplication.view.fragments.personal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.AcademicAccomplishmentViewItemBinding
import com.foxcoder.cvapplication.models.TrainingItem

class TrainingListAdapter(private val trainingList: List<TrainingItem>) :
    RecyclerView.Adapter<TrainingListAdapter.TrainingViewHolder>() {

    inner class TrainingViewHolder(val binding: AcademicAccomplishmentViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindBindTraining(training: TrainingItem) {

            with(binding)
            {
                tvPassingYear.text = training.date
                tvDegree.text = training.subject
                tvInstitute.text = training.durations
                tvDepartment.text = training.institute
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingViewHolder {
        val binding = AcademicAccomplishmentViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrainingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrainingViewHolder, position: Int) {
        holder.bindBindTraining(training = trainingList[position])
    }

    override fun getItemCount() = trainingList.size
}