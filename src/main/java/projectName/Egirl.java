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

public void showBobies(){
    System.out.println("i am " + elo + " " + role);
    System.out.println("here is bobies");
    System.out.println("https://cdn.discordapp.com/attachments/1014220683053633600/1027366166106214481/eric_hsieh.jpeg");
}

public Egirl(String newnameKitten){
    super(newnameKitten);
}
}

