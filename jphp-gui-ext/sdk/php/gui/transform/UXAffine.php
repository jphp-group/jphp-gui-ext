<?php


namespace php\gui\transform;


class UXAffine extends UXTransform {
    public function __construct(?UXTransform $transform = null)
    {
    }

    public function appendArray(array $matrix, string $type, int $offset){}

    public function append2D(float $mxx, float $mxy, float $tx, float $myx, float $myy, float $ty){}
    public function append3D(float $mxx, float $mxy, float $mxz, float $tx, float $myx, float $myy, float $myz, float $ty, float $mzx, float $mzy, float $mzz, float $tz){}

    public function appendTransform(UXTransform $transform){}

    public function appendScale(float $sx, float $sy, float $sz = null, array $pivot = [0, 0, 0]){}

    public function appendShear(float $shx, float $shy, array $pivot = [0, 0]){}

    public function appendTranslation(float $tx, float $ty, float $tz = null){}

    public function appendRotation2D(float $angle, array $pivot = []){}
    public function appendRotation3D(float $angle, array $pivot, array $axis){}

    public function prependArray(array $matrix, string $type, int $offset){}

    public function prepend2D(float $mxx, float $mxy, float $tx, float $myx, float $myy, float $ty){}
    public function prepend3D(float $mxx, float $mxy, float $mxz, float $tx, float $myx, float $myy, float $myz, float $ty, float $mzx, float $mzy, float $mzz, float $tz){}

    public function prependTransform(UXTransform $transform){}

    public function prependScale(float $sx, float $sy, float $sz = null, array $pivot = [0, 0, 0]){}

    public function prependShear(float $shx, float $shy, array $pivot = [0, 0]){}

    public function prependTranslation(float $tx, float $ty, float $tz = null){}

    public function prependRotation2D(float $angle, array $pivot = []){}
    public function prependRotation3D(float $angle, array $pivot, array $axis){}

    public function setElement(string $type, int $row, int $column, float $value){}

    public function setToIdentity(){}
    public function setToTransform(UXTransform $transform){}
}