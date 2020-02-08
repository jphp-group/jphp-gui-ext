package org.develnext.jphp.ext.gui.fonticons;

import de.jensd.fx.glyphs.GlyphIcon;
import de.jensd.fx.glyphs.GlyphsBuilder;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import org.develnext.jphp.ext.gui.fonticons.classes.UXFontAwesomeIcon;
import org.develnext.jphp.ext.gui.fonticons.classes.UXGlyphIcon;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.env.CompileScope;

public class GuiFontIconsExtension extends JavaFXExtension {
    public static final String NS = "php\\gui\\icons";

    @Override
    public String[] getPackageNames() {
        return new String[] { "gui" };
    }

    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, GlyphIcon.class, UXGlyphIcon.class);
        registerWrapperClass(scope, FontAwesomeIcon.class, UXFontAwesomeIcon.class);
    }
}
