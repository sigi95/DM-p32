package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentLoginBinding
import com.example.tiendafreshstart.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {

    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btnDetalle.setOnClickListener{
            it.findNavController().navigate(R.id.action_productsFragment_to_product_detailsFragment)
        }
        binding.btnDetalle2.setOnClickListener{
            it.findNavController().navigate(R.id.action_productsFragment_to_product_detailsFragment)
        }
        binding.btnDetalle3.setOnClickListener{
            it.findNavController().navigate(R.id.action_productsFragment_to_product_detailsFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}