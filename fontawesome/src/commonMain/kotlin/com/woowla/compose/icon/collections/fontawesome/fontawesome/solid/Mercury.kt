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

public val SolidGroup.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.0f, -4.0f)
                curveTo(106.0f, -17.8f, 85.8f, -20.0f, 72.1f, -9.0f)
                reflectiveCurveToRelative(-16.0f, 31.2f, -5.0f, 45.0f)
                curveTo(74.9f, 45.7f, 83.7f, 54.5f, 93.5f, 62.1f)
                curveTo(46.7f, 93.7f, 16.0f, 147.3f, 16.0f, 208.0f)
                curveTo(16.0f, 294.3f, 78.1f, 366.1f, 160.0f, 381.1f)
                lineToRelative(0.0f, 34.9f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -34.9f)
                curveToRelative(81.9f, -15.0f, 144.0f, -86.8f, 144.0f, -173.1f)
                curveToRelative(0.0f, -60.7f, -30.7f, -114.3f, -77.5f, -145.9f)
                curveToRelative(9.8f, -7.7f, 18.7f, -16.4f, 26.4f, -26.1f)
                curveToRelative(11.1f, -13.8f, 8.8f, -33.9f, -5.0f, -45.0f)
                reflectiveCurveTo(278.0f, -17.8f, 267.0f, -4.0f)
                curveToRelative(-17.6f, 22.0f, -44.7f, 36.0f, -75.0f, 36.0f)
                reflectiveCurveTo(134.7f, 18.0f, 117.0f, -4.0f)
                close()
                moveTo(192.0f, 320.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, -50.1f, -112.0f, -112.0f)
                reflectiveCurveTo(130.1f, 96.0f, 192.0f, 96.0f)
                reflectiveCurveTo(304.0f, 146.1f, 304.0f, 208.0f)
                curveToRelative(0.0f, 61.8f, -50.1f, 112.0f, -111.9f, 112.0f)
                lineToRelative(-0.1f, 0.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
