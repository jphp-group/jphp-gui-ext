package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.geometry.Point3D;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "transform\\UXScale")
public class UXScale extends UXTransform<Scale>{
    public UXScale(Environment env, Scale wrappedObject){
        super(env, wrappedObject);
    }

    public UXScale(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Property double x();
        @Property double y();
        @Property double z();

        @Property double pivotX();
        @Property double pivotY();
        @Property double pivotZ();
    }

    @Signature
    public void __construct(){
        __wrappedObject = new Scale();
    }
    @Signature
    public void __construct(double x){
        __wrappedObject = new Scale(x, 1);
    }
    @Signature
    public void __construct(double x, double y){
        __wrappedObject = new Scale(x, y);
    }
    @Signature
    public void __construct(double x, double y, double z){
        __wrappedObject = new Scale(x, y, z);
    }
}
