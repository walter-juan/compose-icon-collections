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

public val DesignGroup.MarkPenFill: ImageVector
    get() {
        if (_markPenFill != null) {
            return _markPenFill!!
        }
        _markPenFill = Builder(name = "MarkPenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.95f, 2.39f)
                lineTo(21.607f, 8.047f)
                curveTo(21.997f, 8.438f, 21.997f, 9.071f, 21.607f, 9.461f)
                lineTo(13.828f, 17.239f)
                lineTo(11.707f, 17.947f)
                lineTo(10.293f, 19.361f)
                curveTo(9.902f, 19.751f, 9.269f, 19.751f, 8.879f, 19.361f)
                lineTo(4.636f, 15.118f)
                curveTo(4.246f, 14.728f, 4.246f, 14.094f, 4.636f, 13.704f)
                lineTo(6.05f, 12.29f)
                lineTo(6.757f, 10.168f)
                lineTo(14.536f, 2.39f)
                curveTo(14.926f, 2.0f, 15.559f, 2.0f, 15.95f, 2.39f)
                close()
                moveTo(16.657f, 5.926f)
                lineTo(10.293f, 12.29f)
                lineTo(11.707f, 13.704f)
                lineTo(18.071f, 7.34f)
                lineTo(16.657f, 5.926f)
                close()
                moveTo(4.283f, 16.886f)
                lineTo(7.111f, 19.714f)
                lineTo(5.697f, 21.128f)
                lineTo(1.454f, 19.714f)
                lineTo(4.283f, 16.886f)
                close()
            }
        }
        .build()
        return _markPenFill!!
    }

private var _markPenFill: ImageVector? = null
