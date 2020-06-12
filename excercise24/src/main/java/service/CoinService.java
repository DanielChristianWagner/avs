package service;

public class CoinService {

    public int simulateMathRandom(Integer coinCount) {
        int headCount = 0;

        for (int i = 0; i < coinCount; i++) {
            headCount += (int) (Math.random()*2);
        }

        return headCount;
    }
}
