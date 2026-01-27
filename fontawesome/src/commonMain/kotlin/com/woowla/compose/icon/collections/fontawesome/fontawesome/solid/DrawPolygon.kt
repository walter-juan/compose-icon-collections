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

public val SolidGroup.DrawPolygon: ImageVector
    get() {
        if (_drawPolygon != null) {
            return _drawPolygon!!
        }
        _drawPolygon = Builder(name = "DrawPolygon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                lineToRelative(273.1f, 0.0f)
                curveToRelative(11.1f, -19.1f, 31.7f, -32.0f, 55.4f, -32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 34.0f, -26.5f, 61.8f, -60.0f, 63.9f)
                lineToRelative(-2.1f, 2.9f)
                lineToRelative(-71.5f, 99.1f)
                curveToRelative(3.6f, 8.0f, 5.6f, 16.9f, 5.6f, 26.2f)
                reflectiveCurveToRelative(-2.0f, 18.2f, -5.6f, 26.2f)
                lineToRelative(2.2f, 3.1f)
                lineToRelative(69.3f, 96.0f)
                lineToRelative(2.1f, 2.9f)
                curveToRelative(33.5f, 2.1f, 60.0f, 29.9f, 60.0f, 63.9f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-23.7f, 0.0f, -44.4f, -12.9f, -55.4f, -32.0f)
                lineToRelative(-273.1f, 0.0f)
                curveToRelative(-11.1f, 19.1f, -31.7f, 32.0f, -55.4f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                lineToRelative(0.0f, -273.1f)
                curveTo(12.9f, 108.4f, 0.0f, 87.7f, 0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(394.2f, 413.4f)
                lineToRelative(-65.5f, -90.6f)
                lineToRelative(-2.2f, -3.1f)
                curveToRelative(-2.1f, 0.2f, -4.3f, 0.3f, -6.5f, 0.3f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(2.2f, 0.0f, 4.4f, 0.1f, 6.5f, 0.3f)
                lineToRelative(67.7f, -93.7f)
                curveToRelative(-0.6f, -0.9f, -1.1f, -1.7f, -1.6f, -2.6f)
                lineTo(119.4f, 96.0f)
                curveToRelative(-5.6f, 9.7f, -13.7f, 17.8f, -23.4f, 23.4f)
                lineToRelative(0.0f, 273.1f)
                curveToRelative(9.7f, 5.6f, 17.8f, 13.7f, 23.4f, 23.4f)
                lineToRelative(273.1f, 0.0f)
                curveToRelative(0.5f, -0.9f, 1.1f, -1.8f, 1.6f, -2.6f)
                close()
            }
        }
        .build()
        return _drawPolygon!!
    }

private var _drawPolygon: ImageVector? = null
