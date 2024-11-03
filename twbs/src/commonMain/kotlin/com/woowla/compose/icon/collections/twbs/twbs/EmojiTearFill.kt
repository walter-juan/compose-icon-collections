package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.EmojiTearFill: ImageVector
    get() {
        if (_emojiTearFill != null) {
            return _emojiTearFill!!
        }
        _emojiTearFill = Builder(name = "EmojiTearFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(9.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                curveToRelative(0.838f, 0.0f, 1.65f, 0.416f, 2.053f, 1.224f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.894f, -0.448f)
                curveTo(12.351f, 3.584f, 11.162f, 3.0f, 10.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 5.672f, 6.552f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(-1.0f, 0.672f, -1.0f, 1.5f)
                reflectiveCurveTo(5.448f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(1.0f, -0.672f, 1.0f, -1.5f)
                moveTo(4.5f, 13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.746f, 1.5f, -1.667f)
                curveToRelative(0.0f, -0.706f, -0.882f, -2.29f, -1.294f, -2.99f)
                arcToRelative(0.238f, 0.238f, 0.0f, false, false, -0.412f, 0.0f)
                curveTo(3.882f, 9.044f, 3.0f, 10.628f, 3.0f, 11.334f)
                curveTo(3.0f, 12.253f, 3.672f, 13.0f, 4.5f, 13.0f)
                moveTo(8.0f, 11.197f)
                curveToRelative(0.916f, 0.0f, 1.607f, 0.408f, 2.25f, 0.826f)
                curveToRelative(0.212f, 0.138f, 0.424f, -0.069f, 0.282f, -0.277f)
                curveToRelative(-0.564f, -0.83f, -1.558f, -2.049f, -2.532f, -2.049f)
                curveToRelative(-0.53f, 0.0f, -1.066f, 0.361f, -1.536f, 0.824f)
                quadToRelative(0.126f, 0.27f, 0.232f, 0.535f)
                quadToRelative(0.069f, 0.174f, 0.135f, 0.373f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 8.0f, 11.197f)
                moveTo(10.0f, 8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.672f, 1.0f, -1.5f)
                reflectiveCurveTo(10.552f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(-1.0f, 0.672f, -1.0f, 1.5f)
                reflectiveCurveTo(9.448f, 8.0f, 10.0f, 8.0f)
                moveTo(6.5f, 3.0f)
                curveToRelative(-1.162f, 0.0f, -2.35f, 0.584f, -2.947f, 1.776f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.894f, 0.448f)
                curveTo(4.851f, 4.416f, 5.662f, 4.0f, 6.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _emojiTearFill!!
    }

private var _emojiTearFill: ImageVector? = null
