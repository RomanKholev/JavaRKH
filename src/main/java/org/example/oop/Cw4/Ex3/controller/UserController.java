package org.example.oop.Cw4.Ex3.controller;

import org.example.oop.Cw4.Ex3.data.Student;
import org.example.oop.Cw4.Ex3.data.Teacher;
import org.example.oop.Cw4.Ex3.data.User;
import org.example.oop.Cw4.Ex3.service.DataService;
import org.example.oop.Cw4.Ex3.service.StudentGroupService;
import org.example.oop.Cw4.Ex3.view.UserView;

import java.time.LocalDate;
import java.util.List;


public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
