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

        Folder movie = new Folder("movie files", john);
        folderRepository.save(movie);
        Folder music = new Folder("music files", john);
        folderRepository.save(music);

        File dayOne = new File("hw from d1", "txt", 5, homework);
        fileRepository.save(dayOne);
        File daytwo = new File("hw from d2", "txt", 4, homework);
        fileRepository.save(daytwo);

         File picOne = new File("pic from d1", "txt", 5, picture);
        fileRepository.save(picOne);
        File picTwo = new File("pic from d2", "txt", 9, picture);
        fileRepository.save(picTwo);


         File movOne = new File("mov 1", "mp4", 50, movie);
        fileRepository.save(movOne);
        File movtwo = new File("mov 2", "mp4", 50, movie);
        fileRepository.save(movtwo);

         File mp3One = new File("hw from d1", "txt", 5, music);
        fileRepository.save(mp3One);
        File mp3two = new File("hw from d1", "txt", 5, music);
        fileRepository.save(mp3two);

        dave.addFolder(homework);
        dave.addFolder(picture);
        userRepository.save(dave);

        john.addFolder(music);
        john.addFolder(movie);
        userRepository.save(john);

        homework.addFiles(dayOne);
        homework.addFiles(daytwo);
        folderRepository.save(homework);

        picture.addFiles(picOne);
        picture.addFiles(picTwo);
        folderRepository.save(picture);

        movie.addFiles(movOne);
        movie.addFiles(movtwo);
        folderRepository.save(movie);

        music.addFiles(mp3One);
        music.addFiles(mp3two);
        folderRepository.save(music);



    }




}
