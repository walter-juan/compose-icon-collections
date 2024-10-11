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

public val EditorGroup.InputCursorMove: ImageVector
    get() {
        if (_inputCursorMove != null) {
            return _inputCursorMove!!
        }
        _inputCursorMove = Builder(name = "InputCursorMove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.05f, 7.05f)
                lineTo(23.0f, 12.0f)
                lineTo(18.05f, 16.95f)
                lineTo(16.636f, 15.535f)
                lineTo(20.172f, 12.0f)
                lineTo(16.636f, 8.464f)
                lineTo(18.05f, 7.05f)
                close()
                moveTo(5.95f, 7.05f)
                lineTo(7.364f, 8.464f)
                lineTo(3.828f, 12.0f)
                lineTo(7.364f, 15.535f)
                lineTo(5.95f, 16.95f)
                lineTo(1.0f, 12.0f)
                lineTo(5.95f, 7.05f)
                close()
            }
        }
        .build()
        return _inputCursorMove!!
    }

private var _inputCursorMove: ImageVector? = null
