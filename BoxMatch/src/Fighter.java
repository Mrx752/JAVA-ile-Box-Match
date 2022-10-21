public class Fighter {
    String name; // DÖbvüşçünğğn ismi
    int damage; // verdiği hasar
    int health;
    int weight;
    int block; // yaptığı block


    Fighter(String name ,int damage,int health,int weight,int block)
    {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.block=block;
    }

    boolean isBlock()
    {
        double number = Math.random()*100;
        if(this.block < number ) return true;
        else return false;


    }



    int attack(Fighter foe)
    {
        System.out.println(this.name + " => " +foe.name+"'e " +this.damage + " Hasar vurdu");
        if (isBlock())
        {
            System.out.println(foe.name + "\tGelen hasarı blockladıı!!!!!!");
            System.out.println("----------------------->");
            return foe.health;
        }


        if(foe.health-this.damage <0 ) return 0;
        return foe.health-this.damage;
    }

    void print()
    {
        System.out.println("\t\t------Sporcunun-----");
        System.out.println("İsmi : "+this.name);
        System.out.println("Hasarı :"+this.damage);
        System.out.println("Canı : "+this.health);
        System.out.println("Sikleti : "+this.weight);
    }



}
