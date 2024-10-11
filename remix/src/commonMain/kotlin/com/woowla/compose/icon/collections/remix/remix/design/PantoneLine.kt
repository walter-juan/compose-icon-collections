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

public val DesignGroup.PantoneLine: ImageVector
    get() {
        if (_pantoneLine != null) {
            return _pantoneLine!!
        }
        _pantoneLine = Builder(name = "PantoneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.765f, 8.0f)
                lineTo(5.469f, 7.269f)
                curveTo(5.263f, 6.757f, 5.51f, 6.175f, 6.022f, 5.968f)
                lineTo(15.294f, 2.222f)
                curveTo(15.806f, 2.015f, 16.389f, 2.262f, 16.596f, 2.774f)
                lineTo(22.215f, 16.682f)
                curveTo(22.422f, 17.194f, 22.174f, 17.777f, 21.662f, 17.984f)
                lineTo(12.39f, 21.73f)
                curveTo(11.878f, 21.937f, 11.295f, 21.689f, 11.089f, 21.177f)
                lineTo(11.0f, 20.959f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 21.0f, 6.0f, 20.552f, 6.0f, 20.0f)
                verticalLineTo(19.73f)
                lineTo(2.651f, 18.377f)
                curveTo(2.138f, 18.17f, 1.891f, 17.587f, 2.098f, 17.075f)
                lineTo(5.765f, 8.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineTo(10.209f)
                lineTo(8.0f, 13.533f)
                verticalLineTo(19.0f)
                close()
                moveTo(6.0f, 12.756f)
                lineTo(4.327f, 16.897f)
                lineTo(6.0f, 17.608f)
                verticalLineTo(12.756f)
                close()
                moveTo(7.698f, 7.447f)
                lineTo(12.568f, 19.501f)
                lineTo(19.986f, 16.504f)
                lineTo(15.116f, 4.451f)
                lineTo(7.698f, 7.447f)
                close()
                moveTo(10.677f, 9.48f)
                curveTo(10.165f, 9.687f, 9.582f, 9.439f, 9.375f, 8.927f)
                curveTo(9.168f, 8.415f, 9.415f, 7.832f, 9.927f, 7.625f)
                curveTo(10.439f, 7.418f, 11.022f, 7.666f, 11.229f, 8.178f)
                curveTo(11.436f, 8.69f, 11.189f, 9.273f, 10.677f, 9.48f)
                close()
            }
        }
        .build()
        return _pantoneLine!!
    }

private var _pantoneLine: ImageVector? = null
