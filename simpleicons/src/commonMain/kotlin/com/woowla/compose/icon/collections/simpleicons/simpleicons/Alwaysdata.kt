package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Alwaysdata: ImageVector
    get() {
        if (_alwaysdata != null) {
            return _alwaysdata!!
        }
        _alwaysdata = Builder(name = "Alwaysdata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.054f, 15.254f)
                curveToRelative(1.262f, 1.263f, 1.262f, 3.311f, 0.0f, 4.573f)
                curveToRelative(-1.262f, 1.262f, -3.307f, 1.261f, -4.569f, -0.002f)
                curveToRelative(-0.96f, -0.96f, -1.187f, -2.371f, -0.688f, -3.548f)
                lineTo(12.97f, 8.947f)
                arcToRelative(2.903f, 2.903f, 0.0f, false, true, -0.765f, -0.007f)
                lineToRelative(-4.607f, 6.201f)
                curveToRelative(0.257f, 0.753f, 0.094f, 1.618f, -0.507f, 2.218f)
                curveToRelative(-0.84f, 0.841f, -2.206f, 0.84f, -3.047f, -0.002f)
                curveToRelative(-0.653f, -0.653f, -0.792f, -1.622f, -0.428f, -2.416f)
                lineToRelative(-2.003f, -2.934f)
                curveToRelative(-0.058f, 0.007f, -0.116f, 0.018f, -0.177f, 0.018f)
                curveToRelative(-0.792f, 0.0f, -1.436f, -0.642f, -1.436f, -1.436f)
                curveToRelative(0.0f, -0.793f, 0.644f, -1.436f, 1.436f, -1.436f)
                curveToRelative(0.794f, 0.0f, 1.436f, 0.643f, 1.436f, 1.436f)
                curveToRelative(0.0f, 0.252f, -0.07f, 0.485f, -0.184f, 0.69f)
                lineToRelative(2.073f, 2.554f)
                curveToRelative(0.516f, -0.21f, 1.069f, -0.191f, 1.549f, -0.013f)
                lineToRelative(3.857f, -6.212f)
                curveToRelative(-0.686f, -1.107f, -0.552f, -2.578f, 0.41f, -3.54f)
                curveToRelative(1.122f, -1.122f, 2.941f, -1.122f, 4.061f, -0.001f)
                curveToRelative(0.879f, 0.879f, 1.067f, 2.188f, 0.568f, 3.254f)
                lineToRelative(5.24f, 7.004f)
                curveToRelative(0.931f, -0.094f, 1.895f, 0.215f, 2.608f, 0.928f)
                close()
            }
        }
        .build()
        return _alwaysdata!!
    }

private var _alwaysdata: ImageVector? = null
