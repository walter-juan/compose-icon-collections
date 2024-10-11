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

public val HealthAndMedicalGroup.HeartAddLine: ImageVector
    get() {
        if (_heartAddLine != null) {
            return _heartAddLine!!
        }
        _heartAddLine = Builder(name = "HeartAddLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.999f)
                lineTo(19.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(16.999f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.636f, 20.479f, 12.992f)
                lineTo(19.06f, 11.574f)
                curveTo(20.39f, 10.05f, 20.32f, 7.66f, 18.827f, 6.17f)
                curveTo(17.324f, 4.671f, 14.908f, 4.607f, 13.337f, 6.017f)
                lineTo(12.002f, 7.215f)
                lineTo(10.666f, 6.018f)
                curveTo(9.091f, 4.606f, 6.675f, 4.668f, 5.172f, 6.172f)
                curveTo(3.682f, 7.661f, 3.607f, 10.047f, 4.98f, 11.623f)
                lineTo(13.412f, 20.069f)
                lineTo(12.0f, 21.485f)
                lineTo(3.521f, 12.993f)
                curveTo(1.417f, 10.637f, 1.496f, 7.019f, 3.757f, 4.757f)
                curveTo(6.022f, 2.493f, 9.645f, 2.417f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
            }
        }
        .build()
        return _heartAddLine!!
    }

private var _heartAddLine: ImageVector? = null
