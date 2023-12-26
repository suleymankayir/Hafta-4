public class BattleLoc extends Location{
    public BattleLoc(Player player, String name) {
        super(player, name);
    }

    // Obstacle obstacle;
   // public BattleLoc(Obstacle obstacle) {
        //this.obstacle = obstacle;
   // }

    @Override
    public boolean onLocation() {
        return false;
    }

    public void combat(){

    }
}
