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

public val SolidGroup.BxsCool: ImageVector
    get() {
        if (_bxsCool != null) {
            return _bxsCool!!
        }
        _bxsCool = Builder(name = "BxsCool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.095f, 16.244f)
                arcToRelative(5.982f, 5.982f, 0.0f, false, true, -3.034f, 1.634f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, -2.414f, 0.0f)
                arcToRelative(5.919f, 5.919f, 0.0f, false, true, -2.148f, -0.903f)
                arcToRelative(6.078f, 6.078f, 0.0f, false, true, -1.621f, -1.622f)
                lineToRelative(1.658f, -1.117f)
                curveToRelative(0.143f, 0.211f, 0.307f, 0.41f, 0.488f, 0.59f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, false, 1.273f, 0.86f)
                curveToRelative(0.243f, 0.102f, 0.495f, 0.181f, 0.749f, 0.232f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, false, 1.616f, 0.0f)
                curveToRelative(0.253f, -0.052f, 0.505f, -0.131f, 0.75f, -0.233f)
                curveToRelative(0.234f, -0.1f, 0.464f, -0.224f, 0.679f, -0.368f)
                curveToRelative(0.208f, -0.142f, 0.407f, -0.306f, 0.591f, -0.489f)
                curveToRelative(0.183f, -0.182f, 0.347f, -0.381f, 0.489f, -0.592f)
                lineToRelative(1.658f, 1.117f)
                curveToRelative(-0.215f, 0.32f, -0.462f, 0.62f, -0.734f, 0.891f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(7.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsCool!!
    }

private var _bxsCool: ImageVector? = null
