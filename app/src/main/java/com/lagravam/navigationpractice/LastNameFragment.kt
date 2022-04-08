package com.lagravam.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.lagravam.navigationpractice.databinding.FragmentLastNameBinding


class LastNameFragment : Fragment() {
    private lateinit var binding:FragmentLastNameBinding
    private val viewModel:MainViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_last_name, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.actionLastnameButton.setOnClickListener{
            val navController=findNavController()
            navController.navigate(R.id.action_lastNameFragment_to_showInfoFragment2)
        }




    }

}