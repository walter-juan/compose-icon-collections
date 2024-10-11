package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.PantoneFill: ImageVector
    get() {
        if (_pantoneFill != null) {
            return _pantoneFill!!
        }
        _pantoneFill = Builder(name = "PantoneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.922f)
                lineTo(2.651f, 18.377f)
                curveTo(2.138f, 18.17f, 1.891f, 17.587f, 2.098f, 17.075f)
                lineTo(4.0f, 12.367f)
                verticalLineTo(18.922f)
                close()
                moveTo(8.86f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 21.0f, 6.0f, 20.552f, 6.0f, 20.0f)
                verticalLineTo(13.922f)
                lineTo(8.86f, 21.0f)
                close()
                moveTo(6.022f, 5.968f)
                lineTo(15.294f, 2.222f)
                curveTo(15.806f, 2.015f, 16.389f, 2.262f, 16.596f, 2.774f)
                lineTo(22.215f, 16.682f)
                curveTo(22.422f, 17.194f, 22.174f, 17.777f, 21.662f, 17.984f)
                lineTo(12.39f, 21.73f)
                curveTo(11.878f, 21.937f, 11.295f, 21.689f, 11.089f, 21.177f)
                lineTo(5.469f, 7.269f)
                curveTo(5.263f, 6.757f, 5.51f, 6.175f, 6.022f, 5.968f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(9.552f, 9.0f, 10.0f, 8.552f, 10.0f, 8.0f)
                curveTo(10.0f, 7.448f, 9.552f, 7.0f, 9.0f, 7.0f)
                curveTo(8.448f, 7.0f, 8.0f, 7.448f, 8.0f, 8.0f)
                curveTo(8.0f, 8.552f, 8.448f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _pantoneFill!!
    }

private var _pantoneFill: ImageVector? = null
