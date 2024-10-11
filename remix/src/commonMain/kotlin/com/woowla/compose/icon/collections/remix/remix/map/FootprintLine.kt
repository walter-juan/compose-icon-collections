package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.FootprintLine: ImageVector
    get() {
        if (_footprintLine != null) {
            return _footprintLine!!
        }
        _footprintLine = Builder(name = "FootprintLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.25f)
                curveTo(9.5f, 20.769f, 8.269f, 22.0f, 6.75f, 22.0f)
                curveTo(5.231f, 22.0f, 4.0f, 20.769f, 4.0f, 19.25f)
                verticalLineTo(18.0f)
                close()
                moveTo(8.058f, 14.0f)
                lineTo(8.103f, 13.868f)
                curveTo(8.87f, 11.762f, 9.0f, 11.371f, 9.0f, 11.0f)
                curveTo(9.0f, 10.251f, 8.797f, 9.357f, 8.472f, 8.727f)
                curveTo(8.23f, 8.258f, 8.06f, 8.121f, 8.0f, 8.121f)
                curveTo(6.721f, 8.121f, 5.5f, 9.485f, 5.5f, 11.0f)
                curveTo(5.5f, 11.959f, 5.575f, 12.773f, 5.727f, 13.758f)
                curveTo(5.733f, 13.798f, 5.747f, 13.887f, 5.765f, 14.0f)
                horizontalLineTo(8.058f)
                close()
                moveTo(8.0f, 6.121f)
                curveTo(10.0f, 6.121f, 11.0f, 9.0f, 11.0f, 11.0f)
                curveTo(11.0f, 12.0f, 10.5f, 13.0f, 10.0f, 14.5f)
                lineTo(9.5f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 15.0f, 3.5f, 13.5f, 3.5f, 11.0f)
                curveTo(3.5f, 8.5f, 5.498f, 6.121f, 8.0f, 6.121f)
                close()
                moveTo(20.054f, 14.098f)
                lineTo(19.837f, 15.329f)
                curveTo(19.573f, 16.825f, 18.147f, 17.824f, 16.651f, 17.56f)
                curveTo(15.155f, 17.296f, 14.157f, 15.87f, 14.42f, 14.374f)
                lineTo(14.637f, 13.143f)
                lineTo(20.054f, 14.098f)
                close()
                moveTo(19.004f, 9.852f)
                curveTo(19.17f, 9.352f, 19.305f, 8.958f, 19.307f, 8.952f)
                curveTo(19.509f, 8.294f, 19.668f, 7.649f, 19.792f, 6.944f)
                curveTo(20.056f, 5.452f, 19.09f, 3.897f, 17.83f, 3.674f)
                curveTo(17.771f, 3.664f, 17.58f, 3.769f, 17.26f, 4.189f)
                curveTo(16.83f, 4.754f, 16.476f, 5.598f, 16.346f, 6.336f)
                curveTo(16.287f, 6.667f, 16.296f, 6.741f, 16.616f, 8.599f)
                curveTo(16.66f, 8.855f, 16.697f, 9.085f, 16.731f, 9.316f)
                lineTo(16.752f, 9.454f)
                lineTo(19.004f, 9.852f)
                close()
                moveTo(18.178f, 1.705f)
                curveTo(20.642f, 2.139f, 22.196f, 4.83f, 21.762f, 7.292f)
                curveTo(21.328f, 9.754f, 20.575f, 11.144f, 20.401f, 12.129f)
                lineTo(14.985f, 11.174f)
                lineTo(14.753f, 9.61f)
                curveTo(14.521f, 8.046f, 14.202f, 6.974f, 14.376f, 5.989f)
                curveTo(14.723f, 4.02f, 16.208f, 1.358f, 18.178f, 1.705f)
                close()
            }
        }
        .build()
        return _footprintLine!!
    }

private var _footprintLine: ImageVector? = null
