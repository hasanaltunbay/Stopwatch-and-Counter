package com.hasanaltunbay.sayacvekronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.hasanaltunbay.sayacvekronometre.databinding.ActivityKronometreBinding

class KronometreActivity : AppCompatActivity() {

    private lateinit var binding:ActivityKronometreBinding
    var sayi=0
    var runnable:Runnable=Runnable { }
    var handler:Handler= Handler(Looper.getMainLooper())



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKronometreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarKronometre.title="KRONOMETRE"


    }

    fun basla(view:View){

        sayi=0

        runnable=object :Runnable{
            override fun run() {
                sayi++
                binding.textViewTime.text="TİME: ${sayi}"
                handler.postDelayed(this,1000)

            }

        }
        handler.post(runnable)
        binding.buttonBasla.isEnabled=false


    }


    fun durdur(view:View){

        binding.buttonBasla.isEnabled=true
        sayi=0
        binding.textViewTime.text="TİME: 0"
        handler.removeCallbacks(runnable)

    }
}