package com.joneikel.mymovies

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.joneikel.mymovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners(binding)

    }

    private fun initListeners(binding: ActivityMainBinding) {
        binding.btnStart.setOnClickListener {
            if (binding.etTxt.text.isNotEmpty()) showMessage(binding.etTxt.text.toString())
        }
    }

    private fun showMessage(toString: String) {
        binding.etTxt.text.clear()
        Toast.makeText(this, toString, Toast.LENGTH_LONG).show()
    }

}