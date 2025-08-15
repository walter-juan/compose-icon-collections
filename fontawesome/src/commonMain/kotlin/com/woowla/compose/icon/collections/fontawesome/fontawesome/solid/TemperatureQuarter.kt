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

public val SolidGroup.TemperatureQuarter: ImageVector
    get() {
        if (_temperatureQuarter != null) {
            return _temperatureQuarter!!
        }
        _temperatureQuarter = Builder(name = "TemperatureQuarter", defaultWidth = 320.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                curveTo(107.0f, 0.0f, 64.0f, 43.0f, 64.0f, 96.0f)
                lineToRelative(0.0f, 164.7f)
                curveTo(34.5f, 287.0f, 16.0f, 325.4f, 16.0f, 368.0f)
                curveTo(16.0f, 447.5f, 80.5f, 512.0f, 160.0f, 512.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -42.6f, -18.5f, -81.0f, -48.0f, -107.3f)
                lineTo(256.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(224.0f, 368.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -26.9f, 16.5f, -49.9f, 40.0f, -59.3f)
                lineToRelative(0.0f, -28.7f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 28.7f)
                curveToRelative(23.5f, 9.5f, 40.0f, 32.5f, 40.0f, 59.3f)
                close()
            }
        }
        .build()
        return _temperatureQuarter!!
    }

private var _temperatureQuarter: ImageVector? = null
