package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxLowVision: ImageVector
    get() {
        if (_bxLowVision != null) {
            return _bxLowVision!!
        }
        _bxLowVision = Builder(name = "BxLowVision", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.998f)
                curveToRelative(-1.836f, 0.0f, -3.356f, 0.389f, -4.617f, 0.971f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(3.315f, 3.316f)
                curveToRelative(-2.613f, 1.952f, -3.543f, 4.618f, -3.557f, 4.66f)
                lineToRelative(-0.105f, 0.316f)
                lineToRelative(0.105f, 0.316f)
                curveTo(2.073f, 12.382f, 4.367f, 19.0f, 12.0f, 19.0f)
                curveToRelative(1.835f, 0.0f, 3.354f, -0.389f, 4.615f, -0.971f)
                lineToRelative(3.678f, 3.678f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.317f, -3.317f)
                curveToRelative(2.614f, -1.952f, 3.545f, -4.618f, 3.559f, -4.66f)
                lineToRelative(0.105f, -0.316f)
                lineToRelative(-0.105f, -0.316f)
                curveToRelative(-0.022f, -0.068f, -2.316f, -6.686f, -9.949f, -6.686f)
                close()
                moveTo(4.074f, 12.0f)
                curveToRelative(0.103f, -0.236f, 0.274f, -0.586f, 0.521f, -0.989f)
                lineToRelative(5.867f, 5.867f)
                curveTo(6.249f, 16.23f, 4.523f, 13.035f, 4.074f, 12.0f)
                close()
                moveTo(13.321f, 16.907f)
                lineTo(5.841f, 9.426f)
                arcToRelative(8.138f, 8.138f, 0.0f, false, true, 1.188f, -0.982f)
                lineToRelative(8.055f, 8.054f)
                arcToRelative(8.835f, 8.835f, 0.0f, false, true, -1.763f, 0.409f)
                close()
                moveTo(16.969f, 15.555f)
                lineTo(15.428f, 14.014f)
                curveToRelative(0.354f, -0.596f, 0.572f, -1.28f, 0.572f, -2.015f)
                curveToRelative(0.0f, -0.474f, -0.099f, -0.924f, -0.255f, -1.349f)
                arcTo(0.983f, 0.983f, 0.0f, false, true, 15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.439f, 0.288f, -0.802f, 0.682f, -0.936f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 12.0f, 7.999f)
                curveToRelative(-0.735f, 0.0f, -1.419f, 0.218f, -2.015f, 0.572f)
                lineToRelative(-1.07f, -1.07f)
                arcTo(9.292f, 9.292f, 0.0f, false, true, 12.0f, 6.998f)
                curveToRelative(5.351f, 0.0f, 7.425f, 3.847f, 7.926f, 5.0f)
                arcToRelative(8.573f, 8.573f, 0.0f, false, true, -2.957f, 3.557f)
                close()
            }
        }
        .build()
        return _bxLowVision!!
    }

private var _bxLowVision: ImageVector? = null
