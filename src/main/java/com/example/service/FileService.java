package com.example.service;

import com.example.config.WebDavConfig;
import com.github.sardine.Sardine;
import lombok.RequiredArgsConstructor;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.net.URISyntaxException;


@Service
@RequiredArgsConstructor
public class FileService {

    private final Sardine sardine;

    private final WebDavConfig webDavConfig;

    public void uploadFile(String path, byte[] bytes) throws IOException, URISyntaxException {
        String fullPath = new URIBuilder(
                webDavConfig.getRoot())
                .setPath(path)
                .toString();
        sardine.put(fullPath, bytes);
    }
}
