package org.develnext.jphp.ext.gui.fonticons;

import de.jensd.fx.glyphs.GlyphIcon;
import de.jensd.fx.glyphs.GlyphsBuilder;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.icons525.Icons525View;
import de.jensd.fx.glyphs.icons525.utils.Icon525Factory;
import org.develnext.jphp.ext.gui.fonticons.classes.UXFontAwesomeIcon;
import org.develnext.jphp.ext.gui.fonticons.classes.UXGlyphIcon;
import org.develnext.jphp.ext.gui.fonticons.classes.UXIcons525Icon;
import org.develnext.jphp.ext.gui.fonticons.support.FontAwesomeIconViewEx;
import org.develnext.jphp.ext.gui.fonticons.support.Icons525ViewEx;
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
        registerWrapperClass(scope, FontAwesomeIconViewEx.class, UXFontAwesomeIcon.class);
        registerWrapperClass(scope, Icons525ViewEx.class, UXIcons525Icon.class);
    }
}
