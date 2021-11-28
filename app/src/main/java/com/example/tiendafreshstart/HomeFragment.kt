package com.example.tiendafreshstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.tiendafreshstart.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import androidx.navigation.findNavController
import com.example.tiendafreshstart.databinding.FragmentHomeBinding
import com.example.tiendafreshstart.MapsActivity


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
            it.findNavController().navigate(R.id.action_homeFragment_to_carritoFragment2)
        }
        binding.btnmap.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_mapsActivity)
        }



        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

