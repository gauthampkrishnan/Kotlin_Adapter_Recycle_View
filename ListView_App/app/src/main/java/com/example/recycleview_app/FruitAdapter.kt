package com.example.recycleview_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_food.view.*


class FruitAdapter(
    val fruits:ArrayList<Fruit>
): RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_food,parent,false
        )
        return FruitViewHolder(itemView)
    }

    override fun getItemCount(): Int = fruits.size


    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
       holder.itemView.tvFruitname.text = fruits[position].name
        holder.itemView.tvOrigin.text = fruits[position].origin
        holder.itemView.tvquantity.text = fruits[position].quantity.toString()
    }
    class FruitViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}