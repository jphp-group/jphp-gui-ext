package org.develnext.jphp.ext.javafx.classes.transform;

import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import javafx.scene.transform.Affine;
import javafx.scene.transform.MatrixType;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "transform\\UXAffine")
public class UXAffine extends UXTransform<Affine>{
    public UXAffine(Environment env, Affine wrappedObject){
        super(env, wrappedObject);
    }

    public UXAffine(Environment env, ClassEntity clazz){
        super(env, clazz);
    }

    interface WrappedInterface{
        @Name("appendArray") void append(double[] matrix, MatrixType type, int offset);
        @Name("append2D") void append(double mxx, double mxy, double tx, double myx, double myy, double ty);
        @Name("append3D") void append(double mxx, double mxy, double mxz, double tx, double myx, double myy, double myz, double ty, double mzx, double mzy, double mzz, double tz);
        @Name("appendTransform") void append(Transform transform);

        void appendScale(double sx, double sy);
        void appendScale(double sx, double sy, double sz);
        void appendScale(double sx, double sy, double sz, Point3D pivot);

        void appendShear(double shx, double shy);
        void appendShear(double shx, double shy, Point2D pivot);

        void appendTranslation(double tx, double ty);
        void appendTranslation(double tx, double ty, double tz);

        @Name("appendRotation2D") void appendRotation(double angle);
        @Name("appendRotation2D") void appendRotation(double angle, Point2D pivot);

        @Name("appendRotation3D") void appendRotation(double angle, Point3D pivot, Point3D axis);

        @Name("prependArray") void prepend(double[] matrix, MatrixType type, int offset);
        @Name("prepend2D") void prepend(double mxx, double mxy, double tx, double myx, double myy, double ty);
        @Name("prepend3D") void prepend(double mxx, double mxy, double mxz, double tx, double myx, double myy, double myz, double ty, double mzx, double mzy, double mzz, double tz);
        @Name("prependTransform") void prepend(Transform transform);

        void prependScale(double sx, double sy);
        void prependScale(double sx, double sy, double sz);
        void prependScale(double sx, double sy, double sz, Point3D pivot);

        void prependShear(double shx, double shy);
        void prependShear(double shx, double shy, Point2D pivot);

        void prependTranslation(double tx, double ty);
        void prependTranslation(double tx, double ty, double dz);

        @Name("prependRotation2D") void prependRotation(double angle);
        @Name("prependRotation2D") void prependRotation(double angle, Point2D pivot);

        @Name("prependRotation3D") void prependRotation(double angle, Point3D pivot, Point3D axis);

        void setElement(MatrixType type, int row, int column, double value);

        void setToIdentity();
        void setToTransform(Transform transform);

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
    }

    @Signature
    public void __construct(){
        __wrappedObject = new Affine();
    }
    @Signature
    public void __construct(Transform transform){
        __wrappedObject = new Affine(transform);
    }
}
