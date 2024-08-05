package layout.e_kurir

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class ProfileActivity : AppCompatActivity(){
    private lateinit var binding : ProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val updateProfile = findViewById<LinearLayout>(R.id.text_editProfile)
//        updateProfile.setOnClickListener(){
////            Toast.makeText(applicationContext, "Opened Home Page", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this@ProfileActivity, ProfileDetailsActivity::class.java)
//            startActivity(intent)
//        }

//        val textName = findViewById<TextView>(R.id.text_name)
//        val textEmail = findViewById<TextView>(R.id.text_email)
//        val textContact = findViewById<TextView>(R.id.text_contact)
//        val textAddress = findViewById<TextView>(R.id.text_address)
//
//        val name = intent.getStringExtra("data_name")
//        val email = intent.getStringExtra("data_email")
//        val contact = intent.getStringExtra("data_contact")
//        val address = intent.getStringExtra("data_address")
//
//        textName.text = name
//        textEmail.text = email
//        textContact.text = contact
//        textAddress.text = address

//            ?: ""
    }
}