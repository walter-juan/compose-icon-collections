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

public val DesignGroup.BallPenFill: ImageVector
    get() {
        if (_ballPenFill != null) {
            return _ballPenFill!!
        }
        _ballPenFill = Builder(name = "BallPenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.849f, 11.805f)
                lineTo(17.142f, 11.098f)
                lineTo(7.243f, 20.997f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.755f)
                lineTo(14.314f, 5.441f)
                lineTo(19.971f, 11.098f)
                curveTo(20.361f, 11.488f, 20.361f, 12.122f, 19.971f, 12.512f)
                lineTo(12.899f, 19.583f)
                lineTo(11.485f, 18.169f)
                lineTo(17.849f, 11.805f)
                close()
                moveTo(18.556f, 2.613f)
                lineTo(21.385f, 5.441f)
                curveTo(21.775f, 5.832f, 21.775f, 6.465f, 21.385f, 6.855f)
                lineTo(19.971f, 8.269f)
                lineTo(15.728f, 4.027f)
                lineTo(17.142f, 2.613f)
                curveTo(17.533f, 2.222f, 18.166f, 2.222f, 18.556f, 2.613f)
                close()
            }
        }
        .build()
        return _ballPenFill!!
    }

private var _ballPenFill: ImageVector? = null
