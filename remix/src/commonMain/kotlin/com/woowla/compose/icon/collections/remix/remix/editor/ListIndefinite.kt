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

public val EditorGroup.ListIndefinite: ImageVector
    get() {
        if (_listIndefinite != null) {
            return _listIndefinite!!
        }
        _listIndefinite = Builder(name = "ListIndefinite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(5.395f, 19.0f, 4.5f, 18.105f, 4.5f, 17.0f)
                curveTo(4.5f, 15.895f, 5.395f, 15.0f, 6.5f, 15.0f)
                curveTo(7.605f, 15.0f, 8.5f, 15.895f, 8.5f, 17.0f)
                curveTo(8.5f, 18.105f, 7.605f, 19.0f, 6.5f, 19.0f)
                close()
                moveTo(6.5f, 21.0f)
                curveTo(8.709f, 21.0f, 10.5f, 19.209f, 10.5f, 17.0f)
                curveTo(10.5f, 14.791f, 8.709f, 13.0f, 6.5f, 13.0f)
                curveTo(4.291f, 13.0f, 2.5f, 14.791f, 2.5f, 17.0f)
                curveTo(2.5f, 19.209f, 4.291f, 21.0f, 6.5f, 21.0f)
                close()
                moveTo(5.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _listIndefinite!!
    }

private var _listIndefinite: ImageVector? = null
