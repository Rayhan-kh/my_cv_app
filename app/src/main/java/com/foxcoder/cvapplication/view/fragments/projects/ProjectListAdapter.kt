package com.foxcoder.cvapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.ProjectLayoutBinding
import com.foxcoder.cvapplication.models.Project
import com.foxcoder.cvapplication.utils.underline

class ProjectListAdapter(private val projects: List<Project>, val projectClickListener: ProjectClickListener) :
    RecyclerView.Adapter<ProjectListAdapter.ProjectViewHolder>() {

    inner class ProjectViewHolder(
        private val binding: ProjectLayoutBinding,
        private val projectClickListener: ProjectClickListener
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindProjectView(project: Project) {
            with(binding)
            {
                root.setOnClickListener {
                    projectClickListener.onProjectSelected(project)
                }

                tvProjectName.text = project.projectName
                tvProjectDesc.text = project.shortDescription
                ivProject.setImageResource(project.appIcon ?: R.drawable.image)
                tbSeeMore.underline()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val binding = ProjectLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProjectViewHolder(binding, projectClickListener)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bindProjectView(projects[position])
    }

    override fun getItemCount() = projects.size
}

interface ProjectClickListener {
    fun onProjectSelected(project: Project)
}