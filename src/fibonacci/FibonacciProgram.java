package fibonacci;

public class FibonacciProgram {

    private static int counter = 1;

    public static void main(String[] args) {
        for (String arg : args) {
            //musmy utworzyć obiekt
            FibonacciBuilder fibonacciBuilder = new FibonacciBuilder(Integer.parseInt(arg));
            fibonacciBuilder.setFibonacciArray();
            //tak nie robimy:
            //int[] array = fibonacciBuilder.getFibonacciArray();

            FibonacciPrinter.printArray(fibonacciBuilder.getFibonacciArray(), counter);
            counter++;


        }

    }

//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            //musmy utworzyć obiekt
//            FibonacciBuilder fibonacciBuilder = new FibonacciBuilder(Integer.parseInt(args[i]));
//            fibonacciBuilder.setFibonacciArray();
//            //tak nie robimy:
//            //int[] array = fibonacciBuilder.getFibonacciArray();
//
//            FibonacciPrinter.printArray(fibonacciBuilder.getFibonacciArray(), i);
//
//
//
//        }
//
//    }
}
