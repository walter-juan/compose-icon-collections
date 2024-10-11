package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.Mic2Fill: ImageVector
    get() {
        if (_mic2Fill != null) {
            return _mic2Fill!!
        }
        _mic2Fill = Builder(name = "Mic2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(14.762f, 1.0f, 17.0f, 3.239f, 17.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 14.761f, 14.762f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 3.239f, 9.239f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.192f, 13.962f)
                lineTo(4.154f, 13.569f)
                curveTo(4.883f, 17.236f, 8.119f, 20.0f, 12.0f, 20.0f)
                curveTo(15.881f, 20.0f, 19.117f, 17.236f, 19.846f, 13.569f)
                lineTo(21.808f, 13.962f)
                curveTo(20.896f, 18.545f, 16.852f, 22.0f, 12.0f, 22.0f)
                curveTo(7.149f, 22.0f, 3.104f, 18.545f, 2.192f, 13.962f)
                close()
            }
        }
        .build()
        return _mic2Fill!!
    }

private var _mic2Fill: ImageVector? = null
