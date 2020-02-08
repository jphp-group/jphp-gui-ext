package org.develnext.jphp.ext.gui.fonticons.classes;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.scene.paint.Color;
import org.develnext.jphp.ext.gui.fonticons.GuiFontIconsExtension;
import org.develnext.jphp.ext.gui.fonticons.support.FontAwesomeIconViewEx;
import org.develnext.jphp.ext.javafx.classes.paint.UXColor;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(GuiFontIconsExtension.NS)
public class UXFontAwesomeIcon extends UXGlyphIcon<FontAwesomeIconViewEx> {
    public UXFontAwesomeIcon(Environment env, FontAwesomeIconViewEx wrappedObject) {
        super(env, wrappedObject);
    }

    public UXFontAwesomeIcon(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(Environment env, String icon, String size, Color color) {
        String iconCode = icon.toUpperCase().replace("-", "_");

        __wrappedObject = new FontAwesomeIconViewEx(
                FontAwesomeIcon.valueOf(iconCode),
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

    @Getter
    public String getIconSize() {
        return getWrappedObject().getIconSize();
    }

    @Getter
    public String getIconColor() {
        return getWrappedObject().getIconColor();
    }
}
