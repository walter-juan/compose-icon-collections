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

public val HealthAndMedicalGroup.NurseFill: ImageVector
    get() {
        if (_nurseFill != null) {
            return _nurseFill!!
        }
        _nurseFill = Builder(name = "NurseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.957f, 15.564f)
                curveTo(17.615f, 16.622f, 19.573f, 19.064f, 19.939f, 22.0f)
                horizontalLineTo(4.063f)
                curveTo(4.429f, 19.064f, 6.386f, 16.622f, 9.044f, 15.564f)
                lineTo(12.001f, 20.0f)
                lineTo(14.957f, 15.564f)
                close()
                moveTo(18.001f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(18.001f, 11.314f, 15.314f, 14.0f, 12.001f, 14.0f)
                curveTo(8.687f, 14.0f, 6.001f, 11.314f, 6.001f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.001f)
                close()
                moveTo(16.001f, 8.0f)
                horizontalLineTo(8.001f)
                curveTo(8.001f, 10.209f, 9.791f, 12.0f, 12.001f, 12.0f)
                curveTo(14.21f, 12.0f, 16.001f, 10.209f, 16.001f, 8.0f)
                close()
            }
        }
        .build()
        return _nurseFill!!
    }

private var _nurseFill: ImageVector? = null
