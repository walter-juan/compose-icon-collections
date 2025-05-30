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

public val Twbs.EmojiAngry: ImageVector
    get() {
        if (_emojiAngry != null) {
            return _emojiAngry!!
        }
        _emojiAngry = Builder(name = "EmojiAngry", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
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
                moveTo(4.285f, 12.433f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.683f, -0.183f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.0f, 10.5f)
                curveToRelative(1.295f, 0.0f, 2.426f, 0.703f, 3.032f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.866f, -0.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.0f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.898f, 2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.183f, 0.683f)
                moveToRelative(6.991f, -8.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.448f, 0.894f)
                lineToRelative(-1.009f, 0.504f)
                curveToRelative(0.176f, 0.27f, 0.285f, 0.64f, 0.285f, 1.049f)
                curveToRelative(0.0f, 0.828f, -0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                curveToRelative(0.0f, -0.247f, 0.04f, -0.48f, 0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, 0.166f, -0.761f)
                close()
                moveTo(4.724f, 4.053f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.448f, 0.894f)
                lineToRelative(1.009f, 0.504f)
                arcTo(1.94f, 1.94f, 0.0f, false, false, 5.0f, 6.5f)
                curveTo(5.0f, 7.328f, 5.448f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(1.0f, -0.672f, 1.0f, -1.5f)
                curveToRelative(0.0f, -0.247f, -0.04f, -0.48f, -0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, -0.166f, -0.761f)
                close()
            }
        }
        .build()
        return _emojiAngry!!
    }

private var _emojiAngry: ImageVector? = null
