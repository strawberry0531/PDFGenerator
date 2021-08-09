package com.strawberry.pdfgenerator


data class PdfDetails(
    val studentName:String,
    val totalMarks:Int,
    val subjectDetailsList: List<SubjectDetails>
)