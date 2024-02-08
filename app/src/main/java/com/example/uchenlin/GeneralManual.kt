package com.example.uchenlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uchenlin.databinding.GeneralManualBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class GeneralManual: BottomSheetDialogFragment() {

    private var binding: GeneralManualBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = GeneralManualBinding.inflate (inflater, container, false)

        binding?.generaltext?.text = arguments?.getString("genmanual").toString()


        return binding?.root
    }


}