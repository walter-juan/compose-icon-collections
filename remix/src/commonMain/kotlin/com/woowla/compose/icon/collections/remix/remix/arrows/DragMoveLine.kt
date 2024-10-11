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

public val ArrowsGroup.DragMoveLine: ImageVector
    get() {
        if (_dragMoveLine != null) {
            return _dragMoveLine!!
        }
        _dragMoveLine = Builder(name = "DragMoveLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(16.243f, 6.243f)
                lineTo(14.828f, 7.657f)
                lineTo(12.0f, 4.828f)
                lineTo(9.172f, 7.657f)
                lineTo(7.757f, 6.243f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineTo(6.243f, 7.757f)
                lineTo(7.657f, 9.172f)
                lineTo(4.828f, 12.0f)
                lineTo(7.657f, 14.828f)
                lineTo(6.243f, 16.243f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(17.757f, 16.243f)
                lineTo(16.343f, 14.828f)
                lineTo(19.172f, 12.0f)
                lineTo(16.343f, 9.172f)
                lineTo(17.757f, 7.757f)
                lineTo(22.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(7.757f, 17.757f)
                lineTo(9.172f, 16.343f)
                lineTo(12.0f, 19.172f)
                lineTo(14.828f, 16.343f)
                lineTo(16.243f, 17.757f)
                lineTo(12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _dragMoveLine!!
    }

private var _dragMoveLine: ImageVector? = null
