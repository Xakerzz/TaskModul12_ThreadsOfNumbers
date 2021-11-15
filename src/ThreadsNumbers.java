public class ThreadsNumbers extends Thread {


    public static void main(String[] args) {


        Thread thread = new Thread("firstOperand") {
            double firstOperand;
            char operation;
            double secondOperand;

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    firstOperand = Math.random() * 100;
                    int first = (int) firstOperand;

                    System.out.print(first);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    double randomOperation;
                    randomOperation = Math.random() * 4;
                    int operationInt = (int) randomOperation;
                    switch (operationInt) {
                        case 0 -> {
                            operation = '/';
                            System.out.print(" " + operation);
                        }
                        case 1 -> {
                            operation = '*';
                            System.out.print(" " + operation);
                        }
                        case 2 -> {
                            operation = '-';
                            System.out.print(" " + operation);
                        }
                        case 3 -> {
                            operation = '+';
                            System.out.print(" " + operation);
                        }
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    secondOperand = Math.random() * first;
                    int second = (int) secondOperand;
                    System.out.print(" " + second);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.print(" = ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int result = 0;
                    switch (operation) {
                        case '/' -> {
                            try {
                                result = first / second;
                                System.out.print(result);
                            } catch (ArithmeticException e) {
                                System.out.print("You can not divide by zero");
                            }

                        }
                        case '*' -> {
                            result = first * second;
                            System.out.print(result);
                        }
                        case '-' -> {
                            result = first - second;
                            System.out.print(result);
                        }
                        case '+' -> {
                            result = first + second;
                            System.out.print(result);
                        }
                    }


                    try {
                        Thread.sleep(1000);
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }


        };

        thread.start();


    }
}
