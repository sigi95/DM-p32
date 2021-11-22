package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentLoginBinding
import com.example.tiendafreshstart.databinding.FragmentRegisterBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.imgLogo4.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        binding.btnregistro2.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.btniniciarsesion2.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_productsFragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}