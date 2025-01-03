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

public val SolidGroup.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.2f, 0.0f)
                curveTo(91.7f, 0.0f, 65.5f, 21.5f, 59.5f, 51.4f)
                lineTo(8.3f, 307.4f)
                curveTo(0.4f, 347.0f, 30.6f, 384.0f, 71.0f, 384.0f)
                lineToRelative(217.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(217.0f, 0.0f)
                curveToRelative(40.4f, 0.0f, 70.7f, -36.9f, 62.8f, -76.6f)
                lineToRelative(-51.2f, -256.0f)
                curveTo(574.5f, 21.5f, 548.3f, 0.0f, 517.8f, 0.0f)
                lineTo(122.2f, 0.0f)
                close()
                moveTo(260.9f, 64.0f)
                lineToRelative(118.2f, 0.0f)
                lineToRelative(10.4f, 104.0f)
                lineToRelative(-139.0f, 0.0f)
                lineTo(260.9f, 64.0f)
                close()
                moveTo(202.3f, 168.0f)
                lineToRelative(-100.8f, 0.0f)
                lineTo(122.2f, 64.0f)
                lineToRelative(90.4f, 0.0f)
                lineTo(202.3f, 168.0f)
                close()
                moveTo(91.8f, 216.0f)
                lineToRelative(105.6f, 0.0f)
                lineTo(187.1f, 320.0f)
                lineTo(71.0f, 320.0f)
                lineTo(91.8f, 216.0f)
                close()
                moveTo(245.7f, 216.0f)
                lineToRelative(148.6f, 0.0f)
                lineToRelative(10.4f, 104.0f)
                lineToRelative(-169.4f, 0.0f)
                lineToRelative(10.4f, -104.0f)
                close()
                moveTo(442.5f, 216.0f)
                lineToRelative(105.6f, 0.0f)
                lineTo(569.0f, 320.0f)
                lineToRelative(-116.0f, 0.0f)
                lineTo(442.5f, 216.0f)
                close()
                moveTo(538.5f, 168.0f)
                lineToRelative(-100.8f, 0.0f)
                lineTo(427.3f, 64.0f)
                lineToRelative(90.4f, 0.0f)
                lineToRelative(31.4f, -6.3f)
                lineTo(517.8f, 64.0f)
                lineToRelative(20.8f, 104.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
