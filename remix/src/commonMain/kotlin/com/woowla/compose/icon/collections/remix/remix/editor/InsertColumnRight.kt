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

public val EditorGroup.InsertColumnRight: ImageVector
    get() {
        if (_insertColumnRight != null) {
            return _insertColumnRight!!
        }
        _insertColumnRight = Builder(name = "InsertColumnRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(10.552f, 3.0f, 11.0f, 3.448f, 11.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.552f, 10.552f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(18.0f, 7.0f)
                curveTo(20.761f, 7.0f, 23.0f, 9.239f, 23.0f, 12.0f)
                curveTo(23.0f, 14.761f, 20.761f, 17.0f, 18.0f, 17.0f)
                curveTo(15.239f, 17.0f, 13.0f, 14.761f, 13.0f, 12.0f)
                curveTo(13.0f, 9.239f, 15.239f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.999f)
                lineTo(15.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(17.0f, 12.999f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.999f)
                lineTo(21.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(19.0f, 10.999f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _insertColumnRight!!
    }

private var _insertColumnRight: ImageVector? = null
