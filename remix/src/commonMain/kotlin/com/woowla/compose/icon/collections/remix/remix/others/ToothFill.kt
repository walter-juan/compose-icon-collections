package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ToothFill: ImageVector
    get() {
        if (_toothFill != null) {
            return _toothFill!!
        }
        _toothFill = Builder(name = "ToothFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.232f)
                curveTo(13.582f, 4.057f, 14.783f, 5.513f, 15.266f, 7.266f)
                curveTo(15.413f, 7.798f, 15.964f, 8.111f, 16.496f, 7.964f)
                curveTo(17.029f, 7.817f, 17.341f, 7.266f, 17.194f, 6.734f)
                curveTo(16.735f, 5.068f, 15.781f, 3.607f, 14.5f, 2.519f)
                curveTo(14.665f, 2.506f, 14.832f, 2.5f, 15.0f, 2.5f)
                curveTo(17.007f, 2.5f, 18.679f, 3.228f, 19.831f, 4.61f)
                curveTo(20.962f, 5.967f, 21.5f, 7.846f, 21.5f, 10.0f)
                curveTo(21.5f, 13.097f, 20.986f, 15.865f, 20.105f, 17.898f)
                curveTo(19.265f, 19.836f, 17.897f, 21.5f, 16.0f, 21.5f)
                curveTo(14.9f, 21.5f, 14.213f, 20.848f, 13.805f, 20.14f)
                curveTo(13.443f, 19.511f, 13.227f, 18.717f, 13.053f, 18.078f)
                curveTo(12.846f, 17.318f, 12.687f, 16.75f, 12.462f, 16.358f)
                curveTo(12.275f, 16.035f, 12.15f, 16.0f, 12.0f, 16.0f)
                curveTo(11.85f, 16.0f, 11.725f, 16.035f, 11.538f, 16.358f)
                curveTo(11.313f, 16.75f, 11.154f, 17.318f, 10.947f, 18.078f)
                lineTo(10.947f, 18.078f)
                curveTo(10.773f, 18.717f, 10.557f, 19.511f, 10.195f, 20.14f)
                curveTo(9.787f, 20.848f, 9.1f, 21.5f, 8.0f, 21.5f)
                curveTo(6.103f, 21.5f, 4.735f, 19.836f, 3.895f, 17.898f)
                curveTo(3.014f, 15.865f, 2.5f, 13.097f, 2.5f, 10.0f)
                curveTo(2.5f, 7.846f, 3.038f, 5.967f, 4.169f, 4.61f)
                curveTo(5.321f, 3.228f, 6.993f, 2.5f, 9.0f, 2.5f)
                curveTo(9.009f, 2.5f, 9.019f, 2.5f, 9.028f, 2.5f)
                curveTo(10.099f, 2.505f, 11.11f, 2.769f, 12.0f, 3.232f)
                curveTo(12.0f, 3.232f, 12.0f, 3.232f, 12.0f, 3.232f)
                close()
            }
        }
        .build()
        return _toothFill!!
    }

private var _toothFill: ImageVector? = null
