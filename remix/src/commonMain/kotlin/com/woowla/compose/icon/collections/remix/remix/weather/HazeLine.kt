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

public val WeatherGroup.HazeLine: ImageVector
    get() {
        if (_hazeLine != null) {
            return _hazeLine!!
        }
        _hazeLine = Builder(name = "HazeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.083f, 13.0f)
                curveTo(6.028f, 12.675f, 6.0f, 12.341f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                curveTo(18.0f, 12.341f, 17.972f, 12.675f, 17.917f, 13.0f)
                horizontalLineTo(15.874f)
                curveTo(15.956f, 12.68f, 16.0f, 12.345f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.209f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 12.345f, 8.044f, 12.68f, 8.126f, 13.0f)
                horizontalLineTo(6.083f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(3.515f, 4.929f)
                lineTo(4.929f, 3.515f)
                lineTo(7.05f, 5.636f)
                lineTo(5.636f, 7.05f)
                lineTo(3.515f, 4.929f)
                close()
                moveTo(19.071f, 3.515f)
                lineTo(20.485f, 4.929f)
                lineTo(18.364f, 7.05f)
                lineTo(16.95f, 5.636f)
                lineTo(19.071f, 3.515f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _hazeLine!!
    }

private var _hazeLine: ImageVector? = null
