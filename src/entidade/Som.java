package entidade;

import java.applet.Applet;
import java.applet.AudioClip;



public class Som {
    
    private AudioClip som;
    public static Som a = new Som("/audio/A.wav");
    public static Som b = new Som("/audio/B.wav");
    public static Som c = new Som("/audio/C.wav");
    public static Som d = new Som("/audio/D.wav");
    public static Som e = new Som("/audio/E.wav");
    public static Som f = new Som("/audio/F.wav");
    public static Som g = new Som("/audio/G.wav");
    public static Som h = new Som("/audio/H.wav");
    public static Som i = new Som("/audio/I.wav");
    public static Som j = new Som("/audio/J.wav");
    public static Som k = new Som("/audio/K.wav");
    public static Som l = new Som("/audio/L.wav");
    public static Som m = new Som("/audio/M.wav");
    public static Som n = new Som("/audio/N.wav");
    public static Som o = new Som("/audio/O.wav");
    public static Som p = new Som("/audio/P.wav");
    public static Som q = new Som("/audio/Q.wav");
    public static Som r = new Som("/audio/R.wav");
    public static Som s = new Som("/audio/S.wav");
    public static Som t = new Som("/audio/T.wav");
    public static Som u = new Som("/audio/U.wav");
    public static Som v = new Som("/audio/V.wav");
    public static Som w = new Som("/audio/W.wav");
    public static Som x = new Som("/audio/X.wav");
    public static Som y = new Som("/audio/Y.wav");
    public static Som z = new Som("/audio/Z.wav");
    public static Som acertou = new Som("/audio/Acertou.wav");
    public static Som errou = new Som("/audio/Errou.wav");
    public static Som start = new Som("/audio/Start.wav");
    public static Som alfaCompleto = new Som("/audio/AlfaCompleto.wav");
    public static Som qual = new Som("/audio/Qual.wav");
    public static Som tshau = new Som("/audio/Tshau.wav");

    public Som(String filename) {
        try{
        this.som = Applet.newAudioClip(Som.class.getResource(filename));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public AudioClip getSom() {
        return som;
    }

    public void setSom(AudioClip som) {
        this.som = som;
    }
    
    public void play(){
        try {
            new Thread(){
                public void run(){
                    som.play();
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
