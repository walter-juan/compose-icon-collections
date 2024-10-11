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

public val MapGroup.FlightLandFill: ImageVector
    get() {
        if (_flightLandFill != null) {
            return _flightLandFill!!
        }
        _flightLandFill = Builder(name = "FlightLandFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.949f, 14.888f)
                curveTo(20.735f, 15.688f, 19.912f, 16.163f, 19.112f, 15.949f)
                lineTo(3.445f, 11.751f)
                curveTo(3.002f, 11.632f, 2.697f, 11.227f, 2.704f, 10.768f)
                lineTo(2.795f, 5.365f)
                lineTo(4.244f, 5.753f)
                lineTo(5.159f, 9.104f)
                lineTo(10.254f, 10.47f)
                lineTo(9.885f, 2.088f)
                lineTo(11.817f, 2.606f)
                lineTo(14.627f, 11.641f)
                lineTo(19.888f, 13.051f)
                curveTo(20.688f, 13.266f, 21.163f, 14.088f, 20.949f, 14.888f)
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
        return _flightLandFill!!
    }

private var _flightLandFill: ImageVector? = null
