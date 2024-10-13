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

public val RegularGroup.BxBuoy: ImageVector
    get() {
        if (_bxBuoy != null) {
            return _bxBuoy!!
        }
        _bxBuoy = Builder(name = "BxBuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.411f, 9.0f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(0.031f)
                arcTo(5.037f, 5.037f, 0.0f, false, false, 14.969f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 4.589f)
                arcTo(8.039f, 8.039f, 0.0f, false, true, 19.411f, 9.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(13.0f, 4.069f)
                verticalLineToRelative(3.032f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 4.069f)
                curveToRelative(0.328f, -0.041f, 0.66f, -0.069f, 1.0f, -0.069f)
                reflectiveCurveToRelative(0.672f, 0.028f, 1.0f, 0.069f)
                close()
                moveTo(9.0f, 4.589f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(0.031f)
                arcTo(5.037f, 5.037f, 0.0f, false, false, 8.0f, 9.031f)
                lineTo(8.0f, 9.0f)
                lineTo(4.589f, 9.0f)
                curveTo(5.402f, 7.0f, 6.999f, 5.402f, 9.0f, 4.589f)
                close()
                moveTo(4.069f, 11.0f)
                horizontalLineToRelative(3.032f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, 0.001f, 2.0f)
                lineTo(4.069f, 13.0f)
                curveTo(4.028f, 12.672f, 4.0f, 12.339f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.028f, -0.672f, 0.069f, -1.0f)
                close()
                moveTo(4.589f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-0.031f)
                curveToRelative(0.284f, 0.381f, 0.621f, 0.718f, 1.0f, 1.005f)
                verticalLineToRelative(3.437f)
                arcTo(8.039f, 8.039f, 0.0f, false, true, 4.589f, 15.0f)
                close()
                moveTo(11.0f, 19.931f)
                verticalLineToRelative(-3.032f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(3.032f)
                curveToRelative(-0.328f, 0.041f, -0.66f, 0.069f, -1.0f, 0.069f)
                reflectiveCurveToRelative(-0.672f, -0.028f, -1.0f, -0.069f)
                close()
                moveTo(15.0f, 19.411f)
                verticalLineToRelative(-3.437f)
                arcToRelative(5.038f, 5.038f, 0.0f, false, false, 1.0f, -1.005f)
                lineTo(16.0f, 15.0f)
                horizontalLineToRelative(3.411f)
                arcTo(8.039f, 8.039f, 0.0f, false, true, 15.0f, 19.411f)
                close()
                moveTo(19.931f, 13.0f)
                horizontalLineToRelative(-3.032f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, false, -0.001f, -2.0f)
                horizontalLineToRelative(3.032f)
                curveToRelative(0.042f, 0.328f, 0.07f, 0.661f, 0.07f, 1.0f)
                reflectiveCurveToRelative(-0.028f, 0.672f, -0.069f, 1.0f)
                close()
            }
        }
        .build()
        return _bxBuoy!!
    }

private var _bxBuoy: ImageVector? = null
