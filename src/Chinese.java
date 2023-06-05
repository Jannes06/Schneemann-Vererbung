import GLOOP.GLKegel;

public class Chinese extends Schneemann {
    GLKegel hut;
    public Chinese(double px, double pz) {
        super(px, pz);
        hut = new GLKegel(px,238,pz,50,20);
        hut.drehe (90,0,0);
        hut.setzeFarbe(1,1,0);
    }
}
