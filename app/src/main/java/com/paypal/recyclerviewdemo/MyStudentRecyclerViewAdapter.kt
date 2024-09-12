package com.paypal.recyclerviewdemo

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyStudentRecyclerViewAdapter(
    private val values: List<Student>
) : RecyclerView.Adapter<MyStudentRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // inflate the item xml
        val containerView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item,
            parent, false)

        return ViewHolder(containerView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // binding data

        val std = values[position]
        holder.nameTextView.text = std.name
        holder.rollTV.text = "${std.rollNo}"
        holder.marksTV.text = "${std.marks}"
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameT)
        val rollTV: TextView = view.findViewById(R.id.rollT)
        val marksTV: TextView = view.findViewById(R.id.marksT)
    }

}