package com.foxcoder.cvapplication.view.fragments.personal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.AcademicAccomplishmentViewItemBinding
import com.foxcoder.cvapplication.models.AcademicAccomplishmentItem

class AcademicAccomplishmentListAdapter(private val aaList: List<AcademicAccomplishmentItem>) :
    RecyclerView.Adapter<AcademicAccomplishmentListAdapter.AcademicAccomplishmentItemHolder>() {

    inner class AcademicAccomplishmentItemHolder(private val binding: AcademicAccomplishmentViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(academicAccomplishmentItem: AcademicAccomplishmentItem) {
            with(binding)
            {
                tvPassingYear.text = academicAccomplishmentItem.passingYear
                tvCgpa.text = academicAccomplishmentItem.cgpa
                tvDegree.text = academicAccomplishmentItem.degree
                tvDepartment.text = academicAccomplishmentItem.department
                tvInstitute.text = academicAccomplishmentItem.schoolName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AcademicAccomplishmentItemHolder {
        val binding = AcademicAccomplishmentViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AcademicAccomplishmentItemHolder(binding)
    }

    override fun onBindViewHolder(holder: AcademicAccomplishmentItemHolder, position: Int) {
        holder.bindView(aaList[position])
    }

    override fun getItemCount() = aaList.size
}
