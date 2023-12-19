package com.gscom.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gscom.Details
import com.gscom.R
import com.gscom.model.User

class ServiceAdapter(var context: Context, arrayList: ArrayList<User>) :
    RecyclerView.Adapter<ServiceAdapter.MyViewHolder>() {

    var arrayList: ArrayList<User>


    init {
        this.arrayList = arrayList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_complaint, parent, false)

        return MyViewHolder(view)
    }


    // add connection id
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.name.text = arrayList[position].name
        holder.accountId.text = arrayList[position].accid
        holder.subcate.text = arrayList[position].subcat
        holder.rrnumber.text = arrayList[position].rrno

        // Set onClickListener
        holder.itemView.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, Details::class.java)
            intent.putExtra("name", arrayList[position].name)
            intent.putExtra("AC ID", arrayList[position].accid)
            intent.putExtra("Subcategory", arrayList[position].subcat)
            intent.putExtra("rrno", arrayList[position].rrno)
            intent.putExtra("category",arrayList[position].cat)
            intent.putExtra("date", arrayList[position].date)

            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.name)
        var accountId: TextView = view.findViewById(R.id.accountId)
        var subcate: TextView = view.findViewById(R.id.subcate)
        var rrnumber: TextView = view.findViewById(R.id.rrnumber)
    }
}
