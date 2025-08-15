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

public val SolidGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 57.8f, -24.4f, 104.8f, -57.4f, 144.5f)
                curveToRelative(-24.1f, 28.9f, -53.8f, 55.1f, -83.6f, 79.5f)
                curveToRelative(29.8f, 24.5f, 59.5f, 50.6f, 83.6f, 79.5f)
                curveToRelative(33.0f, 39.6f, 57.4f, 86.7f, 57.4f, 144.5f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(0.0f, 497.7f, 0.0f, 480.0f)
                curveTo(0.0f, 422.2f, 24.4f, 375.2f, 57.4f, 335.5f)
                curveTo(81.5f, 306.6f, 111.2f, 280.5f, 141.0f, 256.0f)
                curveTo(111.2f, 231.5f, 81.5f, 205.4f, 57.4f, 176.5f)
                curveTo(24.4f, 136.8f, 0.0f, 89.8f, 0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(64.0f, 14.3f, 64.0f, 32.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(283.5f, 384.0f)
                lineToRelative(-182.9f, 0.0f)
                curveToRelative(-8.2f, 10.5f, -15.1f, 21.1f, -20.6f, 32.0f)
                lineToRelative(224.2f, 0.0f)
                curveToRelative(-5.6f, -10.9f, -12.5f, -21.5f, -20.6f, -32.0f)
                close()
                moveTo(238.0f, 336.0f)
                curveToRelative(-14.3f, -13.0f, -29.8f, -25.8f, -46.0f, -39.0f)
                curveToRelative(-16.2f, 13.1f, -31.7f, 26.0f, -46.0f, 39.0f)
                lineToRelative(92.0f, 0.0f)
                close()
                moveTo(100.5f, 128.0f)
                lineToRelative(182.9f, 0.0f)
                curveToRelative(8.2f, -10.5f, 15.1f, -21.1f, 20.6f, -32.0f)
                lineTo(79.9f, 96.0f)
                curveToRelative(5.6f, 10.9f, 12.5f, 21.5f, 20.6f, 32.0f)
                close()
                moveTo(146.0f, 176.0f)
                curveToRelative(14.3f, 13.0f, 29.8f, 25.8f, 46.0f, 39.0f)
                curveToRelative(16.2f, -13.1f, 31.7f, -26.0f, 46.0f, -39.0f)
                lineToRelative(-92.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
