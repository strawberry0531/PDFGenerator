package com.strawberry.pdfgenerator_databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.strawberry.pdfgenerator_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { addDetails() }
    }

    private fun addDetails() {
        val subjectDetailsList = listOf(
            SubjectDetails("Mathematics", 60),
            SubjectDetails("English", 70),
            SubjectDetails("Physics", 90),
            SubjectDetails("Chemistry", 65),
            SubjectDetails("Biology", 96)
        )
        var totalMarks = 0
        subjectDetailsList.forEach {
            totalMarks += it.marks
        }
        val pdfDetails = PdfDetails("Kenny Washington", totalMarks, subjectDetailsList)
        val pdfConverter = PDFConverter()
        pdfConverter.createPdf(this, pdfDetails, this)
    }
}