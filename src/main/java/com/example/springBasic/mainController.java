package com.example.springBasic;

import com.example.springBasic.anotation.preDetroyAndPost.LifecycleDemoBean;
import com.example.springBasic.anotation.primaryAndQualifier.GreetingComponent;
import com.example.springBasic.exportData.ExcelService;
import com.example.springBasic.exportData.PdfService;
import com.example.springBasic.readData.ReadDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class mainController {
    private final ReadDataService readDataService;
    private final ExcelService excelService;
    private final PdfService pdfService;
    private final GreetingComponent greetingComponent;
    private final LifecycleDemoBean lifecycleDemoBean;

    // EXPORT EXCEL
    @GetMapping("/export/excel")
    public ResponseEntity<byte[]> exportExcel() throws Exception {
        return excelService.exportToExcel(Arrays.asList("Row 1", "Row 2", "Row 3"));
    }

    // EXPORT PDF
    @GetMapping("/export/pdf")
    public ResponseEntity<byte[]> exportPdf() throws Exception {
        // Sample data
        return pdfService.exportToPdf(Arrays.asList("Line 1", "Line 2", "Line 3"));
    }

    // READ FILE
    @GetMapping("/readfile")
    private String getFile() throws IOException {
        return readDataService.read();
    }

    // TEST QUALIFIER AND PRIMARY
    @GetMapping("/annotaion")
    private String getGreeting(){
        return greetingComponent.greeting("Sokvisal");
    }



}
