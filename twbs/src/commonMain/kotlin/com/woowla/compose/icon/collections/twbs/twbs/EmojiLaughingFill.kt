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

public val Twbs.EmojiLaughingFill: ImageVector
    get() {
        if (_emojiLaughingFill != null) {
            return _emojiLaughingFill!!
        }
        _emojiLaughingFill = Builder(name = "EmojiLaughingFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveTo(7.0f, 6.5f)
                curveToRelative(0.0f, 0.501f, -0.164f, 0.396f, -0.415f, 0.235f)
                curveTo(6.42f, 6.629f, 6.218f, 6.5f, 6.0f, 6.5f)
                reflectiveCurveToRelative(-0.42f, 0.13f, -0.585f, 0.235f)
                curveTo(5.164f, 6.896f, 5.0f, 7.0f, 5.0f, 6.5f)
                curveTo(5.0f, 5.672f, 5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveToRelative(5.331f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.33f, -2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.535f, 9.0f)
                horizontalLineToRelative(6.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.866f, 0.5f)
                moveToRelative(-1.746f, -2.765f)
                curveTo(10.42f, 6.629f, 10.218f, 6.5f, 10.0f, 6.5f)
                reflectiveCurveToRelative(-0.42f, 0.13f, -0.585f, 0.235f)
                curveTo(9.164f, 6.896f, 9.0f, 7.0f, 9.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.448f, -1.5f, 1.0f, -1.5f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                curveToRelative(0.0f, 0.501f, -0.164f, 0.396f, -0.415f, 0.235f)
            }
        }
        .build()
        return _emojiLaughingFill!!
    }

private var _emojiLaughingFill: ImageVector? = null
