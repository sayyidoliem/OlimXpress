//package com.olimapp.e_kurir
//
//import android.view.LayoutInflater
//import androidx.recyclerview.widget.RecyclerView
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import com.google.android.material.imageview.ShapeableImageView
//
//
//class ContactAdapter(val contactList: List<Contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
//
//    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
//        val textName = itemView.findViewById<TextView>(R.id.text_title)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tugas_6, parent, false)
//        return ContactViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//        val data = contactList[position]
//        holder.textName.text = data.name
//        holder.image.setImageResource(data.image)
//    }
//
//    override fun getItemCount(): Int {
//        return contactList.size//unutk menampilkan berapa jumlah banyak item ditampilkan di recyclerview
//    }
//}