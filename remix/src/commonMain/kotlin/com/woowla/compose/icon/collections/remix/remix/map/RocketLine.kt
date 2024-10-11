package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.RocketLine: ImageVector
    get() {
        if (_rocketLine != null) {
            return _rocketLine!!
        }
        _rocketLine = Builder(name = "RocketLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                curveTo(5.0f, 7.912f, 7.902f, 3.564f, 12.0f, 1.818f)
                curveTo(16.097f, 3.564f, 19.0f, 7.912f, 19.0f, 13.0f)
                curveTo(19.0f, 13.823f, 18.924f, 14.626f, 18.779f, 15.403f)
                lineTo(20.719f, 17.235f)
                curveTo(20.885f, 17.391f, 20.924f, 17.639f, 20.815f, 17.838f)
                lineTo(18.32f, 22.413f)
                curveTo(18.187f, 22.656f, 17.884f, 22.745f, 17.641f, 22.613f)
                curveTo(17.599f, 22.59f, 17.561f, 22.561f, 17.527f, 22.527f)
                lineTo(15.292f, 20.293f)
                curveTo(15.105f, 20.105f, 14.851f, 20.0f, 14.585f, 20.0f)
                horizontalLineTo(9.414f)
                curveTo(9.149f, 20.0f, 8.894f, 20.105f, 8.707f, 20.293f)
                lineTo(6.472f, 22.527f)
                curveTo(6.277f, 22.723f, 5.96f, 22.723f, 5.765f, 22.527f)
                curveTo(5.731f, 22.494f, 5.702f, 22.455f, 5.68f, 22.413f)
                lineTo(3.184f, 17.838f)
                curveTo(3.075f, 17.639f, 3.115f, 17.391f, 3.28f, 17.235f)
                lineTo(5.22f, 15.403f)
                curveTo(5.076f, 14.626f, 5.0f, 13.823f, 5.0f, 13.0f)
                close()
                moveTo(6.475f, 19.696f)
                lineTo(7.292f, 18.879f)
                curveTo(7.855f, 18.316f, 8.618f, 18.0f, 9.414f, 18.0f)
                horizontalLineTo(14.585f)
                curveTo(15.381f, 18.0f, 16.144f, 18.316f, 16.707f, 18.879f)
                lineTo(17.524f, 19.696f)
                lineTo(18.506f, 17.896f)
                lineTo(17.406f, 16.857f)
                curveTo(16.912f, 16.39f, 16.688f, 15.705f, 16.813f, 15.036f)
                curveTo(16.937f, 14.372f, 17.0f, 13.691f, 17.0f, 13.0f)
                curveTo(17.0f, 9.13f, 15.005f, 5.7f, 12.0f, 4.04f)
                curveTo(8.995f, 5.7f, 7.0f, 9.13f, 7.0f, 13.0f)
                curveTo(7.0f, 13.691f, 7.063f, 14.372f, 7.186f, 15.036f)
                curveTo(7.311f, 15.705f, 7.087f, 16.39f, 6.593f, 16.857f)
                lineTo(5.494f, 17.896f)
                lineTo(6.475f, 19.696f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.895f, 13.0f, 10.0f, 12.104f, 10.0f, 11.0f)
                curveTo(10.0f, 9.895f, 10.895f, 9.0f, 12.0f, 9.0f)
                curveTo(13.104f, 9.0f, 14.0f, 9.895f, 14.0f, 11.0f)
                curveTo(14.0f, 12.104f, 13.104f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rocketLine!!
    }

private var _rocketLine: ImageVector? = null
