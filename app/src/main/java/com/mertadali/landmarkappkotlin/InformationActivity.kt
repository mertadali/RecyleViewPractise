package com.mertadali.landmarkappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertadali.landmarkappkotlin.databinding.ActivityInformationBinding

@Suppress("DEPRECATION")
class InformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // Intent part  - Casting

        val intent = intent
        val selected = intent.getSerializableExtra("Landmark") as Landmark
        binding.placeText.text = selected.name
        binding.countryText.text = selected.country
        binding.imageView.setImageResource(selected.image)

    }

}