/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.trainings;

import java.util.List;

/**
 *
 * @author Zunaid
 */
public class ProfessionalTrainings {
    // List :: (id, title, duration, trainingCenter)
    private int id;
    private String title;
    private int duration;
    private TrainingCenter trainingCenter;

    public ProfessionalTrainings() {
    }

    public ProfessionalTrainings(int id, String title, int duration, TrainingCenter trainingCenter) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public TrainingCenter getTrainingCenter() {
        return trainingCenter;
    }

   

    
    
    
    
}
