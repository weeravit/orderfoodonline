package xyz.devnote.orderfoodonline.modules.food

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_food.view.*
import xyz.devnote.orderfoodonline.R
import xyz.devnote.orderfoodonline.extension.load

class FoodAdapter(private val items: List<FoodViewModel.Food> = listOf(),
                  private val listener: (item: FoodViewModel.Food) -> Unit) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_food, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(item: FoodViewModel.Food) {
            itemView.image_product.load(item.imageUrl)

            itemView.image_product.setOnClickListener {
                listener.invoke(item)
            }
        }
    }
}