package org.develnext.jphp.ext.gui.fonticons.classes;

import de.jensd.fx.glyphs.icons525.Icons525;
import javafx.scene.paint.Color;
import org.develnext.jphp.ext.gui.fonticons.GuiFontIconsExtension;
import org.develnext.jphp.ext.gui.fonticons.support.Icons525ViewEx;
import org.develnext.jphp.ext.javafx.classes.paint.UXColor;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(GuiFontIconsExtension.NS)
public class UXIcons525Icon extends UXGlyphIcon<Icons525ViewEx> {
    public UXIcons525Icon(Environment env, Icons525ViewEx wrappedObject) {
        super(env, wrappedObject);
    }

    public UXIcons525Icon(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Icons525ViewEx getWrappedObject() {
        return super.getWrappedObject();
    }

    @Reflection.Signature
    public void __construct(Environment env, String icon, String size, Color color) {
        String iconCode = icon.toUpperCase().replace("-", "_");

        if (Character.isDigit(iconCode.charAt(0))) {
            iconCode = "_" + iconCode;
        }

        __wrappedObject = new Icons525ViewEx(
                Icons525.valueOf(iconCode),
                size,
                color == null ? null : new UXColor(env, color).getWebValue()
        );
    }

    @Reflection.Signature
    public void __construct(Environment env, String icon, String size) {
        __construct(env, icon, size, null);
    }

    @Reflection.Signature
    public void __construct(Environment env, String icon) {
        __construct(env, icon, "1em");
    }

    @Reflection.Getter
    public String getIconSize() {
        return getWrappedObject().getIconSize();
    }

    @Reflection.Getter
    public String getIconColor() {
        return getWrappedObject().getIconColor();
    }
}
