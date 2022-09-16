import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet app;
    private Drawable[] panels;
    final int NUM_PANELS_HORIZONTAL = 4; // the horizontal quantity of panels
    final int NUM_PANELS_VERTICAL = 4; // the vertical quantity of panels

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main(){
        super();
        app = this;
    }

    public void settings() {
        size(600, 600);
    }
    public void setup() {
        panels = new Drawable[NUM_PANELS_HORIZONTAL * NUM_PANELS_VERTICAL];
        int w = width / NUM_PANELS_HORIZONTAL;
        int h = height / NUM_PANELS_VERTICAL;
        int index = 0;
        for (int i = 0; i < NUM_PANELS_VERTICAL; i++) {
            for (int j = 0; j < NUM_PANELS_HORIZONTAL; j++) {
                int x = j * w;
                int y = i * h;
                Drawable s;
                if (i == 0) {
                    s = new Panel(x, y, w, h, "data/bunny.png");
                } else if (i == 1) {
                    s = new TintedPanel(x, y, w, h, "data/bunny.png");
                } else if (i == 2) {
                    s = new ContrastedPanel(x, y, w, h, "data/bunny.png");
                } else {
                    s = new RotatingPanel(x, y, w, h, "data/bunny.png");
                }
                panels[index] = s;
                index++;
            }
        }
    }

    public void draw() {
        fancyBackground();
        for (int i = 0; i < panels.length; i++) {
            panels[i].display();
        }
    }

    public void mouseClicked() {
        for (int i = 0; i < panels.length; i++) {
            if (panels[i] instanceof Clickable)
                ((Clickable) panels[i]).handleMouseClicked(mouseX, mouseY);
        }
    }

    private void fancyBackground() {
        loadPixels();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                int loc = x + y * width;

                if (x % 2 == 0) {
                    pixels[loc] = color(255);
                } else {
                    pixels[loc] = color(0);
                }
            }
        }

        updatePixels();
    }
}