package org.develnext.jphp.ext.javafx.support.event;

import javafx.event.EventHandler;
import javafx.scene.transform.Transform;
import org.develnext.jphp.ext.javafx.support.EventProvider;

public class TransformEventProvider extends EventProvider<Transform>{
    public Handler transformchangedHandler(){
        return new Handler(){
            @Override
            public void set(Transform target, EventHandler eventHandler){
                target.setOnTransformChanged(eventHandler);
            }

            @Override
            public EventHandler get(Transform target){
                return target.getOnTransformChanged();
            }
        };
    }

    @Override
    public Class<Transform> getTargetClass(){
        return Transform.class;
    }
}
