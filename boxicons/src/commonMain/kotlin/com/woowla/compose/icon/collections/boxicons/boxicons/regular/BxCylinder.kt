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

public val RegularGroup.BxCylinder: ImageVector
    get() {
        if (_bxCylinder != null) {
            return _bxCylinder!!
        }
        _bxCylinder = Builder(name = "BxCylinder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.131f, 0.0f, 9.0f, -1.935f, 9.0f, -4.5f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-0.053f)
                curveToRelative(0.033f, -0.164f, 0.053f, -0.33f, 0.053f, -0.5f)
                curveTo(21.0f, 3.935f, 17.131f, 2.0f, 12.0f, 2.0f)
                curveTo(7.209f, 2.0f, 3.52f, 3.688f, 3.053f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 2.565f, 3.869f, 4.5f, 9.0f, 4.5f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.273f, 0.0f, -7.0f, -1.48f, -7.0f, -2.5f)
                lineTo(5.0f, 9.394f)
                curveTo(6.623f, 10.387f, 9.111f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(5.377f, -0.613f, 7.0f, -1.606f)
                lineTo(19.0f, 17.5f)
                curveToRelative(0.0f, 1.02f, -2.727f, 2.5f, -7.0f, 2.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.273f, 0.0f, 7.0f, 1.48f, 7.0f, 2.5f)
                reflectiveCurveTo(16.273f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(5.0f, 7.52f, 5.0f, 6.5f)
                reflectiveCurveTo(7.727f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxCylinder!!
    }

private var _bxCylinder: ImageVector? = null
