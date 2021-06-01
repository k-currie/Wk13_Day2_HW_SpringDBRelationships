package com.codeclan.FilesNFolders.FilesNFolders.components;

import com.codeclan.FilesNFolders.FilesNFolders.models.File;
import com.codeclan.FilesNFolders.FilesNFolders.models.Folder;
import com.codeclan.FilesNFolders.FilesNFolders.models.User;
import com.codeclan.FilesNFolders.FilesNFolders.repositories.FileRepository;
import com.codeclan.FilesNFolders.FilesNFolders.repositories.FolderRepository;
import com.codeclan.FilesNFolders.FilesNFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.format.datetime.DateTimeFormatAnnotationFormatterFactory;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    // now inject every repository with Autowired
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    // empty constructor
    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User claire = new User("Claire");
        userRepository.save(claire);

        User john = new User("John");
        userRepository.save(john);

        Folder topSecret = new Folder("Top Secret", claire);
        folderRepository.save(topSecret);

        Folder holidays = new Folder("Holidays", claire);
        folderRepository.save(holidays);

        Folder toDo = new Folder("To Do List", john);
        folderRepository.save(toDo);

        Folder householdBills = new Folder("Household Bills", john);
        folderRepository.save(householdBills);

        File revenge = new File("Revenge", ".xlsx", 200, topSecret);
        fileRepository.save(revenge);

        File blackBook = new File("My little black book", ".xlsx", 120, topSecret);
        fileRepository.save(blackBook);

        File portugal = new File("Portugal trip", ".xlsx", 60, holidays);
        fileRepository.save(portugal);

        File newYork = new File("New York trip", ".text", 80, holidays);
        fileRepository.save(newYork);

        File rota = new File("Cleaning rota", "xlsx", 30, toDo);
        fileRepository.save(rota);

        File visits = new File("Family visits", "xlsx", 40, toDo);
        fileRepository.save(visits);

        File gardening = new File("Gardening tasks", "xlsx", 60, toDo);
        fileRepository.save(gardening);

        File electric = new File("Electric meter readings", "xlsx", 65, householdBills);
        fileRepository.save(electric);

        File gas = new File("Gas meter readings", "xlsx", 50, householdBills);
        fileRepository.save(gas);

        File rent = new File("Rent payments", "xlsx", 50, householdBills);
        fileRepository.save(rent);

        claire.addFolder(topSecret);
        claire.addFolder(holidays);
        userRepository.save(claire);

        john.addFolder(holidays);
        john.addFolder(toDo);
        userRepository.save(john);

        topSecret.addFile(revenge);
        topSecret.addFile(blackBook);
        folderRepository.save(topSecret);

        holidays.addFile(portugal);
        holidays.addFile(newYork);
        folderRepository.save(holidays);

        toDo.addFile(rota);
        toDo.addFile(visits);
        toDo.addFile(gardening);
        folderRepository.save(toDo);

        householdBills.addFile(electric);
        householdBills.addFile(gas);
        householdBills.addFile(rent);
        folderRepository.save(householdBills);
    }

}
