package uz.context.model5l3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import uz.context.model5l3.R
import uz.context.model5l3.model.Chat


class ChatAdapter(var context: Context, var items:ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_appearance,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is MessageViewHolder){

            val iv_theme = holder.iv_theme

            iv_theme.setImageResource(chat.theme)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var iv_theme: ShapeableImageView = view.findViewById(R.id.theme)

    }

}