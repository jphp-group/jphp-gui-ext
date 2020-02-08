package org.develnext.jphp.ext.gui.fonticons.classes;

import de.jensd.fx.glyphs.GlyphIcon;
import org.develnext.jphp.ext.gui.fonticons.GuiFontIconsExtension;
import org.develnext.jphp.ext.javafx.classes.shape.UXShape;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Namespace(GuiFontIconsExtension.NS)
public class UXGlyphIcon<T extends GlyphIcon> extends UXShape<T> {
    interface WrappedInterface {

    }

    public UXGlyphIcon(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UXGlyphIcon(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public T getWrappedObject() {
        return super.getWrappedObject();
    }

    @Getter
    public String getGlyphName() {
        return getWrappedObject().getGlyphName();
    }
}
