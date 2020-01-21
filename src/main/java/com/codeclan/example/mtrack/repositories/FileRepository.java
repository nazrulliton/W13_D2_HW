package com.codeclan.example.mtrack.repositories;

import com.codeclan.example.mtrack.models.File;
import com.codeclan.example.mtrack.projection.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {

}
