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

public val LogosGroup.MastercardLine: ImageVector
    get() {
        if (_mastercardLine != null) {
            return _mastercardLine!!
        }
        _mastercardLine = Builder(name = "MastercardLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 18.294f)
                curveTo(10.916f, 18.933f, 9.651f, 19.3f, 8.301f, 19.3f)
                curveTo(4.269f, 19.3f, 1.001f, 16.032f, 1.001f, 12.0f)
                curveTo(1.001f, 7.968f, 4.269f, 4.7f, 8.301f, 4.7f)
                curveTo(9.651f, 4.7f, 10.916f, 5.067f, 12.001f, 5.706f)
                curveTo(13.086f, 5.067f, 14.351f, 4.7f, 15.701f, 4.7f)
                curveTo(19.733f, 4.7f, 23.001f, 7.968f, 23.001f, 12.0f)
                curveTo(23.001f, 16.032f, 19.733f, 19.3f, 15.701f, 19.3f)
                curveTo(14.351f, 19.3f, 13.086f, 18.933f, 12.001f, 18.294f)
                close()
                moveTo(13.703f, 16.91f)
                curveTo(14.319f, 17.162f, 14.994f, 17.3f, 15.701f, 17.3f)
                curveTo(18.628f, 17.3f, 21.001f, 14.927f, 21.001f, 12.0f)
                curveTo(21.001f, 9.073f, 18.628f, 6.7f, 15.701f, 6.7f)
                curveTo(14.994f, 6.7f, 14.319f, 6.838f, 13.703f, 7.09f)
                curveTo(14.882f, 8.386f, 15.601f, 10.109f, 15.601f, 12.0f)
                curveTo(15.601f, 13.891f, 14.882f, 15.614f, 13.703f, 16.91f)
                close()
                moveTo(10.299f, 7.09f)
                curveTo(9.683f, 6.838f, 9.008f, 6.7f, 8.301f, 6.7f)
                curveTo(5.374f, 6.7f, 3.001f, 9.073f, 3.001f, 12.0f)
                curveTo(3.001f, 14.927f, 5.374f, 17.3f, 8.301f, 17.3f)
                curveTo(9.008f, 17.3f, 9.683f, 17.162f, 10.299f, 16.91f)
                curveTo(9.12f, 15.614f, 8.401f, 13.891f, 8.401f, 12.0f)
                curveTo(8.401f, 10.109f, 9.12f, 8.386f, 10.299f, 7.09f)
                close()
                moveTo(12.001f, 8.205f)
                curveTo(11.014f, 9.168f, 10.401f, 10.512f, 10.401f, 12.0f)
                curveTo(10.401f, 13.488f, 11.014f, 14.832f, 12.001f, 15.795f)
                curveTo(12.988f, 14.832f, 13.601f, 13.488f, 13.601f, 12.0f)
                curveTo(13.601f, 10.512f, 12.988f, 9.168f, 12.001f, 8.205f)
                close()
            }
        }
        .build()
        return _mastercardLine!!
    }

private var _mastercardLine: ImageVector? = null
