<?php


namespace php\gui\transform;


class UXScale extends UXTransform {
    /**
     * @var double
     */
    public $pivotX;
    /**
     * @var double
     */
    public $pivotY;
    /**
     * @var double
     */
    public $pivotZ;

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

    public function __construct(float $x = 1, float $y = 1, float $z = 1, array $pivot = [0, 0, 0])
    {
    }
}