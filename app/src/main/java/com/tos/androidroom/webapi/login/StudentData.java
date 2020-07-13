
package com.tos.androidroom.webapi.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentData {

    @SerializedName("student")
    @Expose
    private Student student;
    @SerializedName("token")
    @Expose
    private String token;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
