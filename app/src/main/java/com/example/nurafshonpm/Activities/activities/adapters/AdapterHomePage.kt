package com.example.nurafshonpm.Activities.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nurafshonpm.Activities.activities.model.ModelHomePage
import com.example.nurafshonpm.R

class AdapterHomePage(val list: ArrayList<ModelHomePage>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_page_item,parent,false)
        return HomePageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: ModelHomePage = list[position]
        if(holder is HomePageViewHolder){
            holder.image.setImageResource(model.imageAdministration)
            holder.title.text = model.titleAdministration
            holder.description.text = model.descriptionsAdministration
            holder.date.text = model.dateAdministration
        }
    }

    inner class HomePageViewHolder(view: View):RecyclerView.ViewHolder(view){
        var image: ImageView = view.findViewById(R.id.imageAdministration)
        var title: TextView = view.findViewById(R.id.titleAdministration)
        var description: TextView = view.findViewById(R.id.descriptionAdministration)
        var date: TextView = view.findViewById(R.id.dateAdministration)
    }
}