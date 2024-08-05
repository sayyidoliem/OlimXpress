package layout.e_kurir

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemOrder(
    val image : Int,
    val name : String,
    val price : String,
    val description : String
) : Parcelable