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

public val SolidGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(292.9f, 384.0f)
                curveToRelative(7.3f, -22.3f, 21.9f, -42.5f, 38.4f, -59.9f)
                curveToRelative(32.7f, -34.4f, 52.7f, -80.9f, 52.7f, -132.1f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(0.0f, 86.0f, 0.0f, 192.0f)
                curveToRelative(0.0f, 51.2f, 20.0f, 97.7f, 52.7f, 132.1f)
                curveToRelative(16.5f, 17.4f, 31.2f, 37.6f, 38.4f, 59.9f)
                lineToRelative(201.7f, 0.0f)
                close()
                moveTo(288.0f, 432.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                lineToRelative(0.0f, -16.0f)
                close()
                moveTo(184.0f, 112.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -66.3f, 53.7f, -120.0f, 120.0f, -120.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
