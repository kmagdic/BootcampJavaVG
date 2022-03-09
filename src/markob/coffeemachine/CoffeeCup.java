package markob.coffeemachine;

public class CoffeeCup {
    int currentWater;
    int currentMilk;
    int currentCoffeeBeans;
    int currentCups;
    int currentMoney;

    public CoffeeCup(int currentWater, int currentMilk, int currentCoffeeBeans, int currentCups, int currentMoney) {
        this.currentWater = currentWater;
        this.currentMilk = currentMilk;
        this.currentCoffeeBeans = currentCoffeeBeans;
        this.currentCups = currentCups;
        this.currentMoney = currentMoney;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentCoffeeBeans(int currentCoffeeBeans) {
        this.currentCoffeeBeans = currentCoffeeBeans;
    }

    public int getCurrentCoffeeBeans() {
        return currentCoffeeBeans;
    }

    public void setCurrentMilk(int currentMilk) {
        this.currentMilk = currentMilk;
    }

    public int getCurrentMilk() {
        return currentMilk;
    }

    public void setCurrentCups(int currentCups) {
        this.currentCups = currentCups;
    }

    public int getCurrentCups() {
        return currentCups;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }
}

