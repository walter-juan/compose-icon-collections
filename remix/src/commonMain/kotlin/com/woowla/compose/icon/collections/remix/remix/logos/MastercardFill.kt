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

public val LogosGroup.MastercardFill: ImageVector
    get() {
        if (_mastercardFill != null) {
            return _mastercardFill!!
        }
        _mastercardFill = Builder(name = "MastercardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 6.654f)
                curveTo(13.582f, 7.899f, 14.597f, 9.83f, 14.597f, 11.998f)
                curveTo(14.597f, 14.166f, 13.582f, 16.097f, 12.001f, 17.341f)
                curveTo(10.42f, 16.097f, 9.405f, 14.166f, 9.405f, 11.998f)
                curveTo(9.405f, 9.83f, 10.42f, 7.899f, 12.001f, 6.654f)
                close()
                moveTo(11.132f, 6.072f)
                curveTo(9.46f, 7.502f, 8.401f, 9.627f, 8.401f, 12.0f)
                curveTo(8.401f, 14.371f, 9.459f, 16.495f, 11.128f, 17.926f)
                curveTo(10.144f, 18.479f, 9.008f, 18.795f, 7.799f, 18.795f)
                curveTo(4.044f, 18.795f, 1.001f, 15.752f, 1.001f, 11.998f)
                curveTo(1.001f, 8.243f, 4.044f, 5.2f, 7.799f, 5.2f)
                curveTo(9.01f, 5.2f, 10.147f, 5.517f, 11.132f, 6.072f)
                close()
                moveTo(12.873f, 17.926f)
                curveTo(14.543f, 16.495f, 15.601f, 14.371f, 15.601f, 12.0f)
                curveTo(15.601f, 9.627f, 14.542f, 7.502f, 12.87f, 6.072f)
                curveTo(13.855f, 5.517f, 14.992f, 5.2f, 16.203f, 5.2f)
                curveTo(19.958f, 5.2f, 23.001f, 8.243f, 23.001f, 11.998f)
                curveTo(23.001f, 15.752f, 19.958f, 18.795f, 16.203f, 18.795f)
                curveTo(14.993f, 18.795f, 13.858f, 18.479f, 12.873f, 17.926f)
                close()
            }
        }
        .build()
        return _mastercardFill!!
    }

private var _mastercardFill: ImageVector? = null
