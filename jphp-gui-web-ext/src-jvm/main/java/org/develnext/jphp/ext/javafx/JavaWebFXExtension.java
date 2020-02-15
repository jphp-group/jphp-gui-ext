package org.develnext.jphp.ext.javafx;

import javafx.scene.web.*;
import netscape.javascript.JSException;
import org.develnext.jphp.ext.javafx.classes.*;
import org.develnext.jphp.ext.javafx.classes.event.*;
import org.develnext.jphp.ext.javafx.support.EventProvider;
import org.develnext.jphp.ext.javafx.support.event.*;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JavaWebFXExtension extends Extension {
    public final static String NS = "php\\gui\\";

    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public String[] getPackageNames() {
        return new String[] { "gui", "javafx" };
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public void onRegister(CompileScope scope) {

        registerWrapperClass(scope, HTMLEditor.class, UXHtmlEditor.class);
        registerWrapperClass(scope, WebHistory.class, UXWebHistory.class);
        registerWrapperClass(scope, WebEngine.class, UXWebEngine.class);
        registerWrapperClass(scope, WebView.class, UXWebView.class);

        registerWrapperClass(scope, WebEvent.class, UXWebEvent.class);
        registerWrapperClass(scope, WebErrorEvent.class, UXWebErrorEvent.class);

        registerJavaException(scope, WrapJSException.class, JSException.class);

        registerEvents(scope);
    }


    protected void registerEvents(CompileScope scope) {
        registerEventProvider(new WebEngineEventProvider());
    }

    protected void registerEventProvider(EventProvider eventProvider) {
        EventProvider.register(eventProvider);
    }
}
