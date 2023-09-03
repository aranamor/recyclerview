package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class Countriesadapter(
    var countryname: ArrayList<String>,
    var detailslist: ArrayList<String>,
    var imagelist: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<Countriesadapter.countryviewholder>() {

    class countryviewholder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var flag : TextView = itemView.findViewById(R.id.flag)
        var details : TextView = itemView.findViewById(R.id.details)
        var flagimage : CircleImageView = itemView.findViewById(R.id.flagimage)
        var cardView : CardView = itemView.findViewById(R.id.cardview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryviewholder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return countryviewholder(view)
    }

    override fun getItemCount(): Int {
        return countryname.size
    }

    override fun onBindViewHolder(holder: countryviewholder, position: Int) {
        holder.flag.text = countryname.get(position)
        holder.details.text = detailslist.get(position)
        holder.flagimage.setImageResource(imagelist.get(position))

        holder.cardView.setOnClickListener{
            Toast.makeText(context, "You selected the flag of ${countryname.get(position)}", Toast.LENGTH_LONG).show()
        }
    }

}