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

public val EditorGroup.ListRadio: ImageVector
    get() {
        if (_listRadio != null) {
            return _listRadio!!
        }
        _listRadio = Builder(name = "ListRadio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                curveTo(8.5f, 5.895f, 7.605f, 5.0f, 6.5f, 5.0f)
                curveTo(5.395f, 5.0f, 4.5f, 5.895f, 4.5f, 7.0f)
                curveTo(4.5f, 8.105f, 5.395f, 9.0f, 6.5f, 9.0f)
                curveTo(7.605f, 9.0f, 8.5f, 8.105f, 8.5f, 7.0f)
                close()
                moveTo(10.5f, 7.0f)
                curveTo(10.5f, 9.209f, 8.709f, 11.0f, 6.5f, 11.0f)
                curveTo(4.291f, 11.0f, 2.5f, 9.209f, 2.5f, 7.0f)
                curveTo(2.5f, 4.791f, 4.291f, 3.0f, 6.5f, 3.0f)
                curveTo(8.709f, 3.0f, 10.5f, 4.791f, 10.5f, 7.0f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
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
                moveTo(6.5f, 8.0f)
                curveTo(7.052f, 8.0f, 7.5f, 7.552f, 7.5f, 7.0f)
                curveTo(7.5f, 6.448f, 7.052f, 6.0f, 6.5f, 6.0f)
                curveTo(5.948f, 6.0f, 5.5f, 6.448f, 5.5f, 7.0f)
                curveTo(5.5f, 7.552f, 5.948f, 8.0f, 6.5f, 8.0f)
                close()
            }
        }
        .build()
        return _listRadio!!
    }

private var _listRadio: ImageVector? = null
