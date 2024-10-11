package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.FlightTakeoffFill: ImageVector
    get() {
        if (_flightTakeoffFill != null) {
            return _flightTakeoffFill!!
        }
        _flightTakeoffFill = Builder(name = "FlightTakeoffFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.949f, 10.112f)
                curveTo(22.163f, 10.912f, 21.689f, 11.734f, 20.888f, 11.949f)
                lineTo(5.222f, 16.147f)
                curveTo(4.779f, 16.265f, 4.311f, 16.067f, 4.089f, 15.666f)
                lineTo(1.466f, 10.941f)
                lineTo(2.915f, 10.553f)
                lineTo(5.383f, 12.998f)
                lineTo(10.478f, 11.633f)
                lineTo(5.967f, 4.559f)
                lineTo(7.899f, 4.041f)
                lineTo(14.851f, 10.461f)
                lineTo(20.112f, 9.051f)
                curveTo(20.912f, 8.837f, 21.735f, 9.312f, 21.949f, 10.112f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _flightTakeoffFill!!
    }

private var _flightTakeoffFill: ImageVector? = null
