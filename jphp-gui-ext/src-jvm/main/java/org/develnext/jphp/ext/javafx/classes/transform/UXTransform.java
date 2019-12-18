package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.event.Event;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import javafx.scene.transform.MatrixType;
import javafx.scene.transform.Transform;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.develnext.jphp.ext.javafx.support.EventProvider;
import org.develnext.jphp.ext.javafx.support.JavaFxUtils;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.util.HashMap;
import java.util.Map;

@Abstract
@Name(JavaFXExtension.NS + "transform\\UXTransform")
public class UXTransform<T extends Transform> extends BaseWrapper<T>{
    public UXTransform(Environment env, T wrappedObject){
        super(env, wrappedObject);
    }

    public UXTransform(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Property boolean identity();
        @Property boolean type2D();

        @Property double mxx();
        @Property double mxy();
        @Property double mxz();

        @Property double myx();
        @Property double myy();
        @Property double myz();

        @Property double mzx();
        @Property double mzy();
        @Property double mzz();

        @Property double tx();
        @Property double ty();
        @Property double tz();

        double determinant();
        double getElement(MatrixType type, int row, int column);

        //boolean similarTo(Transform transform, Bounds range, double maxDelta);

        double[] column(MatrixType type, int column);
        double[] row(MatrixType type, int row);

        double[] toArray(MatrixType type);

        Transform createConcatenation(Transform transform);
        Transform createInverse();

        Point2D transform(double x, double y);
        Point2D inverseTransform(double x, double y);
        Point2D deltaTransform(double x, double y);
        Point2D inverseDeltaTransform(double x, double y);

        Point3D transform(double x, double y, double z);
        Point3D inverseTransform(double x, double y, double z);
        Point3D deltaTransform(double x, double y, double z);
        Point3D inverseDeltaTransform(double x, double y, double z);
    }

    @Signature
    public Transform __clone(){
        return getWrappedObject().clone();
    }

    @Signature
    public void on(String event, Invoker invoker, String group){
        JavaFxUtils.on(this.getWrappedObject(), event, invoker, group);
    }
    @Signature
    public void on(String event, Invoker invoker){
        on(event, invoker, "general");
    }

    @Signature
    public void off(String event, Invoker invoker, String group){
        JavaFxUtils.off(this.getWrappedObject(), event, group);
    }
    @Signature
    public void off(String event, Invoker invoker){
        JavaFxUtils.off(this.getWrappedObject(), event, null);
    }

    @Signature
    public void trigger(String eventName, Event event){
        JavaFxUtils.trigger(this.getWrappedObject(), eventName, event);
    }
}