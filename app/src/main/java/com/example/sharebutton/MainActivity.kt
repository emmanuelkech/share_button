package com.example.sharebutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shareBtn.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.type = "type/plain"
            val shareBody = "You are Body"
            val shareSub = "You subject here"
            myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody)
            myIntent.putExtra(Intent.EXTRA_TEXT, shareSub)
            startActivity(Intent.createChooser(myIntent,"Share your App"))
        }
    }
}