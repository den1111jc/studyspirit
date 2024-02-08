package com.example.uchenlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uchenlin.databinding.ManualsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class Manuals : BottomSheetDialogFragment() {

    private var binding: ManualsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ManualsBinding.inflate (inflater, container, false)

        binding?.manualtext?.text = arguments?.getString("manualtxt").toString()


        return binding?.root
    }


}