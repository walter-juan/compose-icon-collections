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

public val Twbs.Threads: ImageVector
    get() {
        if (_threads != null) {
            return _threads!!
        }
        _threads = Builder(name = "Threads", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.321f, 6.016f)
                curveToRelative(-0.27f, -0.18f, -1.166f, -0.802f, -1.166f, -0.802f)
                curveToRelative(0.756f, -1.081f, 1.753f, -1.502f, 3.132f, -1.502f)
                curveToRelative(0.975f, 0.0f, 1.803f, 0.327f, 2.394f, 0.948f)
                reflectiveCurveToRelative(0.928f, 1.509f, 1.005f, 2.644f)
                quadToRelative(0.492f, 0.207f, 0.905f, 0.484f)
                curveToRelative(1.109f, 0.745f, 1.719f, 1.86f, 1.719f, 3.137f)
                curveToRelative(0.0f, 2.716f, -2.226f, 5.075f, -6.256f, 5.075f)
                curveTo(4.594f, 16.0f, 1.0f, 13.987f, 1.0f, 7.994f)
                curveTo(1.0f, 2.034f, 4.482f, 0.0f, 8.044f, 0.0f)
                curveTo(9.69f, 0.0f, 13.55f, 0.243f, 15.0f, 5.036f)
                lineToRelative(-1.36f, 0.353f)
                curveTo(12.516f, 1.974f, 10.163f, 1.43f, 8.006f, 1.43f)
                curveToRelative(-3.565f, 0.0f, -5.582f, 2.171f, -5.582f, 6.79f)
                curveToRelative(0.0f, 4.143f, 2.254f, 6.343f, 5.63f, 6.343f)
                curveToRelative(2.777f, 0.0f, 4.847f, -1.443f, 4.847f, -3.556f)
                curveToRelative(0.0f, -1.438f, -1.208f, -2.127f, -1.27f, -2.127f)
                curveToRelative(-0.236f, 1.234f, -0.868f, 3.31f, -3.644f, 3.31f)
                curveToRelative(-1.618f, 0.0f, -3.013f, -1.118f, -3.013f, -2.582f)
                curveToRelative(0.0f, -2.09f, 1.984f, -2.847f, 3.55f, -2.847f)
                curveToRelative(0.586f, 0.0f, 1.294f, 0.04f, 1.663f, 0.114f)
                curveToRelative(0.0f, -0.637f, -0.54f, -1.728f, -1.9f, -1.728f)
                curveToRelative(-1.25f, 0.0f, -1.566f, 0.405f, -1.967f, 0.868f)
                close()
                moveTo(8.716f, 8.19f)
                curveToRelative(-2.04f, 0.0f, -2.304f, 0.87f, -2.304f, 1.416f)
                curveToRelative(0.0f, 0.878f, 1.043f, 1.168f, 1.6f, 1.168f)
                curveToRelative(1.02f, 0.0f, 2.067f, -0.282f, 2.232f, -2.423f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -1.528f, -0.161f)
            }
        }
        .build()
        return _threads!!
    }

private var _threads: ImageVector? = null
