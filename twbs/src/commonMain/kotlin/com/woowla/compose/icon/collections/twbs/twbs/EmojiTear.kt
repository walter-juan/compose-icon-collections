package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.EmojiTear: ImageVector
    get() {
        if (_emojiTear != null) {
            return _emojiTear!!
        }
        _emojiTear = Builder(name = "EmojiTear", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.831f, 11.43f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 8.0f, 11.196f)
                curveToRelative(0.916f, 0.0f, 1.607f, 0.408f, 2.25f, 0.826f)
                curveToRelative(0.212f, 0.138f, 0.424f, -0.069f, 0.282f, -0.277f)
                curveToRelative(-0.564f, -0.83f, -1.558f, -2.049f, -2.532f, -2.049f)
                curveToRelative(-0.53f, 0.0f, -1.066f, 0.361f, -1.536f, 0.824f)
                quadToRelative(0.126f, 0.27f, 0.232f, 0.535f)
                quadToRelative(0.069f, 0.174f, 0.135f, 0.373f)
                close()
                moveTo(6.0f, 11.333f)
                curveTo(6.0f, 12.253f, 5.328f, 13.0f, 4.5f, 13.0f)
                reflectiveCurveTo(3.0f, 12.254f, 3.0f, 11.333f)
                curveToRelative(0.0f, -0.706f, 0.882f, -2.29f, 1.294f, -2.99f)
                arcToRelative(0.238f, 0.238f, 0.0f, false, true, 0.412f, 0.0f)
                curveToRelative(0.412f, 0.7f, 1.294f, 2.284f, 1.294f, 2.99f)
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 7.328f, 6.552f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveToRelative(4.0f, 0.0f)
                curveToRelative(0.0f, 0.828f, -0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(9.448f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveToRelative(-1.5f, -3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 3.0f)
                curveToRelative(1.162f, 0.0f, 2.35f, 0.584f, 2.947f, 1.776f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.894f, 0.448f)
                curveTo(11.649f, 4.416f, 10.838f, 4.0f, 10.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(7.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                curveToRelative(-1.162f, 0.0f, -2.35f, 0.584f, -2.947f, 1.776f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.894f, 0.448f)
                curveTo(4.851f, 4.416f, 5.662f, 4.0f, 6.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
            }
        }
        .build()
        return _emojiTear!!
    }

private var _emojiTear: ImageVector? = null
