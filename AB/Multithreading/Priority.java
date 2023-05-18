public class Priority extends Thread{
    public void run(){
        System.out.println("Priority of 3 "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("Priority of 4 "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Priority of 1 "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
        Priority p=new Priority();
        System.out.println("Priority of 2 "+p.getName()+" is "+p.getPriority());
        Thread.currentThread().setPriority(3);
        System.out.println("Priority of 5 "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
        p.start();
    }
}