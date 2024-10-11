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

public val HealthAndMedicalGroup.HeartAddFill: ImageVector
    get() {
        if (_heartAddFill != null) {
            return _heartAddFill!!
        }
        _heartAddFill = Builder(name = "HeartAddFill", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(22.403f, 6.923f, 22.572f, 10.314f, 20.75f, 12.667f)
                curveTo(19.926f, 12.24f, 18.991f, 12.0f, 18.0f, 12.0f)
                curveTo(14.686f, 12.0f, 12.0f, 14.686f, 12.0f, 18.0f)
                curveTo(12.0f, 19.009f, 12.249f, 19.96f, 12.689f, 20.794f)
                lineTo(12.0f, 21.485f)
                lineTo(3.521f, 12.993f)
                curveTo(1.417f, 10.637f, 1.496f, 7.019f, 3.757f, 4.757f)
                curveTo(6.022f, 2.493f, 9.645f, 2.417f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
            }
        }
        .build()
        return _heartAddFill!!
    }

private var _heartAddFill: ImageVector? = null
