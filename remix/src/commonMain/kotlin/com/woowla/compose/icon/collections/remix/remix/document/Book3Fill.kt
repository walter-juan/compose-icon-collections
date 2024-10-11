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

public val DocumentGroup.Book3Fill: ImageVector
    get() {
        if (_book3Fill != null) {
            return _book3Fill!!
        }
        _book3Fill = Builder(name = "Book3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 4.0f, 5.0f, 4.895f, 5.0f, 6.0f)
                curveTo(5.0f, 7.105f, 5.895f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 22.0f, 3.0f, 20.209f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 3.791f, 4.791f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 7.0f, 6.0f, 6.552f, 6.0f, 6.0f)
                curveTo(6.0f, 5.448f, 6.448f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _book3Fill!!
    }

private var _book3Fill: ImageVector? = null
