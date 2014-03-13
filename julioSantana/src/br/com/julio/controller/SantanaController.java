package br.com.julio.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class SantanaController {
	
    private List<String> images;  
    
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=5;i++) {  
            images.add("Linguica" + i + ".png");  
        }  

    }

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}  
}
