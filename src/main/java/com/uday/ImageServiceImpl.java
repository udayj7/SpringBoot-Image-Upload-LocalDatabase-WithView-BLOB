package com.uday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageRepository imageRepository;

	@Override
	public Image create(Image image) {
		return imageRepository.save(image);
	}

	@Override
	public List<Image> viewAll() {
		return (List<Image>) imageRepository.findAll();
	}

	@Override
	public Image viewById(long id) {
		return imageRepository.findById(id).get();
	}
	
	
	  @Override
	    public Image update(long id, Image updatedImage) {
	        Image existingImage = imageRepository.findById(id).orElse(null);
	        if (existingImage != null) {
	            existingImage.setImage(updatedImage.getImage());
	            return imageRepository.save(existingImage);
	        }
	        return null; // Handle non-existing image
	    }

	    @Override
	    public void delete(long id) {
	        imageRepository.deleteById(id);
	    }
}