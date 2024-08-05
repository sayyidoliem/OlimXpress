package layout.e_kurir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class OrderListActivity : AppCompatActivity(R.layout.order_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val backButtton = findViewById<MaterialToolbar>(R.id.toolbar)
        backButtton.setNavigationOnClickListener(){
//            val detailIntent = Intent(this@OrderListActivity, HomeActivity::class.java)
            finish()
        }
//        val inputText = findViewById<EditText>(R.id.text_input)
//        inputText.setOnClickListener(){
//            Toast.makeText(applicationContext, "Change Destination!", Toast.LENGTH_SHORT).show()
//        }

//        val textList = listOf(
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//            "Set Bedroom",
//        )
//
//        val imageList = listOf(
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//            R.drawable.set_bedroom,
//        )
//
//        val parcelist= mutableListOf<ContactOrder>()
//        for(i in textList.indices){
//            parcelist.add(
//                ParcelableClass(
//                    textList[i],
//                    imageList[i]
//                )
//            )
//        }
        val contact = ItemOrder(R.drawable.set_bedroom, "Bedroom Set", "350", "Bedroom set with 1 bed and pillow")
        val contact1 = ItemOrder(R.drawable.knalpot, "Knalpot Racing", "12", "Knalpot Racing with ")
        val contact2 = ItemOrder(R.drawable.tv, "Tv 4K", "20", "The tv has 4K resolution. From brand LG")
        val contact3 = ItemOrder(R.drawable.guitar, "Guitar", "300", "Guitar has ")
        val contact4 = ItemOrder(R.drawable.poster_bocchi, "Poster Bocchi", "3", "Inspired from Bocchi the Rock!")
        val contact5 = ItemOrder(R.drawable.kamera, "Leica M10", "4.000", "Premium Camera")
        val contact6 = ItemOrder(R.drawable.ipad, "Ipad Pro", "200", "Ipad multitasking")
        val contact7 = ItemOrder(R.drawable.nendoroid_utaha, "Nendo Utaha", "89", "Minifigure made in Japanese. The Character from Saekano")
        val contact8 = ItemOrder(R.drawable.bola_voli, "Volley Ball", "42", "Volleyball has standart")
        val contact9 = ItemOrder(R.drawable.lego, "Lego", "154", "Lego can make you feel better")
        val contact10 = ItemOrder(R.drawable.tas, "Tas", "14", "Bag idgrents ")
        val contactList = listOf<ItemOrder>(contact, contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter = AdapterItemOrder(contactList)

        recycler.adapter = AdapterItemOrder(contactList){ item ->
            startActivity(
                Intent(this, DetailActivity::class.java)
                    .putExtra(DetailActivity.KIRIM_ITEM, item)
            )
        }
    }
}
