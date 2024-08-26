package OOP.multithreading;

class Printer{
    String word ;
    Printer(String word){
        this.word = word;
    }
    void print(){
        for (int i = 0 ;i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}

class  MyThread extends Thread{

    private  Thread t;
    String  threadName ;
    Printer pd ;
    MyThread(String threadName , Printer pd){
        this.threadName = threadName;
        this.pd = pd;
    }

    @Override
    public void run() {
        synchronized (pd){
            pd.print();;
        }
        System.out.println(threadName + "is exited");
    }

    public void start2(){
        System.out.println("Staring "+ threadName);
        if (t == null){
            t = new Thread(this , threadName);
        }
    }
}

public class Syncronization {
}
