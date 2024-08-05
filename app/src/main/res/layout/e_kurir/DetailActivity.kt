package layout.e_kurir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import coil.load
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButtonToggleGroup
import com.olimapp.e_kurir.R
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity(R.layout.order_details) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_details)

//        val productImage = findViewById<ImageView>(R.id.image_profile)
//        productImage.setOnClickListener(){
//            Toast.makeText(applicationContext, "Opened Profile", Toast.LENGTH_SHORT).show()
//            val profileIntent = Intent(this@DetailActivity, ProfileActivity::class.java)
//            startActivity(profileIntent)
//        }

        val backButton = findViewById<MaterialToolbar>(R.id.toolbar_detail)
        backButton.setNavigationOnClickListener(){
//            Toast.makeText(applicationContext, "Back to Home", Toast.LENGTH_SHORT).show()
            finish()
        }

//        val card = findViewById<MaterialCardView>(R.id.card1)
//        card.setOnClickListener(){
//            Toast.makeText(applicationContext, "Change Saved!", Toast.LENGTH_SHORT).show()
//        }

//        val buttonCiti = findViewById<Button>(R.id.buttonPanel)
//        buttonCiti.setOnClickListener(){
//            Toast.makeText(applicationContext, "Change Saved!", Toast.LENGTH_SHORT).show()
//        }
//
//        val buttonCiti1 = findViewById<Button>(R.id.buttonPanel1)
//        buttonCiti1.setOnClickListener(){
//            Toast.makeText(applicationContext, "Change Saved!", Toast.LENGTH_SHORT).show()
//        }
//
//        val buttonCiti2 = findViewById<Button>(R.id.buttonPanel2)
//        buttonCiti2.setOnClickListener(){
//            Toast.makeText(applicationContext, "Change Saved!", Toast.LENGTH_SHORT).show()
//        }

        val buttonConfirm = findViewById<Button>(R.id.lima)
        buttonConfirm.setOnClickListener(){
            Toast.makeText(applicationContext, "successfully!", Toast.LENGTH_SHORT).show()
        }

        val itemDetail= intent.getParcelableExtra<ItemOrder>(KIRIM_ITEM) ?: return

        val textDetail = findViewById<TextView>(R.id.text_title)
        val textDetail1 = findViewById<TextView>(R.id.text_description)
        val price = findViewById<TextView>(R.id.text_cost)
        val description = findViewById<TextView>(R.id.text_description_item)
        val imageDetail = findViewById<ImageView>(R.id.image_profile)

        textDetail.text = itemDetail.name
        textDetail1.text = itemDetail.name
        price.text = itemDetail.price
        description.text = itemDetail.description
        imageDetail.load(itemDetail.image)

        val add = findViewById<ImageButton>(R.id.button_add)
        val remove = findViewById<ImageButton>(R.id.button_remove)
        val quantity = findViewById<TextView>(R.id.text_quantity)
        val textresult = findViewById<TextView>(R.id.totalCost)

        val cost = price.text.toString().toInt()
        var finalPrice = 0
        textresult.text = "$$cost"

        val toggleButton = findViewById<MaterialButtonToggleGroup>(R.id.toogleButtonGroup)
        val paymentMethod = findViewById<TextView>(R.id.tiga)
        val paymentCost = findViewById<TextView>(R.id.text_payment_cost)
        var harga = 0
        toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
            // Respond to button selection
            when {
                checkedId == R.id.button1 && isChecked -> {//Bank
                    Toast.makeText(applicationContext, "Change 1", Toast.LENGTH_SHORT).show()
                    paymentMethod.text = "How to pay using with Bank?"
                    paymentCost.text = "7"
                    harga = 7
                }
                checkedId == R.id.button2 && isChecked -> {//Debit
                    Toast.makeText(applicationContext, "Change 2", Toast.LENGTH_SHORT).show()
                    paymentMethod.text = "How to pay using with Debit?"
                    paymentCost.text = "5"
                    harga = 5
                }
                checkedId == R.id.button3 && isChecked -> {//Paypal
                    Toast.makeText(applicationContext, "Change 3", Toast.LENGTH_SHORT).show()
                    paymentMethod.text = "How to pay using with Paypal?"
                    paymentCost.text = "4"
                    harga = 4
                }
                checkedId == R.id.button4 && isChecked -> {//Cash
                    Toast.makeText(applicationContext, "Change 4", Toast.LENGTH_SHORT).show()
                    paymentMethod.text = "How to pay using with Cash?"
                    paymentCost.text = "2"
                    harga = 2
                }
            }
        }


        add.setOnClickListener(){
//            val tambah = price.text.toString().toInt()
//            val hasil = tambah + tambah
            val totalQuantity = quantity.text.toString().toInt()
            val quantityHasil = totalQuantity + 1
            quantity.text = "$quantityHasil"

            finalPrice = cost * quantityHasil + harga
            textresult.text = "$$finalPrice"
        }

        remove.setOnClickListener(){
            val totalQuantity = quantity.text.toString().toInt()
            if (totalQuantity >= 4){
                val hasil = totalQuantity - 1
                quantity.text = "$hasil"

                val total = cost * hasil + harga
                textresult.text = "$$total"
            }
        }

//        val checkButton = findViewById<ToggleButton>(R.id.toggleButton)

//        checkButton.addOnButtonCheckedListener { checkButton, checkedId, isChecked ->
//            // Respond to button selection
//        }
    }
    companion object{
        const val KIRIM_ITEM = "KIRIMITEMKEY"
    }
}