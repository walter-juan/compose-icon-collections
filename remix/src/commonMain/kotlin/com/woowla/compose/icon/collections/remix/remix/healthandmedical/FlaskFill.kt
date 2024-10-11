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

public val HealthAndMedicalGroup.FlaskFill: ImageVector
    get() {
        if (_flaskFill != null) {
            return _flaskFill!!
        }
        _flaskFill = Builder(name = "FlaskFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.999f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.999f)
                verticalLineTo(7.243f)
                curveTo(14.999f, 8.401f, 15.251f, 9.544f, 15.736f, 10.595f)
                lineTo(20.017f, 19.871f)
                curveTo(20.364f, 20.624f, 20.036f, 21.515f, 19.284f, 21.862f)
                curveTo(19.087f, 21.953f, 18.872f, 22.0f, 18.655f, 22.0f)
                horizontalLineTo(5.344f)
                curveTo(4.515f, 22.0f, 3.844f, 21.328f, 3.844f, 20.5f)
                curveTo(3.844f, 20.283f, 3.891f, 20.069f, 3.982f, 19.871f)
                lineTo(8.263f, 10.595f)
                curveTo(8.748f, 9.544f, 8.999f, 8.401f, 8.999f, 7.243f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.999f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.999f)
                close()
                moveTo(12.999f, 4.0f)
                horizontalLineTo(10.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.999f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _flaskFill!!
    }

private var _flaskFill: ImageVector? = null
