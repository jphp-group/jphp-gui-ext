package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.geometry.Point3D;
import javafx.scene.transform.Rotate;
import org.develnext.jphp.ext.javafx.JavaFXExtension;

import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "transform\\UXRotate")
public class UXRotate extends UXTransform<Rotate>{
    public UXRotate(Environment env, Rotate wrappedObject){
        super(env, wrappedObject);
    }

    public UXRotate(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Property double angle();

        @Property double pivotX();
        @Property double pivotY();
        @Property double pivotZ();

        @Property Point3D axis();
    }

    @Signature
    public void __construct(){
        __wrappedObject = new Rotate();
    }
    @Signature
    public void __construct(double angle){
        __wrappedObject = new Rotate(angle);
    }
    @Signature
    public void __construct(double angle, double pivotX){
        __wrappedObject = new Rotate(angle, pivotX, 0);
    }
    @Signature
    public void __construct(double angle, double pivotX, double pivotY){
        __wrappedObject = new Rotate(angle, pivotX, pivotY);
    }
    @Signature
    public void __construct(double angle, double pivotX, double pivotY, double pivotZ){
        __wrappedObject = new Rotate(angle, pivotX, pivotY, pivotZ);
    }
    @Signature
    public void __construct(double angle, double pivotX, double pivotY, double pivotZ, Point3D axis){
        __wrappedObject = new Rotate(angle, pivotX, pivotY, pivotZ, axis);
    }
}
