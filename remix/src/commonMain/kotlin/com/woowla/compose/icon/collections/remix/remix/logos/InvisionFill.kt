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

public val LogosGroup.InvisionFill: ImageVector
    get() {
        if (_invisionFill != null) {
            return _invisionFill!!
        }
        _invisionFill = Builder(name = "InvisionFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 3.0f)
                horizontalLineTo(20.001f)
                curveTo(20.553f, 3.0f, 21.001f, 3.448f, 21.001f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.001f, 20.552f, 20.553f, 21.0f, 20.001f, 21.0f)
                horizontalLineTo(4.001f)
                curveTo(3.449f, 21.0f, 3.001f, 20.552f, 3.001f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.001f, 3.448f, 3.449f, 3.0f, 4.001f, 3.0f)
                close()
                moveTo(6.989f, 14.065f)
                curveTo(6.928f, 14.332f, 6.898f, 14.62f, 6.898f, 14.855f)
                curveTo(6.898f, 15.782f, 7.381f, 16.397f, 8.407f, 16.397f)
                curveTo(9.258f, 16.397f, 9.948f, 15.871f, 10.445f, 15.022f)
                lineTo(10.142f, 16.289f)
                horizontalLineTo(11.832f)
                lineTo(12.798f, 12.258f)
                curveTo(13.04f, 11.237f, 13.507f, 10.707f, 14.217f, 10.707f)
                curveTo(14.775f, 10.707f, 15.122f, 11.069f, 15.122f, 11.665f)
                curveTo(15.122f, 11.838f, 15.107f, 12.026f, 15.047f, 12.23f)
                lineTo(14.549f, 14.083f)
                curveTo(14.473f, 14.35f, 14.443f, 14.617f, 14.443f, 14.868f)
                curveTo(14.443f, 15.748f, 14.941f, 16.391f, 15.982f, 16.391f)
                curveTo(16.873f, 16.391f, 17.582f, 15.795f, 17.975f, 14.366f)
                lineTo(17.311f, 14.099f)
                curveTo(16.979f, 15.057f, 16.692f, 15.23f, 16.465f, 15.23f)
                curveTo(16.239f, 15.23f, 16.118f, 15.073f, 16.118f, 14.759f)
                curveTo(16.118f, 14.618f, 16.149f, 14.461f, 16.194f, 14.272f)
                lineTo(16.677f, 12.467f)
                curveTo(16.797f, 12.043f, 16.843f, 11.667f, 16.843f, 11.322f)
                curveTo(16.843f, 9.971f, 16.058f, 9.267f, 15.107f, 9.267f)
                curveTo(14.217f, 9.267f, 13.311f, 10.102f, 12.858f, 10.982f)
                lineTo(13.19f, 9.403f)
                horizontalLineTo(10.61f)
                lineTo(10.248f, 10.794f)
                horizontalLineTo(11.455f)
                lineTo(10.711f, 13.891f)
                curveTo(10.127f, 15.241f, 9.055f, 15.263f, 8.92f, 15.231f)
                curveTo(8.699f, 15.18f, 8.558f, 15.092f, 8.558f, 14.793f)
                curveTo(8.558f, 14.621f, 8.588f, 14.373f, 8.664f, 14.075f)
                lineTo(9.796f, 9.403f)
                horizontalLineTo(6.928f)
                lineTo(6.566f, 10.794f)
                horizontalLineTo(7.758f)
                lineTo(6.989f, 14.065f)
                close()
                moveTo(8.626f, 8.625f)
                curveTo(9.247f, 8.625f, 9.751f, 8.121f, 9.751f, 7.5f)
                curveTo(9.751f, 6.879f, 9.247f, 6.375f, 8.626f, 6.375f)
                curveTo(8.005f, 6.375f, 7.501f, 6.879f, 7.501f, 7.5f)
                curveTo(7.501f, 8.121f, 8.005f, 8.625f, 8.626f, 8.625f)
                close()
            }
        }
        .build()
        return _invisionFill!!
    }

private var _invisionFill: ImageVector? = null
