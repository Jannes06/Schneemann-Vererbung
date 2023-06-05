import GLOOP.GLQuader;
import GLOOP.GLZylinder;

public class Englaender extends Schneemann {
    Schneemann Chinese;
    GLZylinder hutoben, hutunten;

    public Englaender(double px, double pz) {
        super(px, pz);
        hutoben = new GLZylinder(px,250,pz,20,35);
        hutunten = new GLZylinder(px,235,pz,30,8);
        hutoben.drehe(90,0,0);
        hutunten.drehe(90,0,0);

        hutoben.setzeFarbe(0,0,0);
        hutunten.setzeFarbe(0,0,0);

    }

}

