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

public val HealthAndMedicalGroup.HeartsLine: ImageVector
    get() {
        if (_heartsLine != null) {
            return _heartsLine!!
        }
        _heartsLine = Builder(name = "HeartsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.243f, 4.757f)
                curveTo(20.705f, 6.223f, 21.255f, 8.25f, 20.892f, 10.137f)
                curveTo(21.461f, 10.297f, 21.999f, 10.6f, 22.447f, 11.045f)
                curveTo(23.851f, 12.439f, 23.851f, 14.699f, 22.447f, 16.092f)
                lineTo(17.0f, 21.5f)
                lineTo(13.978f, 18.5f)
                lineTo(11.0f, 21.485f)
                lineTo(2.521f, 12.993f)
                curveTo(0.417f, 10.637f, 0.496f, 7.019f, 2.757f, 4.757f)
                curveTo(5.022f, 2.493f, 8.645f, 2.417f, 11.001f, 4.529f)
                curveTo(13.35f, 2.42f, 16.98f, 2.49f, 19.243f, 4.757f)
                close()
                moveTo(12.962f, 12.465f)
                curveTo(12.346f, 13.076f, 12.346f, 14.061f, 12.962f, 14.673f)
                lineTo(17.0f, 18.682f)
                lineTo(21.038f, 14.673f)
                curveTo(21.654f, 14.061f, 21.654f, 13.076f, 21.038f, 12.465f)
                curveTo(20.414f, 11.845f, 19.396f, 11.845f, 18.77f, 12.467f)
                lineTo(16.998f, 14.221f)
                lineTo(15.591f, 12.825f)
                lineTo(15.228f, 12.465f)
                curveTo(14.604f, 11.845f, 13.586f, 11.845f, 12.962f, 12.465f)
                close()
                moveTo(4.172f, 6.172f)
                curveTo(2.682f, 7.661f, 2.607f, 10.047f, 3.98f, 11.623f)
                lineTo(11.0f, 18.654f)
                lineTo(12.559f, 17.092f)
                lineTo(11.553f, 16.092f)
                curveTo(10.149f, 14.699f, 10.149f, 12.439f, 11.553f, 11.045f)
                curveTo(12.957f, 9.652f, 15.233f, 9.652f, 16.637f, 11.045f)
                lineTo(17.0f, 11.405f)
                lineTo(17.363f, 11.045f)
                curveTo(17.788f, 10.624f, 18.292f, 10.33f, 18.828f, 10.163f)
                curveTo(19.244f, 8.796f, 18.906f, 7.251f, 17.827f, 6.17f)
                curveTo(16.328f, 4.668f, 13.908f, 4.607f, 12.337f, 6.017f)
                lineTo(11.002f, 7.215f)
                lineTo(9.666f, 6.018f)
                curveTo(8.091f, 4.606f, 5.675f, 4.668f, 4.172f, 6.172f)
                close()
            }
        }
        .build()
        return _heartsLine!!
    }

private var _heartsLine: ImageVector? = null
