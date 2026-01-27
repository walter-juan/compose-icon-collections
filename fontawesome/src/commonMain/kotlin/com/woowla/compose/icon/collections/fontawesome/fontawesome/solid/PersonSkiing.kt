package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PersonSkiing: ImageVector
    get() {
        if (_personSkiing != null) {
            return _personSkiing!!
        }
        _personSkiing = Builder(name = "PersonSkiing", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(2.7f, 300.9f)
                curveToRelative(6.1f, -11.8f, 20.6f, -16.3f, 32.4f, -10.2f)
                lineToRelative(197.8f, 102.7f)
                lineToRelative(62.3f, -87.2f)
                lineToRelative(-82.0f, -92.2f)
                curveToRelative(-11.0f, -12.4f, -16.2f, -27.5f, -16.2f, -42.4f)
                lineToRelative(111.6f, 53.4f)
                lineToRelative(42.9f, 48.2f)
                curveToRelative(14.9f, 16.7f, 16.2f, 41.6f, 3.2f, 59.8f)
                lineToRelative(-64.4f, 90.2f)
                lineToRelative(128.3f, 66.6f)
                curveToRelative(13.6f, 7.1f, 29.8f, 7.2f, 43.6f, 0.3f)
                lineToRelative(15.2f, -7.6f)
                curveToRelative(11.9f, -5.9f, 26.3f, -1.1f, 32.2f, 10.7f)
                reflectiveCurveToRelative(1.1f, 26.3f, -10.7f, 32.2f)
                lineToRelative(-15.2f, 7.6f)
                curveToRelative(-27.5f, 13.7f, -59.9f, 13.5f, -87.2f, -0.7f)
                lineTo(12.9f, 333.3f)
                curveTo(1.2f, 327.2f, -3.4f, 312.7f, 2.7f, 300.9f)
                close()
                moveTo(103.0f, 49.6f)
                lineToRelative(18.0f, 8.7f)
                lineToRelative(8.7f, -17.4f)
                curveToRelative(4.0f, -7.9f, 13.6f, -11.1f, 21.5f, -7.2f)
                reflectiveCurveToRelative(11.1f, 13.6f, 7.2f, 21.5f)
                lineToRelative(-8.5f, 17.0f)
                lineToRelative(84.8f, 41.0f)
                lineToRelative(0.4f, -0.2f)
                lineToRelative(76.1f, -33.8f)
                curveToRelative(31.3f, -13.9f, 67.9f, -0.7f, 83.2f, 29.9f)
                lineToRelative(28.9f, 57.8f)
                lineToRelative(68.7f, 27.5f)
                curveToRelative(16.4f, 6.6f, 24.4f, 25.2f, 17.8f, 41.6f)
                reflectiveCurveToRelative(-25.2f, 24.4f, -41.6f, 17.8f)
                lineTo(393.8f, 224.0f)
                curveToRelative(-10.9f, -4.4f, -19.8f, -12.6f, -25.1f, -23.1f)
                lineToRelative(-11.5f, -23.1f)
                curveToRelative(-16.4f, 9.4f, -25.9f, 14.8f, -28.5f, 16.3f)
                lineToRelative(-7.6f, -3.7f)
                lineToRelative(-185.6f, -89.6f)
                lineToRelative(-9.2f, 18.3f)
                curveToRelative(-4.0f, 7.9f, -13.6f, 11.1f, -21.5f, 7.2f)
                reflectiveCurveToRelative(-11.1f, -13.6f, -7.2f, -21.5f)
                lineToRelative(9.0f, -17.9f)
                lineToRelative(-17.6f, -8.5f)
                curveTo(81.1f, 74.6f, 77.8f, 65.0f, 81.6f, 57.0f)
                reflectiveCurveTo(95.0f, 45.7f, 103.0f, 49.6f)
                close()
            }
        }
        .build()
        return _personSkiing!!
    }

private var _personSkiing: ImageVector? = null
