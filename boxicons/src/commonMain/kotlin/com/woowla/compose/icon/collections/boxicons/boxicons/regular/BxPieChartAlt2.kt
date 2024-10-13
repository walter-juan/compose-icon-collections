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

public val RegularGroup.BxPieChartAlt2: ImageVector
    get() {
        if (_bxPieChartAlt2 != null) {
            return _bxPieChartAlt2!!
        }
        _bxPieChartAlt2 = Builder(name = "BxPieChartAlt2", defaultWidth = 24.0.dp, defaultHeight =
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
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 4.069f)
                arcTo(8.008f, 8.008f, 0.0f, false, true, 19.931f, 11.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.072f, 3.061f, -7.436f, 7.0f, -7.931f)
                lineTo(11.0f, 12.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, 0.111f, 0.438f)
                curveToRelative(0.015f, 0.03f, 0.022f, 0.063f, 0.041f, 0.093f)
                lineToRelative(4.202f, 6.723f)
                arcTo(7.949f, 7.949f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                close()
                moveTo(17.052f, 18.196f)
                lineTo(13.805f, 13.0f)
                horizontalLineToRelative(6.126f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, true, -2.879f, 5.196f)
                close()
            }
        }
        .build()
        return _bxPieChartAlt2!!
    }

private var _bxPieChartAlt2: ImageVector? = null
