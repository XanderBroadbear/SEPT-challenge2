package com.example.person.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "person")
public class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String address;

        @Column(nullable = false)
        private int postcode;

        @Column(nullable = false)
        private int age;

        @Column(nullable = false)
        private String job;

        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
        private int phoneno;


        public int getId() {
            return id;
        }
        public void setId(int id) {this.id = id;}

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }

        public int getPostcode() {
            return postcode;
        }
        public void setpostcode(int postcode) {
            this.postcode = postcode;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }
        public void setJob(String job) {
            this.job = job;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public int getPhoneno() {
            return phoneno;
        }
        public void setPhoneno(int phoneno) {
            this.phoneno = phoneno;
        }

    }

