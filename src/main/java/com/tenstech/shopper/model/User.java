package com.tenstech.shopper.model;

   import jakarta.persistence.*;
   import lombok.AllArgsConstructor;
   import lombok.NoArgsConstructor;

   @Entity
   @NoArgsConstructor
   @AllArgsConstructor
   @Table(name = "app_user")
   public class User extends AuditedEntity{

       @Column(nullable = false, unique = true)
       private String username;

       @Column(nullable = false)
       private String password;

       @Column(nullable = false)
       private String roles;

       @Column(unique = true)
       private String email;

       @Column
       private String phone;

       @Column
       private String address;

       @Column
       private String city;

       @Column
       private String country;

       @Column
       private String firstName;

       @Column
       private String lastName;

       @Column
       private String gender;

       @Column
       private Boolean accountNonExpired;

       @Column
       private Boolean accountNonLocked;

       @Column
       private Boolean enabled;

       public String getUsername() {
           return username;
       }

       public void setUsername(String username) {
           this.username = username;
       }

       public String getPassword() {
           return password;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       public String getRoles() {
           return roles;
       }

       public void setRoles(String roles) {
           this.roles = roles;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getPhone() {
           return phone;
       }

       public void setPhone(String phone) {
           this.phone = phone;
       }

       public String getAddress() {
           return address;
       }

       public void setAddress(String address) {
           this.address = address;
       }

       public String getCity() {
           return city;
       }

       public void setCity(String city) {
           this.city = city;
       }

       public String getCountry() {
           return country;
       }

       public void setCountry(String country) {
           this.country = country;
       }

       public String getFirstName() {
           return firstName;
       }

       public void setFirstName(String firstName) {
           this.firstName = firstName;
       }

       public String getLastName() {
           return lastName;
       }

       public void setLastName(String lastName) {
           this.lastName = lastName;
       }

       public String getGender() {
           return gender;
       }

       public void setGender(String gender) {
           this.gender = gender;
       }

       public Boolean getAccountNonExpired() {
           return accountNonExpired;
       }

       public void setAccountNonExpired(Boolean accountNonExpired) {
           this.accountNonExpired = accountNonExpired;
       }

       public Boolean getAccountNonLocked() {
           return accountNonLocked;
       }

       public void setAccountNonLocked(Boolean accountNonLocked) {
           this.accountNonLocked = accountNonLocked;
       }

       public Boolean getEnabled() {
           return enabled;
       }

       public void setEnabled(Boolean enabled) {
           this.enabled = enabled;
       }
   }