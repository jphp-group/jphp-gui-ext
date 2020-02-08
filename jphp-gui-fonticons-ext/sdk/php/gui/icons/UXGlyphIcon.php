<?php
namespace php\gui\icons;

use php\gui\shape\UXShape;

/**
 * Class UXGlyphIcon
 * @package php\gui\icons
 */
abstract class UXGlyphIcon extends UXShape
{
    /**
     * @read-only
     * @var string
     */
    public $glyphName;
}