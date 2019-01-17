<?php

use php\gui\{UXApplication, UXDialog, UXForm, UXLabel, layout\UXVBox, UXMaterialButton};
use php\desktop\{Mouse};
use php\lang\{System};

UXApplication::runLater(function() {
    $form = new UXForm();
    $form->title = 'JavaFX 11 SandBox';

    $label = new UXLabel('Hi, World!');
    $label->font->bold = true;
    $label->font->size = 14;

    $btn = new UXMaterialButton('Button');
    $btn->size = [120, 30];
    $btn->buttonType = 'RAISED';
    $btn->backgroundColor = 'white';
    $btn->on('click', function() use ($label) {
        $label->text = 'Clicked! X: ' . Mouse::x() . ",  Y: " + Mouse::y();
    });

    $form->layout = new UXVBox();
    $form->layout->spacing = 10;
    $form->layout->alignment = 'CENTER';
    $form->layout->add($label);
    $form->layout->add($btn);
    $form->layout->size = [400, 300];
    $form->show();
});