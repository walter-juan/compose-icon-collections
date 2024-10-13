package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsLowVision: ImageVector
    get() {
        if (_bxsLowVision != null) {
            return _bxsLowVision!!
        }
        _bxsLowVision = Builder(name = "BxsLowVision", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.998f)
                curveToRelative(-1.836f, 0.0f, -3.356f, 0.389f, -4.617f, 0.971f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(3.315f, 3.315f)
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
                moveTo(12.043f, 7.0f)
                lineTo(12.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                arcToRelative(4.894f, 4.894f, 0.0f, false, true, -0.852f, 2.734f)
                lineToRelative(-0.721f, -0.721f)
                arcTo(3.919f, 3.919f, 0.0f, false, false, 16.0f, 11.999f)
                curveToRelative(0.0f, -0.474f, -0.099f, -0.925f, -0.255f, -1.349f)
                arcTo(0.985f, 0.985f, 0.0f, false, true, 15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.439f, 0.288f, -0.802f, 0.682f, -0.936f)
                arcTo(3.965f, 3.965f, 0.0f, false, false, 12.0f, 7.999f)
                curveToRelative(-0.735f, 0.0f, -1.419f, 0.218f, -2.015f, 0.572f)
                lineToRelative(-0.72f, -0.72f)
                curveTo(10.053f, 7.326f, 10.982f, 7.0f, 12.0f, 7.0f)
                horizontalLineToRelative(-0.043f)
                lineTo(12.0f, 6.998f)
                lineToRelative(0.043f, 0.002f)
                close()
                moveTo(4.074f, 11.999f)
                curveToRelative(0.103f, -0.235f, 0.274f, -0.586f, 0.521f, -0.989f)
                lineToRelative(5.867f, 5.867f)
                curveToRelative(-4.213f, -0.647f, -5.939f, -3.842f, -6.388f, -4.878f)
                close()
                moveTo(13.321f, 16.907f)
                lineTo(5.841f, 9.427f)
                arcToRelative(8.146f, 8.146f, 0.0f, false, true, 1.188f, -0.984f)
                lineToRelative(8.055f, 8.055f)
                arcToRelative(8.835f, 8.835f, 0.0f, false, true, -1.763f, 0.409f)
                close()
            }
        }
        .build()
        return _bxsLowVision!!
    }

private var _bxsLowVision: ImageVector? = null
