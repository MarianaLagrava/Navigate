package com.lagravam.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.lagravam.navigationpractice.databinding.FragmentNameBinding


class NameFragment : Fragment() {
    private val viewModel:MainViewModel by activityViewModels()
    private lateinit var binding:FragmentNameBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_name, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner=viewLifecycleOwner


        binding.actionNameButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_nameFragment_to_lastNameFragment)
        }
    }




}