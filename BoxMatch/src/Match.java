import java.security.KeyStore;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeigth;
    int maxWeigth;



    Match(Fighter f1,Fighter f2,int minWeigt,int maxWeigth)
        {
        this.minWeigth=maxWeigth;
        this.maxWeigth=maxWeigth;
        this.f1=f1;
        this.f2=f2;
        }

        public void run()
        {
            if (isCHeck())
            {
                while (this.f1.health > 0 && this.f2.health > 0)
                {
                    System.out.println("=============****YENİ ROUND****=============");

                    this.f2.health=this.f1.attack(this.f2); // savaşcı 1 saldırı da bulunuyor
                    if(isWin()) break;
                    //System.out.println(this.f2.name + "'in kalan canı :"+this.f2.health);

                    this.f1.health=this.f2.attack(this.f1); // savaşçı 2 saldırı da bulunuyor
                    if(isWin()) break;

                    System.out.println(this.f1.name +"in sağlık durumu:\t"+this.f1.health);
                    System.out.println(this.f2.name +"in sağlık durumu:\t"+this.f2.health);

                    System.out.println("#\t#\t#\t#");
                }
            }



        }


    boolean isCHeck()
    {
        if ((this.f1.weight >= this.minWeigth) && (this.f1.weight <= this.maxWeigth) && (this.f2.weight >= this.minWeigth) && (this.f2.weight <= this.maxWeigth));
        {
            return true;
        }
    }

    boolean isWin()
    {
        if (this.f1.health==0)
        {
            System.out.println(this.f2.name + "\tAdlı Sporcu kazandı");
             return true;
        }
        if (this.f2.health==0)
        {
            System.out.println(this.f1.name + "\tAdlı Sporcu kazandı");
             return true;
        }
        else return false;
    }
}

