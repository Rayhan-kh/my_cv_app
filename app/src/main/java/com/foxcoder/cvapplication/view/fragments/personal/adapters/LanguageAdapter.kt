package com.foxcoder.cvapplication.view.fragments.personal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.LanguageViewItemBinding
import com.foxcoder.cvapplication.models.LanguageItem

class LanguageAdapter(private val languages: List<LanguageItem>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    inner class LanguageViewHolder(private val binding: LanguageViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindLanguage(languageItem: LanguageItem) {
            with(binding) {
                tvLevel.text = languageItem.proficiency
                tvTitle.text = languageItem.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val binding = LanguageViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LanguageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bindLanguage(languageItem = languages[position])
    }

    override fun getItemCount() = languages.size
}