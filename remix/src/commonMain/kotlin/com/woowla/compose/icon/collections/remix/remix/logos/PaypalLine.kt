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

public val LogosGroup.PaypalLine: ImageVector
    get() {
        if (_paypalLine != null) {
            return _paypalLine!!
        }
        _paypalLine = Builder(name = "PaypalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.496f, 20.667f)
                horizontalLineTo(10.047f)
                lineTo(10.585f, 17.291f)
                curveTo(10.801f, 15.93f, 11.975f, 14.925f, 13.354f, 14.925f)
                horizontalLineTo(13.854f)
                curveTo(16.532f, 14.925f, 17.915f, 13.942f, 18.406f, 11.422f)
                curveTo(18.613f, 10.356f, 18.522f, 9.692f, 18.234f, 9.32f)
                curveTo(17.027f, 12.374f, 14.445f, 13.479f, 11.273f, 13.479f)
                horizontalLineTo(10.388f)
                curveTo(10.004f, 13.479f, 9.595f, 13.689f, 9.536f, 14.06f)
                lineTo(8.496f, 20.667f)
                close()
                moveTo(3.552f, 20.373f)
                curveTo(3.214f, 20.373f, 2.955f, 20.071f, 3.008f, 19.736f)
                lineTo(5.682f, 2.776f)
                curveTo(5.753f, 2.329f, 6.138f, 2.0f, 6.59f, 2.0f)
                horizontalLineTo(13.014f)
                curveTo(15.226f, 2.0f, 16.956f, 2.467f, 17.913f, 3.558f)
                curveTo(18.783f, 4.549f, 19.036f, 5.642f, 18.785f, 7.25f)
                curveTo(19.144f, 7.441f, 19.452f, 7.675f, 19.7f, 7.956f)
                curveTo(20.518f, 8.889f, 20.678f, 10.216f, 20.368f, 11.805f)
                curveTo(19.628f, 15.611f, 17.093f, 16.925f, 13.854f, 16.925f)
                horizontalLineTo(13.354f)
                curveTo(12.959f, 16.925f, 12.623f, 17.214f, 12.561f, 17.605f)
                lineTo(11.858f, 21.988f)
                curveTo(11.796f, 22.379f, 11.459f, 22.667f, 11.064f, 22.667f)
                horizontalLineTo(6.721f)
                curveTo(6.424f, 22.667f, 6.198f, 22.402f, 6.244f, 22.109f)
                lineTo(6.518f, 20.373f)
                horizontalLineTo(3.552f)
                close()
                moveTo(10.388f, 11.479f)
                horizontalLineTo(11.273f)
                curveTo(14.462f, 11.479f, 16.167f, 10.267f, 16.755f, 7.25f)
                curveTo(16.774f, 7.149f, 16.792f, 7.047f, 16.809f, 6.941f)
                curveTo(16.975f, 5.882f, 16.859f, 5.388f, 16.41f, 4.878f)
                curveTo(15.945f, 4.348f, 14.807f, 4.0f, 13.014f, 4.0f)
                horizontalLineTo(7.514f)
                lineTo(5.247f, 18.373f)
                horizontalLineTo(6.808f)
                lineTo(7.538f, 13.745f)
                lineTo(7.546f, 13.746f)
                curveTo(7.846f, 12.43f, 9.017f, 11.479f, 10.388f, 11.479f)
                close()
            }
        }
        .build()
        return _paypalLine!!
    }

private var _paypalLine: ImageVector? = null
