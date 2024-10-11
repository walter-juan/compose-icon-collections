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

public val HealthAndMedicalGroup.NurseLine: ImageVector
    get() {
        if (_nurseLine != null) {
            return _nurseLine!!
        }
        _nurseLine = Builder(name = "NurseLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 15.0f)
                curveTo(16.08f, 15.0f, 19.447f, 18.054f, 19.939f, 22.0f)
                horizontalLineTo(4.063f)
                curveTo(4.555f, 18.054f, 7.921f, 15.0f, 12.001f, 15.0f)
                close()
                moveTo(10.188f, 17.279f)
                curveTo(8.754f, 17.734f, 7.546f, 18.713f, 6.802f, 20.0f)
                lineTo(12.001f, 20.0f)
                lineTo(10.188f, 17.279f)
                close()
                moveTo(13.814f, 17.28f)
                lineTo(12.001f, 20.0f)
                lineTo(17.199f, 20.0f)
                curveTo(16.455f, 18.713f, 15.248f, 17.734f, 13.814f, 17.28f)
                close()
                moveTo(18.001f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(18.001f, 11.314f, 15.314f, 14.0f, 12.001f, 14.0f)
                curveTo(8.687f, 14.0f, 6.001f, 11.314f, 6.001f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.001f)
                close()
                moveTo(8.001f, 8.0f)
                curveTo(8.001f, 10.209f, 9.791f, 12.0f, 12.001f, 12.0f)
                curveTo(14.21f, 12.0f, 16.001f, 10.209f, 16.001f, 8.0f)
                horizontalLineTo(8.001f)
                close()
                moveTo(16.001f, 4.0f)
                horizontalLineTo(8.001f)
                lineTo(8.0f, 6.0f)
                horizontalLineTo(16.0f)
                lineTo(16.001f, 4.0f)
                close()
            }
        }
        .build()
        return _nurseLine!!
    }

private var _nurseLine: ImageVector? = null
