import GLOOP.*;
public class Schneemannszene {
    private GLKamera kamera;
    private GLLicht  licht;  
    private GLHimmel himmel;
    private GLBoden  boden;

    private Schneemann schneemann;
    private Englaender  en1;
    private Chinese     ch1;

    public Schneemannszene(){
        kamera = new GLSchwenkkamera(800,600);
        kamera.setzePosition(-600,400,800);
        licht  = new GLLicht();  
        boden  = new GLBoden("src/img/Schnee.jpg");
        himmel = new GLHimmel("src/img/Himmel.jpg");

        en1 = new Englaender(0,0);
        schneemann = new Schneemann(-150,0);
        ch1 = new Chinese (150,0);
    }
}
