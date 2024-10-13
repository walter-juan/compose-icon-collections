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

public val SolidGroup.BxsCookie: ImageVector
    get() {
        if (_bxsCookie != null) {
            return _bxsCookie!!
        }
        _bxsCookie = Builder(name = "BxsCookie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.598f, 11.064f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.854f, -0.172f)
                arcTo(2.938f, 2.938f, 0.0f, false, true, 20.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.003f, -2.938f)
                curveToRelative(0.005f, -0.034f, 0.016f, -0.134f, 0.017f, -0.168f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.254f, -1.006f)
                arcTo(3.002f, 3.002f, 0.0f, false, true, 15.0f, 7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.217f, 0.031f, -0.444f, 0.099f, -0.716f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.067f, -1.236f)
                arcTo(9.956f, 9.956f, 0.0f, false, false, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -0.049f, -0.003f, -0.097f, -0.007f, -0.16f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.395f, -0.776f)
                close()
                moveTo(8.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(6.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(9.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(12.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(15.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsCookie!!
    }

private var _bxsCookie: ImageVector? = null
