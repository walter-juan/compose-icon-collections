package com.woowla.compose.icon.collections.remix.remix.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.WeatherGroup

public val WeatherGroup.SnowflakeFill: ImageVector
    get() {
        if (_snowflakeFill != null) {
            return _snowflakeFill!!
        }
        _snowflakeFill = Builder(name = "SnowflakeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 3.298f)
                lineTo(14.446f, 1.668f)
                lineTo(15.555f, 3.332f)
                lineTo(13.001f, 5.035f)
                verticalLineTo(10.268f)
                lineTo(17.532f, 7.651f)
                lineTo(17.73f, 4.587f)
                lineTo(19.726f, 4.716f)
                lineTo(19.537f, 7.649f)
                lineTo(22.171f, 8.952f)
                lineTo(21.285f, 10.744f)
                lineTo(18.532f, 9.384f)
                lineTo(14.001f, 12.0f)
                lineTo(18.533f, 14.616f)
                lineTo(21.285f, 13.255f)
                lineTo(22.171f, 15.048f)
                lineTo(19.537f, 16.351f)
                lineTo(19.726f, 19.283f)
                lineTo(17.73f, 19.412f)
                lineTo(17.533f, 16.348f)
                lineTo(13.001f, 13.731f)
                verticalLineTo(18.965f)
                lineTo(15.555f, 20.668f)
                lineTo(14.446f, 22.332f)
                lineTo(12.001f, 20.702f)
                lineTo(9.555f, 22.332f)
                lineTo(8.446f, 20.668f)
                lineTo(11.001f, 18.965f)
                verticalLineTo(13.732f)
                lineTo(6.469f, 16.348f)
                lineTo(6.271f, 19.412f)
                lineTo(4.275f, 19.284f)
                lineTo(4.465f, 16.351f)
                lineTo(1.83f, 15.048f)
                lineTo(2.717f, 13.255f)
                lineTo(5.469f, 14.616f)
                lineTo(10.001f, 12.0f)
                lineTo(5.469f, 9.383f)
                lineTo(2.717f, 10.744f)
                lineTo(1.83f, 8.951f)
                lineTo(4.465f, 7.649f)
                lineTo(4.276f, 4.716f)
                lineTo(6.272f, 4.587f)
                lineTo(6.469f, 7.651f)
                lineTo(11.001f, 10.267f)
                verticalLineTo(5.035f)
                lineTo(8.446f, 3.332f)
                lineTo(9.555f, 1.668f)
                lineTo(12.001f, 3.298f)
                close()
            }
        }
        .build()
        return _snowflakeFill!!
    }

private var _snowflakeFill: ImageVector? = null
