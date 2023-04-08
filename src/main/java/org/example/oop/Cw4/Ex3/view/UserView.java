package org.example.oop.Cw4.Ex3.view;

import org.example.oop.Cw4.Ex3.data.Student;
import org.example.oop.Cw4.Ex3.data.StudentGroup;
import org.example.oop.Cw4.Ex3.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView<T extends User>   {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
