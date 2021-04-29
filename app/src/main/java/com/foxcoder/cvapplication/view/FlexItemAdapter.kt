package com.foxcoder.cvapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.databinding.FlexTextItemViewBinding

class FlexItemAdapter(private val list: List<String>) : RecyclerView.Adapter<FlexItemAdapter.FlexItemHolder>() {


    inner class FlexItemHolder(private val binding: FlexTextItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(item: String) {
            binding.tvFlex.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlexItemHolder {
        val binding = FlexTextItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlexItemHolder(binding)
    }

    override fun onBindViewHolder(holder: FlexItemHolder, position: Int) {
        holder.bindView(list[position])
    }

    override fun getItemCount() = list.size
}