package com.daksh.sprinGit;

import java.util.List;
import org.springframework.web.client.RestClient;
import org.springframework.stereotype.Service;

@Service
public class GitHubService {
    
    Thread loading = new Thread(() -> {
        System.out.print("Searching..");
        for(int i=0; i<=3; i++){
            System.out.print(".");
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    });


    public void fetchRepo(String topic) {
        RestClient client = RestClient.create();
        System.out.println(topic);

        loading.start();
        GitHubResponse response = client.get()
                                .uri("https://api.github.com/search/repositories?q=" + topic)
                                .retrieve()
                                .body(GitHubResponse.class);
                            

                                List<Repository> repositories = response.getItems();

        int count=0;

        for(Repository repo: repositories){

          if(count==10){
            break;
          }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Name        : " + repo.getName());
            System.out.println("Full_name   : " + repo.getFull_name());
            System.out.println("Stars       : " + repo.getStargazers_count());
            System.out.println("Description : " + repo.getDescription());
            System.out.println("Repo-Link   : " + repo.getHtml_url());
            System.out.println("Email       : " + repo.getEmail());
            System.out.println("-------------------------------------------------------------------------\n");
            
            try {
                  Thread.sleep(750);   // Wait 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            count++;
        }
    }
}
