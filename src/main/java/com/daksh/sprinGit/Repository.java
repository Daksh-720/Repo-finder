package com.daksh.sprinGit;

public class Repository {
    private String name;
    private String full_name;
    private String description;
    private String html_url;
    private int stargazers_count;
    private Owner owner;




    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getFull_name(){
        return full_name;
    }
    public void setFull_name(String full_name){
        this.full_name = full_name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getHtml_url(){
        return html_url;
    }
    public void setHtml_url(String html_url){
        this.html_url = html_url;
    }

    public int getStargazers_count(){
        return stargazers_count;
    }
    public void setStargazers_count(int stargazers_count){
        this.stargazers_count = stargazers_count;
    }

    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    

}
