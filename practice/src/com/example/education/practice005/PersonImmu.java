package com.example.education.practice005;

public final class PersonImmu {

        private String name;
        private String surname;

        public static final String UNNAMED_PERSON = "";

        public PersonImmu() {
                this.name = UNNAMED_PERSON;
                this.surname = UNNAMED_PERSON;
                }

        public PersonImmu(String name, String surname) {
                this.name = name;
                this.surname = surname;
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
}
