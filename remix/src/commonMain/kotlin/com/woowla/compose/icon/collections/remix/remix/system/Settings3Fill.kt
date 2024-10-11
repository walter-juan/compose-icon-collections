package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Settings3Fill: ImageVector
    get() {
        if (_settings3Fill != null) {
            return _settings3Fill!!
        }
        _settings3Fill = Builder(name = "Settings3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.954f, 2.211f)
                curveTo(11.288f, 1.931f, 12.681f, 1.923f, 14.045f, 2.208f)
                curveTo(14.222f, 3.367f, 14.905f, 4.439f, 16.0f, 5.071f)
                curveTo(17.094f, 5.703f, 18.364f, 5.759f, 19.457f, 5.332f)
                curveTo(20.386f, 6.371f, 21.075f, 7.582f, 21.5f, 8.877f)
                curveTo(20.585f, 9.61f, 20.0f, 10.736f, 20.0f, 11.999f)
                curveTo(20.0f, 13.263f, 20.586f, 14.39f, 21.501f, 15.123f)
                curveTo(21.29f, 15.764f, 21.01f, 16.392f, 20.66f, 16.999f)
                curveTo(20.309f, 17.606f, 19.905f, 18.163f, 19.456f, 18.666f)
                curveTo(18.363f, 18.24f, 17.094f, 18.295f, 16.0f, 18.927f)
                curveTo(14.906f, 19.559f, 14.223f, 20.629f, 14.045f, 21.788f)
                curveTo(12.712f, 22.067f, 11.319f, 22.076f, 9.954f, 21.791f)
                curveTo(9.777f, 20.631f, 9.095f, 19.559f, 8.0f, 18.927f)
                curveTo(6.905f, 18.295f, 5.635f, 18.24f, 4.543f, 18.666f)
                curveTo(3.614f, 17.627f, 2.925f, 16.416f, 2.5f, 15.122f)
                curveTo(3.414f, 14.389f, 4.0f, 13.262f, 4.0f, 11.999f)
                curveTo(4.0f, 10.735f, 3.413f, 9.608f, 2.498f, 8.875f)
                curveTo(2.709f, 8.235f, 2.989f, 7.606f, 3.339f, 6.999f)
                curveTo(3.69f, 6.392f, 4.094f, 5.836f, 4.543f, 5.333f)
                curveTo(5.636f, 5.759f, 6.905f, 5.703f, 8.0f, 5.071f)
                curveTo(9.094f, 4.439f, 9.776f, 3.369f, 9.954f, 2.211f)
                close()
                moveTo(12.0f, 14.999f)
                curveTo(13.656f, 14.999f, 15.0f, 13.656f, 15.0f, 11.999f)
                curveTo(15.0f, 10.342f, 13.656f, 8.999f, 12.0f, 8.999f)
                curveTo(10.343f, 8.999f, 9.0f, 10.342f, 9.0f, 11.999f)
                curveTo(9.0f, 13.656f, 10.343f, 14.999f, 12.0f, 14.999f)
                close()
            }
        }
        .build()
        return _settings3Fill!!
    }

private var _settings3Fill: ImageVector? = null
