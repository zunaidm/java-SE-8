/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.edu;

/**
 *
 * @author Zunaid
 */
public class EducationQualifications {
    //List :: (id, degreeName, grade, passingYear, instituteName)
    private int id;
    private DegreeName degreeName;
    private Grade grade;
    private PassingYear passingYear;
    private InstituteName instituteName;

    public EducationQualifications() {
    }

    public EducationQualifications(int id, DegreeName degreeName, Grade grade, PassingYear passingYear, InstituteName instituteName) {
        this.id = id;
        this.degreeName = degreeName;
        this.grade = grade;
        this.passingYear = passingYear;
        this.instituteName = instituteName;
    }

    public int getId() {
        return id;
    }

    public DegreeName getDegreeName() {
        return degreeName;
    }

    public Grade getGrade() {
        return grade;
    }

    public PassingYear getPassingYear() {
        return passingYear;
    }

    public InstituteName getInstituteName() {
        return instituteName;
    }
    
}
