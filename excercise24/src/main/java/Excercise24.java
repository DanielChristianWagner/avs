import service.CoinService;

public class Excercise24 {

    private final static CoinService coinService = new CoinService();

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("at leasts one argument is necessary");
        }
        int coinCounts = Integer.parseInt(args[0]);
        int result = 0;
        for (int i = 0; i < 50; i++) {
            result += coinService.simulateMathRandom(coinCounts);
        }

        int averageResult = (result / 50);
        double divergence = (coinCounts / 2.0) / averageResult;

        divergence = divergence > 1 ? (divergence - 1) * 100 : (1 - divergence) * 100;

        System.out.printf("head was thrown in %d of %d times with a divergence of %f %%", averageResult, coinCounts, divergence);
        System.out.println();
    }
}
