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

public val RegularGroup.BxGlobe: ImageVector
    get() {
        if (_bxGlobe != null) {
            return _bxGlobe!!
        }
        _bxGlobe = Builder(name = "BxGlobe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.931f, 11.0f)
                horizontalLineToRelative(-2.764f)
                arcToRelative(14.67f, 14.67f, 0.0f, false, false, -1.792f, -6.243f)
                arcTo(8.013f, 8.013f, 0.0f, false, true, 19.931f, 11.0f)
                close()
                moveTo(12.53f, 4.027f)
                curveToRelative(1.035f, 1.364f, 2.427f, 3.78f, 2.627f, 6.973f)
                lineTo(9.03f, 11.0f)
                curveToRelative(0.139f, -2.596f, 0.994f, -5.028f, 2.451f, -6.974f)
                curveToRelative(0.172f, -0.01f, 0.344f, -0.026f, 0.519f, -0.026f)
                curveToRelative(0.179f, 0.0f, 0.354f, 0.016f, 0.53f, 0.027f)
                close()
                moveTo(8.688f, 4.727f)
                curveTo(7.704f, 6.618f, 7.136f, 8.762f, 7.03f, 11.0f)
                lineTo(4.069f, 11.0f)
                arcToRelative(8.013f, 8.013f, 0.0f, false, true, 4.619f, -6.273f)
                close()
                moveTo(4.069f, 13.0f)
                horizontalLineToRelative(2.974f)
                curveToRelative(0.136f, 2.379f, 0.665f, 4.478f, 1.556f, 6.23f)
                arcTo(8.01f, 8.01f, 0.0f, false, true, 4.069f, 13.0f)
                close()
                moveTo(11.45f, 19.973f)
                curveTo(10.049f, 18.275f, 9.222f, 15.896f, 9.041f, 13.0f)
                horizontalLineToRelative(6.113f)
                curveToRelative(-0.208f, 2.773f, -1.117f, 5.196f, -2.603f, 6.972f)
                curveToRelative(-0.182f, 0.012f, -0.364f, 0.028f, -0.551f, 0.028f)
                curveToRelative(-0.186f, 0.0f, -0.367f, -0.016f, -0.55f, -0.027f)
                close()
                moveTo(15.461f, 19.201f)
                curveToRelative(0.955f, -1.794f, 1.538f, -3.901f, 1.691f, -6.201f)
                horizontalLineToRelative(2.778f)
                arcToRelative(8.005f, 8.005f, 0.0f, false, true, -4.469f, 6.201f)
                close()
            }
        }
        .build()
        return _bxGlobe!!
    }

private var _bxGlobe: ImageVector? = null
