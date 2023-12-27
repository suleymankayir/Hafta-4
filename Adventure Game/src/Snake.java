import java.util.Random;

public class Snake extends Obstacle {

    private int award;

    public Snake() {
        super("Yılan", 4, generateRandomDamage(), 12, 0);
        this.award = generateAward();
    }

    private static int generateRandomDamage() {
        Random random = new Random();
        return random.nextInt(4) + 3;
    }

    private int generateAward() {
        Random random = new Random();
        int dropChance = random.nextInt(100);
        int randomAward = 0;
        if (dropChance < 15) {
            int gunDropChance = random.nextInt(100);
            if (gunDropChance < 20) {
                randomAward = Weapon.weapons[0];
            } else if (gunDropChance < 50) {
                randomAward = Weapon.weapons[1];
            } else {
                randomAward = Weapon.weapons[0];
            }
        } else if (dropChance < 30) {
            int armorDropChance = random.nextInt(100);
            if (armorDropChance < 20) {
                randomAward = Armor.armors[2];
            } else if (armorDropChance < 50) {
                randomAward = Armor.armors[1];
            } else {
                randomAward = Armor.armors[0];
            }
        } else if (dropChance < 55) {
            int coinDropChance = random.nextInt(100);
            if (coinDropChance < 20) {
                randomAward = 10;
            } else if (coinDropChance < 50) {
                randomAward = 5;
            } else {
                randomAward = 1;
            }
        }
        return randomAward;
    }

    public int getAward() {
        return award;
    }
}
