package com.foxcoder.cvapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.ExperienceItemBinding
import com.foxcoder.cvapplication.models.Experience

class ExperienceAdapter(private val listener: ExperienceClickListener, val experiences: List<Experience>) :
    RecyclerView.Adapter<ExperienceAdapter.ExperienceHolder>() {

    inner class ExperienceHolder(private val binding: ExperienceItemBinding, clickListener: ExperienceClickListener) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindExperience(experience: Experience) {
            with(binding)
            {

                if (experience.currentlyEmployed) {
                    tvTerminated.text = "Present"
                } else {
                    tvTerminated.text = experience.terminatedDate
                }
                tvJoined.text = experience.joinDate

                tvCompany.text = experience.companyName
                tvDesignation.text = experience.designation
                experience.companyLogo?.let {
                    ivCompany.setImageResource(it)
                }

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceHolder {
        val binding = ExperienceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExperienceHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ExperienceHolder, position: Int) {
        holder.bindExperience(experiences[position])
    }

    override fun getItemCount() = experiences.size
}

interface ExperienceClickListener {

}