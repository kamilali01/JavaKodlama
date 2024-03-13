public class App {
    public static void main(String[] args) throws Exception {
        BaseKrediManager[] CrediManagers=new BaseKrediManager[]
        {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : CrediManagers) {
           System.out.println( krediManager.hesapla(1000));
        }

    }
}
