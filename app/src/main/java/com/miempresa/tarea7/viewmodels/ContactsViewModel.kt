package com.miempresa.tarea7.viewmodels

import androidx.lifecycle.ViewModel
import com.miempresa.tarea7.models.Contacto

class ContactsViewModel : ViewModel() {
    val contacts = listOf(
        Contacto ("erick.quijivix", "0123-4567"),
        Contacto("bryan.quijivix", "3333-2222"),
        Contacto("derick.quijivix", "55555-1111")
    )
}