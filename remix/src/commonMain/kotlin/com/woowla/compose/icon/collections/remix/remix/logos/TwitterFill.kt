package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.TwitterFill: ImageVector
    get() {
        if (_twitterFill != null) {
            return _twitterFill!!
        }
        _twitterFill = Builder(name = "TwitterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.212f, 5.656f)
                curveTo(21.449f, 5.994f, 20.639f, 6.216f, 19.811f, 6.314f)
                curveTo(20.684f, 5.791f, 21.337f, 4.969f, 21.649f, 4.0f)
                curveTo(20.829f, 4.488f, 19.931f, 4.831f, 18.994f, 5.015f)
                curveTo(18.203f, 4.171f, 17.098f, 3.693f, 15.942f, 3.694f)
                curveTo(13.633f, 3.694f, 11.76f, 5.567f, 11.76f, 7.877f)
                curveTo(11.76f, 8.205f, 11.797f, 8.522f, 11.868f, 8.829f)
                curveTo(8.39f, 8.654f, 5.31f, 6.99f, 3.247f, 4.459f)
                curveTo(2.875f, 5.098f, 2.68f, 5.823f, 2.681f, 6.562f)
                curveTo(2.681f, 8.013f, 3.42f, 9.293f, 4.541f, 10.043f)
                curveTo(3.877f, 10.022f, 3.228f, 9.843f, 2.647f, 9.52f)
                curveTo(2.647f, 9.537f, 2.647f, 9.555f, 2.647f, 9.571f)
                curveTo(2.647f, 11.598f, 4.088f, 13.289f, 6.002f, 13.673f)
                curveTo(5.643f, 13.77f, 5.272f, 13.819f, 4.9f, 13.819f)
                curveTo(4.63f, 13.819f, 4.368f, 13.794f, 4.113f, 13.745f)
                curveTo(4.645f, 15.406f, 6.189f, 16.616f, 8.02f, 16.649f)
                curveTo(6.538f, 17.812f, 4.709f, 18.443f, 2.825f, 18.44f)
                curveTo(2.492f, 18.44f, 2.159f, 18.42f, 1.828f, 18.381f)
                curveTo(3.74f, 19.61f, 5.966f, 20.263f, 8.238f, 20.26f)
                curveTo(15.932f, 20.26f, 20.138f, 13.887f, 20.138f, 8.361f)
                curveTo(20.138f, 8.18f, 20.134f, 7.999f, 20.126f, 7.82f)
                curveTo(20.944f, 7.228f, 21.651f, 6.496f, 22.212f, 5.656f)
                close()
            }
        }
        .build()
        return _twitterFill!!
    }

private var _twitterFill: ImageVector? = null
