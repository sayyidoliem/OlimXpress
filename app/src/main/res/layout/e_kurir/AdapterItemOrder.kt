package layout.e_kurir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class AdapterItemOrder(
    private val contactList: List<ItemOrder>,
    private var onClick: ((ItemOrder)->Unit)? = null //variabel yg diklik
    ) : RecyclerView.Adapter<AdapterItemOrder.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ShapeableImageView>(R.id.image)
        val textName = itemView.findViewById<TextView>(R.id.text_title)
        val cost = itemView.findViewById<TextView>(R.id.text_cost)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tugas_6, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = contactList[position]
        holder.itemView.rootView.setOnClickListener{
            onClick?.invoke(data)//biar bisa diklik
        }
        holder.textName.text = data.name
        holder.cost.text = "$${data.price}"
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}