package com.example.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.sharedpreference.databinding.ActivityMain2Binding
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sherdPreferends.init(this)
        loddata()

        binding.tvedit.addTextChangedListener {
            sherdPreferends.myName = it.toString()
            loddata()
        
        }
    }
    private fun  loddata(){
     binding.tv.text = sherdPreferends.myName
    }
}