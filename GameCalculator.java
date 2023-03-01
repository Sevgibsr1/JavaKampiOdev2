public abstract class GameCalculator {
    public abstract void hesapla();



    public final void gameOver(){ // public final dersem olduğu gibi kullanılmalı değiştirilemez
        System.out.println("oyun bitti");
    }
}
