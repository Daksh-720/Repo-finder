package com.daksh.sprinGit;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final GitHubService githubService;

    public AppRunner(GitHubService githubService){
        this.githubService = githubService;
    }


    @Override
    public void run(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n========================");
        System.out.println("|Welcome to Repo finder|");
        System.out.println("========================");

        System.out.print("\nEnter Topic: ");
        String topic = sc.nextLine();

        githubService.fetchRepo(topic);
        sc.close();
    }
    
}
