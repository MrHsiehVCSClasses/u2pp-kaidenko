package main.java.projectName;
 

public class Egirl extends Kitten{
    
    private String elo;   //elo of egirl
    private String role;  // role of egirl


// constructor to set elo and role

public Egirl() {
    elo = "diamond";
    role = "support";
    nameKitten = "BakaEmily";
}

public Egirl(String newelo, String newrole, String newnameKitten){
    elo = newelo;
    role = newrole;
    nameKitten = newnameKitten;
}

public String getElo(){
    return elo;
}

public String getRole(){
    return role;
}

public String getameKitten(){
    return nameKitten;
}

public void eloAndRole(){
    System.out.println("Meowww btw I am " + elo + " " + role + " in league of legends." + "What is your role?");
}

public void showBobies(){
    System.out.println("https://cdn.discordapp.com/attachments/1014220683053633600/1027366166106214481/eric_hsieh.jpeg");
}

public void blocked(){
    System.out.println(" * ClydeBot: Your message could not be delivered. This is usually because you don't share a server with the recipient or the recipient is only accepting direct messages from friends. You can see the full list of reasons here: https://support.discord.com/hc/en-us/articles/360060145013 * ");
    System.out.println("          *You have negative rizz*          ");
}
public Egirl(String newnameKitten){
    super(newnameKitten);
}
}

