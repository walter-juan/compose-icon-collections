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

public val RegularGroup.BxData: ImageVector
    get() {
        if (_bxData != null) {
            return _bxData!!
        }
        _bxData = Builder(name = "BxData", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -2.168f, -3.663f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveTo(4.0f, 4.832f, 4.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.168f, 3.663f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.832f, 8.0f, -4.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(3.691f, 0.0f, 5.931f, 1.507f, 6.0f, 1.994f)
                curveTo(17.931f, 7.493f, 15.691f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.069f, 7.493f, 6.0f, 7.006f)
                curveTo(6.069f, 6.507f, 8.309f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(6.0f, 9.607f)
                curveTo(7.479f, 10.454f, 9.637f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(4.521f, -0.546f, 6.0f, -1.393f)
                verticalLineToRelative(2.387f)
                curveToRelative(-0.069f, 0.499f, -2.309f, 2.006f, -6.0f, 2.006f)
                reflectiveCurveToRelative(-5.931f, -1.507f, -6.0f, -2.0f)
                verticalLineTo(9.607f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineToRelative(-2.393f)
                curveTo(7.479f, 15.454f, 9.637f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(4.521f, -0.546f, 6.0f, -1.393f)
                verticalLineToRelative(2.387f)
                curveToRelative(-0.069f, 0.499f, -2.309f, 2.006f, -6.0f, 2.006f)
                reflectiveCurveToRelative(-5.931f, -1.507f, -6.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxData!!
    }

private var _bxData: ImageVector? = null
