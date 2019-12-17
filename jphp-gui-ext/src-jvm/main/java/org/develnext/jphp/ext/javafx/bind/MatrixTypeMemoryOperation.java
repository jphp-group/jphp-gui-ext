package org.develnext.jphp.ext.javafx.bind;

import javafx.scene.transform.MatrixType;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.StringMemory;
import php.runtime.memory.support.MemoryOperation;

public class MatrixTypeMemoryOperation extends MemoryOperation<MatrixType>{
    @Override
    public Class<?>[] getOperationClasses(){
        return new Class[]{MatrixType.class};
    }

    @Override
    public MatrixType convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable{
        return MatrixType.valueOf(memory.toString());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, MatrixType matrixType) throws Throwable{
        return StringMemory.valueOf(matrixType.name());
    }
}
