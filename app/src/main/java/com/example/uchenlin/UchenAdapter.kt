package com.example.uchenlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uchenlin.databinding.UcnenItemBinding



   class UchenAdapter(private val action_uchen:(UchenModel)->Unit, var uchens: ArrayList<UchenModel>):
       RecyclerView.Adapter <UchenAdapter.UchenHolder>() {



         override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UchenHolder {

             val binding:UcnenItemBinding= UcnenItemBinding.inflate(LayoutInflater.from(parent.context), parent,
                 false)

             return UchenHolder(binding)
         }

         override fun onBindViewHolder(holder: UchenHolder, position: Int) {
              holder.bind(uchens[position], action_uchen)
         }

         override fun getItemCount(): Int {
             return uchens.size
         }


         class UchenHolder (val binding:UcnenItemBinding): RecyclerView.ViewHolder(binding.root){

             fun bind(uchenModel:UchenModel, action_uchen: (UchenModel) -> Unit) {

                 binding.contentCard.setBackgroundResource(uchenModel.baner)
                 binding.linkread.text = uchenModel.manual

                 binding.manual.setOnClickListener(View.OnClickListener {
                     action_uchen(uchenModel)
                 })

             }
         }
   }
