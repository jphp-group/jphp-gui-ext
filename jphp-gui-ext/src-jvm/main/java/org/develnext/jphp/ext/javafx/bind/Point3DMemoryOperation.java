package org.develnext.jphp.ext.javafx.bind;

import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.support.MemoryOperation;

public class Point3DMemoryOperation extends MemoryOperation<Point3D>{
    @Override
    public Class<?>[] getOperationClasses(){
        return new Class[]{Point3D.class};
    }

    @Override
    public Point3D convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable{
        Memory[] values = memory.toValue(ArrayMemory.class).values();

        if(values.length < 3){
            throw new IllegalArgumentException("Array length must be greater than or equal to three");
        }

        return new Point3D(values[0].toDouble(), values[1].toDouble(), values[2].toDouble());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, Point3D point3D) throws Throwable{
        return ArrayMemory.ofDoubles(point3D.getX(), point3D.getY(), point3D.getZ());
    }
}
