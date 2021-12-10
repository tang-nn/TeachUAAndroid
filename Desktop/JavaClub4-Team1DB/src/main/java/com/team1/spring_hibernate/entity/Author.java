package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    Set<Book> authorsOfBooks;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "nationality_id")
    private int nationality_id;

    @Column(name = "age")
    private int age;


//    @ManyToMany
//    @JoinTable(
//            name = "book_author",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"),
//            @Column(name = "is_coauthor")
//            private boolean is_coauthor;
//            )


//
//    @ManyToMany
//    @JoinTable(
//            name = "book_author",
//            joinColumns = @JoinColumn(name = "student_id"),
//            inverseJoinColumns = @JoinColumn(name = "course_id"))
//     Set<Book> likedCourses;


    public Author() {
    }

    public Author(int id, String name, String surname, int nationality_id, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationality_id = nationality_id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(int nationality_id) {
        this.nationality_id = nationality_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
