class DownloadFile{
    public static void file(String file){
     for(int i=1;i<6;i++){
        System.out.println(file+" downloading...."+(i*20)+"%");
     }
     try {
        Thread.sleep(2000);
     } catch (Exception e) {
        // TODO: handle exception
     }
     System.out.println("Downloading completed!");
    }
}

public class To_Download_A_File_withoutThread {
    public static void main(String[] args) {
    DownloadFile d1 = new DownloadFile();
    d1.file("File A ");
    d1.file("File B ");
    }
}
