package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Duolingo: ImageVector
    get() {
        if (_duolingo != null) {
            return _duolingo!!
        }
        _duolingo = Builder(name = "Duolingo", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.3f, 230.5f)
                curveToRelative(10.4f, 88.5f, -43.4f, 172.1f, -128.2f, 199.0f)
                reflectiveCurveToRelative(-176.6f, -10.3f, -218.9f, -88.7f)
                curveToRelative(-72.0f, 3.0f, -137.4f, -39.8f, -163.2f, -105.5f)
                curveToRelative(-2.6f, -6.6f, -1.9f, -14.0f, 1.9f, -19.9f)
                reflectiveCurveToRelative(10.2f, -9.7f, 17.2f, -10.1f)
                lineToRelative(96.1f, -6.0f)
                lineToRelative(-23.8f, -75.9f)
                curveToRelative(-6.3f, -20.0f, -2.2f, -41.9f, 11.0f, -58.3f)
                reflectiveCurveToRelative(33.7f, -25.0f, 54.5f, -23.0f)
                curveToRelative(52.2f, 5.0f, 86.8f, 4.8f, 104.0f, -0.6f)
                reflectiveCurveTo(300.0f, 16.7f, 339.0f, -16.9f)
                curveToRelative(15.9f, -13.7f, 37.7f, -18.5f, 57.8f, -12.7f)
                reflectiveCurveToRelative(36.1f, 21.3f, 42.4f, 41.4f)
                lineTo(462.8f, 87.0f)
                lineTo(543.6f, 37.3f)
                curveToRelative(6.0f, -3.7f, 13.4f, -4.3f, 19.9f, -1.6f)
                reflectiveCurveToRelative(11.3f, 8.3f, 12.9f, 15.2f)
                curveToRelative(16.2f, 68.2f, -12.4f, 140.3f, -72.1f, 179.5f)
                close()
                moveTo(258.5f, 475.9f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(15.1f, 7.5f, 21.5f, 25.8f, 14.2f, 41.0f)
                reflectiveCurveToRelative(-25.4f, 21.9f, -40.7f, 14.9f)
                lineToRelative(-43.9f, -21.0f)
                curveToRelative(-15.1f, -7.5f, -21.5f, -25.8f, -14.2f, -41.0f)
                reflectiveCurveToRelative(25.4f, -21.9f, 40.7f, -14.9f)
                lineToRelative(43.8f, 21.0f)
                close()
                moveTo(564.6f, 345.7f)
                curveToRelative(14.8f, 8.4f, 20.0f, 27.3f, 11.6f, 42.2f)
                lineToRelative(-23.9f, 42.4f)
                curveToRelative(-8.7f, 14.3f, -27.1f, 19.2f, -41.6f, 10.9f)
                reflectiveCurveToRelative(-19.9f, -26.6f, -12.0f, -41.4f)
                lineToRelative(23.9f, -42.4f)
                curveToRelative(4.0f, -7.1f, 10.7f, -12.4f, 18.6f, -14.6f)
                reflectiveCurveToRelative(16.3f, -1.2f, 23.4f, 2.9f)
                close()
            }
        }
        .build()
        return _duolingo!!
    }

private var _duolingo: ImageVector? = null
