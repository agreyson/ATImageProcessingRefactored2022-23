public abstract class ImageWrapper {

    /* INSTANCE VARIABLES: maintain information about an object/instance.*/
    /* Instance variables are usually private to achieve INFORMATION HIDING.*/
    private String imgName;
    private int x;
    private int y;
    private int w;
    private int h;

    /* CONSTRUCTOR: a method that initializes an object.*/
    /* SHADOWING is avoided by giving the parameters different */
    /* names than their corresponding instance variables.*/
    public ImageWrapper(int _x, int _y, int _w, int _h, String imgName){
        x = _x;
        y = _y;
        w = _w;
        h = _h;
        this.imgName = imgName;
    }

    /* INSTANCE METHODS: methods that define the behavior of an object. */

    /* GETTERS: special instance methods that returns the value of an instance variable.*/
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return w;
    }
    public int getHeight(){
        return h;
    }

    /* SETTERS: special instance methods that assigns a value to an instance variable.*/
    public void setX(int _x){
        x = _x;
    }
    public void setY(int _y){
        y = _y;
    }
}
