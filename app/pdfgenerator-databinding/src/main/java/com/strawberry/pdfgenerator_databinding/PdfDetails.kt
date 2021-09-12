package com.strawberry.pdfgenerator_databinding


data class PdfDetails(
    val studentName:String,
    val totalMarks:Int,
    val subjectDetailsList: List<SubjectDetails>
)