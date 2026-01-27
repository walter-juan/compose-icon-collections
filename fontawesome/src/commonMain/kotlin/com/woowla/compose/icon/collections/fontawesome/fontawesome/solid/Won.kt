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

public val SolidGroup.Won: ImageVector
    get() {
        if (_won != null) {
            return _won!!
        }
        _won = Builder(name = "Won", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.4f, 53.9f)
                curveTo(56.8f, 37.1f, 38.7f, 28.1f, 21.9f, 33.6f)
                reflectiveCurveTo(-3.9f, 57.4f, 1.7f, 74.1f)
                lineTo(56.9f, 240.0f)
                lineTo(32.0f, 240.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(40.9f, 0.0f)
                lineToRelative(56.7f, 170.1f)
                curveToRelative(4.5f, 13.5f, 17.4f, 22.4f, 31.6f, 21.9f)
                reflectiveCurveToRelative(26.4f, -10.4f, 29.8f, -24.2f)
                lineTo(233.0f, 288.0f)
                lineTo(279.0f, 288.0f)
                lineTo(321.0f, 455.8f)
                curveToRelative(3.4f, 13.8f, 15.6f, 23.7f, 29.8f, 24.2f)
                reflectiveCurveToRelative(27.1f, -8.4f, 31.6f, -21.9f)
                lineTo(439.1f, 288.0f)
                lineTo(480.0f, 288.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-24.9f, 0.0f)
                lineToRelative(55.3f, -165.9f)
                curveToRelative(5.6f, -16.8f, -3.5f, -34.9f, -20.2f, -40.5f)
                reflectiveCurveToRelative(-34.9f, 3.5f, -40.5f, 20.2f)
                lineToRelative(-62.0f, 186.1f)
                lineToRelative(-54.6f, 0.0f)
                lineToRelative(-45.9f, -183.8f)
                curveTo(283.5f, 42.0f, 270.7f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(-27.5f, 10.0f, -31.0f, 24.2f)
                lineTo(179.0f, 240.0f)
                lineTo(124.4f, 240.0f)
                lineTo(62.4f, 53.9f)
                close()
                moveTo(140.4f, 288.0f)
                lineToRelative(26.6f, 0.0f)
                lineToRelative(-11.4f, 45.6f)
                lineToRelative(-15.2f, -45.6f)
                close()
                moveTo(245.0f, 240.0f)
                lineToRelative(11.0f, -44.1f)
                lineToRelative(11.0f, 44.1f)
                lineToRelative(-22.0f, 0.0f)
                close()
                moveTo(345.0f, 288.0f)
                lineToRelative(26.6f, 0.0f)
                lineToRelative(-15.2f, 45.6f)
                lineToRelative(-11.4f, -45.6f)
                close()
            }
        }
        .build()
        return _won!!
    }

private var _won: ImageVector? = null
