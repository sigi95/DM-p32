package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.imgLogo.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_formsFragment)
        }
        binding.btncasa.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_formsFragment)
        }
        binding.btnprofile.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_editProfileFragment)
        }

        binding.btncarrito.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_carritoFragment)
        }
        //binding.carrito.setOnClickListener{
            //it.findNavController().navigate(R.id.action_homeFragment_to_formsFragment)
        //}



        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}