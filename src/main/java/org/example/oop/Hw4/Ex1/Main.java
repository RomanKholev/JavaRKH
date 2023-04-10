package org.example.oop.Hw4.Ex1;

import org.example.oop.Hw4.Ex1.data.Teacher;
import org.example.oop.Hw4.Ex1.data.UserComparator;
import org.example.oop.Hw4.Ex1.view.TeacherView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс УчительСервис и реализовать аналогично проделанному на семинаре
 * Создать класс УчительВью и реализовать аналогично проделанному на семинаре
 */
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Name1", "SecondName1", "Patronymic1", LocalDate.of(1984, 01, 01), 01L);
        Teacher teacher2 = new Teacher("Name2", "SecondName2", "Patronymic2", LocalDate.of(1984, 01, 02), 02L);
        Teacher teacher3 = new Teacher("Name3", "SecondName3", "Patronymic3", LocalDate.of(1984, 01, 03), 03L);
        UserComparator<Teacher> teahcomp = new UserComparator<>();
        System.out.println(teahcomp.compare(teacher1,teacher2));
        TeacherView teacherView = new TeacherView();
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teacherView.sendOnConsole(teachers);
    }
}
