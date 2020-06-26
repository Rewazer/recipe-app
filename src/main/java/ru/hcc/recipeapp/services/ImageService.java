package ru.hcc.recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/*
 * Created by SS on 26/06/2020.
 */

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
