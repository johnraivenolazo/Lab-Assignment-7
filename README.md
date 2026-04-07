# Lab Assignment 7 - Prototype Pattern (Java)

This project demonstrates the Prototype Design Pattern using Java document types.

## Overview

The program defines a common Document prototype interface and creates concrete document prototypes for:
- PDF
- Text
- Spreadsheet

Instead of creating new document objects directly in client code, objects are cloned from registered prototypes through a registry class.

## Project Files

- Document.java: Prototype interface
- PdfDocument.java: Concrete PDF prototype
- TextDocument.java: Concrete text prototype
- SpreadsheetDocument.java: Concrete spreadsheet prototype
- DocumentRegistry.java: Stores and clones prototypes
- ProcessedDocument.java: Main class (client)

## How to Compile and Run

From the project root, run:

```bash
javac *.java
java ProcessedDocument
```

## Expected Output

The program prints prototype creation messages once, then prints details for cloned documents after their properties are set.

Sample output:

```text
Creating a PDF Document prototype.
Creating a Text Document prototype.
Creating a Spreadsheet Document prototype.

Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150

Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250

Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20

Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)
```