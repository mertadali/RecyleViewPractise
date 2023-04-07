package com.mertadali.landmarkappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.mertadali.landmarkappkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist : ArrayList<Landmark>    // if we want to add country later we have a list.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarklist = ArrayList<Landmark>()

        /* Data part - We created Landmark class after than we have to make objects of landmark therefore
         we did the bottom part but significant thing we created as a static so we didn't use to pull
          information for pictures or names.*/

        val pisa = Landmark("Pisa Tower","Italy",R.drawable.pisa)
        val collesium = Landmark("Collesium","Italy",R.drawable.collesium)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffiel)
        val bridge = Landmark("London Bridge","United Kingdom",R.drawable.bridge)

        landmarklist.add(pisa)
        landmarklist.add(collesium)
        landmarklist.add(eiffel)
        landmarklist.add(bridge)

        binding.recyclerView.layoutManager= LinearLayoutManager(this)

        val landmarkAdapter = LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter = landmarkAdapter

        /* Adapter  : Layout + Data  - Adapter using for connect layout to data
        // Mapping -  It is used to convert one data to another data.

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarklist.map { landmark -> landmark.name })
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,InformationActivity::class.java)
            intent.putExtra("Landmark",landmarklist.get(i))
            startActivity(intent)

            if it gave an error we would serialize the landmark class. (Serializable)

            ( This way we could also create but this method is not a useful so we will use RecyclerView.)


        }*/


    }

}