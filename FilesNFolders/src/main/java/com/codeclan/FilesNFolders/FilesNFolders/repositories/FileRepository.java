package com.codeclan.FilesNFolders.FilesNFolders.repositories;

import com.codeclan.FilesNFolders.FilesNFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
