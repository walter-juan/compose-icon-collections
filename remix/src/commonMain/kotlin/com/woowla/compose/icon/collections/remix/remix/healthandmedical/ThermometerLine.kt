package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.ThermometerLine: ImageVector
    get() {
        if (_thermometerLine != null) {
            return _thermometerLine!!
        }
        _thermometerLine = Builder(name = "ThermometerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.556f, 3.444f)
                curveTo(22.119f, 5.006f, 22.119f, 7.538f, 20.556f, 9.101f)
                lineTo(12.356f, 17.301f)
                curveTo(11.714f, 17.943f, 10.872f, 18.348f, 9.97f, 18.448f)
                lineTo(6.591f, 18.822f)
                lineTo(4.293f, 21.121f)
                curveTo(3.903f, 21.512f, 3.269f, 21.512f, 2.879f, 21.121f)
                curveTo(2.488f, 20.731f, 2.488f, 20.098f, 2.879f, 19.707f)
                lineTo(5.177f, 17.408f)
                lineTo(5.552f, 14.031f)
                curveTo(5.653f, 13.128f, 6.057f, 12.286f, 6.699f, 11.644f)
                lineTo(14.9f, 3.444f)
                curveTo(16.462f, 1.882f, 18.994f, 1.882f, 20.556f, 3.444f)
                close()
                moveTo(16.314f, 4.858f)
                lineTo(8.114f, 13.058f)
                curveTo(7.793f, 13.379f, 7.59f, 13.8f, 7.54f, 14.252f)
                lineTo(7.264f, 16.736f)
                lineTo(9.749f, 16.46f)
                curveTo(10.2f, 16.41f, 10.621f, 16.208f, 10.942f, 15.887f)
                lineTo(11.364f, 15.464f)
                lineTo(9.95f, 14.05f)
                lineTo(11.364f, 12.636f)
                lineTo(12.778f, 14.05f)
                lineTo(14.192f, 12.636f)
                lineTo(12.778f, 11.222f)
                lineTo(14.193f, 9.808f)
                lineTo(15.607f, 11.222f)
                lineTo(17.021f, 9.807f)
                lineTo(15.607f, 8.393f)
                lineTo(17.021f, 6.979f)
                lineTo(18.435f, 8.393f)
                lineTo(19.142f, 7.686f)
                curveTo(19.923f, 6.905f, 19.923f, 5.639f, 19.142f, 4.858f)
                curveTo(18.361f, 4.077f, 17.095f, 4.077f, 16.314f, 4.858f)
                close()
            }
        }
        .build()
        return _thermometerLine!!
    }

private var _thermometerLine: ImageVector? = null
