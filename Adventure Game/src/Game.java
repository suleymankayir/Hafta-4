import java.util.Scanner;

public class Game {

    public Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("***** Macera Oyununa Hoşgeldiniz *****");
        System.out.println("Lütfen bir isim giriniz : ");

        //String playerName = scanner.nextLine();
        Player player = new Player("Musti");
        System.out.println("Oyuncu " + player.getName() + " metin tabanlı macera oyununa hosgeldin.");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("*** Bolgeler ***");
            System.out.println( );
            System.out.println("1 - Guvenli Ev --> Burasi sizin icin guvenli. Dusman yok.");
            System.out.println("2 - Magaza --> Silah veya zırh satin alabilirsiniz.");
            System.out.print("Lutfen gitmek istediginiz bölgeyi seciniz: ");

            int selectLoc = scanner.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if (!location.onLocation()) {
                System.out.println("Game OVER");
                break;
            }

        }


    }
}