package com.miempresa.tarea7.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.miempresa.tarea7.R
import com.miempresa.tarea7.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btnLogin.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_contactsFragment)
        }
        return binding.root
    }
}