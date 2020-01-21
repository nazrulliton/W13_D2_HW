package com.codeclan.example.mtrack.projection;


import com.codeclan.example.mtrack.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.nio.file.Files;

@Projection(name = "embedFolder", types = Files.class )
public interface EmbedFolder {
    String getName();
    String getExtensions();
    int getSize();
    Folder getFolder();
}
