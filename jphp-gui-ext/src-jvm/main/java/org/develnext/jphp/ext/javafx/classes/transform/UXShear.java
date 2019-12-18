package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.geometry.Point2D;
import javafx.scene.transform.Shear;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "transform\\UXShear")
public class UXShear extends UXTransform<Shear>{
    public UXShear(Environment env, Shear wrappedObject){
        super(env, wrappedObject);
    }

    public UXShear(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Property double x();
        @Property double y();

        @Property double pivotX();
        @Property double pivotY();
    }

    @Signature
    public void __construct(){
        __wrappedObject = new Shear();
    }
    @Signature
    public void __construct(Point2D position){
        __wrappedObject = new Shear(position.getX(), position.getY());
    }
    @Signature
    public void __construct(Point2D position, Point2D pivot){
        __wrappedObject = new Shear(position.getX(), position.getY(), pivot.getX(), pivot.getY());
    }
}
