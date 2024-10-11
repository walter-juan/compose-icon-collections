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

public val EditorGroup.DeleteColumn: ImageVector
    get() {
        if (_deleteColumn != null) {
            return _deleteColumn!!
        }
        _deleteColumn = Builder(name = "DeleteColumn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                lineTo(13.0f, 12.0f)
                curveTo(13.835f, 11.372f, 14.874f, 11.0f, 16.0f, 11.0f)
                curveTo(18.761f, 11.0f, 21.0f, 13.239f, 21.0f, 16.0f)
                curveTo(21.0f, 18.761f, 18.761f, 21.0f, 16.0f, 21.0f)
                curveTo(14.968f, 21.0f, 14.009f, 20.687f, 13.213f, 20.152f)
                lineTo(13.0f, 20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 21.0f, 5.0f, 20.552f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _deleteColumn!!
    }

private var _deleteColumn: ImageVector? = null
