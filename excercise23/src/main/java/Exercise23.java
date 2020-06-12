import service.PushService;

public class Exercise23 {

    private static final PushService pushService = new PushService();

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("at leasts one argument is necessary");
        }

        int nodesCount = Integer.parseInt(args[0]);
        int result = 0;

        for (int i = 0; i < 50; i++) {
            result = result + pushService.simulate(nodesCount);
        }
        System.out.printf("average rounds for %d nodes is: %d", nodesCount, (result / 50));
        System.out.println();
    }
}
