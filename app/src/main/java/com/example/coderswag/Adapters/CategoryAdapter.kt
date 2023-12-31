package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.documentfile.R
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category


class CategoryAdapter( context: Context, categories: List<Category>,) : BaseAdapter() {

    val context=context
    val categories = categories
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null){
            categoryView=LayoutInflater.from(context).inflate(com.example.coderswag.R.layout.category_list_item, null)
            holder=ViewHolder()

            holder.categoryImage=categoryView.findViewById(com.example.coderswag.R.id.categoryImage)
            holder.categoryName=categoryView.findViewById(com.example.coderswag.R.id.categoryName)
            println("i exist for first time")
            categoryView.tag=holder
        }
        else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("go green recycle")
        }



        val category=categories[position]

        val resourceId=context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)

        holder.categoryName?.text=category.title


        return categoryView
    }

    private class ViewHolder{
        var categoryImage: ImageView? =null
        var categoryName: TextView? = null
    }

}