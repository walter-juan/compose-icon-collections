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

public val LogosGroup.HonorOfKingsLine: ImageVector
    get() {
        if (_honorOfKingsLine != null) {
            return _honorOfKingsLine!!
        }
        _honorOfKingsLine = Builder(name = "HonorOfKingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.329f, 4.256f)
                lineTo(16.906f, 5.679f)
                curveTo(13.768f, 3.237f, 9.229f, 3.459f, 6.344f, 6.343f)
                curveTo(3.97f, 8.717f, 3.4f, 12.211f, 4.634f, 15.123f)
                lineTo(7.051f, 12.706f)
                curveTo(6.838f, 11.203f, 7.309f, 9.621f, 8.465f, 8.464f)
                curveTo(10.176f, 6.754f, 12.817f, 6.542f, 14.758f, 7.828f)
                lineTo(13.294f, 9.292f)
                curveTo(12.179f, 8.76f, 10.803f, 8.955f, 9.88f, 9.879f)
                curveTo(8.956f, 10.802f, 8.761f, 12.178f, 9.293f, 13.293f)
                lineTo(2.843f, 19.742f)
                curveTo(2.809f, 16.243f, 2.252f, 14.931f, 2.055f, 13.041f)
                curveTo(1.754f, 10.147f, 2.712f, 7.147f, 4.93f, 4.929f)
                curveTo(8.596f, 1.263f, 14.401f, 1.038f, 18.329f, 4.256f)
                close()
                moveTo(21.159f, 4.258f)
                curveTo(21.193f, 7.757f, 21.75f, 9.069f, 21.947f, 10.959f)
                curveTo(22.248f, 13.853f, 21.29f, 16.853f, 19.072f, 19.071f)
                curveTo(15.406f, 22.737f, 9.601f, 22.962f, 5.673f, 19.744f)
                lineTo(7.096f, 18.321f)
                curveTo(10.234f, 20.763f, 14.773f, 20.541f, 17.658f, 17.657f)
                curveTo(20.032f, 15.283f, 20.602f, 11.789f, 19.368f, 8.877f)
                lineTo(16.951f, 11.294f)
                curveTo(17.164f, 12.797f, 16.693f, 14.379f, 15.536f, 15.535f)
                curveTo(13.826f, 17.246f, 11.185f, 17.458f, 9.244f, 16.172f)
                lineTo(10.708f, 14.708f)
                curveTo(11.823f, 15.24f, 13.199f, 15.045f, 14.122f, 14.121f)
                curveTo(15.046f, 13.198f, 15.241f, 11.822f, 14.709f, 10.707f)
                lineTo(21.159f, 4.258f)
                close()
            }
        }
        .build()
        return _honorOfKingsLine!!
    }

private var _honorOfKingsLine: ImageVector? = null
