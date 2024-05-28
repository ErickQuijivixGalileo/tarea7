package com.miempresa.tarea7.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.miempresa.tarea7.R
import com.miempresa.tarea7.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentContactsBinding.inflate(inflater, container, false)
        binding.btnViewList.setOnClickListener {
            navController.navigate(R.id.action_contactsFragment_to_contactsListFragment)
        }
        binding.btnLogout.setOnClickListener {
            navController.navigate(R.id.action_contactsFragment_to_loginFragment)
        }
        return binding.root
    }
}