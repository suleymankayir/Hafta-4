public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----- Magazaya hos geldiniz -----" );
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");
        System.out.print("Seçiminiz: " );
        int selectCase = scanner.nextInt();
        while (selectCase<1 || selectCase >3){
            System.out.print("Geçersiz değer,tekrar giriniz") ;
            selectCase = scanner.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
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

    public void printWeapon(){
        System.out.println("------Silahlar------");
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getName() + "<Para: " + w.getPrice() + " , Hasar: " + w.getDamage() + ">");

        }
    }

    private void buy() {
    }

    private void menu() {
    }
}
