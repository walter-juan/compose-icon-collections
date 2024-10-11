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

public val DocumentGroup.BookOpenLine: ImageVector
    get() {
        if (_bookOpenLine != null) {
            return _bookOpenLine!!
        }
        _bookOpenLine = Builder(name = "BookOpenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(10.195f, 3.0f, 11.267f, 3.524f, 12.0f, 4.354f)
                curveTo(12.733f, 3.524f, 13.805f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                curveTo(13.895f, 5.0f, 13.0f, 5.895f, 13.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(11.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 5.895f, 10.105f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _bookOpenLine!!
    }

private var _bookOpenLine: ImageVector? = null
