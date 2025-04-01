 package com.example.realtimeeditor.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
 
public class Document {  // ✅ Renamed to avoid conflict
    @Id
    private String id;
    private String title;
    private String content;
	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTitle(Object title2) {
		// TODO Auto-generated method stub
		
	}
	public Object getContent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setContent(Object content2) {
		// TODO Auto-generated method stub
		
	}
}
