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

public val HealthAndMedicalGroup.Heart2Line: ImageVector
    get() {
        if (_heart2Line != null) {
            return _heart2Line!!
        }
        _heart2Line = Builder(name = "Heart2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.637f, 20.479f, 12.993f)
                lineTo(12.0f, 21.485f)
                lineTo(3.521f, 12.993f)
                curveTo(1.417f, 10.637f, 1.496f, 7.019f, 3.757f, 4.757f)
                curveTo(6.022f, 2.493f, 9.645f, 2.417f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
                moveTo(5.172f, 6.172f)
                curveTo(3.682f, 7.661f, 3.607f, 10.047f, 4.98f, 11.623f)
                lineTo(12.0f, 18.654f)
                lineTo(19.02f, 11.623f)
                curveTo(20.393f, 10.047f, 20.319f, 7.665f, 18.827f, 6.17f)
                curveTo(17.34f, 4.68f, 14.946f, 4.608f, 13.374f, 5.984f)
                lineTo(9.172f, 10.187f)
                lineTo(7.757f, 8.773f)
                lineTo(10.582f, 5.946f)
                lineTo(10.5f, 5.877f)
                curveTo(8.925f, 4.612f, 6.623f, 4.72f, 5.172f, 6.172f)
                close()
            }
        }
        .build()
        return _heart2Line!!
    }

private var _heart2Line: ImageVector? = null
