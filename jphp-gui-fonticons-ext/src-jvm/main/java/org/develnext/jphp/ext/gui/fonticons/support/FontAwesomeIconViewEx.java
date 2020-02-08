package org.develnext.jphp.ext.gui.fonticons.support;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;

public class FontAwesomeIconViewEx extends FontAwesomeIconView {
    private String iconSize;
    private String iconColor;

    public FontAwesomeIconViewEx(FontAwesomeIcon icon, String iconSize, String color) {
        this(icon, iconSize);
        if (color != null && !color.isEmpty()) {
            this.iconColor = color;
            setStyle(getStyle() + "; -fx-fill: " + color);
        }
    }

    public FontAwesomeIconViewEx(FontAwesomeIcon icon, String iconSize) {
        super(icon, iconSize);
        this.iconSize = iconSize;
    }

    public FontAwesomeIconViewEx(FontAwesomeIcon icon) {
        super(icon);
    }

    public FontAwesomeIconViewEx() {
    }

    public String getIconSize() {
        return iconSize;
    }

    public String getIconColor() {
        return iconColor;
    }
}
