package com.strawberry.pdfgenerator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MarksRecyclerAdapter(private val subjectMarksList: List<SubjectDetails>) :
    RecyclerView.Adapter<MarksRecyclerAdapter.MarksViewHolder>() {
    class MarksViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val subjectName: TextView = view.findViewById(R.id.txt_subject_recy)
        val subjectMarks: TextView = view.findViewById(R.id.txt_marks_recy)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarksViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_materials_pdf, parent, false)
        return MarksViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarksViewHolder, position: Int) {
        holder.subjectName.text = subjectMarksList[position].subjectName
        holder.subjectMarks.text = subjectMarksList[position].marks.toString()
    }

    override fun getItemCount(): Int {
        return subjectMarksList.size
    }
}