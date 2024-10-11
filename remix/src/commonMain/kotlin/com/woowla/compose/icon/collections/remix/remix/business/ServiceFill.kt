package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ServiceFill: ImageVector
    get() {
        if (_serviceFill != null) {
            return _serviceFill!!
        }
        _serviceFill = Builder(name = "ServiceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 10.479f)
                curveTo(13.731f, 10.089f, 13.098f, 10.089f, 12.707f, 10.479f)
                lineTo(12.0f, 11.186f)
                curveTo(11.219f, 11.967f, 9.953f, 11.967f, 9.172f, 11.186f)
                curveTo(8.39f, 10.405f, 8.39f, 9.139f, 9.172f, 8.358f)
                lineTo(14.802f, 2.726f)
                curveTo(16.906f, 2.25f, 19.201f, 2.831f, 20.839f, 4.469f)
                curveTo(23.258f, 6.888f, 23.372f, 10.74f, 21.179f, 13.294f)
                lineTo(19.071f, 15.429f)
                lineTo(14.121f, 10.479f)
                close()
                moveTo(3.161f, 4.469f)
                curveTo(5.335f, 2.295f, 8.664f, 1.983f, 11.17f, 3.531f)
                lineTo(7.757f, 6.944f)
                curveTo(6.195f, 8.506f, 6.195f, 11.038f, 7.757f, 12.601f)
                curveTo(9.272f, 14.115f, 11.7f, 14.161f, 13.269f, 12.738f)
                lineTo(13.414f, 12.601f)
                lineTo(17.657f, 16.843f)
                lineTo(13.414f, 21.086f)
                curveTo(12.633f, 21.867f, 11.367f, 21.867f, 10.586f, 21.086f)
                lineTo(3.161f, 13.661f)
                curveTo(0.623f, 11.123f, 0.623f, 7.007f, 3.161f, 4.469f)
                close()
            }
        }
        .build()
        return _serviceFill!!
    }

private var _serviceFill: ImageVector? = null
