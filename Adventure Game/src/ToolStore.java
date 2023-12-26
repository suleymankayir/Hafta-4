public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----- Magazaya hos geldiniz -----");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");
        System.out.print("Seçiminiz: ");
        int selectCase = scanner.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.print("Geçersiz değer,tekrar giriniz");
            selectCase = scanner.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz");
                return true;
        }
        return true;


    }

    public void printArmor() {
        System.out.println("Zırhlar");
    }

    public void printWeapon() {
        System.out.println("------Silahlar------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Para: " + w.getPrice() +
                    " , Hasar: " + w.getDamage() + ">");

        }

    }

    private void buyWeapon() {
        System.out.println("Bir silah seçiniz: ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer,tekrar giriniz");
            selectWeaponID = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır.");
            } else {
                // satın alma işlemi
                System.out.println(selectedWeapon.getName() + " isimli silahi satın aldınız.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }

    }

    private void menu() {
    }
}
