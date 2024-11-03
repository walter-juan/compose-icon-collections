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

public val Twbs.EmojiLaughing: ImageVector
    get() {
        if (_emojiLaughing != null) {
            return _emojiLaughing!!
        }
        _emojiLaughing = Builder(name = "EmojiLaughing", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(12.331f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.33f, -2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.535f, 9.0f)
                horizontalLineToRelative(6.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.866f, 0.5f)
                moveTo(7.0f, 6.5f)
                curveToRelative(0.0f, 0.828f, -0.448f, 0.0f, -1.0f, 0.0f)
                reflectiveCurveToRelative(-1.0f, 0.828f, -1.0f, 0.0f)
                reflectiveCurveTo(5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveToRelative(4.0f, 0.0f)
                curveToRelative(0.0f, 0.828f, -0.448f, 0.0f, -1.0f, 0.0f)
                reflectiveCurveToRelative(-1.0f, 0.828f, -1.0f, 0.0f)
                reflectiveCurveTo(9.448f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
            }
        }
        .build()
        return _emojiLaughing!!
    }

private var _emojiLaughing: ImageVector? = null
