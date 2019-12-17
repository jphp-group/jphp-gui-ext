<?php


namespace php\gui\transform;


class UXTranslate extends UXTransform {
    /**
     * @var double
     */
    public $x;
    /**
     * @var double
     */
    public $y;
    /**
     * @var double
     */
    public $z;

    public function __construct(float $x = 1, float $y = 1, float $z = 1)
    {
    }
}