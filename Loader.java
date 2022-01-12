public class Loader extends Worker{
    public Loader(int ID){
        this.ID = ID;
    }

    @Override
    public void doJob(int money) {
        earnedMoney += money;
    }

    @Override
    public int getEarnedMoney() {
        return earnedMoney;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void getInfo() {
        System.out.println("Грузчик "+ ID + " заработок: " + earnedMoney);
    }
}
