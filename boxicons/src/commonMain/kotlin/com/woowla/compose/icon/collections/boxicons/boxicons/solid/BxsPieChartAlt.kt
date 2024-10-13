package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPieChartAlt: ImageVector
    get() {
        if (_bxsPieChartAlt != null) {
            return _bxsPieChartAlt!!
        }
        _bxsPieChartAlt = Builder(name = "BxsPieChartAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 4.929f)
                arcTo(9.97f, 9.97f, 0.0f, false, false, 12.0f, 2.0f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, false, -7.071f, 2.929f)
                curveTo(3.04f, 6.818f, 2.0f, 9.33f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.04f, 5.182f, 2.929f, 7.071f)
                curveTo(6.818f, 20.96f, 9.33f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.182f, -1.04f, 7.071f, -2.929f)
                arcTo(9.936f, 9.936f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, false, -2.929f, -7.071f)
                close()
                moveTo(17.657f, 17.657f)
                curveTo(16.146f, 19.168f, 14.137f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(-4.146f, -0.832f, -5.657f, -2.343f)
                curveTo(4.832f, 16.146f, 4.0f, 14.137f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.832f, -4.146f, 2.343f, -5.657f)
                arcTo(7.948f, 7.948f, 0.0f, false, true, 12.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(7.948f, 7.948f, 0.0f, false, true, -2.343f, 5.657f)
                close()
            }
        }
        .build()
        return _bxsPieChartAlt!!
    }

private var _bxsPieChartAlt: ImageVector? = null
