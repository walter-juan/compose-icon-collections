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

public val OthersGroup.RecycleLine: ImageVector
    get() {
        if (_recycleLine != null) {
            return _recycleLine!!
        }
        _recycleLine = Builder(name = "RecycleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.56f, 12.097f)
                lineTo(21.092f, 14.75f)
                curveTo(22.059f, 16.424f, 21.485f, 18.565f, 19.811f, 19.531f)
                curveTo(19.279f, 19.838f, 18.675f, 20.0f, 18.061f, 20.0f)
                lineTo(15.998f, 20.0f)
                lineTo(15.999f, 22.5f)
                lineTo(10.999f, 19.0f)
                lineTo(15.999f, 15.5f)
                lineTo(15.998f, 18.0f)
                lineTo(18.061f, 18.0f)
                curveTo(18.324f, 18.0f, 18.583f, 17.931f, 18.811f, 17.799f)
                curveTo(19.528f, 17.385f, 19.774f, 16.468f, 19.36f, 15.75f)
                lineTo(17.829f, 13.097f)
                lineTo(19.56f, 12.097f)
                close()
                moveTo(7.303f, 9.134f)
                lineTo(7.834f, 15.214f)
                lineTo(5.668f, 13.964f)
                lineTo(4.638f, 15.75f)
                curveTo(4.506f, 15.978f, 4.437f, 16.237f, 4.437f, 16.5f)
                curveTo(4.437f, 17.329f, 5.108f, 18.0f, 5.937f, 18.0f)
                lineTo(8.999f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.937f)
                curveTo(4.004f, 20.0f, 2.437f, 18.433f, 2.437f, 16.5f)
                curveTo(2.437f, 15.886f, 2.598f, 15.282f, 2.905f, 14.75f)
                lineTo(3.936f, 12.964f)
                lineTo(1.771f, 11.714f)
                lineTo(7.303f, 9.134f)
                close()
                moveTo(13.749f, 2.969f)
                curveTo(14.281f, 3.276f, 14.723f, 3.718f, 15.03f, 4.25f)
                lineTo(16.06f, 6.036f)
                lineTo(18.226f, 4.786f)
                lineTo(17.695f, 10.866f)
                lineTo(12.164f, 8.286f)
                lineTo(14.328f, 7.036f)
                lineTo(13.298f, 5.25f)
                curveTo(13.166f, 5.022f, 12.977f, 4.833f, 12.749f, 4.701f)
                curveTo(12.031f, 4.287f, 11.114f, 4.533f, 10.7f, 5.25f)
                lineTo(9.168f, 7.903f)
                lineTo(7.436f, 6.903f)
                lineTo(8.968f, 4.25f)
                curveTo(9.934f, 2.576f, 12.075f, 2.003f, 13.749f, 2.969f)
                close()
            }
        }
        .build()
        return _recycleLine!!
    }

private var _recycleLine: ImageVector? = null
