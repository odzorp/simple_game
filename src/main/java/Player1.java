public class Player1 {
    private String name;
    private String weapon;
    private int health;

    // Constructor
    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health <= 0 || health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public void damageByGun1() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println(getName() + " got hit by " + weapon + ". Health reduced by 30. New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    public void damageByGun2() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println(getName() + " got hit by " + weapon + ". Health reduced by 50. New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    public void heal() {
        if (this.health <= 0) {
            System.out.println("Player is Dead! Cannot heal");
        } else {
            while (this.health < 100) { 
                this.health += 2;
                if (this.health > 100) {
                    this.health = 100;
                }
                System.out.println("Healing... Current health: " + this.health);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("Healing interrupted");
                }
            }
            System.out.println("Healing complete. Health is now full: " + this.health);
        }
    }


  
    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
