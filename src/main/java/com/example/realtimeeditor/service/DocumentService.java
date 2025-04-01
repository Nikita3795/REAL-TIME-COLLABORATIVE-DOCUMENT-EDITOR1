 package com.example.realtimeeditor.service;

import com.example.realtimeeditor.model.Document;
import com.example.realtimeeditor.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document createDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Document updateDocument(String id, Document newDocument) {
        return documentRepository.findById(id)
                .map(doc -> {
                    doc.setTitle(newDocument.getTitle());
                    doc.setContent(newDocument.getContent());
                    return documentRepository.save(doc);
                })
                .orElseThrow(() -> new RuntimeException("Document not found"));
    }

    public void deleteDocument(String id) {
        documentRepository.deleteById(id);
    }
}
