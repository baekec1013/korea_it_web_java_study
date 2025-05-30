package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    WaterBottle() {
        System.out.println();
    }

    public void fill(int amount) {
        if (amount > 0  && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println("물병에 " + amount + "만큼 채웠습니다. 현재 물의 양: " + currentWater);
        }else {
            System.out.println("채우는 물의 양이 0이상이어야 하고 1000이하여야 합니다.");
        }
    }
    public void drink(int amount) {
        if(amount > 0 && amount <= currentWater) {
            currentWater -= amount;
            System.out.println("물병에 " + amount + "만큼 마셨습니다. 현재 물의 양: " + currentWater);
        }else {
            System.out.println("마시는 물의 양이 0이상이어야 하고 1000이하여야 합니다.");
        }
    }
public int getCurrentWater() {
        return currentWater;
}
}
