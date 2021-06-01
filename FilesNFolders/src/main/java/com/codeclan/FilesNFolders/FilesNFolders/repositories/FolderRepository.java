package com.codeclan.FilesNFolders.FilesNFolders.repositories;

import com.codeclan.FilesNFolders.FilesNFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
