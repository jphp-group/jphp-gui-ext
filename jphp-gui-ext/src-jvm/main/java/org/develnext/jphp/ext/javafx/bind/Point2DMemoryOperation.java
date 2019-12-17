package org.develnext.jphp.ext.javafx.bind;

import javafx.geometry.Point2D;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.support.MemoryOperation;

public class Point2DMemoryOperation extends MemoryOperation<Point2D>{
    @Override
    public Class<?>[] getOperationClasses(){
        return new Class[]{Point2D.class};
    }

    @Override
    public Point2D convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable{
        Memory[] values = memory.toValue(ArrayMemory.class).values();

        if(values.length < 2){
            throw new IllegalArgumentException("Array length must be greater than or equal to two");
        }

        return new Point2D(values[0].toDouble(), values[1].toDouble());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, Point2D point2D) throws Throwable{
        return ArrayMemory.ofDoubles(point2D.getX(), point2D.getY());
    }
}
