package heroes;           
import skills.Skill;

public class Archer extends Hero {
    private static final int default_hp = 160;
    private static final int default_mp = 140;

    public Archer(String name) {
        super(name, default_hp, default_mp);
        skill = new Skill[] {
                new Skill("Arrow Shot", 30, 40),
                new Skill("Multi Shot", 50, 60),
                new Skill("Peircing Arrow", 80, 100)
        };
    }
    public String[] getSkill() {
        return new String[] {
                skill[0].getSkill_Name(),
                skill[1].getSkill_Name(),
                skill[2].getSkill_Name()
        };
    }
    public boolean isTank() {
        return false;
    }

   
     
    public double getAttackMultiplier() {
    
        return 1.3;
    }

    
    public int getDefense() {
       
        return 5;
    }
}