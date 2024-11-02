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

public val Simpleicons.Tldraw: ImageVector
    get() {
        if (_tldraw != null) {
            return _tldraw!!
        }
        _tldraw = Builder(name = "Tldraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.474f, 0.0f)
                lineTo(2.526f, 0.0f)
                curveTo(1.131f, 0.0f, 0.0f, 1.18f, 0.0f, 2.637f)
                verticalLineToRelative(18.726f)
                curveTo(0.0f, 22.819f, 1.131f, 24.0f, 2.526f, 24.0f)
                horizontalLineToRelative(18.948f)
                curveTo(22.869f, 24.0f, 24.0f, 22.82f, 24.0f, 21.363f)
                lineTo(24.0f, 2.637f)
                curveTo(24.0f, 1.181f, 22.869f, 0.0f, 21.474f, 0.0f)
                close()
                moveTo(10.464f, 5.388f)
                curveToRelative(0.397f, -0.405f, 0.888f, -0.607f, 1.474f, -0.607f)
                curveToRelative(0.57f, 0.0f, 1.052f, 0.202f, 1.448f, 0.607f)
                curveToRelative(0.397f, 0.404f, 0.595f, 0.896f, 0.595f, 1.476f)
                reflectiveCurveToRelative(-0.198f, 1.072f, -0.595f, 1.476f)
                curveToRelative(-0.396f, 0.405f, -0.879f, 0.607f, -1.448f, 0.607f)
                curveToRelative(-0.586f, 0.0f, -1.077f, -0.202f, -1.474f, -0.607f)
                curveToRelative(-0.396f, -0.404f, -0.594f, -0.896f, -0.594f, -1.476f)
                reflectiveCurveToRelative(0.198f, -1.072f, 0.594f, -1.476f)
                close()
                moveTo(13.594f, 16.878f)
                arcToRelative(4.887f, 4.887f, 0.0f, false, true, -2.018f, 2.136f)
                curveToRelative(-0.483f, 0.281f, -0.879f, 0.273f, -1.19f, -0.026f)
                curveToRelative(-0.292f, -0.281f, -0.206f, -0.615f, 0.26f, -1.002f)
                curveToRelative(0.258f, -0.193f, 0.473f, -0.44f, 0.646f, -0.738f)
                curveToRelative(0.172f, -0.299f, 0.284f, -0.607f, 0.336f, -0.923f)
                curveToRelative(0.017f, -0.14f, -0.043f, -0.21f, -0.181f, -0.21f)
                curveToRelative(-0.345f, -0.018f, -0.698f, -0.212f, -1.06f, -0.581f)
                curveToRelative(-0.362f, -0.37f, -0.543f, -0.826f, -0.543f, -1.37f)
                curveToRelative(0.0f, -0.58f, 0.198f, -1.073f, 0.594f, -1.477f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, true, 1.5f, -0.633f)
                curveToRelative(0.552f, 0.0f, 1.034f, 0.21f, 1.448f, 0.633f)
                curveToRelative(0.414f, 0.404f, 0.655f, 0.86f, 0.724f, 1.37f)
                curveToRelative(0.138f, 0.95f, -0.034f, 1.89f, -0.517f, 2.822f)
                close()
            }
        }
        .build()
        return _tldraw!!
    }

private var _tldraw: ImageVector? = null
