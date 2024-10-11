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

public val EditorGroup.FormatClear: ImageVector
    get() {
        if (_formatClear != null) {
            return _formatClear!!
        }
        _formatClear = Builder(name = "FormatClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.651f, 14.065f)
                lineTo(11.605f, 20.0f)
                horizontalLineTo(9.574f)
                lineTo(10.925f, 12.339f)
                lineTo(3.515f, 4.929f)
                lineTo(4.929f, 3.515f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(12.651f, 14.065f)
                close()
                moveTo(11.773f, 7.53f)
                lineTo(12.042f, 6.0f)
                horizontalLineTo(10.243f)
                lineTo(8.243f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.073f)
                lineTo(13.499f, 9.257f)
                lineTo(11.773f, 7.53f)
                close()
            }
        }
        .build()
        return _formatClear!!
    }

private var _formatClear: ImageVector? = null
