package com.example.real_dolar_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.real_dolar_converter.databinding.ActivityMainBinding
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
//valor dolar pra real hoje: 5,11 //valor euro : 5.40

    fun convertEuro(v : View){
        var valorEuro : Double = binding.editvalorEuro.text.toString().toDouble()
        var result: Double  = valorEuro * 5.40


        binding.tvResultadoEuro.setText("Em R$: " + "%.2f".format(result))
    }

    fun convertReal(v: View){
        var valorDolar: Double = binding.editvalorDolar.text.toString().toDouble()
        var result: Double = valorDolar * 5.11
        /*var dec = DecimalFormat("#,##")
        dec.roundingMode = RoundingMode.CEILING
        var saida = dec.format(result)*/
        binding.tvResultDolar.setText("Em R$: " + "%.2f".format(result))
    }
}