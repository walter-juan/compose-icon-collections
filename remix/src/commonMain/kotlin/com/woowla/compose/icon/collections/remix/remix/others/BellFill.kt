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

public val OthersGroup.BellFill: ImageVector
    get() {
        if (_bellFill != null) {
            return _bellFill!!
        }
        _bellFill = Builder(name = "BellFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.414f, 10.586f)
                lineTo(13.894f, 11.072f)
                lineTo(14.358f, 11.557f)
                lineTo(14.818f, 12.049f)
                curveTo(18.276f, 15.813f, 20.29f, 19.267f, 19.425f, 20.132f)
                curveTo(19.024f, 20.532f, 18.069f, 20.316f, 16.785f, 19.625f)
                curveTo(13.584f, 21.638f, 9.39f, 21.441f, 6.382f, 19.033f)
                lineTo(9.362f, 16.054f)
                curveTo(10.029f, 16.232f, 10.77f, 16.059f, 11.293f, 15.536f)
                curveTo(12.074f, 14.755f, 12.074f, 13.488f, 11.293f, 12.707f)
                curveTo(10.512f, 11.926f, 9.246f, 11.926f, 8.464f, 12.707f)
                curveTo(7.981f, 13.19f, 7.797f, 13.859f, 7.912f, 14.484f)
                lineTo(7.947f, 14.639f)
                lineTo(4.968f, 17.618f)
                curveTo(2.559f, 14.611f, 2.362f, 10.416f, 4.376f, 7.214f)
                curveTo(3.684f, 5.931f, 3.468f, 4.976f, 3.868f, 4.575f)
                curveTo(4.845f, 3.599f, 9.118f, 6.29f, 13.414f, 10.586f)
                close()
                moveTo(19.778f, 4.222f)
                curveTo(20.559f, 5.003f, 20.559f, 6.269f, 19.778f, 7.05f)
                curveTo(19.725f, 7.103f, 19.67f, 7.152f, 19.614f, 7.198f)
                curveTo(21.23f, 9.754f, 21.433f, 12.95f, 20.221f, 15.668f)
                curveTo(19.032f, 13.714f, 17.151f, 11.495f, 14.828f, 9.172f)
                lineTo(14.29f, 8.64f)
                curveTo(12.163f, 6.562f, 10.135f, 4.876f, 8.333f, 3.779f)
                curveTo(11.05f, 2.567f, 14.246f, 2.77f, 16.804f, 4.387f)
                curveTo(16.848f, 4.33f, 16.897f, 4.275f, 16.95f, 4.222f)
                curveTo(17.731f, 3.441f, 18.997f, 3.441f, 19.778f, 4.222f)
                close()
            }
        }
        .build()
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
