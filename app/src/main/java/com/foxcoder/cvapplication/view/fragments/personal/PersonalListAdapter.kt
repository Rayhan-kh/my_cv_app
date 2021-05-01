package com.foxcoder.cvapplication.view.fragments.personal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.PersonalListItemBinding
import com.foxcoder.cvapplication.models.PersonalDataItem

class PersonalListAdapter(private val personalDataItems: List<PersonalDataItem>) :
    RecyclerView.Adapter<PersonalListAdapter.PersonalItemHolder>() {

    inner class PersonalItemHolder(val binding: PersonalListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindPersonalData(personalDataItem: PersonalDataItem) {
            with(binding)
            {
                tvPersonalItem.text = personalDataItem.title
                ivPersonalItem.setImageResource(personalDataItem.icon ?: R.drawable.ic_arrow_down)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonalItemHolder {
        val binding = PersonalListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonalItemHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonalItemHolder, position: Int) {
        holder.bindPersonalData(personalDataItems[position])
    }

    override fun getItemCount() = personalDataItems.size
}