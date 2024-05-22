    public class Player2 extends Player1 {
        private boolean armour;

        public Player2(String name, String weapon, int health, boolean armour) {
            super(name, weapon, health);
            this.armour = armour;
        }

        @Override
        public void damageByGun1() {
            if (armour) {
                setHealth(getHealth() - 20);
                if (getHealth() <= 0) {
                    setHealth(0);
                }
                System.out.println("Armour is on. " + getName() + " got hit by gun 1. Health reduced by 20. New health is " + getHealth());
            } else {
                
                setHealth(getHealth() - 30);
                if (getHealth() <= 0) {
                    setHealth(0);
                }
                System.out.println("Armour is on. " + getName() + " got hit by gun 1. Health reduced by 30. New health is " + getHealth());
            }

            if (getHealth() == 0) {
                System.out.println(getName() + " is dead");
            }
        }

        @Override
        public void damageByGun2() {
            if (armour) {
                setHealth(getHealth() - 40);
                if (getHealth() <= 0) {
                    setHealth(0);
                }
                System.out.println("Armour is on. " + getName() + " got hit by gun 2. Health reduced by 40. New health is " + getHealth());
            } else {
                setHealth(getHealth() - 50);
                if (getHealth() <= 0) {
                    setHealth(0);
                }
                System.out.println("Armour is off. " + getName() + " got hit by gun 2. Health reduced by 50. New health is " + getHealth());
            }

            if (getHealth() == 0) {
                System.out.println(getName() + " is dead");
            }
        }
    }
