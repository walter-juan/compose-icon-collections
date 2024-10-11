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

public val DesignGroup.DragDropFill: ImageVector
    get() {
        if (_dragDropFill != null) {
            return _dragDropFill!!
        }
        _dragDropFill = Builder(name = "DragDropFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 8.0f, 22.0f, 8.448f, 22.0f, 9.0f)
                verticalLineTo(16.5f)
                lineTo(16.0f, 13.0f)
                lineTo(16.036f, 21.062f)
                lineTo(18.259f, 18.913f)
                lineTo(20.041f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 22.0f, 8.0f, 21.552f, 8.0f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                curveTo(8.0f, 8.448f, 8.448f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(22.0f, 17.338f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.107f, 21.983f, 21.21f, 21.952f, 21.307f)
                lineTo(19.991f, 17.913f)
                lineTo(22.0f, 17.338f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(16.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _dragDropFill!!
    }

private var _dragDropFill: ImageVector? = null
