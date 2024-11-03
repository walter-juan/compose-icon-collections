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

public val Twbs.EmojiWinkFill: ImageVector
    get() {
        if (_emojiWinkFill != null) {
            return _emojiWinkFill!!
        }
        _emojiWinkFill = Builder(name = "EmojiWinkFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 5.672f, 6.552f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(-1.0f, 0.672f, -1.0f, 1.5f)
                reflectiveCurveTo(5.448f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(1.0f, -0.672f, 1.0f, -1.5f)
                moveTo(4.285f, 9.567f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.183f, 0.683f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.0f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.866f, -0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.032f, -1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.683f, -0.183f)
                moveToRelative(5.152f, -3.31f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.874f, 0.486f)
                curveToRelative(0.33f, 0.595f, 0.958f, 1.007f, 1.687f, 1.007f)
                reflectiveCurveToRelative(1.356f, -0.412f, 1.687f, -1.007f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.874f, -0.486f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.813f, 0.493f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.813f, -0.493f)
            }
        }
        .build()
        return _emojiWinkFill!!
    }

private var _emojiWinkFill: ImageVector? = null
