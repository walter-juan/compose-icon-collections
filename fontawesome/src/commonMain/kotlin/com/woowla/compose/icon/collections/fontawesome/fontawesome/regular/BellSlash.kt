package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(542.6f, 400.0f)
                curveToRelative(2.7f, -7.8f, 1.3f, -16.5f, -3.9f, -23.0f)
                lineToRelative(-14.9f, -18.6f)
                curveTo(495.5f, 322.9f, 480.0f, 278.8f, 480.0f, 233.4f)
                lineToRelative(0.0f, -33.4f)
                curveToRelative(0.0f, -75.8f, -55.5f, -138.6f, -128.0f, -150.1f)
                lineTo(352.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 17.9f)
                curveToRelative(-43.9f, 7.0f, -81.5f, 32.7f, -104.4f, 68.7f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(221.7f, 148.4f)
                curveTo(239.6f, 117.1f, 273.3f, 96.0f, 312.0f, 96.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(57.4f, 0.0f, 104.0f, 46.6f, 104.0f, 104.0f)
                lineToRelative(0.0f, 33.4f)
                curveToRelative(0.0f, 32.7f, 6.4f, 64.8f, 18.7f, 94.5f)
                lineTo(221.7f, 148.4f)
                close()
                moveTo(406.2f, 416.0f)
                lineToRelative(-60.9f, -48.0f)
                lineToRelative(-176.9f, 0.0f)
                curveToRelative(21.2f, -32.8f, 34.4f, -70.3f, 38.4f, -109.1f)
                lineTo(160.0f, 222.1f)
                lineToRelative(0.0f, 11.4f)
                curveToRelative(0.0f, 45.4f, -15.5f, 89.5f, -43.8f, 124.9f)
                lineTo(101.3f, 377.0f)
                curveToRelative(-5.8f, 7.2f, -6.9f, 17.1f, -2.9f, 25.4f)
                reflectiveCurveToRelative(12.4f, 13.6f, 21.6f, 13.6f)
                lineToRelative(286.2f, 0.0f)
                close()
                moveTo(384.0f, 448.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                reflectiveCurveToRelative(18.7f, -28.3f, 18.7f, -45.3f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
