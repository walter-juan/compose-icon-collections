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

public val DocumentGroup.Book2Line: ImageVector
    get() {
        if (_book2Line != null) {
            return _book2Line!!
        }
        _book2Line = Builder(name = "Book2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 18.0f, 5.0f, 18.448f, 5.0f, 19.0f)
                curveTo(5.0f, 19.552f, 5.448f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 22.0f, 3.0f, 20.657f, 3.0f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 2.895f, 3.895f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(5.0f, 16.05f)
                curveTo(5.162f, 16.017f, 5.329f, 16.0f, 5.5f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.05f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _book2Line!!
    }

private var _book2Line: ImageVector? = null
