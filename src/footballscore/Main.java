package footballscore;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String args[]){
        FootBallScore obj1 = new FootBallScore();
	ReportScore obj = new ReportScore();
        Scanner in = new Scanner(System.in);
        int people = obj.insertNoPeople();
        if(people < 2) {System.out.println("error"); return;}
        for(int i = 0; i < people; i++) 
            obj.register(obj1);
        while(true){
            System.out.print("Enter Score : ");
            String score = in.nextLine();
            if(score.equals("")) break;
            obj.setSomeData(score);
        }
        
        
    }
}
