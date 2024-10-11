package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.StickyNoteAddFill: ImageVector
    get() {
        if (_stickyNoteAddFill != null) {
            return _stickyNoteAddFill!!
        }
        _stickyNoteAddFill = Builder(name = "StickyNoteAddFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(11.0f, 5.0f)
                curveTo(11.0f, 8.314f, 8.314f, 11.0f, 5.0f, 11.0f)
                curveTo(4.299f, 11.0f, 3.626f, 10.88f, 3.0f, 10.659f)
                verticalLineTo(20.007f)
                curveTo(3.0f, 20.555f, 3.447f, 21.0f, 3.998f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 14.45f, 14.45f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.999f)
                curveTo(21.0f, 3.447f, 20.555f, 3.0f, 20.007f, 3.0f)
                horizontalLineTo(10.659f)
                curveTo(10.88f, 3.626f, 11.0f, 4.299f, 11.0f, 5.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(16.0f, 20.997f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _stickyNoteAddFill!!
    }

private var _stickyNoteAddFill: ImageVector? = null
