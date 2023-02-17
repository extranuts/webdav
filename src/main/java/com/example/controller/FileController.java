package com.example.controller;

import com.example.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URISyntaxException;

@Slf4j
@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping("ok")
    public String ok() {
        return "All works";
    }


    @PostMapping("/item")
    public ResponseEntity<Boolean> uploadFile(
            @RequestParam("file") MultipartFile multipartFile) {
        String path = "/" + multipartFile.getOriginalFilename();
        try {
            fileService.uploadFile(path, multipartFile.getBytes());
            return ResponseEntity.ok(true);
        } catch (IOException | URISyntaxException e) {
            log.error(e.getMessage());
        }
        return ResponseEntity.ok(false);
    }
}
