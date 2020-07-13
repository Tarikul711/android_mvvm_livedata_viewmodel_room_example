
package com.tos.androidroom.webapi.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentProfile {

    @SerializedName("data")
    @Expose
    private StudentData studentData;

    public StudentData getStudentData() {
        return studentData;
    }

    public void setStudentData(StudentData studentData) {
        this.studentData = studentData;
    }

}
