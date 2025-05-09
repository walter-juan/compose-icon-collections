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

public val EditorGroup.DeleteRow: ImageVector
    get() {
        if (_deleteRow != null) {
            return _deleteRow!!
        }
        _deleteRow = Builder(name = "DeleteRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(21.0f, 12.552f, 20.552f, 13.0f, 20.0f, 13.0f)
                curveTo(20.628f, 13.835f, 21.0f, 14.874f, 21.0f, 16.0f)
                curveTo(21.0f, 18.761f, 18.761f, 21.0f, 16.0f, 21.0f)
                curveTo(13.239f, 21.0f, 11.0f, 18.761f, 11.0f, 16.0f)
                curveTo(11.0f, 14.874f, 11.372f, 13.835f, 12.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _deleteRow!!
    }

private var _deleteRow: ImageVector? = null
