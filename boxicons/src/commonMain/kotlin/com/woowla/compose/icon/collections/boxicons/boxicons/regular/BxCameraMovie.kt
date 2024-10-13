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

public val RegularGroup.BxCameraMovie: ImageVector
    get() {
        if (_bxCameraMovie != null) {
            return _bxCameraMovie!!
        }
        _bxCameraMovie = Builder(name = "BxCameraMovie", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                curveToRelative(0.0f, -0.959f, -0.68f, -1.761f, -1.581f, -1.954f)
                curveTo(16.779f, 8.445f, 17.0f, 7.75f, 17.0f, 7.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.517f, 0.0f, -2.821f, 0.857f, -3.5f, 2.104f)
                curveTo(8.821f, 3.857f, 7.517f, 3.0f, 6.0f, 3.0f)
                curveTo(3.794f, 3.0f, 2.0f, 4.794f, 2.0f, 7.0f)
                curveToRelative(0.0f, 0.902f, 0.312f, 1.727f, 0.817f, 2.396f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 2.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.638f)
                lineToRelative(4.0f, 2.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-4.0f, 2.0f)
                lineTo(18.0f, 11.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(0.002f, 8.0f)
                lineTo(4.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bxCameraMovie!!
    }

private var _bxCameraMovie: ImageVector? = null
