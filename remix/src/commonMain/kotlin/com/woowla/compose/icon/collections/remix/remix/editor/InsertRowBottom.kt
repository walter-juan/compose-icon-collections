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

public val EditorGroup.InsertRowBottom: ImageVector
    get() {
        if (_insertRowBottom != null) {
            return _insertRowBottom!!
        }
        _insertRowBottom = Builder(name = "InsertRowBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(14.761f, 13.0f, 17.0f, 15.239f, 17.0f, 18.0f)
                curveTo(17.0f, 20.761f, 14.761f, 23.0f, 12.0f, 23.0f)
                curveTo(9.239f, 23.0f, 7.0f, 20.761f, 7.0f, 18.0f)
                curveTo(7.0f, 15.239f, 9.239f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.999f)
                lineTo(9.0f, 17.0f)
                verticalLineTo(19.0f)
                lineTo(11.0f, 18.999f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.999f)
                lineTo(15.0f, 19.0f)
                verticalLineTo(17.0f)
                lineTo(13.0f, 16.999f)
                verticalLineTo(15.0f)
                close()
                moveTo(20.0f, 3.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 10.552f, 20.552f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 11.0f, 3.0f, 10.552f, 3.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _insertRowBottom!!
    }

private var _insertRowBottom: ImageVector? = null
