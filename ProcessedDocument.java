public class ProcessedDocument {

    public static void main(String[] args) {

        DocumentRegistry registry = new DocumentRegistry();

        PdfDocument pdf1 = registry.createPdf();
        pdf1.setFileName("annual_report_2024.pdf");
        pdf1.setAuthor("Acme Corp");
        pdf1.setPageCount(150);

        pdf1.open();
        System.out.println(pdf1.getType());
        System.out.println();

        TextDocument text = registry.createText();
        text.setFilePath("meeting_notes.txt");
        text.setEncoding("UTF-8");
        text.setWordCount(250);

        text.open();
        System.out.println(text.getType());
        System.out.println();

        SpreadsheetDocument sheet = registry.createSpreadsheet();
        sheet.setSpreadsheetName("sales_data_q1.xlsx");
        sheet.setRowCount(1000);
        sheet.setColumnCount(20);

        sheet.open();
        System.out.println(sheet.getType());
        System.out.println();

        PdfDocument pdf2 = registry.createPdf();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setAuthor("Acme Corp");
        pdf2.setPageCount(30);

        pdf2.open();
    }
}
