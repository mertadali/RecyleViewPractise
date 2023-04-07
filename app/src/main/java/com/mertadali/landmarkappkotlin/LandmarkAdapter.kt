package com.mertadali.landmarkappkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mertadali.landmarkappkotlin.databinding.RecyclerRowBinding


class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {  // we will define a class with this name
    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){
           // we create view holder class and after than we implemented
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder { //Binding with the view holder which is created by us is done here
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context))
        return LandmarkHolder(binding)


    }

    override fun getItemCount(): Int {  //the part where we specify how many we will buy
        return landmarkList.size

    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {   //the part where we do what happens after we connect
        holder.binding.recyclerViewTestView.text= landmarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,InformationActivity::class.java)
            intent.putExtra("Landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }
}