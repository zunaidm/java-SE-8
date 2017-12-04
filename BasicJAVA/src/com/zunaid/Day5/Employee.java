/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5;


import com.zunaid.Day5.Address.Address;
import com.zunaid.Day5.bank.BankDetails;
import com.zunaid.Day5.details.EmployeeDetails;
import com.zunaid.Day5.edu.EducationQualifications;
import com.zunaid.Day5.job.JobHistory;
import com.zunaid.Day5.projects.ProjectsTillNow;
import com.zunaid.Day5.trainings.ProfessionalTrainings;
import java.util.List;

/**
 *
 * @author Zunaid
 */
public class Employee {
    private int id;
    private String name;
    private String mobile;
    private Department department;
    private List<EducationQualifications> educationQualificationses;
    private Address address;
    private List<JobHistory> jobHistory;
    private List<ProfessionalTrainings> professionalTrainingses;
    private List<ProjectsTillNow> projectsTillNows;
    private List<BankDetails> bankDetailses;
    private EmployeeDetails employeeDetails;

    public Employee() {
    }

    public Employee(int id, String name, String mobile, Department department, List<EducationQualifications> educationQualificationses, Address address, List<JobHistory> jobHistory, List<ProfessionalTrainings> professionalTrainingses, List<ProjectsTillNow> projectsTillNows, List<BankDetails> bankDetailses, EmployeeDetails employeeDetails) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.department = department;
        this.educationQualificationses = educationQualificationses;
        this.address = address;
        this.jobHistory = jobHistory;
        this.professionalTrainingses = professionalTrainingses;
        this.projectsTillNows = projectsTillNows;
        this.bankDetailses = bankDetailses;
        this.employeeDetails = employeeDetails;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public Department getDepartment() {
        return department;
    }

    public List<EducationQualifications> getEducationQualificationses() {
        return educationQualificationses;
    }

    public Address getAddress() {
        return address;
    }

    public List<JobHistory> getJobHistory() {
        return jobHistory;
    }

    public List<ProfessionalTrainings> getProfessionalTrainingses() {
        return professionalTrainingses;
    }

    public List<ProjectsTillNow> getProjectsTillNows() {
        return projectsTillNows;
    }

    public List<BankDetails> getBankDetailses() {
        return bankDetailses;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }
    
    
}
