package heroes;           
import skills.Skill;

public class Assassin extends Hero {
    private static final int default_hp = 150;
    private static final int default_mp = 120;

    public Assassin(String name) {
        super(name, default_hp, default_mp);
        skill = new Skill[] {
                new Skill("Quick Stab", 35, 30),
                new Skill("Shadow strike", 70, 50),
                new Skill("Deadly Ambush", 90, 100)
        };
    }

    public String[] getSkill() {
        return new String[] {
                skill[0].getSkill_Name(),
                skill[1].getSkill_Name(),
                skill[2].getSkill_Name()
        };
    }

    public double getAttackMultiplier() {
        return 1.5;
    }

    
    public int getDefense() {
        return 3;
    }

    public boolean isTank() {
        return false;
    }
}