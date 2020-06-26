package ru.hcc.recipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/*
 * Created by SS on 26/06/2020.
 */

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        log.debug("Received a file");
    }
}
