<?php
namespace php\gui\icons;

use php\gui\paint\UXColor;

/**
 * Class UXFontAwesomeIcon
 * @package php\gui\icons
 */
class UXFontAwesomeIcon extends UXGlyphIcon
{
    /**
     * @read-only
     * @var string
     */
    public $iconSize = "1em";

    /**
     * @read-only
     * @var string
     */
    public $iconColor = null;

    /**
     * UXFontAwesomeIcon constructor.
     * @param $code
     * @param string $size
     * @param UXColor|string $color
     */
    public function __construct($code, $size = '1em', $color = null)
    {
    }
}