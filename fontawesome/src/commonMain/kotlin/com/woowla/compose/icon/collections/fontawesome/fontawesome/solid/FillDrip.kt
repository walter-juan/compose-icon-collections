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

public val SolidGroup.FillDrip: ImageVector
    get() {
        if (_fillDrip != null) {
            return _fillDrip!!
        }
        _fillDrip = Builder(name = "FillDrip", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.7f, 71.6f)
                lineToRelative(-64.4f, 64.4f)
                lineToRelative(33.4f, 33.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-96.4f, 96.4f)
                curveToRelative(-2.9f, 2.9f, -5.1f, 6.5f, -6.3f, 10.3f)
                lineToRelative(321.5f, 0.0f)
                lineToRelative(53.7f, -53.7f)
                curveToRelative(4.9f, -4.9f, 7.6f, -11.5f, 7.6f, -18.3f)
                reflectiveCurveToRelative(-2.7f, -13.5f, -7.6f, -18.3f)
                lineTo(346.3f, 71.6f)
                curveTo(341.5f, 66.7f, 334.9f, 64.0f, 328.0f, 64.0f)
                reflectiveCurveToRelative(-13.5f, 2.7f, -18.3f, 7.6f)
                close()
                moveTo(58.3f, 232.4f)
                lineToRelative(96.4f, -96.4f)
                lineToRelative(-49.4f, -49.4f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.3f, 0.0f)
                lineTo(200.0f, 90.7f)
                lineTo(264.4f, 26.3f)
                curveTo(281.3f, 9.5f, 304.1f, 0.0f, 328.0f, 0.0f)
                reflectiveCurveToRelative(46.7f, 9.5f, 63.6f, 26.3f)
                lineTo(517.7f, 152.4f)
                curveTo(534.5f, 169.3f, 544.0f, 192.1f, 544.0f, 216.0f)
                reflectiveCurveToRelative(-9.5f, 46.7f, -26.3f, 63.6f)
                lineTo(311.6f, 485.7f)
                curveTo(294.7f, 502.5f, 271.9f, 512.0f, 248.0f, 512.0f)
                reflectiveCurveToRelative(-46.7f, -9.5f, -63.6f, -26.3f)
                lineTo(58.3f, 359.6f)
                curveTo(41.5f, 342.7f, 32.0f, 319.9f, 32.0f, 296.0f)
                reflectiveCurveToRelative(9.5f, -46.7f, 26.3f, -63.6f)
                close()
                moveTo(512.0f, 544.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -25.2f, 32.6f, -79.6f, 51.2f, -108.7f)
                curveToRelative(6.0f, -9.4f, 19.5f, -9.4f, 25.5f, 0.0f)
                curveToRelative(18.7f, 29.1f, 51.2f, 83.5f, 51.2f, 108.7f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _fillDrip!!
    }

private var _fillDrip: ImageVector? = null
