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

public val DocumentGroup.StickyNoteAddLine: ImageVector
    get() {
        if (_stickyNoteAddLine != null) {
            return _stickyNoteAddLine!!
        }
        _stickyNoteAddLine = Builder(name = "StickyNoteAddLine", defaultWidth = 24.0.dp,
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
                moveTo(3.0f, 20.007f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 13.45f, 13.45f, 13.0f, 14.0f, 13.0f)
                lineTo(19.0f, 12.999f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 3.0f, 21.0f, 3.456f, 21.0f, 4.002f)
                verticalLineTo(15.0f)
                lineTo(15.0f, 20.996f)
                lineTo(4.002f, 21.0f)
                curveTo(3.449f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                close()
                moveTo(18.171f, 14.999f)
                lineTo(15.0f, 15.0f)
                verticalLineTo(18.169f)
                lineTo(18.171f, 14.999f)
                close()
            }
        }
        .build()
        return _stickyNoteAddLine!!
    }

private var _stickyNoteAddLine: ImageVector? = null