<?php


namespace php\gui\transform;


class UXRotate extends UXTransform{
    /**
     * @var double
     */
    public $angle;

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
     * @var array
     */
    public $axis;

    public function __construct(float $angle = 0, float $pivotX = 0, float $pivotY = 0, float $pivotZ = 0, array $axis = [0, 0, 1])
    {
    }
}