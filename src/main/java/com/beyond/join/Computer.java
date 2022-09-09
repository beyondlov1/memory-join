package com.beyond.join;

/**
 * @author chenshipeng
 * @date 2021/03/30
 */
public class Computer {
    private String studentId;
    private String computerName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "studentId='" + studentId + '\'' +
                ", computerName='" + computerName + '\'' +
                '}';
    }
}
