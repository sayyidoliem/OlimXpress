package layout.e_kurir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.google.android.material.appbar.MaterialToolbar

class HomeActivity : AppCompatActivity(R.layout.home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val profile = findViewById<MaterialToolbar>(R.id.toolbar)
        profile.setOnMenuItemClickListener(){ menuItem ->
            when (menuItem.itemId){
                R.id.account -> {
//                    Toast.makeText(applicationContext, "Opened Detail Page", Toast.LENGTH_SHORT).show()
                    val detailIntent = Intent(this@HomeActivity, ProfileActivity::class.java)
                    startActivity(detailIntent)
                }
            }
            false
        }

        val shop = findViewById<CardView>(R.id.card2)
        shop.setOnClickListener(){
//            Toast.makeText(applicationContext, "Opened Detail Page", Toast.LENGTH_SHORT).show()
            val detailIntent = Intent(this@HomeActivity, OrderListActivity::class.java)
            startActivity(detailIntent)
        }

        val all = findViewById<LinearLayout>(R.id.allStates)
        all.setOnClickListener(){
//            Toast.makeText(applicationContext, "Opened Detail Page", Toast.LENGTH_SHORT).show()
            val detailIntent = Intent(this@HomeActivity, OrderListActivity::class.java)
            startActivity(detailIntent)
        }
    }
}