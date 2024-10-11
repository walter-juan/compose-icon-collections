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

public val MapGroup.FootprintFill: ImageVector
    get() {
        if (_footprintFill != null) {
            return _footprintFill!!
        }
        _footprintFill = Builder(name = "FootprintFill", defaultWidth = 24.0.dp, defaultHeight =
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
        return _footprintFill!!
    }

private var _footprintFill: ImageVector? = null
