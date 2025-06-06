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

public val EditorGroup.PageSeparator: ImageVector
    get() {
        if (_pageSeparator != null) {
            return _pageSeparator!!
        }
        _pageSeparator = Builder(name = "PageSeparator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 15.448f, 5.448f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 15.0f, 19.0f, 15.448f, 19.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 8.552f, 18.552f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 9.0f, 5.0f, 8.552f, 5.0f, 8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(6.0f, 12.0f)
                lineTo(2.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(18.0f, 12.0f)
                lineTo(22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _pageSeparator!!
    }

private var _pageSeparator: ImageVector? = null
