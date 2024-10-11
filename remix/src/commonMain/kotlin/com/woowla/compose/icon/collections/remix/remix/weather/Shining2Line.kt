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

public val WeatherGroup.Shining2Line: ImageVector
    get() {
        if (_shining2Line != null) {
            return _shining2Line!!
        }
        _shining2Line = Builder(name = "Shining2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                lineTo(23.5f, 12.0f)
                lineTo(16.0f, 16.0f)
                lineTo(12.0f, 23.5f)
                lineTo(8.0f, 16.0f)
                lineTo(0.5f, 12.0f)
                lineTo(8.0f, 8.0f)
                lineTo(12.0f, 0.5f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(19.25f, 12.0f)
                lineTo(14.522f, 9.478f)
                lineTo(12.0f, 4.75f)
                lineTo(9.478f, 9.478f)
                lineTo(4.75f, 12.0f)
                lineTo(9.478f, 14.522f)
                lineTo(12.0f, 19.25f)
                lineTo(14.522f, 14.522f)
                lineTo(19.25f, 12.0f)
                close()
            }
        }
        .build()
        return _shining2Line!!
    }

private var _shining2Line: ImageVector? = null
