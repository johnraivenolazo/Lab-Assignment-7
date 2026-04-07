public class DocumentRegistry {

    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdf() {
        return (PdfDocument) pdfPrototype.clone();
    }

    public TextDocument createText() {
        return (TextDocument) textPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheet() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}
