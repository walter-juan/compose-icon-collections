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

public val ArrowsGroup.DragMoveFill: ImageVector
    get() {
        if (_dragMoveFill != null) {
            return _dragMoveFill!!
        }
        _dragMoveFill = Builder(name = "DragMoveFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineTo(6.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(18.0f, 16.0f)
                verticalLineTo(8.0f)
                lineTo(22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _dragMoveFill!!
    }

private var _dragMoveFill: ImageVector? = null
