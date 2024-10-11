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

public val WeatherGroup.FireLine: ImageVector
    get() {
        if (_fireLine != null) {
            return _fireLine!!
        }
        _fireLine = Builder(name = "FireLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(16.142f, 23.0f, 19.5f, 19.642f, 19.5f, 15.5f)
                curveTo(19.5f, 14.634f, 19.27f, 13.803f, 19.0f, 13.03f)
                curveTo(17.333f, 14.677f, 16.067f, 15.5f, 15.2f, 15.5f)
                curveTo(19.195f, 8.5f, 17.0f, 5.5f, 11.0f, 1.5f)
                curveTo(11.5f, 6.5f, 8.204f, 8.774f, 6.862f, 10.037f)
                curveTo(5.408f, 11.405f, 4.5f, 13.346f, 4.5f, 15.5f)
                curveTo(4.5f, 19.642f, 7.858f, 23.0f, 12.0f, 23.0f)
                close()
                moveTo(12.709f, 5.235f)
                curveTo(15.951f, 7.985f, 15.967f, 10.122f, 13.463f, 14.509f)
                curveTo(12.702f, 15.842f, 13.665f, 17.5f, 15.2f, 17.5f)
                curveTo(15.888f, 17.5f, 16.584f, 17.299f, 17.319f, 16.905f)
                curveTo(16.698f, 19.262f, 14.552f, 21.0f, 12.0f, 21.0f)
                curveTo(8.962f, 21.0f, 6.5f, 18.538f, 6.5f, 15.5f)
                curveTo(6.5f, 13.961f, 7.133f, 12.528f, 8.232f, 11.493f)
                curveTo(8.358f, 11.375f, 8.997f, 10.808f, 9.025f, 10.784f)
                curveTo(9.449f, 10.402f, 9.798f, 10.066f, 10.143f, 9.697f)
                curveTo(11.373f, 8.379f, 12.257f, 6.916f, 12.709f, 5.235f)
                close()
            }
        }
        .build()
        return _fireLine!!
    }

private var _fireLine: ImageVector? = null
