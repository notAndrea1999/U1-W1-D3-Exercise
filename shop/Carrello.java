package shop;

import java.util.Arrays;

public class Carrello {
    private Cliente userId;
    private Articolo[] myArr;
    private double itemSum;

    public Carrello(Cliente userId) {
        this.userId = userId;
        this.itemSum = 0;

    }

    public void setMyArr(Articolo[] myArr) {
        this.myArr = myArr;
        this.itemSum = 0;
        for (int i = 0; i < myArr.length; i++) {
            this.itemSum = this.itemSum + myArr[i].getPrice();
        }
    }

    public double setItemSum() {
        for (int i = 0; i < myArr.length; i++) {
            this.itemSum = this.itemSum + myArr[i].getPrice();
        }
        return this.itemSum;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "userId=" + userId +
                ", myArr=" + Arrays.toString(myArr) +
                ", itemSum=" + itemSum +
                '}';
    }
}


