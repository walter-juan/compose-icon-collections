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
                moveTo(12.0f, 3.298f)
                lineTo(14.445f, 1.668f)
                lineTo(15.554f, 3.332f)
                lineTo(13.0f, 5.035f)
                verticalLineTo(10.268f)
                lineTo(17.531f, 7.651f)
                lineTo(17.729f, 4.587f)
                lineTo(19.725f, 4.716f)
                lineTo(19.536f, 7.649f)
                lineTo(22.17f, 8.952f)
                lineTo(21.284f, 10.744f)
                lineTo(18.531f, 9.384f)
                lineTo(14.0f, 12.0f)
                lineTo(18.532f, 14.616f)
                lineTo(21.284f, 13.255f)
                lineTo(22.17f, 15.048f)
                lineTo(19.536f, 16.351f)
                lineTo(19.725f, 19.283f)
                lineTo(17.729f, 19.412f)
                lineTo(17.532f, 16.348f)
                lineTo(13.0f, 13.731f)
                verticalLineTo(18.965f)
                lineTo(15.554f, 20.668f)
                lineTo(14.445f, 22.332f)
                lineTo(12.0f, 20.702f)
                lineTo(9.554f, 22.332f)
                lineTo(8.445f, 20.668f)
                lineTo(11.0f, 18.965f)
                verticalLineTo(13.732f)
                lineTo(6.468f, 16.348f)
                lineTo(6.27f, 19.412f)
                lineTo(4.274f, 19.284f)
                lineTo(4.464f, 16.351f)
                lineTo(1.829f, 15.048f)
                lineTo(2.716f, 13.255f)
                lineTo(5.468f, 14.616f)
                lineTo(10.0f, 12.0f)
                lineTo(5.468f, 9.383f)
                lineTo(2.716f, 10.744f)
                lineTo(1.829f, 8.951f)
                lineTo(4.464f, 7.649f)
                lineTo(4.275f, 4.716f)
                lineTo(6.271f, 4.587f)
                lineTo(6.468f, 7.651f)
                lineTo(11.0f, 10.267f)
                verticalLineTo(5.035f)
                lineTo(8.445f, 3.332f)
                lineTo(9.554f, 1.668f)
                lineTo(12.0f, 3.298f)
                close()
            }
        }
        .build()
        return _snowflakeFill!!
    }

private var _snowflakeFill: ImageVector? = null
