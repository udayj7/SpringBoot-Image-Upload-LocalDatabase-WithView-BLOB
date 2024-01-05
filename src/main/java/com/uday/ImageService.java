package com.uday;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ImageService {
    public Image create(Image image);
    public List<Image> viewAll();
    public Image viewById(long id);
    
    public Image update(long id, Image updatedImage) ;
    public void delete(long id);
}