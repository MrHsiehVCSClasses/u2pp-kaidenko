package main.java.projectName;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // make a scanner to have inputs
        Scanner myScanner = new Scanner(System.in);
        Catfish myCatfish = new Catfish();
        Egirl myEgirl = new Egirl();
        
        boolean Ture = true;
        while (Ture) {

        // rizz begins
        System.out.println("Unknown Kitten: hey whats ur name?");
        String name = myScanner.nextLine();
        System.out.println("Unknown Kitten: hey " + name + "~~ how old are u");
        String input = myScanner.nextLine();
        int userAge = Integer.valueOf(input);

        //checks age of user then directs them to catfish or egirl
        if (userAge >= 18){
            myCatfish.beginning();
            String command = myScanner.nextLine();
            System.out.println("Baka Erica: I can't " + command +  " ~~~unlesss send me discord nitro uwu. Will you pwety pwease?");
            System.out.println("(1 = yes | 2 = no)");
            String input1 = myScanner.nextLine();
            int nitroChoose = Integer.valueOf(input1);
                if (nitroChoose == 1){
                    myCatfish.nitro();
                    myCatfish.reveal();
                }
                else {
                    System.out.println("BakaErica: KONO BAKA~~ even if u do not love me. I will be your little kitten no matter what~~ Pwease buy me daddy!");
                    System.out.println("(1 = buy | 2 = deny)");
                    String input3 = myScanner.nextLine();
                    int nitroChooseN = Integer.valueOf(input3);

                    if (nitroChooseN == 1){
                        myCatfish.nitro();
                        myCatfish.reveal();
                    }
                    else {
                        System.out.println("You silly baka...that was a joke right?");
                        System.out.println("(1 = admit joke and buy | 2 = deny");
                        String input4 = myScanner.nextLine();
                        int nitroChooseNN = Integer.valueOf(input4);
                        
                        if (nitroChooseNN == 1){
                            System.out.print("BakaErica: Youre so funny daddy. Thats why I love u. Do you want to see what I look like now?");
                            System.out.println("(input any number to view");
                            String input6 = myScanner.nextLine();
                            int nitroChooseNNN = Integer.valueOf(input6);
                                
                            if (nitroChooseNNN == 0){
                                System.out.println("");
                                }
                            myCatfish.nitro();
                            myCatfish.reveal();
                        }
                        else {
                            System.out.println("useless piece of shit i hope u kys");
                            System.out.println("          *blocked*          ");
                        }
                        }

                }
        }
        if (userAge >=  0 && userAge <= 17){
            System.out.println("BakaEmily: You are " + userAge+ "? Thats purrrrfect~~ my servant name is BakaEmily and I think we would be a good match <3");
            myEgirl.eloAndRole();
            String yourDescription = myScanner.nextLine();
            System.out.println("BakaEmily: that is so hot uwu~~ maybe...we can play sometime :3");
            System.out.println("          (1 = yes | 2 = no)          ");
            String input2 = myScanner.nextLine();
            int gamerChoose = Integer.valueOf(input2);
                if (gamerChoose == 1){
                    System.out.println("BakaEmily: i cant wait... *lipbite*");
                    System.out.println("BakaEmily: in the meantime daddy, how can i assist u~~");
                    System.out.println("          (1 = bobies pic | 2 = feet pic)          ");
                    String input5 = myScanner.nextLine();
                    int bodypart = Integer.valueOf(input5);
                        
                    System.out.println("here my master!");
                    myEgirl.showBobies();
                }
                else {
                    System.out.println("I thought...I thought u loved me... *sad meow* ~~~ You don't really mean that right?");
                        if (gamerChoose == 1){
                            System.out.println("BakaErica: seeee i knew u love me~~ I will forever be your dog...grrrrr...as your eternal servant i shall show u my feet pics");
                            System.out.println("BakaErica: https://cdn.discordapp.com/attachments/1014220683053633600/1027366166106214481/eric_hsieh.jpeg");
                        }
                        else {
                            System.out.println("BakaErica: kys hoe");
                            myEgirl.blocked();
                        }

                }
            
        }

        //end!!
        myScanner.close();
        Ture=false;
        }
        
    }

}
