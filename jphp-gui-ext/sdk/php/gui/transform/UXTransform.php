<?php


namespace php\gui\transform;


use php\gui\event\UXEvent;

abstract class UXTransform{
    /**
     * @var boolean
     */
    public $identity;
    /**
     * @var boolean
     */
    public $type2D;

    /**
     * @var double
     */
    public $mxx;
    /**
     * @var double
     */
    public $mxy;
    /**
     * @var double
     */
    public $mxz;

    /**
     * @var double
     */
    public $myx;
    /**
     * @var double
     */
    public $myy;
    /**
     * @var double
     */
    public $myz;

    /**
     * @var double
     */
    public $mzx;
    /**
     * @var double
     */
    public $mzy;
    /**
     * @var double
     */
    public $mzz;

    /**
     * @var double
     */
    public $tx;
    /**
     * @var double
     */
    public $ty;
    /**
     * @var double
     */
    public $tz;


    /**
     * @return float
     */
    public function determinant(){}
    /**
     * @return float
     */
    public function getElement(string $type, int $row, int $column){}


    /**
     * @return float[]
     */
    public function column(string $type, int $column){}
    /**
     * @return float[]
     */
    public function row(string $type, int $row){}

    /**
     * @return float[]
     */
    public function toArray(string $type){}

    /**
     * @return UXTransform
     */
    public function createConcatenation(UXTransform $transform){}
    /**
     * @return UXTransform
     */
    public function createInverse(){}

    /**
     * @return array
     */
    public function transform(float $x, float $y, float $z = null){}
    /**
     * @return array
     */
    public function inverseTransform(float $x, float $y, float $z = null){}
    /**
     * @return array
     */
    public function deltaTransform(float $x, float $y, float $z = null){}
    /**
     * @return array
     */
    public function inverseDeltaTransform(float $x, float $y, float $z = null){}


    /**
     * @param string $event finish, etc.
     * @param callable $handler
     * @param string $group
     */
    public function on($event, callable $handler, $group = 'general')
    {
    }

    /**
     * @param string $event
     * @param string $group (optional)
     */
    public function off($event, $group)
    {
    }

    /**
     * @param string $event
     * @param UXEvent $e (optional)
     */
    public function trigger($event, UXEvent $e)
    {
    }
}