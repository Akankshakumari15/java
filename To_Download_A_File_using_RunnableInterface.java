class DownloadFile implements Runnable{
     String fileName;

    public DownloadFile(String fileName){
        this.fileName=fileName;
    }
    public void run(){
        for(int i=1;i<6;i++){
        System.out.println(fileName+" downloading...."+(i*20)+"%");
     }
     try {
        Thread.sleep(2000);
     } catch (Exception e) {
     }
     System.out.println("Downloading completed!");
    }
}
public class To_Download_A_File_using_RunnableInterface {
    public static void main(String[] args) {
        DownloadFile obj = new DownloadFile("A");
        Thread d1 = new Thread(obj);
        DownloadFile obj1 = new DownloadFile("B");
        Thread d2 = new Thread(obj1);
        d1.start();
        d2.start();
        try {
            //to block the main thread and first run the user made thread.
            d1.join();
            d2.join();
        } catch (Exception e) {
        }
        System.out.println("Hello, my name is akuu.");
    }
    
}
