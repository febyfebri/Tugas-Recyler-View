package id.ac.amikom.dinosaurus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_dinosaurus.view.*

class DinosaurusAdapter (val list: List<Dinosaurus>) : RecyclerView.Adapter<DinosaurusAdapter.ViewHolder>() {
    var onItemClickListener: ((Dinosaurus) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bind(dino : Dinosaurus){
        with(itemView){
            itemImage.setImageResource(dino.gambar)
            itemNama.text = dino.nama
        }
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_dinosaurus, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dino = list.get(position)
        holder.bind(dino)
        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(dino)
        }

    }
}