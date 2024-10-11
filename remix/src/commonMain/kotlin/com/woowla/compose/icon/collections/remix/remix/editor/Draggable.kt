package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.Draggable: ImageVector
    get() {
        if (_draggable != null) {
            return _draggable!!
        }
        _draggable = Builder(name = "Draggable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                curveTo(9.328f, 7.0f, 10.0f, 6.328f, 10.0f, 5.5f)
                curveTo(10.0f, 4.672f, 9.328f, 4.0f, 8.5f, 4.0f)
                curveTo(7.672f, 4.0f, 7.0f, 4.672f, 7.0f, 5.5f)
                curveTo(7.0f, 6.328f, 7.672f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(8.5f, 13.5f)
                curveTo(9.328f, 13.5f, 10.0f, 12.828f, 10.0f, 12.0f)
                curveTo(10.0f, 11.172f, 9.328f, 10.5f, 8.5f, 10.5f)
                curveTo(7.672f, 10.5f, 7.0f, 11.172f, 7.0f, 12.0f)
                curveTo(7.0f, 12.828f, 7.672f, 13.5f, 8.5f, 13.5f)
                close()
                moveTo(10.0f, 18.5f)
                curveTo(10.0f, 19.328f, 9.328f, 20.0f, 8.5f, 20.0f)
                curveTo(7.672f, 20.0f, 7.0f, 19.328f, 7.0f, 18.5f)
                curveTo(7.0f, 17.672f, 7.672f, 17.0f, 8.5f, 17.0f)
                curveTo(9.328f, 17.0f, 10.0f, 17.672f, 10.0f, 18.5f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.328f, 7.0f, 17.0f, 6.328f, 17.0f, 5.5f)
                curveTo(17.0f, 4.672f, 16.328f, 4.0f, 15.5f, 4.0f)
                curveTo(14.672f, 4.0f, 14.0f, 4.672f, 14.0f, 5.5f)
                curveTo(14.0f, 6.328f, 14.672f, 7.0f, 15.5f, 7.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.828f, 16.328f, 13.5f, 15.5f, 13.5f)
                curveTo(14.672f, 13.5f, 14.0f, 12.828f, 14.0f, 12.0f)
                curveTo(14.0f, 11.172f, 14.672f, 10.5f, 15.5f, 10.5f)
                curveTo(16.328f, 10.5f, 17.0f, 11.172f, 17.0f, 12.0f)
                close()
                moveTo(15.5f, 20.0f)
                curveTo(16.328f, 20.0f, 17.0f, 19.328f, 17.0f, 18.5f)
                curveTo(17.0f, 17.672f, 16.328f, 17.0f, 15.5f, 17.0f)
                curveTo(14.672f, 17.0f, 14.0f, 17.672f, 14.0f, 18.5f)
                curveTo(14.0f, 19.328f, 14.672f, 20.0f, 15.5f, 20.0f)
                close()
            }
        }
        .build()
        return _draggable!!
    }

private var _draggable: ImageVector? = null
