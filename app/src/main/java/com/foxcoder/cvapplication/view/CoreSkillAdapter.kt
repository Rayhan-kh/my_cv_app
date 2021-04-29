package com.foxcoder.cvapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.CoreSkillViewItemBinding

class CoreSkillAdapter(private val list: List<String>) : RecyclerView.Adapter<CoreSkillAdapter.CoreSkillHolder>() {

    inner class CoreSkillHolder(private val binding: CoreSkillViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindSkill(skill: String) {
            binding.tvCoreSkill.text = skill
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoreSkillHolder {
        val binding = CoreSkillViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoreSkillHolder(binding)
    }

    override fun onBindViewHolder(holder: CoreSkillHolder, position: Int) {
        holder.bindSkill(list[position])
    }

    override fun getItemCount() = list.size
}