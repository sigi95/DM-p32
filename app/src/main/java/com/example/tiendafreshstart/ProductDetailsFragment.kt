package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentProductDetailsBinding

class product_detailsFragment: Fragment() {
        private var _binding: FragmentProductDetailsBinding? = null
        private val binding get() = _binding!!
        var numero:Int=1
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btncasadetails.setOnClickListener{
            it.findNavController().navigate(R.id.action_product_detailsFragment_to_homeFragment)
        }
        binding.btnprofiledetails.setOnClickListener{
            it.findNavController().navigate(R.id.action_product_detailsFragment_to_editProfileFragment)
        }

        binding.btnsumar.setOnClickListener{
            numero=numero+1
            binding.txtcantidad.setText(""+numero)
        }

        binding.btnrestar.setOnClickListener{
            if(numero>1){
                numero=numero-1
                binding.txtcantidad.setText(""+numero)
            }
        }
        return view
    }

}