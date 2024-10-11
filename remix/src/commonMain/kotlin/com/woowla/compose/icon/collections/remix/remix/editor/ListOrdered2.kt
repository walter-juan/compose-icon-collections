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

public val EditorGroup.ListOrdered2: ImageVector
    get() {
        if (_listOrdered2 != null) {
            return _listOrdered2!!
        }
        _listOrdered2 = Builder(name = "ListOrdered2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.5f)
                horizontalLineTo(4.717f)
                lineTo(3.25f, 3.893f)
                verticalLineTo(5.446f)
                lineTo(4.25f, 5.178f)
                lineTo(4.25f, 8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.75f)
                verticalLineTo(3.5f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.875f, 15.625f)
                curveTo(2.875f, 14.451f, 3.826f, 13.5f, 5.0f, 13.5f)
                curveTo(6.174f, 13.5f, 7.125f, 14.451f, 7.125f, 15.625f)
                curveTo(7.125f, 16.111f, 6.962f, 16.559f, 6.687f, 16.917f)
                lineTo(6.683f, 16.923f)
                lineTo(5.316f, 18.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 18.879f)
                lineTo(5.472f, 16.035f)
                curveTo(5.567f, 15.925f, 5.625f, 15.782f, 5.625f, 15.625f)
                curveTo(5.625f, 15.28f, 5.345f, 15.0f, 5.0f, 15.0f)
                curveTo(4.674f, 15.0f, 4.406f, 15.25f, 4.377f, 15.569f)
                lineTo(4.365f, 15.875f)
                horizontalLineTo(2.875f)
                verticalLineTo(15.625f)
                close()
            }
        }
        .build()
        return _listOrdered2!!
    }

private var _listOrdered2: ImageVector? = null
