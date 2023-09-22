package com.example.fooddelivery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var foodList:ArrayList<FoodModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder> (){

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var foodImage:ImageView
        lateinit var foodTitle:TextView
        lateinit var foodPrice:TextView
        lateinit var add_btn:Button

        init{
            foodImage=itemView.findViewById(R.id.imageview)
            foodTitle=itemView.findViewById(R.id.title)
            foodPrice=itemView.findViewById(R.id.price)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return MyViewHolder(v)
    }


    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
       holder.foodTitle.setText(foodList[position].title)
        holder.foodImage.setImageResource(foodList[position].img)
        holder.foodPrice.setText(foodList[position].price)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}