package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentCarritoBinding


class CarritoFragment : Fragment() {
    private var _binding: FragmentCarritoBinding? = null
    private val binding get() = _binding!!
    var numero:Int=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCarritoBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btnhomecarrito.setOnClickListener {
            it.findNavController().navigate(R.id.action_carritoFragment2_to_homeFragment)
        }
        binding.btnprofilecarrito.setOnClickListener {
            it.findNavController().navigate(R.id.action_carritoFragment2_to_editProfileFragment)
        }
        binding.btnsumar2.setOnClickListener{
            numero=numero+1
            binding.txtcantidad2.setText(""+numero)
        }

        binding.btnrestar2.setOnClickListener{
            if(numero>1){
                numero=numero-1
                binding.txtcantidad2.setText(""+numero)
            }
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

