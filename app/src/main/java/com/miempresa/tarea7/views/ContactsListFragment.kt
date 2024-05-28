package com.miempresa.tarea7.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.miempresa.tarea7.adapters.ContactsAdapter
import com.miempresa.tarea7.databinding.FragmentContactsListBinding
import com.miempresa.tarea7.viewmodels.ContactsViewModel

class ContactsListFragment : Fragment() {

    private val viewModel: ContactsViewModel by activityViewModels()
    private var _binding: FragmentContactsListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactsListBinding.inflate(inflater, container, false)

        val contacts = viewModel.contacts

        val adapter = ContactsAdapter(contacts)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
