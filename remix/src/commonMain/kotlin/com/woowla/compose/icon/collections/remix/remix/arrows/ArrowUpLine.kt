package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowUpLine: ImageVector
    get() {
        if (_arrowUpLine != null) {
            return _arrowUpLine!!
        }
        _arrowUpLine = Builder(name = "ArrowUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.828f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.828f)
                lineTo(5.636f, 13.192f)
                lineTo(4.222f, 11.778f)
                lineTo(12.0f, 4.0f)
                lineTo(19.778f, 11.778f)
                lineTo(18.364f, 13.192f)
                lineTo(13.0f, 7.828f)
                close()
            }
        }
        .build()
        return _arrowUpLine!!
    }

private var _arrowUpLine: ImageVector? = null
