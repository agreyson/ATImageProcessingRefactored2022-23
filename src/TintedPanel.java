/* SUBCLASS/CHILD: a class that extends another class.*/
/* SUPERCLASS/PARENT: the class that is extended (it's possible that it, too, extends some class). */
/* CLASS HIERARCHY: the collection of related superclasses and subclasses.*/
/* TintedPanel is a subclass of Panel--it extends Panel by tinting the displayed image. */
/* Panel is the superclass of TintedPanel. It's the top of the class hierarchy (but extends Object). */
/* Note that the client does not belong to the class hierarchy. */
public class TintedPanel extends Panel {

    /* TintedPanel relies on Panel's instance variables. It needs no additional variables of its own.*/

    /* CONSTRUCTOR: a method that initializes an object.*/
    /* SUPER: refers to the constructor of the superclass. */
    /* In a subclass constructor, the first line should be a call to super(). */
    /* Whatever parameters were passed to the subclass's constructor should be passed along to super. */
    public TintedPanel(int _x, int _y, int _w, int _h, String imageName){
        super(_x, _y, _w, _h, imageName);
    }


    /* INSTANCE METHODS: methods that define the behavior of an object. */
  /* INHERIT: subclasses inherit the public instance methods of their superclass/parent.
  /* This means that by default, a subclass adopts the same behavior as the superclass. */
    /* OVERRIDE: if a subclass needs something other than the default behavior of an instance */
    /* method that it inherits, its class definition provides a different implementation */
    /*(overrides) that instance method. */
    /* TintedPanel overrides the display() method to apply a tint effect to the normal image. */
    /* super.display() invokes the Panel's version of display. The tint is activated before and */
    /* deactivated after super.display(), so that the tint won't affect other objects.*/
    /* The TintedPanel class doesn't override any other inherited methods because the Panel versions are fine. */
    public void display(){
        Main.app.tint(255, 0, 0, 200);
        super.display();
        Main.app.noTint();
    }
}