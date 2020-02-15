package org.develnext.jphp.ext.gui.fonticons.support;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.icons525.Icons525;
import de.jensd.fx.glyphs.icons525.Icons525View;

public class Icons525ViewEx extends Icons525View {
    private String iconSize;
    private String iconColor;

    public Icons525ViewEx(Icons525 icon, String iconSize, String color) {
        this(icon, iconSize);
        if (color != null && !color.isEmpty()) {
            this.iconColor = color;
            setStyle(getStyle() + "; -fx-fill: " + color);
        }
    }

    public Icons525ViewEx(Icons525 icon, String iconSize) {
        super(icon, iconSize);
        this.iconSize = iconSize;
    }

    public Icons525ViewEx(Icons525 icon) {
        super(icon);
    }

    public Icons525ViewEx() {
    }

    public String getIconSize() {
        return iconSize;
    }

    public String getIconColor() {
        return iconColor;
    }
}
