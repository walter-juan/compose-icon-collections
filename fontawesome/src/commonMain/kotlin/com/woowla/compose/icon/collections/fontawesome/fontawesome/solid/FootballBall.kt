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

public val SolidGroup.FootballBall: ImageVector
    get() {
        if (_footballBall != null) {
            return _footballBall!!
        }
        _footballBall = Builder(name = "FootballBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.1f, 22.6f)
                curveToRelative(-89.0f, 18.0f, -150.5f, 63.4f, -190.0f, 123.9f)
                curveToRelative(-23.3f, 35.6f, -38.1f, 75.3f, -46.7f, 115.5f)
                lineTo(251.9f, 489.4f)
                curveToRelative(89.0f, -18.0f, 150.5f, -63.4f, 190.1f, -123.9f)
                curveToRelative(23.3f, -35.6f, 38.1f, -75.3f, 46.7f, -115.5f)
                lineTo(261.1f, 22.6f)
                close()
                moveTo(497.1f, 190.7f)
                curveToRelative(3.2f, -42.3f, 0.7f, -83.3f, -4.8f, -118.7f)
                curveToRelative(-4.4f, -27.8f, -26.8f, -48.0f, -53.1f, -51.6f)
                curveToRelative(-43.0f, -5.9f, -82.2f, -7.5f, -117.8f, -5.4f)
                lineTo(497.1f, 190.6f)
                close()
                moveTo(191.7f, 497.1f)
                lineTo(15.9f, 321.4f)
                curveToRelative(-3.2f, 42.3f, -0.7f, 83.3f, 4.8f, 118.7f)
                curveToRelative(4.4f, 27.8f, 26.8f, 48.0f, 53.1f, 51.6f)
                curveToRelative(43.0f, 5.9f, 82.2f, 7.5f, 117.8f, 5.4f)
                close()
                moveTo(271.5f, 143.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                close()
                moveTo(207.5f, 207.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                close()
                moveTo(143.5f, 271.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                close()
            }
        }
        .build()
        return _footballBall!!
    }

private var _footballBall: ImageVector? = null
