class DownloadFile extends Thread{
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

public class To_Download_A_File_Using_Thread {
    public static void main(String[] args) {
        DownloadFile d1 = new DownloadFile("A");
        DownloadFile d2 = new DownloadFile("B");
        d1.start();
        d2.start();

    }
}
