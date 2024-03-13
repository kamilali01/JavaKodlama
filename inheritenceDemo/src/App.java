public class App {
    public static void main(String[] args) throws Exception {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
