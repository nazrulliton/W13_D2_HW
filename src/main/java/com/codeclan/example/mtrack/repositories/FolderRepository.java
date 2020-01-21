package com.codeclan.example.mtrack.repositories;


import com.codeclan.example.mtrack.models.Folder;
import com.codeclan.example.mtrack.projection.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
