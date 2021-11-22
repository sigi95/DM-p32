package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentFormsBinding
import com.example.tiendafreshstart.databinding.FragmentHomeBinding


class FormsFragment : Fragment() {

    private var _binding: FragmentFormsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormsBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnregistrar.setOnClickListener{
            it.findNavController().navigate(R.id.action_formsFragment_to_registerFragment)
        }

        binding.btnsesion.setOnClickListener{
            it.findNavController().navigate(R.id.action_formsFragment_to_loginFragment)
        }

        binding.imgLogo3.setOnClickListener{
            it.findNavController().navigate(R.id.action_formsFragment_to_homeFragment)
        }

        return view
    }


}

//            it.findNavController().navigate(R.id.action_homeFragment_to_formsFragment)