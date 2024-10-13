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

public val SolidGroup.BxsPieChartAlt2: ImageVector
    get() {
        if (_bxsPieChartAlt2 != null) {
            return _bxsPieChartAlt2!!
        }
        _bxsPieChartAlt2 = Builder(name = "BxsPieChartAlt2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.051f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(8.949f)
                curveToRelative(-0.47f, -4.717f, -4.232f, -8.479f, -8.949f, -8.949f)
                close()
                moveTo(17.969f, 20.004f)
                curveToRelative(2.189f, -1.637f, 3.694f, -4.14f, 3.98f, -7.004f)
                horizontalLineToRelative(-8.183f)
                lineToRelative(4.203f, 7.004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                verticalLineTo(2.051f)
                curveTo(5.954f, 2.555f, 2.0f, 6.824f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 4.255f, -0.964f)
                reflectiveCurveToRelative(-5.253f, -8.915f, -5.254f, -9.031f)
                arcTo(0.02f, 0.02f, 0.0f, false, false, 11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bxsPieChartAlt2!!
    }

private var _bxsPieChartAlt2: ImageVector? = null
