package kotlinx.css

@Suppress("EnumEntryName")
enum class Align {
    // Basic keywords
    auto,
    stretch,
    center,
    flexStart,
    flexEnd,
    baseline;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class JustifyContent {
    center,
    start,
    end,
    flexStart,
    flexEnd,
    left,
    right,
    baseline,
    firstBaseline,
    lastBaseline,
    spaceBetween,
    spaceAround,
    spaceEvenly,
    stretch,
    safeCenter,
    unsafeCenter;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class BackgroundRepeat {
    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class BackgroundAttachment {
    scroll, fixed, local;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BorderCollapse {
    separate, collapse, initial, inherit;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class BorderStyle {
    none, dotted, dashed, solid;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BoxSizing {
    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Clear {
    none, left, right, both;

    override fun toString(): String = name
}

class Color(val value: String) {
    companion object {
        val transparent = Color("transparent")

        // Values from https://www.w3schools.com/cssref/css_colors.asp
        val aliceBlue = Color("#F0F8FF")
        val antiqueWhite = Color("#FAEBD7")
        val aqua = Color("#00FFFF")
        val aquamarine = Color("#7FFFD4")
        val azure = Color("#F0FFFF")
        val beige = Color("#F5F5DC")
        val bisque = Color("#FFE4C4")
        val black = Color("#000000")
        val blanchedAlmond = Color("#FFEBCD")
        val blue = Color("#0000FF")
        val blueViolet = Color("#8A2BE2")
        val brown = Color("#A52A2A")
        val burlyWood = Color("#DEB887")
        val cadetBlue = Color("#5F9EA0")
        val chartreuse = Color("#7FFF00")
        val chocolate = Color("#D2691E")
        val coral = Color("#FF7F50")
        val cornflowerBlue = Color("#6495ED")
        val cornsilk = Color("#FFF8DC")
        val crimson = Color("#DC143C")
        val cyan = Color("#00FFFF")
        val darkBlue = Color("#00008B")
        val darkCyan = Color("#008B8B")
        val darkGoldenRod = Color("#B8860B")
        val darkGray = Color("#A9A9A9")
        val darkGrey = Color("#A9A9A9")
        val darkGreen = Color("#006400")
        val darkKhaki = Color("#BDB76B")
        val darkMagenta = Color("#8B008B")
        val darkOliveGreen = Color("#556B2F")
        val darkOrange = Color("#FF8C00")
        val darkOrchid = Color("#9932CC")
        val darkRed = Color("#8B0000")
        val darkSalmon = Color("#E9967A")
        val darkSeaGreen = Color("#8FBC8F")
        val darkSlateBlue = Color("#483D8B")
        val darkSlateGray = Color("#2F4F4F")
        val darkSlateGrey = Color("#2F4F4F")
        val darkTurquoise = Color("#00CED1")
        val darkViolet = Color("#9400D3")
        val deepPink = Color("#FF1493")
        val deepSkyBlue = Color("#00BFFF")
        val dimGray = Color("#696969")
        val dimGrey = Color("#696969")
        val dodgerBlue = Color("#1E90FF")
        val fireBrick = Color("#B22222")
        val floralWhite = Color("#FFFAF0")
        val forestGreen = Color("#228B22")
        val fuchsia = Color("#FF00FF")
        val gainsboro = Color("#DCDCDC")
        val ghostWhite = Color("#F8F8FF")
        val gold = Color("#FFD700")
        val goldenRod = Color("#DAA520")
        val gray = Color("#808080")
        val grey = Color("#808080")
        val green = Color("#008000")
        val greenYellow = Color("#ADFF2F")
        val honeyDew = Color("#F0FFF0")
        val hotPink = Color("#FF69B4")
        val indianRed = Color("#CD5C5C")
        val indigo = Color("#4B0082")
        val ivory = Color("#FFFFF0")
        val khaki = Color("#F0E68C")
        val lavender = Color("#E6E6FA")
        val lavenderBlush = Color("#FFF0F5")
        val lawnGreen = Color("#7CFC00")
        val lemonChiffon = Color("#FFFACD")
        val lightBlue = Color("#ADD8E6")
        val lightCoral = Color("#F08080")
        val lightCyan = Color("#E0FFFF")
        val lightGoldenRodYellow = Color("#FAFAD2")
        val lightGray = Color("#D3D3D3")
        val lightGrey = Color("#D3D3D3")
        val lightGreen = Color("#90EE90")
        val lightPink = Color("#FFB6C1")
        val lightSalmon = Color("#FFA07A")
        val lightSeaGreen = Color("#20B2AA")
        val lightSkyBlue = Color("#87CEFA")
        val lightSlateGray = Color("#778899")
        val lightSlateGrey = Color("#778899")
        val lightSteelBlue = Color("#B0C4DE")
        val lightYellow = Color("#FFFFE0")
        val lime = Color("#00FF00")
        val limeGreen = Color("#32CD32")
        val linen = Color("#FAF0E6")
        val magenta = Color("#FF00FF")
        val maroon = Color("#800000")
        val mediumAquaMarine = Color("#66CDAA")
        val mediumBlue = Color("#0000CD")
        val mediumOrchid = Color("#BA55D3")
        val mediumPurple = Color("#9370DB")
        val mediumSeaGreen = Color("#3CB371")
        val mediumSlateBlue = Color("#7B68EE")
        val mediumSpringGreen = Color("#00FA9A")
        val mediumTurquoise = Color("#48D1CC")
        val mediumVioletRed = Color("#C71585")
        val midnightBlue = Color("#191970")
        val mintCream = Color("#F5FFFA")
        val mistyRose = Color("#FFE4E1")
        val moccasin = Color("#FFE4B5")
        val navajoWhite = Color("#FFDEAD")
        val navy = Color("#000080")
        val oldLace = Color("#FDF5E6")
        val olive = Color("#808000")
        val oliveDrab = Color("#6B8E23")
        val orange = Color("#FFA500")
        val orangeRed = Color("#FF4500")
        val orchid = Color("#DA70D6")
        val paleGoldenRod = Color("#EEE8AA")
        val paleGreen = Color("#98FB98")
        val paleTurquoise = Color("#AFEEEE")
        val paleVioletRed = Color("#DB7093")
        val papayaWhip = Color("#FFEFD5")
        val peachPuff = Color("#FFDAB9")
        val peru = Color("#CD853F")
        val pink = Color("#FFC0CB")
        val plum = Color("#DDA0DD")
        val powderBlue = Color("#B0E0E6")
        val purple = Color("#800080")
        val rebeccaPurple = Color("#663399")
        val red = Color("#FF0000")
        val rosyBrown = Color("#BC8F8F")
        val royalBlue = Color("#4169E1")
        val saddleBrown = Color("#8B4513")
        val salmon = Color("#FA8072")
        val sandyBrown = Color("#F4A460")
        val seaGreen = Color("#2E8B57")
        val seaShell = Color("#FFF5EE")
        val sienna = Color("#A0522D")
        val silver = Color("#C0C0C0")
        val skyBlue = Color("#87CEEB")
        val slateBlue = Color("#6A5ACD")
        val slateGray = Color("#708090")
        val slateGrey = Color("#708090")
        val snow = Color("#FFFAFA")
        val springGreen = Color("#00FF7F")
        val steelBlue = Color("#4682B4")
        val tan = Color("#D2B48C")
        val teal = Color("#008080")
        val thistle = Color("#D8BFD8")
        val tomato = Color("#FF6347")
        val turquoise = Color("#40E0D0")
        val violet = Color("#EE82EE")
        val wheat = Color("#F5DEB3")
        val white = Color("#FFFFFF")
        val whiteSmoke = Color("#F5F5F5")
        val yellow = Color("#FFFF00")
    }

    override fun toString() = value

    fun withAlpha(alpha: Double): Color {
        if (alpha < 0 || alpha > 1) {
            throw IllegalArgumentException("Alpha should be a number between 0.0 (fully transparent) and 1.0 (fully opaque)")
        } else {
            val rgb = toRGB()
            return Color("rgba(${rgb.first},${rgb.second},${rgb.third},$alpha)")
        }
    }


    private fun fromRGBNotation(): Triple<Int, Int, Int> {
        // Match for rgb(255, 255, 255) | rgba(255, 255, 255, 0.5)
        val pattern = "^rgba?\\((\\d{1,3}),?\\s*(\\d{1,3}),?\\s*(\\d{1,3}),?\\s*(\\d\\.\\d)?\\)\$"
        val match = Regex(pattern, RegexOption.IGNORE_CASE).find(value)
        val ints = (1..3).map {
            val int = match?.groups?.get(it)?.value?.toInt()
            if (int == null || int < 0 || int > 255) {
                throw IllegalArgumentException("Expected rgb or rgba notation, got $value")
            } else {
                int
            }
        }
        return Triple(ints[0], ints[1], ints[2])
    }

    private fun toRGB(): Triple<Int, Int, Int> {
        return when {
            value.startsWith("rgb") -> fromRGBNotation()

            // Matches #rgb
            value.startsWith("#") && value.length == 4 -> Triple(
                (value[1].toString() * 2).toInt(16),
                (value[2].toString() * 2).toInt(16),
                (value[3].toString() * 2).toInt(16)
            )

            // Matches both #rrggbb and #rrggbbaa
            value.startsWith("#") && (value.length == 7 || value.length == 9) -> Triple(
                (value.substring(1..2)).toInt(16),
                (value.substring(3..4)).toInt(16),
                (value.substring(5..6)).toInt(16)
            )
            else -> throw IllegalArgumentException("Only hexadecimal, rgb, and rgba notations are accepted, got $value")
        }
    }
}

fun rgb(red: Int, green: Int, blue: Int) = Color("rgb($red, $green, $blue)")
fun rgba(red: Int, green: Int, blue: Int, alpha: Double) = Color("rgba($red, $green, $blue, $alpha)")
fun blackAlpha(alpha: Double) = Color.black.withAlpha(alpha)
fun whiteAlpha(alpha: Double) = Color.white.withAlpha(alpha)

@Suppress("EnumEntryName")
enum class Cursor {
    auto, default, none, // General
    contextMenu, help, pointer, progress, wait, // Links & status
    cell, crosshair, text, verticalText, // Selection
    alias, copy, move, noDrop, notAllowed, grab, grabbing, // Drag and drop
    colResize, rowResize, allScroll, // Resize & scrolling
    eResize, nResize, neResize, nwResize, sResize, seResize, swResize, wResize, // Directed resize
    ewResize, nsResize, neswResize, nwseResize, // Bidirectional resize
    zoomIn, zoomOut; // Zoom

    override fun toString() = name.hyphenize()
}

// Enquotes the value
class QuotedString(val value: String) {
    override fun toString(): String = "'$value'"
}

val String.quoted get() = QuotedString(this)

@Suppress("EnumEntryName")
enum class Direction {
    ltr, rtl;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Display {
    block, `inline`, runIn,

    flow, flowRoot, table, flex, grid, subgrid,

    listItem,

    tableRowGroup, tableHeaderGroup, tableFooterGroup, tableRow, tableCell, tableColumnGroup, tableColumn, tableCaption,

    contents, none,

    inlineBlock, inlineListItem, inlineTable, inlineFlex, inlineGrid;

    override fun toString(): String = name.hyphenize()
}

class FlexBasis(val value: String) {
    companion object {
        val auto = FlexBasis("auto")
        val content = FlexBasis("content")
        val minContent = FlexBasis("min-content")
        val maxContent = FlexBasis("max-content")
        val fitContent = FlexBasis("fit-content")
        val fill = FlexBasis("fill")
        val zero = FlexBasis("0")
    }

    override fun toString(): String = value
}

val LinearDimension.basis get() = FlexBasis(toString())

@Suppress("EnumEntryName")
enum class FlexWrap {
    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Float {
    left, right, none;

    override fun toString(): String = name.hyphenize()
}

class FontWeight(val value: String) {
    companion object {
        val normal = FontWeight("normal")
        val bold = FontWeight("bold")
        val bolder = FontWeight("bolder")
        val lighter = FontWeight("lighter")
        val w900 = FontWeight("900")
        val w800 = FontWeight("800")
        val w700 = FontWeight("700") // same as "bold"
        val w600 = FontWeight("600")
        val w500 = FontWeight("500")
        val w400 = FontWeight("400") // same as "normal"
        val w300 = FontWeight("300")
        val w200 = FontWeight("200")
        val w100 = FontWeight("100")
    }

    override fun toString(): String = value
}

class FontStyle(val value: String) {
    companion object {
        val normal = FontStyle("normal")
        val italic = FontStyle("italic")
    }

    override fun toString(): String = value
}

@Suppress("EnumEntryName")
enum class FlexDirection {
    column, row;

    override fun toString() = name
}

enum class Grow {
    NONE, GROW, SHRINK, GROW_SHRINK
}

@Suppress("EnumEntryName")
enum class Hyphens {
    none, manual, auto;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ListStyleType {
    none, disc, circle, square, decimal;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Outline {
    none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Overflow {
    visible, hidden, scroll, auto;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class OverflowWrap {
    normal, breakWord;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class PointerEvents {
    auto, none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Position {
    static, relative, absolute, fixed, sticky;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ScrollBehavior {
    auto, smooth;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextAlign {
    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class TableLayout {
    auto, fixed, initial, inherit;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextOverflow {
    clip, ellipsis;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextTransform {
    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class UserSelect {
    none, auto, text, contain, all;

    override fun toString() = name
}

class VerticalAlign(val value: String) {
    companion object {
        val baseline = VerticalAlign("baseline")
        val sub = VerticalAlign("sub")
        val `super` = VerticalAlign("super")
        val textTop = VerticalAlign("text-top")
        val textBottom = VerticalAlign("text-bottom")
        val middle = VerticalAlign("middle")
        val top = VerticalAlign("top")
        val bottom = VerticalAlign("bottom")
    }

    override fun toString() = value
}

val LinearDimension.up get() = VerticalAlign(toString())
val LinearDimension.down get() = VerticalAlign((-this).toString())

@Suppress("EnumEntryName")
enum class Visibility {
    visible, hidden, collapse;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class WhiteSpace {
    normal, nowrap, pre, preWrap, preLine;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordBreak {
    normal, breakAll, breakWord, keepAll;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordWrap {
    normal, breakWord;

    override fun toString() = name.hyphenize()
}

class Image(val value: String) {
    companion object {
        val none = Image("none")
    }

    override fun toString() = value
}
