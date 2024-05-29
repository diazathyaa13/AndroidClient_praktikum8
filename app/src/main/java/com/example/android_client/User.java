package com.example.android_client;

public class User {
        private int id;
        private String name;
        private String email;
        private String nim;
        private String telepon;
        private String agama;
        public User(String name, String email, String nim, String telepon, String agama) {
            this.name = name;
            this.email = email;
            this.nim = nim;
            this.telepon = telepon;
            this.agama = agama;
        }
        public int getId() { return id; }
        public String getName() { return name; }
        public String getEmail() { return email; }
        public String getNim() { return nim; }
        public String getTelepon() { return telepon; }
        public String getAgama() { return agama; }
}
