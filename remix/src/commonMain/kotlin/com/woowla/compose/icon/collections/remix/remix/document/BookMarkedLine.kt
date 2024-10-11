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

public val DocumentGroup.BookMarkedLine: ImageVector
    get() {
        if (_bookMarkedLine != null) {
            return _bookMarkedLine!!
        }
        _bookMarkedLine = Builder(name = "BookMarkedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.343f, 4.343f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 22.0f, 3.0f, 20.433f, 3.0f, 18.5f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 17.0f, 5.0f, 17.672f, 5.0f, 18.5f)
                curveTo(5.0f, 19.328f, 5.672f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 4.0f, 5.0f, 4.448f, 5.0f, 5.0f)
                verticalLineTo(15.337f)
                curveTo(5.455f, 15.121f, 5.963f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                lineTo(13.5f, 10.0f)
                lineTo(10.0f, 12.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bookMarkedLine!!
    }

private var _bookMarkedLine: ImageVector? = null
