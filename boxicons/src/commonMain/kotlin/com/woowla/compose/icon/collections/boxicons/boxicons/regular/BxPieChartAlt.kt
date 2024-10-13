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

public val RegularGroup.BxPieChartAlt: ImageVector
    get() {
        if (_bxPieChartAlt != null) {
            return _bxPieChartAlt!!
        }
        _bxPieChartAlt = Builder(name = "BxPieChartAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, false, -7.071f, 2.929f)
                curveTo(3.04f, 6.818f, 2.0f, 9.33f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.04f, 5.182f, 2.929f, 7.071f)
                curveTo(6.818f, 20.96f, 9.33f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.182f, -1.04f, 7.071f, -2.929f)
                curveTo(20.96f, 17.182f, 22.0f, 14.67f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-1.04f, -5.182f, -2.929f, -7.071f)
                arcTo(9.936f, 9.936f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(17.657f, 17.657f)
                curveTo(16.146f, 19.168f, 14.137f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(-4.146f, -0.832f, -5.657f, -2.343f)
                curveTo(4.832f, 16.146f, 4.0f, 14.137f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.832f, -4.146f, 2.343f, -5.657f)
                arcTo(7.927f, 7.927f, 0.0f, false, true, 11.0f, 4.069f)
                lineTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(7.931f)
                arcToRelative(7.927f, 7.927f, 0.0f, false, true, -2.274f, 4.657f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 4.062f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, true, 4.657f, 2.281f)
                arcTo(7.934f, 7.934f, 0.0f, false, true, 19.938f, 11.0f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxPieChartAlt!!
    }

private var _bxPieChartAlt: ImageVector? = null
