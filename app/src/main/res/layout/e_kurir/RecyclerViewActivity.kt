//package com.olimapp.e_kurir
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.RecyclerView
//
//class RecyclerViewActivity : AppCompatActivity(R.layout.recycle_view) {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContentView(R.layout.recycle_view)
//
//        val contact1 = Contact(R.drawable.ic_baseline_account_circle_24,"Arya")
//        val contact2 = Contact(R.drawable.ic_baseline_account_balance_wallet_24,"Barik")
//        val contact3 = Contact(R.drawable.ic_baseline_arrow_back_24,"Fadhil")
//        val contact4 = Contact(R.drawable.ic_baseline_dashboard_24,"Fariz")
//        val contact5 = Contact(R.drawable.ic_baseline_send_24,"Hariz")
//        val contact6 = Contact(R.drawable.ic_baseline_dehaze_24,"Ilham")
//        val contact7 = Contact(R.drawable.ic_baseline_shopping_cart_checkout_24,"Khaikal")
//        val contact8 = Contact(R.drawable.ic_baseline_send_24,"Hasfi")
//        val contact9 = Contact(R.drawable.ic_baseline_account_balance_wallet_24,"Sayyid")
//        val contact10 = Contact(R.drawable.ic_baseline_dehaze_24,"Sayyid")
//        val contact11 = Contact(R.drawable.ic_baseline_account_balance_wallet_24,"Sayyid")
//        val contact12 = Contact(R.drawable.ic_baseline_send_24,"Sayyid")
//        val contact13 = Contact(R.drawable.ic_baseline_arrow_back_24,"Sayyid")
//        val contact14 = Contact(R.drawable.ic_baseline_account_balance_wallet_24,"Sayyid")
//        val contact15 = Contact(R.drawable.ic_baseline_dashboard_24,"Sayyid")
//        val contact16 = Contact(R.drawable.ic_baseline_shopping_cart_checkout_24,"Sayyid")
//        val contact17 = Contact(R.drawable.ic_baseline_account_circle_24,"Sayyid")
//        val contact18 = Contact(R.drawable.ic_baseline_account_balance_wallet_24,"Sayyid")
//        val contactList = listOf<Contact>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18)
//
//        val recyler = findViewById<RecyclerView>(R.id.recyclerView)
//        recyler.adapter = ContactAdapter(contactList)
//    }
//}