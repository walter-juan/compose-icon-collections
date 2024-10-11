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

public val WeatherGroup.BlazeFill: ImageVector
    get() {
        if (_blazeFill != null) {
            return _blazeFill!!
        }
        _blazeFill = Builder(name = "BlazeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.0f)
                curveTo(19.5f, 10.061f, 20.0f, 11.394f, 20.0f, 13.0f)
                curveTo(20.0f, 16.466f, 16.3f, 17.276f, 14.5f, 22.0f)
                curveTo(13.833f, 21.425f, 13.5f, 20.592f, 13.5f, 19.5f)
                curveTo(13.5f, 16.018f, 18.5f, 14.21f, 18.5f, 9.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(15.7f, 6.238f, 16.3f, 7.572f, 16.3f, 9.0f)
                curveTo(16.3f, 13.951f, 10.255f, 14.692f, 11.5f, 22.0f)
                curveTo(9.833f, 20.839f, 9.0f, 19.173f, 9.0f, 17.0f)
                curveTo(9.0f, 13.675f, 14.5f, 11.0f, 14.5f, 5.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveTo(11.333f, 2.667f, 12.0f, 4.167f, 12.0f, 5.5f)
                curveTo(12.0f, 11.75f, 3.5f, 13.722f, 8.0f, 22.0f)
                curveTo(5.384f, 21.42f, 3.5f, 19.0f, 3.5f, 16.0f)
                curveTo(3.5f, 9.5f, 10.0f, 8.5f, 10.0f, 1.0f)
                close()
            }
        }
        .build()
        return _blazeFill!!
    }

private var _blazeFill: ImageVector? = null
