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

public val LogosGroup.OperaFill: ImageVector
    get() {
        if (_operaFill != null) {
            return _operaFill!!
        }
        _operaFill = Builder(name = "OperaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.71f, 6.365f)
                curveTo(7.603f, 7.67f, 6.888f, 9.601f, 6.838f, 11.765f)
                verticalLineTo(12.235f)
                curveTo(6.889f, 14.4f, 7.603f, 16.328f, 8.71f, 17.634f)
                curveTo(10.144f, 19.497f, 12.276f, 20.679f, 14.659f, 20.679f)
                curveTo(16.123f, 20.679f, 17.493f, 20.232f, 18.665f, 19.453f)
                curveTo(16.9f, 21.038f, 14.563f, 22.0f, 12.001f, 22.0f)
                curveTo(11.841f, 22.0f, 11.682f, 21.997f, 11.526f, 21.988f)
                curveTo(6.221f, 21.741f, 2.001f, 17.363f, 2.001f, 12.0f)
                curveTo(2.001f, 6.476f, 6.478f, 2.0f, 12.001f, 2.0f)
                horizontalLineTo(12.038f)
                curveTo(14.584f, 2.01f, 16.905f, 2.972f, 18.666f, 4.546f)
                curveTo(17.493f, 3.771f, 16.124f, 3.32f, 14.658f, 3.32f)
                curveTo(12.276f, 3.32f, 10.144f, 4.503f, 8.708f, 6.365f)
                horizontalLineTo(8.71f)
                close()
                moveTo(22.001f, 12.0f)
                curveTo(22.001f, 14.963f, 20.713f, 17.623f, 18.666f, 19.454f)
                curveTo(16.101f, 20.704f, 13.711f, 19.83f, 12.919f, 19.283f)
                curveTo(15.439f, 18.73f, 17.342f, 15.683f, 17.342f, 12.0f)
                curveTo(17.342f, 8.315f, 15.439f, 5.271f, 12.919f, 4.717f)
                curveTo(13.71f, 4.172f, 16.101f, 3.297f, 18.666f, 4.546f)
                curveTo(20.713f, 6.375f, 22.001f, 9.038f, 22.001f, 12.0f)
                close()
            }
        }
        .build()
        return _operaFill!!
    }

private var _operaFill: ImageVector? = null
