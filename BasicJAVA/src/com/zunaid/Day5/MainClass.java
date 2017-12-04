/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5;

import com.zunaid.Day5.bank.BankDetails;
import com.zunaid.Day5.details.EmployeeDetails;
import com.zunaid.Day5.edu.DegreeName;
import com.zunaid.Day5.edu.EducationQualifications;
import com.zunaid.Day5.edu.Grade;
import com.zunaid.Day5.edu.InstituteName;
import com.zunaid.Day5.edu.PassingYear;
import com.zunaid.Day5.job.JobHistory;
import com.zunaid.Day5.job.JobType;
import com.zunaid.Day5.projects.ProjectsTillNow;
import com.zunaid.Day5.trainings.ProfessionalTrainings;
import com.zunaid.Day5.trainings.TrainingCenter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DBA
 */
public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        List<EducationQualifications> educationQualificationses1 = new ArrayList<>();
        educationQualificationses1.add(new EducationQualifications(1,new DegreeName(1, "SSC"),new Grade(1, 5.0), new PassingYear(1, 2010), new InstituteName(1, "Zilla School")));
        educationQualificationses1.add(new EducationQualifications(1,new DegreeName(2, "HSC"),new Grade(2, 5.0), new PassingYear(2, 2013), new InstituteName(2, "Zilla Collage")));
        
        List<JobHistory>  jobHistory1 = new ArrayList<>();
        jobHistory1.add(new JobHistory(1,"Project", 2, "Geameen Phone", new JobType(1, "Manager")));
        jobHistory1.add(new JobHistory(2,"Programmer", 2, "Bangla Phone", new JobType(2, "SE")));
        
        List<ProfessionalTrainings> professionalTrainings1 = new ArrayList<>();
        professionalTrainings1.add(new ProfessionalTrainings(1, "WEB DEV", 6, new TrainingCenter(1, "BASIS", "Kawran Bazar")));
        
        List<ProjectsTillNow> projectsTillNows1 = new ArrayList<>();
        List<BankDetails> bankDetailses1 = new ArrayList<>();
        List<EmployeeDetails> employeeDetails1 = new ArrayList<>();
        
        
        
    }
}
