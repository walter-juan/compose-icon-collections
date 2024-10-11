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

public val HealthAndMedicalGroup.HeartLine: ImageVector
    get() {
        if (_heartLine != null) {
            return _heartLine!!
        }
        _heartLine = Builder(name = "HeartLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.637f, 20.479f, 12.993f)
                lineTo(12.0f, 21.485f)
                lineTo(3.521f, 12.993f)
                curveTo(1.417f, 10.637f, 1.496f, 7.019f, 3.757f, 4.757f)
                curveTo(6.022f, 2.493f, 9.645f, 2.417f, 12.001f, 4.529f)
                close()
                moveTo(18.827f, 6.17f)
                curveTo(17.328f, 4.668f, 14.908f, 4.607f, 13.337f, 6.017f)
                lineTo(12.002f, 7.215f)
                lineTo(10.666f, 6.018f)
                curveTo(9.091f, 4.606f, 6.675f, 4.668f, 5.172f, 6.172f)
                curveTo(3.682f, 7.661f, 3.607f, 10.047f, 4.98f, 11.623f)
                lineTo(12.0f, 18.654f)
                lineTo(19.02f, 11.623f)
                curveTo(20.393f, 10.047f, 20.319f, 7.665f, 18.827f, 6.17f)
                close()
            }
        }
        .build()
        return _heartLine!!
    }

private var _heartLine: ImageVector? = null
