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

public val Twbs.EmojiGrin: ImageVector
    get() {
        if (_emojiGrin != null) {
            return _emojiGrin!!
        }
        _emojiGrin = Builder(name = "EmojiGrin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.946f, 11.398f)
                arcTo(6.002f, 6.002f, 0.0f, false, true, 2.108f, 9.14f)
                curveToRelative(-0.114f, -0.595f, 0.426f, -1.068f, 1.028f, -0.997f)
                curveTo(4.405f, 8.289f, 6.48f, 8.5f, 8.0f, 8.5f)
                reflectiveCurveToRelative(3.595f, -0.21f, 4.864f, -0.358f)
                curveToRelative(0.602f, -0.07f, 1.142f, 0.402f, 1.028f, 0.998f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, -0.946f, 2.258f)
                moveToRelative(-0.078f, -2.25f)
                curveTo(11.588f, 9.295f, 9.539f, 9.5f, 8.0f, 9.5f)
                reflectiveCurveToRelative(-3.589f, -0.205f, -4.868f, -0.352f)
                curveToRelative(0.11f, 0.468f, 0.286f, 0.91f, 0.517f, 1.317f)
                arcTo(37.0f, 37.0f, 0.0f, false, false, 8.0f, 10.75f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, 4.351f, -0.285f)
                curveToRelative(0.231f, -0.407f, 0.407f, -0.85f, 0.517f, -1.317f)
                moveToRelative(-1.36f, 2.416f)
                curveToRelative(-1.02f, 0.1f, -2.255f, 0.186f, -3.508f, 0.186f)
                reflectiveCurveToRelative(-2.488f, -0.086f, -3.507f, -0.186f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.507f, -1.436f)
                close()
                moveTo(6.488f, 7.0f)
                curveToRelative(0.114f, -0.294f, 0.179f, -0.636f, 0.179f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.597f, -2.0f, -1.334f, -2.0f)
                curveTo(4.597f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                curveToRelative(0.0f, 0.364f, 0.065f, 0.706f, 0.178f, 1.0f)
                curveToRelative(0.23f, -0.598f, 0.662f, -1.0f, 1.155f, -1.0f)
                curveToRelative(0.494f, 0.0f, 0.925f, 0.402f, 1.155f, 1.0f)
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, 0.364f, -0.065f, 0.706f, -0.178f, 1.0f)
                curveToRelative(-0.23f, -0.598f, -0.662f, -1.0f, -1.155f, -1.0f)
                curveToRelative(-0.494f, 0.0f, -0.925f, 0.402f, -1.155f, 1.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.179f, -1.0f)
                curveToRelative(0.0f, -1.105f, 0.597f, -2.0f, 1.334f, -2.0f)
                curveTo(11.403f, 4.0f, 12.0f, 4.895f, 12.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveToRelative(0.0f, -1.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
            }
        }
        .build()
        return _emojiGrin!!
    }

private var _emojiGrin: ImageVector? = null
