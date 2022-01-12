public class Brigadier extends Worker{
    public Brigadier(String name){
        this.name = name;
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
        System.out.println("Бригадир "+name+" заработок:" + earnedMoney);
    }
}
