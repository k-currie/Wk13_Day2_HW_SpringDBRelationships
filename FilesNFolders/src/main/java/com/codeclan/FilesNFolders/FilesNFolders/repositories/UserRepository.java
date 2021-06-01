package com.codeclan.FilesNFolders.FilesNFolders.repositories;

import com.codeclan.FilesNFolders.FilesNFolders.models.User;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
