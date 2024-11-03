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

public val Twbs.EmojiSurpriseFill: ImageVector
    get() {
        if (_emojiSurpriseFill != null) {
            return _emojiSurpriseFill!!
        }
        _emojiSurpriseFill = Builder(name = "EmojiSurpriseFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(7.0f, 5.5f)
                curveTo(7.0f, 4.672f, 6.552f, 4.0f, 6.0f, 4.0f)
                reflectiveCurveToRelative(-1.0f, 0.672f, -1.0f, 1.5f)
                reflectiveCurveTo(5.448f, 7.0f, 6.0f, 7.0f)
                reflectiveCurveToRelative(1.0f, -0.672f, 1.0f, -1.5f)
                moveToRelative(4.0f, 0.0f)
                curveToRelative(0.0f, -0.828f, -0.448f, -1.5f, -1.0f, -1.5f)
                reflectiveCurveToRelative(-1.0f, 0.672f, -1.0f, 1.5f)
                reflectiveCurveTo(9.448f, 7.0f, 10.0f, 7.0f)
                reflectiveCurveToRelative(1.0f, -0.672f, 1.0f, -1.5f)
                moveTo(8.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
        }
        .build()
        return _emojiSurpriseFill!!
    }

private var _emojiSurpriseFill: ImageVector? = null
