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

public val LogosGroup.TailwindCssFill: ImageVector
    get() {
        if (_tailwindCssFill != null) {
            return _tailwindCssFill!!
        }
        _tailwindCssFill = Builder(name = "TailwindCssFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.86f)
                curveTo(8.826f, 4.86f, 6.843f, 6.447f, 6.05f, 9.62f)
                curveTo(7.24f, 8.033f, 8.628f, 7.438f, 10.215f, 7.835f)
                curveTo(11.12f, 8.061f, 11.767f, 8.718f, 12.483f, 9.445f)
                curveTo(13.651f, 10.63f, 15.0f, 12.0f, 17.95f, 12.0f)
                curveTo(21.123f, 12.0f, 23.106f, 10.413f, 23.9f, 7.24f)
                curveTo(22.71f, 8.827f, 21.321f, 9.422f, 19.735f, 9.025f)
                curveTo(18.829f, 8.799f, 18.183f, 8.142f, 17.466f, 7.415f)
                curveTo(16.299f, 6.23f, 14.95f, 4.86f, 12.0f, 4.86f)
                close()
                moveTo(6.05f, 12.0f)
                curveTo(2.876f, 12.0f, 0.893f, 13.587f, 0.1f, 16.76f)
                curveTo(1.29f, 15.173f, 2.678f, 14.578f, 4.265f, 14.975f)
                curveTo(5.17f, 15.201f, 5.817f, 15.858f, 6.534f, 16.586f)
                curveTo(7.701f, 17.77f, 9.05f, 19.14f, 12.0f, 19.14f)
                curveTo(15.173f, 19.14f, 17.156f, 17.553f, 17.95f, 14.38f)
                curveTo(16.76f, 15.967f, 15.371f, 16.562f, 13.785f, 16.165f)
                curveTo(12.879f, 15.939f, 12.233f, 15.282f, 11.516f, 14.554f)
                curveTo(10.349f, 13.37f, 9.0f, 12.0f, 6.05f, 12.0f)
                close()
            }
        }
        .build()
        return _tailwindCssFill!!
    }

private var _tailwindCssFill: ImageVector? = null
