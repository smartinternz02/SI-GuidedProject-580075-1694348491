package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var recyclerView:RecyclerView=findViewById(R.id.recyclerview)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        var foodList:ArrayList<FoodModel> = ArrayList()
        var f1= FoodModel("Biryani","300",R.drawable.biryani)
        var f2= FoodModel("Pizza","230",R.drawable.pizza)
        var f3= FoodModel("Burger","120",R.drawable.burger)
        var f4= FoodModel("Kabab","300",R.drawable.kabab)
        var f5= FoodModel("Momos","100",R.drawable.momos)
        var f6=FoodModel("FriedRice","200",R.drawable.friedrice)
        var f7=FoodModel("Manchurian","150",R.drawable.manchurian)
        var f8=FoodModel("PannerTikka","300",R.drawable.paneertikka)

        foodList.add(f1)
        foodList.add(f2)
        foodList.add(f3)
        foodList.add(f4)
        foodList.add(f5)
        foodList.add(f6)
        foodList.add(f7)
        foodList.add(f8)

        val adapter=MyAdapter(foodList)
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)

    }
}