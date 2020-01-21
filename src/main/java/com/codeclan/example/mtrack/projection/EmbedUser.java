package com.codeclan.example.mtrack.projection;

import com.codeclan.example.mtrack.models.Folder;
import com.codeclan.example.mtrack.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class )
public interface EmbedUser {
    String getTitle();
    User getUser();
    List getFiles();
}
