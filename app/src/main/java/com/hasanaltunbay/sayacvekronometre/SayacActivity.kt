package com.hasanaltunbay.sayacvekronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.hasanaltunbay.sayacvekronometre.databinding.ActivityKronometreBinding
import com.hasanaltunbay.sayacvekronometre.databinding.ActivitySayacBinding

class SayacActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySayacBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySayacBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarSayac.title="SAYAÇ"


        object :CountDownTimer(21000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text="SAYAÇ: ${millisUntilFinished/1000}"

            }

            override fun onFinish() {

                binding.textView.text="BİTTİ..."
            }

        }.start()



    }
}