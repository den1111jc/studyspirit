package com.example.uchenlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uchenlin.databinding.AboutChristBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class AboutChrist: BottomSheetDialogFragment() {

    private var binding: AboutChristBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AboutChristBinding.inflate (inflater, container, false)

        binding?.abchristtext?.text = arguments?.getString("abChrist").toString()


        return binding?.root
    }


}