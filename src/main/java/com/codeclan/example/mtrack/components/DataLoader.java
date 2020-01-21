package com.codeclan.example.mtrack.components;


import com.codeclan.example.mtrack.models.File;
import com.codeclan.example.mtrack.models.Folder;
import com.codeclan.example.mtrack.models.User;
import com.codeclan.example.mtrack.repositories.FileRepository;
import com.codeclan.example.mtrack.repositories.FolderRepository;
import com.codeclan.example.mtrack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User dave = new User("Big Davie");
        userRepository.save(dave);
        User john = new User("Big John");
        userRepository.save(john);

        Folder homework = new Folder("Homework files", dave);
        folderRepository.save(homework);
        Folder picture = new Folder("Picture files", dave);
        folderRepository.save(picture);

        Folder movie = new Folder("movie files", dave);
        folderRepository.save(movie);
        Folder music = new Folder("music files", dave);
        folderRepository.save(music);

        File dayOne = new File("hw from d1", "txt", 5, homework);
        fileRepository.save(dayOne);


    }




}
