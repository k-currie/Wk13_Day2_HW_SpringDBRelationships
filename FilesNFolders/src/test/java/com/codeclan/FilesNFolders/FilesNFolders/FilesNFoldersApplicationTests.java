package com.codeclan.FilesNFolders.FilesNFolders;

import com.codeclan.FilesNFolders.FilesNFolders.repositories.FileRepository;
import com.codeclan.FilesNFolders.FilesNFolders.repositories.FolderRepository;
import com.codeclan.FilesNFolders.FilesNFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesNFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void () {
	}
}
