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

public val Twbs.EmojiAngryFill: ImageVector
    get() {
        if (_emojiAngryFill != null) {
            return _emojiAngryFill!!
        }
        _emojiAngryFill = Builder(name = "EmojiAngryFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveTo(4.053f, 4.276f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.67f, -0.223f)
                lineToRelative(2.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.166f, 0.76f)
                curveToRelative(0.071f, 0.206f, 0.111f, 0.44f, 0.111f, 0.687f)
                curveTo(7.0f, 7.328f, 6.552f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                curveToRelative(0.0f, -0.408f, 0.109f, -0.778f, 0.285f, -1.049f)
                lineToRelative(-1.009f, -0.504f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.223f, -0.67f)
                close()
                moveTo(4.285f, 12.433f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.183f, -0.683f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.0f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.898f, 2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.866f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.032f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.683f, 0.183f)
                moveTo(10.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.672f, -1.0f, -1.5f)
                curveToRelative(0.0f, -0.247f, 0.04f, -0.48f, 0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, 0.166f, -0.761f)
                lineToRelative(2.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.448f, 0.894f)
                lineToRelative(-1.009f, 0.504f)
                curveToRelative(0.176f, 0.27f, 0.285f, 0.64f, 0.285f, 1.049f)
                curveToRelative(0.0f, 0.828f, -0.448f, 1.5f, -1.0f, 1.5f)
            }
        }
        .build()
        return _emojiAngryFill!!
    }

private var _emojiAngryFill: ImageVector? = null
