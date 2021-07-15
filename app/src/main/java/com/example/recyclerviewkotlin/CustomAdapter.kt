package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles = arrayOf("Maharashtra", "GUJRAT", "GOA", "UP", "Andhra Pradesh", "Arunachal Pradesh", "Assam"
            , "Bihar", "Chhattisgarh", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh",
            "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
            "Tripura", "Uttarakhand", "West Bengal")
    val details = arrayOf("Mumbai", "Gandhinagar", "Panji", "Lucknow", "Amaravati", "Itanagar", "Dispur",
            "Patna", "Raipur", "Chandigarh", "Shimla", "Ranchi", "Bengaluru", "Thiruvananthapuram", "Bhopal",
            "Imphal", "Shillong", "Aizawl", "Kohima", "Bhubaneswar", "Chandigarh", "Jaipur", "Gangtok", "Chennai", "Hyderabad",
            "Agartala", "Dehradun", "Kolkata")
    val images = intArrayOf(R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false);
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position];
        holder.itemDetails.text = details[position];
        holder.itemImage.setImageResource(images[position]);
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView;
        var itemTitle: TextView;
        var itemDetails: TextView;

        init {
            itemImage = itemView.findViewById(R.id.item_image);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDetails = itemView.findViewById(R.id.item_details);
        }
    }
}