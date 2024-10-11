package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.HandHeartFill: ImageVector
    get() {
        if (_handHeartFill != null) {
            return _handHeartFill!!
        }
        _handHeartFill = Builder(name = "HandHeartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.335f, 11.502f)
                lineTo(11.505f, 11.503f)
                curveTo(13.99f, 11.503f, 16.005f, 13.517f, 16.005f, 16.003f)
                lineTo(9.004f, 16.002f)
                lineTo(9.005f, 17.003f)
                lineTo(17.005f, 17.002f)
                verticalLineTo(16.003f)
                curveTo(17.005f, 14.92f, 16.687f, 13.9f, 16.119f, 13.002f)
                lineTo(19.005f, 13.003f)
                curveTo(20.997f, 13.003f, 22.717f, 14.168f, 23.521f, 15.854f)
                curveTo(21.156f, 18.975f, 17.327f, 21.003f, 13.005f, 21.003f)
                curveTo(10.244f, 21.003f, 7.904f, 20.412f, 6.004f, 19.378f)
                lineTo(6.006f, 10.074f)
                curveTo(7.251f, 10.252f, 8.391f, 10.758f, 9.335f, 11.502f)
                close()
                moveTo(4.005f, 9.003f)
                curveTo(4.518f, 9.003f, 4.94f, 9.389f, 4.998f, 9.886f)
                lineTo(5.005f, 10.002f)
                verticalLineTo(19.003f)
                curveTo(5.005f, 19.555f, 4.557f, 20.003f, 4.005f, 20.003f)
                horizontalLineTo(2.005f)
                curveTo(1.453f, 20.003f, 1.005f, 19.555f, 1.005f, 19.003f)
                verticalLineTo(10.003f)
                curveTo(1.005f, 9.45f, 1.453f, 9.003f, 2.005f, 9.003f)
                horizontalLineTo(4.005f)
                close()
                moveTo(13.651f, 3.578f)
                lineTo(14.005f, 3.932f)
                lineTo(14.358f, 3.578f)
                curveTo(15.335f, 2.602f, 16.918f, 2.602f, 17.894f, 3.578f)
                curveTo(18.87f, 4.554f, 18.87f, 6.137f, 17.894f, 7.114f)
                lineTo(14.005f, 11.003f)
                lineTo(10.116f, 7.114f)
                curveTo(9.139f, 6.137f, 9.139f, 4.554f, 10.116f, 3.578f)
                curveTo(11.092f, 2.602f, 12.675f, 2.602f, 13.651f, 3.578f)
                close()
            }
        }
        .build()
        return _handHeartFill!!
    }

private var _handHeartFill: ImageVector? = null
