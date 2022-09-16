import processing.core.PImage;

public class Panel extends ImageWrapper implements Drawable {
    private PImage img;
    public Panel(int _x, int _y, int _w, int _h, String imageName){
        super(_x, _y, _w, _h, imageName);
        img = Main.app.loadImage(imageName);
    }

   /* OVERRIDE: when a subclass implements an instance method differently from its superclass.*/
    public void display(){
        Main.app.image(img, getX(), getY(), getWidth(), getHeight());
    }
    public PImage getImageCopy(){
        return img.copy();
    }
}
  
  
  
  
  
  