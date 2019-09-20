package com.study.xu;

import sun.text.resources.sk.CollationData_sk;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

public class demo1 {
    public static void main(String[] args) {

//        Random random = new Random();
//        for(int i =0;i<10;i++){
//            int j = random.nextInt(100);
//            list.add(j);
//        }
//        for(Object a : list){
//            System.out.print(a+"排序前"+",");
//        }
//        Collections.sort(list);
//        System.out.println("================");
//
//        for(Object a : list){
//            System.out.print(a+"排序后"+",");
//        }

        List<Student> list = new ArrayList<Student>();
        Random random = new Random();
        list.add(new Student(random.nextInt(1000)+"","Lucy"));
        list.add(new Student(random.nextInt(1000)+"","Jack"));
        list.add(new Student(random.nextInt(1000)+"","Hill"));
        list.add(new Student(10000+"","0abc"));
        System.out.println("-----------排序前------------");
        for(Student student:list){
            System.out.println("学生姓名："+student.name+",学生id："+student.id);
        }
        Collections.sort(list);
        System.out.println("-----------id排序后------------");
        for(Student student:list){
            System.out.println("学生姓名："+student.name+",学生id："+student.id);
        }

        Collections.sort(list, new StudentComparator());
        System.out.println("-----------按照姓名排序后------------");
        for(Student student:list){
            System.out.println("学生姓名："+student.name+",学生id："+student.id);
        }
    }
    }
class Student implements Comparable<Student>{
    public String id;
    public String name;
    public Set courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, courses);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }

    public Student(String id, String name) {
        super();
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }
}
