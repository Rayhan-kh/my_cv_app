package com.foxcoder.cvapplication.view.fragments.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.databinding.FragmentProjectsBinding
import com.foxcoder.cvapplication.models.Project
import com.foxcoder.cvapplication.utils.myProjects
import com.foxcoder.cvapplication.utils.setLightStatusBar
import com.foxcoder.cvapplication.view.base_classes.BaseFragment
import com.foxcoder.cvapplication.view.ProjectClickListener
import com.foxcoder.cvapplication.view.ProjectListAdapter


class ProjectsFragment : BaseFragment(), ProjectClickListener {

    private var _binding: FragmentProjectsBinding? = null
    private val binding get() = _binding!!
    private val projectListAdapter = ProjectListAdapter(myProjects, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProjectsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setLightStatusBar(view,requireActivity())
        with(binding)
        {
            rvProject.apply {
                hasFixedSize()
                adapter = projectListAdapter
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onProjectSelected(project: Project) {

    }

}