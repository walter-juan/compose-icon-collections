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

public val EditorGroup.ListUnordered: ImageVector
    get() {
        if (_listUnordered != null) {
            return _listUnordered!!
        }
        _listUnordered = Builder(name = "ListUnordered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.5f, 6.5f)
                curveTo(3.672f, 6.5f, 3.0f, 5.828f, 3.0f, 5.0f)
                curveTo(3.0f, 4.172f, 3.672f, 3.5f, 4.5f, 3.5f)
                curveTo(5.328f, 3.5f, 6.0f, 4.172f, 6.0f, 5.0f)
                curveTo(6.0f, 5.828f, 5.328f, 6.5f, 4.5f, 6.5f)
                close()
                moveTo(4.5f, 13.5f)
                curveTo(3.672f, 13.5f, 3.0f, 12.828f, 3.0f, 12.0f)
                curveTo(3.0f, 11.172f, 3.672f, 10.5f, 4.5f, 10.5f)
                curveTo(5.328f, 10.5f, 6.0f, 11.172f, 6.0f, 12.0f)
                curveTo(6.0f, 12.828f, 5.328f, 13.5f, 4.5f, 13.5f)
                close()
                moveTo(4.5f, 20.4f)
                curveTo(3.672f, 20.4f, 3.0f, 19.728f, 3.0f, 18.9f)
                curveTo(3.0f, 18.072f, 3.672f, 17.4f, 4.5f, 17.4f)
                curveTo(5.328f, 17.4f, 6.0f, 18.072f, 6.0f, 18.9f)
                curveTo(6.0f, 19.728f, 5.328f, 20.4f, 4.5f, 20.4f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _listUnordered!!
    }

private var _listUnordered: ImageVector? = null
