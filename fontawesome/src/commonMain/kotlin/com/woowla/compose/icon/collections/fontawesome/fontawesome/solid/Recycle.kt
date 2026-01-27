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

public val SolidGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.3f, 60.0f)
                curveTo(198.5f, -20.0f, 314.0f, -20.0f, 360.2f, 60.0f)
                lineToRelative(37.3f, 64.6f)
                lineToRelative(27.7f, -16.0f)
                curveToRelative(8.4f, -4.9f, 18.9f, -4.2f, 26.6f, 1.7f)
                reflectiveCurveToRelative(11.1f, 15.9f, 8.6f, 25.3f)
                lineTo(436.9f, 223.0f)
                curveToRelative(-3.4f, 12.8f, -16.6f, 20.4f, -29.4f, 17.0f)
                lineToRelative(-87.4f, -23.4f)
                curveToRelative(-9.4f, -2.5f, -16.3f, -10.4f, -17.6f, -20.0f)
                reflectiveCurveToRelative(3.4f, -19.1f, 11.8f, -23.9f)
                lineToRelative(27.7f, -16.0f)
                lineToRelative(-37.3f, -64.6f)
                curveToRelative(-21.6f, -37.3f, -75.4f, -37.3f, -97.0f, 0.0f)
                lineToRelative(-5.3f, 9.1f)
                curveToRelative(-8.8f, 15.3f, -28.4f, 20.5f, -43.7f, 11.7f)
                reflectiveCurveTo(138.2f, 84.5f, 147.0f, 69.1f)
                lineToRelative(5.3f, -9.1f)
                close()
                moveTo(449.7f, 279.1f)
                curveToRelative(15.3f, -8.8f, 34.9f, -3.6f, 43.7f, 11.7f)
                lineToRelative(5.3f, 9.1f)
                curveToRelative(46.2f, 80.0f, -11.5f, 180.0f, -103.9f, 180.0f)
                lineToRelative(-74.6f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(6.9f, -6.9f, 17.2f, -8.9f, 26.2f, -5.2f)
                reflectiveCurveToRelative(14.8f, 12.5f, 14.8f, 22.2f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(74.6f, 0.0f)
                curveToRelative(43.1f, 0.0f, 70.1f, -46.7f, 48.5f, -84.0f)
                lineToRelative(-5.3f, -9.1f)
                curveToRelative(-8.8f, -15.3f, -3.6f, -34.9f, 11.7f, -43.7f)
                close()
                moveTo(51.0f, 235.4f)
                lineToRelative(-27.7f, -16.0f)
                curveToRelative(-8.4f, -4.9f, -13.1f, -14.3f, -11.8f, -23.9f)
                reflectiveCurveToRelative(8.2f, -17.5f, 17.6f, -20.0f)
                lineTo(116.5f, 152.0f)
                curveToRelative(12.8f, -3.4f, 26.0f, 4.2f, 29.4f, 17.0f)
                lineToRelative(23.4f, 87.4f)
                curveToRelative(2.5f, 9.4f, -0.9f, 19.3f, -8.6f, 25.3f)
                reflectiveCurveToRelative(-18.2f, 6.6f, -26.6f, 1.7f)
                lineToRelative(-27.7f, -16.0f)
                lineToRelative(-37.3f, 64.6f)
                curveToRelative(-21.6f, 37.3f, 5.4f, 84.0f, 48.5f, 84.0f)
                lineToRelative(10.6f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-10.6f, 0.0f)
                curveTo(25.3f, 480.0f, -32.4f, 380.0f, 13.8f, 300.0f)
                lineTo(51.0f, 235.4f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
