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

public val SolidGroup.Swimmer: ImageVector
    get() {
        if (_swimmer != null) {
            return _swimmer!!
        }
        _swimmer = Builder(name = "Swimmer", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.0f, 152.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 112.0f, 0.0f)
                close()
                moveTo(293.4f, 198.2f)
                lineToRelative(-88.6f, 73.9f)
                curveToRelative(1.1f, 0.0f, 2.2f, -0.1f, 3.3f, -0.1f)
                curveToRelative(33.1f, -0.2f, 66.3f, 10.2f, 94.4f, 31.4f)
                curveToRelative(22.1f, 16.6f, 29.1f, 16.6f, 51.2f, 0.0f)
                curveToRelative(27.5f, -20.7f, 59.9f, -31.2f, 92.4f, -31.4f)
                curveToRelative(4.8f, 0.0f, 9.7f, 0.2f, 14.5f, 0.6f)
                curveToRelative(-8.3f, -30.0f, -24.3f, -57.7f, -46.8f, -80.2f)
                curveToRelative(-18.4f, -18.4f, -40.6f, -32.7f, -65.0f, -41.8f)
                lineToRelative(-68.6f, -25.7f)
                curveToRelative(-27.4f, -10.3f, -58.0f, -7.5f, -83.1f, 7.6f)
                lineToRelative(-53.5f, 32.1f)
                curveToRelative(-15.2f, 9.1f, -20.1f, 28.7f, -11.0f, 43.9f)
                reflectiveCurveToRelative(28.7f, 20.1f, 43.9f, 11.0f)
                lineTo(230.0f, 187.3f)
                curveToRelative(8.4f, -5.0f, 18.6f, -5.9f, 27.7f, -2.5f)
                lineToRelative(35.7f, 13.4f)
                close()
                moveTo(403.4f, 380.1f)
                curveToRelative(21.3f, -16.1f, 49.9f, -16.1f, 71.2f, 0.0f)
                curveToRelative(19.0f, 14.4f, 41.9f, 28.2f, 67.2f, 33.3f)
                curveToRelative(26.5f, 5.4f, 54.3f, 0.8f, 80.7f, -19.1f)
                curveToRelative(10.6f, -8.0f, 12.7f, -23.0f, 4.7f, -33.6f)
                reflectiveCurveToRelative(-23.0f, -12.7f, -33.6f, -4.7f)
                curveToRelative(-14.9f, 11.2f, -28.6f, 13.1f, -42.3f, 10.3f)
                curveToRelative(-14.9f, -3.0f, -30.9f, -11.9f, -47.8f, -24.6f)
                curveToRelative(-38.4f, -29.0f, -90.5f, -29.0f, -129.0f, 0.0f)
                curveToRelative(-24.0f, 18.1f, -40.7f, 26.3f, -54.5f, 26.3f)
                reflectiveCurveToRelative(-30.5f, -8.2f, -54.5f, -26.3f)
                curveToRelative(-38.4f, -29.0f, -90.5f, -29.0f, -129.0f, 0.0f)
                curveToRelative(-21.6f, 16.3f, -41.3f, 25.8f, -58.9f, 25.7f)
                curveToRelative(-9.6f, -0.1f, -19.9f, -3.0f, -31.2f, -11.5f)
                curveToRelative(-10.6f, -8.0f, -25.6f, -5.9f, -33.6f, 4.7f)
                reflectiveCurveTo(7.0f, 386.3f, 17.6f, 394.3f)
                curveToRelative(19.1f, 14.4f, 39.4f, 21.0f, 59.8f, 21.1f)
                curveToRelative(33.9f, 0.2f, 64.3f, -17.4f, 88.1f, -35.3f)
                curveToRelative(21.3f, -16.1f, 49.9f, -16.1f, 71.2f, 0.0f)
                curveToRelative(24.2f, 18.3f, 52.3f, 35.9f, 83.4f, 35.9f)
                reflectiveCurveToRelative(59.1f, -17.7f, 83.4f, -35.9f)
                close()
            }
        }
        .build()
        return _swimmer!!
    }

private var _swimmer: ImageVector? = null
