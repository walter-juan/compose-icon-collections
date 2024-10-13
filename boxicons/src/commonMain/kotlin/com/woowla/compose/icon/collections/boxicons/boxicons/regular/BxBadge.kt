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

public val RegularGroup.BxBadge: ImageVector
    get() {
        if (_bxBadge != null) {
            return _bxBadge!!
        }
        _bxBadge = Builder(name = "BxBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.965f, 8.521f)
                curveTo(19.988f, 8.347f, 20.0f, 8.173f, 20.0f, 8.0f)
                curveToRelative(0.0f, -2.378f, -2.143f, -4.288f, -4.521f, -3.964f)
                curveTo(14.786f, 2.802f, 13.466f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-2.786f, 0.802f, -3.479f, 2.036f)
                curveTo(6.138f, 3.712f, 4.0f, 5.622f, 4.0f, 8.0f)
                curveToRelative(0.0f, 0.173f, 0.012f, 0.347f, 0.035f, 0.521f)
                curveTo(2.802f, 9.214f, 2.0f, 10.535f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.802f, 2.786f, 2.035f, 3.479f)
                arcTo(3.976f, 3.976f, 0.0f, false, false, 4.0f, 16.0f)
                curveToRelative(0.0f, 2.378f, 2.138f, 4.284f, 4.521f, 3.964f)
                curveTo(9.214f, 21.198f, 10.534f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(2.786f, -0.802f, 3.479f, -2.036f)
                curveTo(17.857f, 20.284f, 20.0f, 18.378f, 20.0f, 16.0f)
                curveToRelative(0.0f, -0.173f, -0.012f, -0.347f, -0.035f, -0.521f)
                curveTo(21.198f, 14.786f, 22.0f, 13.465f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-0.802f, -2.786f, -2.035f, -3.479f)
                close()
                moveTo(18.523f, 13.924f)
                lineTo(17.421f, 14.217f)
                lineTo(17.855f, 15.27f)
                curveToRelative(0.095f, 0.23f, 0.145f, 0.483f, 0.145f, 0.73f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.247f, 0.0f, -0.499f, -0.05f, -0.73f, -0.145f)
                lineToRelative(-1.054f, -0.434f)
                lineToRelative(-0.293f, 1.102f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, -3.846f, 0.0f)
                lineToRelative(-0.293f, -1.102f)
                lineToRelative(-1.054f, 0.434f)
                arcTo(1.935f, 1.935f, 0.0f, false, true, 8.0f, 18.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.247f, 0.05f, -0.5f, 0.145f, -0.73f)
                lineToRelative(0.434f, -1.053f)
                lineToRelative(-1.102f, -0.293f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.0f, -3.848f)
                lineToRelative(1.102f, -0.293f)
                lineToRelative(-0.434f, -1.053f)
                arcTo(1.932f, 1.932f, 0.0f, false, true, 6.0f, 8.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.247f, 0.0f, 0.499f, 0.05f, 0.73f, 0.145f)
                lineToRelative(1.054f, 0.434f)
                lineToRelative(0.293f, -1.102f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 3.846f, 0.0f)
                lineToRelative(0.293f, 1.102f)
                lineToRelative(1.054f, -0.434f)
                curveTo(15.501f, 6.05f, 15.753f, 6.0f, 16.0f, 6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.247f, -0.05f, 0.5f, -0.145f, 0.73f)
                lineToRelative(-0.434f, 1.053f)
                lineToRelative(1.102f, 0.293f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.0f, 3.848f)
                close()
            }
        }
        .build()
        return _bxBadge!!
    }

private var _bxBadge: ImageVector? = null
