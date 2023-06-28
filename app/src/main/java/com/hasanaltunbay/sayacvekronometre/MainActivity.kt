package com.hasanaltunbay.sayacvekronometre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanaltunbay.sayacvekronometre.databinding.ActivityKronometreBinding
import com.hasanaltunbay.sayacvekronometre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarAnasayfa.title="Sayaç ve Kronometre"

        binding.buttonSayac.setOnClickListener {
            val intent=Intent(this@MainActivity,SayacActivity::class.java)
            startActivity(intent)
        }
        binding.buttonKronometre.setOnClickListener {
            val intent=Intent(this@MainActivity,KronometreActivity::class.java)
            startActivity(intent)
        }
    }
}