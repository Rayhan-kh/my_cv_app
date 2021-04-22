package com.foxcoder.cvapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentProjectsBinding
import com.foxcoder.cvapplication.models.Project
import com.foxcoder.cvapplication.utils.myProjects


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