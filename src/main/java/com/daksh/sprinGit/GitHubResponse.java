package com.daksh.sprinGit;

import java.util.List;

public class GitHubResponse {
    private List<Repository> items;
    
    public List<Repository> getItems(){
        return items;
    }
    public void setItems (List<Repository> items){
        this.items = items;
    }


}


