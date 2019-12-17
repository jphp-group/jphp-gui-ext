<?php


namespace php\gui\transform;


class UXShear extends UXTransform{
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
    public $x;
    /**
     * @var double
     */
    public $y;

    public function __construct(array $position = [0, 0], array $pivot = [0, 0])
    {
    }
}