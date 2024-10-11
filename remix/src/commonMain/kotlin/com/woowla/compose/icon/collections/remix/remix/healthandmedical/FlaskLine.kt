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

public val HealthAndMedicalGroup.FlaskLine: ImageVector
    get() {
        if (_flaskLine != null) {
            return _flaskLine!!
        }
        _flaskLine = Builder(name = "FlaskLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.387f, 10.001f)
                horizontalLineTo(10.611f)
                curveTo(10.507f, 10.364f, 10.382f, 10.722f, 10.237f, 11.072f)
                lineTo(10.079f, 11.434f)
                lineTo(6.124f, 20.0f)
                horizontalLineTo(17.873f)
                lineTo(13.92f, 11.434f)
                curveTo(13.705f, 10.969f, 13.528f, 10.49f, 13.387f, 10.001f)
                close()
                moveTo(10.999f, 7.243f)
                curveTo(10.999f, 7.496f, 10.99f, 7.749f, 10.971f, 8.001f)
                horizontalLineTo(13.028f)
                curveTo(13.019f, 7.88f, 13.012f, 7.759f, 13.007f, 7.637f)
                lineTo(12.999f, 7.243f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.999f)
                verticalLineTo(7.243f)
                close()
            }
        }
        .build()
        return _flaskLine!!
    }

private var _flaskLine: ImageVector? = null
