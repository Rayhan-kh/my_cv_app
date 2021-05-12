package com.foxcoder.cvapplication.view.fragments.personal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.FlexTextItemViewBinding

class HobbiesAdapter(private val hobbies: List<String>) : RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder>() {

    inner class HobbiesViewHolder(private val binding: FlexTextItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindHobbyItem(hobby: String) {
            with(binding)
            {
                tvFlex.text = hobby
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {
        val binding = FlexTextItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HobbiesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        holder.bindHobbyItem(hobby = hobbies[position])
    }

    override fun getItemCount() = hobbies.size
}