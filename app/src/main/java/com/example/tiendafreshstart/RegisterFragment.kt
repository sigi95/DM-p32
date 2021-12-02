package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentHomeBinding
import com.example.tiendafreshstart.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class RegisterFragment : Fragment() {


    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    /*public override fun onStart(){
        super.onStart()
        val currentUser= auth.currentUser
        if (currentUser != null){
            reload()
        }
    }*/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.imgLogo2.setOnClickListener{
            it.findNavController().navigate(R.id.action_registerFragment_to_homeFragment)
        }

        binding.btnRegistro.setOnClickListener{
            it.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}