package com.example.springBasic.exportData;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class PdfService {

    public ResponseEntity<byte[]> exportToPdf(List<String> data) throws IOException {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(outputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);

        // Add content to PDF
        for (String line : data) {
            document.add(new Paragraph(line));
        }

        // Close document
        document.close();

        byte[] pdfData = outputStream.toByteArray();

        // Create HTTP response
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=sample.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdfData);
    }
}
