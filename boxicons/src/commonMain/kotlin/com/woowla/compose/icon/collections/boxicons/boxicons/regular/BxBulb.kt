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

public val RegularGroup.BxBulb: ImageVector
    get() {
        if (_bxBulb != null) {
            return _bxBulb!!
        }
        _bxBulb = Builder(name = "BxBulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 22.0f)
                close()
                moveTo(16.906f, 13.712f)
                curveTo(17.936f, 12.506f, 19.0f, 11.259f, 19.0f, 9.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(5.0f, 5.141f, 5.0f, 9.0f)
                curveToRelative(0.0f, 2.285f, 1.067f, 3.528f, 2.101f, 4.73f)
                curveToRelative(0.358f, 0.418f, 0.729f, 0.851f, 1.084f, 1.349f)
                curveToRelative(0.144f, 0.206f, 0.38f, 0.996f, 0.591f, 1.921f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.774f)
                curveToRelative(0.213f, -0.927f, 0.45f, -1.719f, 0.593f, -1.925f)
                curveToRelative(0.352f, -0.503f, 0.726f, -0.94f, 1.087f, -1.363f)
                close()
                moveTo(14.182f, 13.925f)
                curveToRelative(-0.434f, 0.617f, -0.796f, 2.075f, -1.006f, 3.075f)
                horizontalLineToRelative(-2.351f)
                curveToRelative(-0.209f, -1.002f, -0.572f, -2.463f, -1.011f, -3.08f)
                arcToRelative(20.502f, 20.502f, 0.0f, false, false, -1.196f, -1.492f)
                curveTo(7.644f, 11.294f, 7.0f, 10.544f, 7.0f, 9.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.521f, -0.643f, 2.274f, -1.615f, 3.413f)
                curveToRelative(-0.373f, 0.438f, -0.796f, 0.933f, -1.203f, 1.512f)
                close()
            }
        }
        .build()
        return _bxBulb!!
    }

private var _bxBulb: ImageVector? = null
