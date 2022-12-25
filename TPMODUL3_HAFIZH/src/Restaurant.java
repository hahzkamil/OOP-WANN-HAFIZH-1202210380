public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int FoodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return FoodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver Food
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the Food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another Food is ready to deliver
            waitingForPickup = true;
            System.out.println("Restaurant: Making Food Number " + FoodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the Food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}