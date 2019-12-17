package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.geometry.Point3D;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "transform\\UXTranslate")
public class UXTranslate extends UXTransform<Translate>{
    public UXTranslate(Environment env, Translate wrappedObject){
        super(env, wrappedObject);
    }

    public UXTranslate(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Property double x();
        @Property double y();
        @Property double z();
    }

    @Signature
    public void __construct(){
        __wrappedObject = new Translate();
    }
    @Signature
    public void __construct(double x){
        __wrappedObject = new Translate(x, 1);
    }
    @Signature
    public void __construct(double x, double y){
        __wrappedObject = new Translate(x, y);
    }
    @Signature
    public void __construct(double x, double y, double z){
        __wrappedObject = new Translate(x, y, z);
    }
}
