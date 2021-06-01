package com.codeclan.FilesNFolders.FilesNFolders;

import com.codeclan.FilesNFolders.FilesNFolders.models.File;
import com.codeclan.FilesNFolders.FilesNFolders.models.Folder;
import com.codeclan.FilesNFolders.FilesNFolders.models.User;
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

//	@Test
//	public void createNewUserFolderAndFile() {
//		User user1 = new User("Claire");
//		userRepository.save(user1);
//
//		Folder folder1 = new Folder("Top Secret", user1);
//		folderRepository.save(folder1);
//
//		File file1 = new File("df", ".xsxl", 60, folder1);
//		fileRepository.save(file1);
//	}
//
//	@Test
//	public void canAddFilesAndFolders() {
//		User user1 = new User("Claire");
//		userRepository.save(user1);
//
//		Folder folder1 = new Folder("Top Secret", user1);
//		folderRepository.save(folder1);
//
//		File file1 = new File("Contacts", ".xlsx", 60, folder1);
//		fileRepository.save(file1);
//
//		user1.addFolder(folder1);
//		userRepository.save(user1);
//
//		folder1.addFile(file1);
//		folderRepository.save(folder1);
//	}
}
