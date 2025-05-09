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

public val SolidGroup.BanSmoking: ImageVector
    get() {
        if (_banSmoking != null) {
            return _banSmoking!!
        }
        _banSmoking = Builder(name = "BanSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.5f, 144.8f)
                lineTo(178.7f, 224.0f)
                lineToRelative(96.0f, 96.0f)
                lineToRelative(92.5f, 92.5f)
                curveTo(335.9f, 434.9f, 297.5f, 448.0f, 256.0f, 448.0f)
                curveTo(150.0f, 448.0f, 64.0f, 362.0f, 64.0f, 256.0f)
                curveToRelative(0.0f, -41.5f, 13.1f, -79.9f, 35.5f, -111.2f)
                close()
                moveTo(333.3f, 288.0f)
                lineToRelative(-32.0f, -32.0f)
                lineToRelative(82.7f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-50.7f, 0.0f)
                close()
                moveTo(365.3f, 320.0f)
                lineToRelative(34.7f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-130.7f, 0.0f)
                lineTo(144.8f, 99.5f)
                curveTo(176.1f, 77.1f, 214.5f, 64.0f, 256.0f, 64.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                curveToRelative(0.0f, 41.5f, -13.1f, 79.9f, -35.5f, 111.2f)
                lineTo(365.3f, 320.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(272.0f, 96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(229.5f, 320.0f)
                lineToRelative(-96.0f, -96.0f)
                lineTo(112.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(117.5f, 0.0f)
                close()
            }
        }
        .build()
        return _banSmoking!!
    }

private var _banSmoking: ImageVector? = null
