package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentComentariosBinding


class ComentariosFragment : Fragment() {

    private var _binding: FragmentComentariosBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentComentariosBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btncasa.setOnClickListener {
            it.findNavController().navigate(R.id.action_comentariosFragment_to_homeFragment)
        }
        binding.btnprofile.setOnClickListener {
            it.findNavController().navigate(R.id.action_comentariosFragment_to_editProfileFragment)
        }
        binding.btncarrito.setOnClickListener {
            it.findNavController().navigate(R.id.action_comentariosFragment_to_carritoFragment2)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

