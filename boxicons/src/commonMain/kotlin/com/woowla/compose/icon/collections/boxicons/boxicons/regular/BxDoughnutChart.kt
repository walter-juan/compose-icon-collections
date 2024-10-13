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

public val RegularGroup.BxDoughnutChart: ImageVector
    get() {
        if (_bxDoughnutChart != null) {
            return _bxDoughnutChart!!
        }
        _bxDoughnutChart = Builder(name = "BxDoughnutChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineToRelative(-3.032f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 13.0f, 7.102f)
                lineTo(13.0f, 4.069f)
                arcTo(8.008f, 8.008f, 0.0f, false, true, 19.931f, 11.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.072f, 3.061f, -7.436f, 7.0f, -7.931f)
                verticalLineToRelative(3.032f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 7.0f, 12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 4.898f, -4.0f)
                horizontalLineToRelative(3.032f)
                curveToRelative(-0.494f, 3.939f, -3.858f, 7.0f, -7.93f, 7.0f)
                close()
            }
        }
        .build()
        return _bxDoughnutChart!!
    }

private var _bxDoughnutChart: ImageVector? = null
