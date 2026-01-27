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

public val SolidGroup.ColonSign: ImageVector
    get() {
        if (_colonSign != null) {
            return _colonSign!!
        }
        _colonSign = Builder(name = "ColonSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.8f, 8.7f)
                curveToRelative(12.9f, 3.2f, 20.7f, 16.2f, 17.5f, 29.1f)
                lineToRelative(-4.6f, 18.5f)
                curveToRelative(15.4f, 0.8f, 30.4f, 3.4f, 44.7f, 7.5f)
                lineToRelative(9.4f, -37.6f)
                curveTo(283.9f, 13.3f, 297.0f, 5.5f, 309.8f, 8.7f)
                reflectiveCurveTo(330.5f, 25.0f, 327.3f, 37.8f)
                lineTo(316.0f, 82.8f)
                curveToRelative(13.5f, 7.8f, 26.0f, 17.1f, 37.2f, 27.8f)
                curveToRelative(12.9f, 12.1f, 13.4f, 32.4f, 1.3f, 45.2f)
                reflectiveCurveToRelative(-32.4f, 13.4f, -45.2f, 1.3f)
                curveToRelative(-3.1f, -2.9f, -6.4f, -5.8f, -9.8f, -8.4f)
                lineTo(239.2f, 390.0f)
                curveToRelative(26.9f, -4.6f, 51.1f, -17.1f, 70.1f, -35.1f)
                curveToRelative(12.9f, -12.1f, 33.1f, -11.5f, 45.2f, 1.3f)
                reflectiveCurveToRelative(11.5f, 33.1f, -1.3f, 45.2f)
                curveToRelative(-34.3f, 32.3f, -80.0f, 52.8f, -130.5f, 54.4f)
                lineToRelative(-7.5f, 29.9f)
                curveToRelative(-3.2f, 12.9f, -16.2f, 20.7f, -29.1f, 17.5f)
                reflectiveCurveToRelative(-20.7f, -16.2f, -17.5f, -29.1f)
                lineToRelative(5.6f, -22.5f)
                curveToRelative(-15.0f, -3.2f, -29.4f, -8.0f, -42.9f, -14.4f)
                lineToRelative(-12.1f, 48.5f)
                curveToRelative(-3.2f, 12.9f, -16.2f, 20.7f, -29.1f, 17.5f)
                reflectiveCurveTo(69.5f, 487.0f, 72.7f, 474.2f)
                lineToRelative(16.0f, -63.9f)
                curveTo(44.3f, 373.6f, 16.0f, 318.1f, 16.0f, 256.0f)
                curveTo(16.0f, 159.2f, 84.8f, 78.4f, 176.3f, 60.0f)
                lineToRelative(8.4f, -33.8f)
                curveTo(187.9f, 13.3f, 201.0f, 5.5f, 213.8f, 8.7f)
                close()
                moveTo(158.0f, 132.9f)
                curveToRelative(-46.1f, 21.8f, -78.0f, 68.7f, -78.0f, 123.1f)
                curveToRelative(0.0f, 30.5f, 10.0f, 58.6f, 26.9f, 81.3f)
                lineTo(158.0f, 132.9f)
                close()
                moveTo(147.4f, 373.4f)
                curveToRelative(13.0f, 7.6f, 27.3f, 13.1f, 42.5f, 16.1f)
                lineToRelative(65.9f, -263.6f)
                curveToRelative(-12.6f, -3.8f, -25.9f, -5.9f, -39.8f, -5.9f)
                curveToRelative(-1.8f, 0.0f, -3.5f, 0.0f, -5.3f, 0.1f)
                lineTo(147.4f, 373.4f)
                close()
            }
        }
        .build()
        return _colonSign!!
    }

private var _colonSign: ImageVector? = null
