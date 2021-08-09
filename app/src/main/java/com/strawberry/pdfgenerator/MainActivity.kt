package com.strawberry.pdfgenerator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var btnCreatePDF: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnCreatePDF = findViewById(R.id.button)
        btnCreatePDF.setOnClickListener {
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
}