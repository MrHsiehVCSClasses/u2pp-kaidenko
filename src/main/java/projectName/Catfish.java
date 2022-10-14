package main.java.projectName;
import java.util.*;
 

public class Catfish extends Kitten{

//overrides nameKitten

    String CatfishName = super.nameKitten;

    public Catfish(){
        super();
        CatfishName = "BakaErica";
    }

    public void beginning(){
        System.out.println("Baka Erica: Heyyyy my name is " + CatfishName + " :3");
        System.out.println("Baka Erica: how can i assist u master?");
    }   

    public void nitro() {
        System.out.println("BakaErica: Thank you daddy ~~ rawrrrr");
    }
    
    public void reveal(){
        System.out.println("BakaErica: here master ~~ https://cdn.discordapp.com/attachments/1014220683053633600/1027366166106214481/eric_hsieh.jpeg");
        System.out.println(" *blocked* ");
    }

    public void blocked(){
        System.out.println(" * ClydeBot: Your message could not be delivered. This is usually because you don't share a server with the recipient or the recipient is only accepting direct messages from friends. You can see the full list of reasons here: https://support.discord.com/hc/en-us/articles/360060145013 * ");
        System.out.println("          *You have negative rizz*          ");
    }
    
}