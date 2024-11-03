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

public val Twbs.EmojiGrinFill: ImageVector
    get() {
        if (_emojiGrinFill != null) {
            return _emojiGrinFill!!
        }
        _emojiGrinFill = Builder(name = "EmojiGrinFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveTo(6.488f, 7.0f)
                curveToRelative(-0.23f, -0.598f, -0.661f, -1.0f, -1.155f, -1.0f)
                curveToRelative(-0.493f, 0.0f, -0.924f, 0.402f, -1.155f, 1.0f)
                arcTo(2.8f, 2.8f, 0.0f, false, true, 4.0f, 6.0f)
                curveToRelative(0.0f, -1.105f, 0.597f, -2.0f, 1.333f, -2.0f)
                curveToRelative(0.737f, 0.0f, 1.334f, 0.895f, 1.334f, 2.0f)
                curveToRelative(0.0f, 0.364f, -0.065f, 0.706f, -0.179f, 1.0f)
                moveToRelative(5.334f, 0.0f)
                curveToRelative(-0.23f, -0.598f, -0.662f, -1.0f, -1.155f, -1.0f)
                curveToRelative(-0.494f, 0.0f, -0.925f, 0.402f, -1.155f, 1.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.179f, -1.0f)
                curveToRelative(0.0f, -1.105f, 0.597f, -2.0f, 1.334f, -2.0f)
                curveTo(11.403f, 4.0f, 12.0f, 4.895f, 12.0f, 6.0f)
                curveToRelative(0.0f, 0.364f, -0.065f, 0.706f, -0.178f, 1.0f)
                moveTo(2.696f, 8.756f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.382f, -0.118f)
                curveTo(4.348f, 8.786f, 6.448f, 9.0f, 8.0f, 9.0f)
                curveToRelative(1.553f, 0.0f, 3.653f, -0.214f, 4.922f, -0.362f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.383f, 0.118f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.096f, 0.29f)
                curveToRelative(-0.09f, 0.47f, -0.242f, 0.921f, -0.445f, 1.342f)
                curveToRelative(-0.263f, 0.035f, -0.576f, 0.075f, -0.929f, 0.115f)
                arcTo(37.0f, 37.0f, 0.0f, false, true, 8.0f, 10.75f)
                curveToRelative(-1.475f, 0.0f, -2.934f, -0.123f, -4.027f, -0.247f)
                curveToRelative(-0.353f, -0.04f, -0.666f, -0.08f, -0.93f, -0.115f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 2.6f, 9.045f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.097f, -0.29f)
                close()
                moveTo(8.0f, 13.5f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, -4.256f, -2.017f)
                lineToRelative(0.116f, 0.014f)
                curveToRelative(1.115f, 0.126f, 2.615f, 0.253f, 4.14f, 0.253f)
                reflectiveCurveToRelative(3.025f, -0.127f, 4.14f, -0.253f)
                lineToRelative(0.117f, -0.014f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 8.0f, 13.5f)
            }
        }
        .build()
        return _emojiGrinFill!!
    }

private var _emojiGrinFill: ImageVector? = null
