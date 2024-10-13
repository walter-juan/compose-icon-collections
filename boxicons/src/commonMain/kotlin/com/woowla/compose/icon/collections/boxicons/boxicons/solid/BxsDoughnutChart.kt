package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsDoughnutChart: ImageVector
    get() {
        if (_bxsDoughnutChart != null) {
            return _bxsDoughnutChart!!
        }
        _bxsDoughnutChart = Builder(name = "BxsDoughnutChart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                curveToRelative(2.507f, 0.423f, 4.577f, 2.493f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(-0.471f, -4.717f, -4.283f, -8.529f, -9.0f, -9.0f)
                verticalLineToRelative(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-0.478f, 2.833f, -2.982f, 4.949f, -5.949f, 4.949f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveTo(6.051f, 8.982f, 8.167f, 6.478f, 11.0f, 6.0f)
                verticalLineTo(2.0f)
                curveToRelative(-5.046f, 0.504f, -8.949f, 4.773f, -8.949f, 9.949f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.176f, 0.0f, 9.445f, -3.903f, 9.949f, -8.949f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxsDoughnutChart!!
    }

private var _bxsDoughnutChart: ImageVector? = null
