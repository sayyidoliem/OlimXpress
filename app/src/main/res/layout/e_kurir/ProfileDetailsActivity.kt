//package com.olimapp.e_kurir
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.google.android.material.appbar.MaterialToolbar
//import com.google.android.material.card.MaterialCardView
//
//class ProfileDetailsActivity : AppCompatActivity(R.layout.profile_details){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val backButton = findViewById<MaterialToolbar>(R.id.toolbar_profile)
//        backButton.setNavigationOnClickListener(){
////            Toast.makeText(applicationContext, "Opened Home Page", Toast.LENGTH_SHORT).show()
//            finish()
//        }
//
//
//        val editName = findViewById<EditText>(R.id.text_name)
//        val editEmail = findViewById<EditText>(R.id.edit_email)
//        val editContact = findViewById<EditText>(R.id.edit_contact)
//        val editAddress = findViewById<EditText>(R.id.edit_address)
////
////        editAddress.setOnClickListener(){
////            //untuk mengambil data dari edit text
////            val name = editName.text.toString()
////            val email = editEmail.text.toString()
////            val contact = editContact.text.toString()
////            val address = editAddress.text.toString()
//////            Toast.makeText(applicationContext, "$name, $email, $password" , Toast.LENGTH_SHORT).show()
////            val intent = Intent(this@ProfileDetailsActivity, ProfileActivity::class.java)
////            intent.putExtra("data_name",name)
////            intent.putExtra("data_email",email)
////            intent.putExtra("data_contact",contact)
////            intent.putExtra("data_address",address)
////            startActivity(intent)
////        }
//
//        val save = findViewById<Button>(R.id.save_button)
//        save.setOnClickListener(){
//            val name = editName.text.toString()
//            val email = editEmail.text.toString()
//            val contact = editContact.text.toString()
//            val address = editAddress.text.toString()
//            val intent = Intent(this@ProfileDetailsActivity, ProfileActivity::class.java)
//            intent.putExtra("data_name",name)
//            intent.putExtra("data_email",email)
//            intent.putExtra("data_contact",contact)
//            intent.putExtra("data_address",address)
//            Toast.makeText(applicationContext, "Change Saved!", Toast.LENGTH_SHORT).show()
//            startActivity(intent)
//        }
//    }
//}