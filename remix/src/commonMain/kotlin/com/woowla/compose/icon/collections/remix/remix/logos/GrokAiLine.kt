package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GrokAiLine: ImageVector
    get() {
        if (_grokAiLine != null) {
            return _grokAiLine!!
        }
        _grokAiLine = Builder(name = "GrokAiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.775f, 2.778f)
                curveTo(12.176f, 1.295f, 7.866f, 2.033f, 4.939f, 4.961f)
                curveTo(3.058f, 6.845f, 2.039f, 9.405f, 2.024f, 12.0f)
                curveTo(2.016f, 13.288f, 2.256f, 14.583f, 2.76f, 15.81f)
                curveTo(3.895f, 18.573f, 1.999f, 21.027f, 0.124f, 23.0f)
                lineTo(6.228f, 17.54f)
                curveTo(4.848f, 16.102f, 4.0f, 14.15f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(13.317f, 4.0f, 14.56f, 4.318f, 15.656f, 4.882f)
                lineTo(17.808f, 3.888f)
                curveTo(17.266f, 3.496f, 16.572f, 3.074f, 15.775f, 2.778f)
                close()
                moveTo(21.696f, 9.733f)
                curveTo(20.709f, 5.482f, 21.636f, 3.274f, 23.9f, 0.1f)
                lineTo(8.59f, 15.472f)
                lineTo(18.199f, 8.806f)
                curveTo(18.634f, 8.485f, 19.255f, 8.611f, 19.462f, 9.11f)
                curveTo(19.809f, 10.006f, 20.0f, 10.981f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(10.697f, 20.0f, 9.466f, 19.688f, 8.379f, 19.136f)
                lineTo(5.196f, 20.145f)
                curveTo(6.833f, 21.313f, 9.836f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(21.996f, 11.236f, 21.871f, 10.476f, 21.696f, 9.733f)
                close()
            }
        }
        .build()
        return _grokAiLine!!
    }

private var _grokAiLine: ImageVector? = null
