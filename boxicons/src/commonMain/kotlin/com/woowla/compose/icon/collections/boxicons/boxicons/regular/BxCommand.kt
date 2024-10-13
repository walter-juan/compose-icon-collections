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

public val RegularGroup.BxCommand: ImageVector
    get() {
        if (_bxCommand != null) {
            return _bxCommand!!
        }
        _bxCommand = Builder(name = "BxCommand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                arcToRelative(4.003f, 4.003f, 0.0f, false, false, 3.998f, -3.98f)
                lineTo(10.0f, 18.02f)
                lineTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.039f)
                horizontalLineToRelative(0.004f)
                arcTo(4.002f, 4.002f, 0.0f, false, false, 18.0f, 22.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 5.98f)
                horizontalLineToRelative(-0.002f)
                arcTo(4.003f, 4.003f, 0.0f, false, false, 6.0f, 2.0f)
                curveTo(3.794f, 2.0f, 2.0f, 3.794f, 2.0f, 6.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(8.0f, 18.0f)
                curveToRelative(0.0f, 1.122f, -0.879f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.878f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.879f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 16.0f)
                curveToRelative(1.121f, 0.0f, 2.0f, 0.878f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.879f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.878f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveToRelative(0.0f, -1.122f, 0.879f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.878f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.879f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(-1.121f, 0.0f, -2.0f, -0.878f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.879f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.878f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxCommand!!
    }

private var _bxCommand: ImageVector? = null
