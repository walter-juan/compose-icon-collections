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

public val HealthAndMedicalGroup.HeartsFill: ImageVector
    get() {
        if (_heartsFill != null) {
            return _heartsFill!!
        }
        _heartsFill = Builder(name = "HeartsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.363f, 11.045f)
                curveTo(18.767f, 9.652f, 21.043f, 9.652f, 22.447f, 11.045f)
                curveTo(23.851f, 12.439f, 23.851f, 14.699f, 22.447f, 16.092f)
                lineTo(17.0f, 21.5f)
                lineTo(11.553f, 16.092f)
                curveTo(10.149f, 14.699f, 10.149f, 12.439f, 11.553f, 11.045f)
                curveTo(12.957f, 9.652f, 15.233f, 9.652f, 16.637f, 11.045f)
                lineTo(17.0f, 11.405f)
                lineTo(17.363f, 11.045f)
                close()
                moveTo(19.243f, 4.757f)
                curveTo(20.183f, 5.7f, 20.746f, 6.875f, 20.932f, 8.095f)
                curveTo(19.599f, 7.847f, 18.193f, 8.085f, 17.0f, 8.808f)
                curveTo(14.849f, 7.505f, 12.006f, 7.778f, 10.144f, 9.626f)
                curveTo(8.013f, 11.741f, 7.954f, 15.141f, 9.966f, 17.327f)
                lineTo(10.144f, 17.512f)
                lineTo(12.565f, 19.916f)
                lineTo(11.0f, 21.485f)
                lineTo(2.521f, 12.993f)
                curveTo(0.417f, 10.637f, 0.496f, 7.019f, 2.757f, 4.757f)
                curveTo(5.022f, 2.493f, 8.645f, 2.417f, 11.001f, 4.529f)
                curveTo(13.35f, 2.42f, 16.98f, 2.49f, 19.243f, 4.757f)
                close()
            }
        }
        .build()
        return _heartsFill!!
    }

private var _heartsFill: ImageVector? = null
