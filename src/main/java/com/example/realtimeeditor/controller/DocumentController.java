package com.example.realtimeeditor.controller;

import com.example.realtimeeditor.model.Document;
import com.example.realtimeeditor.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")  // ✅ Ensure this is correct
@CrossOrigin(origins = "http://localhost:3000") 
public class DocumentController {
    
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.createDocument(document);
    }

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable String id, @RequestBody Document document) {
        return documentService.updateDocument(id, document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable String id) {
        documentService.deleteDocument(id);
    }
}
