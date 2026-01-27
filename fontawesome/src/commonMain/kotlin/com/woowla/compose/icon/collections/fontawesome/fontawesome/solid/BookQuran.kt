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

public val SolidGroup.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 512.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                lineTo(0.0f, 336.0f)
                curveToRelative(0.0f, 20.9f, 13.4f, 38.7f, 32.0f, 45.3f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(352.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(256.0f, 0.0f)
                close()
                moveTo(273.1f, 144.4f)
                curveToRelative(2.5f, -6.1f, 11.2f, -6.1f, 13.7f, 0.0f)
                lineToRelative(10.3f, 24.8f)
                lineToRelative(26.8f, 2.1f)
                curveToRelative(6.6f, 0.5f, 9.2f, 8.7f, 4.2f, 13.0f)
                lineTo(307.8f, 201.9f)
                lineTo(314.0f, 228.0f)
                curveToRelative(1.5f, 6.4f, -5.5f, 11.5f, -11.1f, 8.1f)
                lineToRelative(-22.9f, -14.0f)
                lineToRelative(-22.9f, 14.0f)
                curveToRelative(-5.6f, 3.4f, -12.6f, -1.6f, -11.1f, -8.1f)
                lineToRelative(6.2f, -26.1f)
                lineToRelative(-20.4f, -17.5f)
                curveToRelative(-5.0f, -4.3f, -2.3f, -12.5f, 4.2f, -13.0f)
                lineToRelative(26.8f, -2.1f)
                lineToRelative(10.3f, -24.8f)
                close()
                moveTo(100.0f, 192.0f)
                curveToRelative(0.0f, -68.5f, 55.5f, -124.0f, 124.0f, -124.0f)
                curveToRelative(23.8f, 0.0f, 46.1f, 6.7f, 65.0f, 18.4f)
                curveToRelative(4.8f, 2.9f, 6.9f, 8.8f, 5.0f, 14.1f)
                reflectiveCurveToRelative(-7.1f, 8.6f, -12.7f, 8.0f)
                curveToRelative(-3.1f, -0.3f, -6.2f, -0.5f, -9.4f, -0.5f)
                curveToRelative(-46.4f, 0.0f, -84.0f, 37.6f, -84.0f, 84.0f)
                reflectiveCurveToRelative(37.6f, 84.0f, 84.0f, 84.0f)
                curveToRelative(3.2f, 0.0f, 6.3f, -0.2f, 9.4f, -0.5f)
                curveToRelative(5.6f, -0.6f, 10.8f, 2.7f, 12.7f, 8.0f)
                reflectiveCurveToRelative(-0.3f, 11.2f, -5.0f, 14.1f)
                curveToRelative(-18.9f, 11.7f, -41.2f, 18.4f, -65.0f, 18.4f)
                curveToRelative(-68.5f, 0.0f, -124.0f, -55.5f, -124.0f, -124.0f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
