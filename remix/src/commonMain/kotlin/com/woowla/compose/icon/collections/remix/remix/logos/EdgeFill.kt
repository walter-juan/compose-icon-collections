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

public val LogosGroup.EdgeFill: ImageVector
    get() {
        if (_edgeFill != null) {
            return _edgeFill!!
        }
        _edgeFill = Builder(name = "EdgeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.645f, 8.586f)
                curveTo(20.475f, 7.875f, 20.204f, 7.138f, 19.871f, 6.565f)
                curveTo(19.1f, 5.236f, 18.407f, 4.328f, 16.694f, 3.245f)
                curveTo(14.981f, 2.162f, 13.077f, 2.0f, 12.171f, 2.0f)
                curveTo(9.756f, 2.0f, 7.96f, 2.86f, 6.646f, 3.887f)
                curveTo(3.345f, 6.47f, 3.001f, 11.0f, 3.001f, 11.0f)
                curveTo(3.001f, 11.0f, 4.222f, 8.955f, 6.541f, 7.474f)
                curveTo(7.944f, 6.579f, 9.942f, 6.0f, 11.569f, 6.0f)
                curveTo(15.886f, 6.0f, 16.001f, 10.0f, 16.001f, 10.0f)
                horizontalLineTo(9.001f)
                curveTo(9.001f, 8.0f, 10.001f, 7.0f, 10.001f, 7.0f)
                curveTo(10.001f, 7.0f, 5.001f, 9.0f, 5.001f, 14.044f)
                curveTo(5.001f, 14.531f, 4.998f, 15.416f, 5.249f, 16.327f)
                curveTo(5.481f, 17.17f, 5.949f, 18.032f, 6.381f, 18.68f)
                curveTo(7.602f, 20.512f, 9.426f, 21.294f, 10.297f, 21.584f)
                curveTo(11.293f, 21.916f, 12.326f, 22.0f, 13.307f, 22.0f)
                curveTo(16.027f, 22.0f, 18.184f, 21.114f, 19.001f, 20.725f)
                verticalLineTo(16.553f)
                curveTo(18.243f, 17.007f, 16.322f, 18.0f, 14.001f, 18.0f)
                curveTo(9.001f, 18.0f, 9.001f, 14.0f, 9.001f, 14.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(11.51f)
                curveTo(21.001f, 11.51f, 20.962f, 9.917f, 20.645f, 8.586f)
                close()
            }
        }
        .build()
        return _edgeFill!!
    }

private var _edgeFill: ImageVector? = null
