/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.projects;

/**
 *
 * @author Zunaid
 */
public class ProjectsTillNow {
    //-List :: (id, title, type(Hr, Accounts, Marketing etc), status, language, framework)
    private int id;
    private String title;
    private Type type;
    private Status status;
    private Language language;
    private Framework framework;

    public ProjectsTillNow() {
    }

    public ProjectsTillNow(int id, String title, Type type, Status status, Language language, Framework framework) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.status = status;
        this.language = language;
        this.framework = framework;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public Language getLanguage() {
        return language;
    }

    public Framework getFramework() {
        return framework;
    }
    
    
}
