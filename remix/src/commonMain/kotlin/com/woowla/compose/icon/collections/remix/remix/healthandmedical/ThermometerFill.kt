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

public val HealthAndMedicalGroup.ThermometerFill: ImageVector
    get() {
        if (_thermometerFill != null) {
            return _thermometerFill!!
        }
        _thermometerFill = Builder(name = "ThermometerFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.364f, 12.636f)
                lineTo(9.95f, 14.05f)
                lineTo(12.071f, 16.172f)
                lineTo(13.485f, 14.757f)
                lineTo(11.364f, 12.636f)
                close()
                moveTo(14.193f, 9.808f)
                lineTo(12.778f, 11.222f)
                lineTo(14.9f, 13.343f)
                lineTo(16.314f, 11.929f)
                lineTo(14.193f, 9.808f)
                close()
                moveTo(17.021f, 6.979f)
                lineTo(15.607f, 8.393f)
                lineTo(17.728f, 10.515f)
                lineTo(19.142f, 9.101f)
                lineTo(17.021f, 6.979f)
                close()
            }
        }
        .build()
        return _thermometerFill!!
    }

private var _thermometerFill: ImageVector? = null
