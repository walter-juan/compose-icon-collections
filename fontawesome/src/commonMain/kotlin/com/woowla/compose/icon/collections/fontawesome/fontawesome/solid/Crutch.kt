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

public val SolidGroup.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.4f, 9.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(160.0f, 160.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(-158.6f, 158.6f)
                curveToRelative(-18.0f, 18.0f, -42.4f, 28.1f, -67.9f, 28.1f)
                lineToRelative(-59.0f, 0.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, 3.4f, -22.6f, 9.4f)
                curveToRelative(-61.7f, 61.7f, -92.8f, 92.8f, -93.3f, 93.3f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(16.0f, -16.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(77.3f, -77.3f)
                curveToRelative(6.0f, -6.0f, 9.4f, -14.1f, 9.4f, -22.6f)
                lineToRelative(0.0f, -59.0f)
                curveToRelative(0.0f, -25.5f, 10.1f, -49.9f, 28.1f, -67.9f)
                lineTo(298.7f, 56.0f)
                lineTo(297.4f, 54.6f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                close()
                moveTo(344.0f, 101.3f)
                lineTo(261.3f, 184.0f)
                lineTo(328.0f, 250.7f)
                lineTo(410.7f, 168.0f)
                lineTo(344.0f, 101.3f)
                close()
                moveTo(216.0f, 229.3f)
                lineToRelative(-30.6f, 30.6f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                lineToRelative(0.0f, 53.5f)
                lineToRelative(53.5f, 0.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineTo(282.7f, 296.0f)
                lineTo(216.0f, 229.3f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
