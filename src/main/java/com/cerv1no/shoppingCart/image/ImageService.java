package com.cerv1no.shoppingCart.image;

import com.cerv1no.shoppingCart.image.dto.ImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    void updateImage(MultipartFile file, Long imageId);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
}
