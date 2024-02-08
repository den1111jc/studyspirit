package com.example.uchenlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uchenlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),View.OnClickListener  {


    private var binding: ActivityMainBinding? = null
    private var uchenAdapter:UchenAdapter? = null
    private var uchens:ArrayList<UchenModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.manualbut?.setOnClickListener(this)
        binding?.aboutchrist?.setOnClickListener(this)




        uchens = ArrayList <UchenModel>()


        uchens?.add(UchenModel(R.drawable.zdrasnovgizn,getString(R.string.zdravnovlink),getString(R.string.zdravnovgizn)))
        uchens?.add(UchenModel(R.drawable.tanciyanovoobrachennogo,getString(R.string.stnovlink),getString(R.string.stnovobr)))
        uchens?.add(UchenModel(R.drawable.vvodniikurs,getString(R.string.vvodkurslink),getString(R.string.vvodkurs)))
        uchens?.add(UchenModel(R.drawable.atragivaiaserdza,getString(R.string.zatrserdlink),getString(R.string.zatrserdsta)))
        uchens?.add(UchenModel(R.drawable.tevoditelnastavnika,getString(R.string.putnastlink),getString(R.string.putnast)))
        uchens?.add(UchenModel(R.drawable.rslg,getString(R.string.rslglink),getString(R.string.RSLG)))
        uchens?.add(UchenModel(R.drawable.utevoditelpastiria,getString(R.string.putpastlink),getString(R.string.putpastira)))




         fun action_uchen(uchenModel: UchenModel) {

            val manuals = Manuals()
            val parameters = Bundle()
            parameters.putString("manualtxt", uchenModel.manualtxt)

            manuals.arguments = parameters

            manuals.show(supportFragmentManager, "manuals")





        }

        binding?.catalogChrist?.layoutManager = LinearLayoutManager(this)
        uchenAdapter =UchenAdapter ({uchenModel: UchenModel-> action_uchen(uchenModel)},uchens!!)
        binding?.catalogChrist?.adapter = uchenAdapter


    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.manualbut -> openGeneralManual()
            R.id.aboutchrist -> openAboutChrist()
        }
    }

    private fun openGeneralManual() {
        val genman = GeneralManual()
        val parameters = Bundle()
        parameters.putString("genmanual", getString(R.string.genmanual))
        genman.arguments = parameters
        genman.show(supportFragmentManager, "manuals")
    }

    private fun openAboutChrist() {
        val abCr = AboutChrist()
        val parameters = Bundle()
        parameters.putString("abChrist", getString(R.string.abChrist))
        abCr.arguments = parameters
        abCr.show(supportFragmentManager, "ab")
    }






}