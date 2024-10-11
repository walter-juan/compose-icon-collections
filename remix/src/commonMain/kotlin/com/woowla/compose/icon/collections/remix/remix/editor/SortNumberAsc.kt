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

public val EditorGroup.SortNumberAsc: ImageVector
    get() {
        if (_sortNumberAsc != null) {
            return _sortNumberAsc!!
        }
        _sortNumberAsc = Builder(name = "SortNumberAsc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.001f, 3.0f)
                lineTo(9.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.41f)
                lineTo(5.0f, 5.949f)
                verticalLineTo(3.62f)
                lineTo(7.313f, 3.0f)
                horizontalLineTo(9.001f)
                close()
                moveTo(19.0f, 3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 21.0f)
                lineTo(14.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(11.0f, 15.5f)
                curveTo(11.0f, 16.065f, 10.844f, 16.593f, 10.573f, 17.044f)
                lineTo(8.289f, 21.0f)
                horizontalLineTo(5.979f)
                lineTo(7.452f, 18.45f)
                curveTo(6.057f, 18.192f, 5.0f, 16.969f, 5.0f, 15.5f)
                curveTo(5.0f, 13.843f, 6.343f, 12.5f, 8.0f, 12.5f)
                curveTo(9.657f, 12.5f, 11.0f, 13.843f, 11.0f, 15.5f)
                close()
                moveTo(8.0f, 16.5f)
                curveTo(8.552f, 16.5f, 9.0f, 16.052f, 9.0f, 15.5f)
                curveTo(9.0f, 14.948f, 8.552f, 14.5f, 8.0f, 14.5f)
                curveTo(7.448f, 14.5f, 7.0f, 14.948f, 7.0f, 15.5f)
                curveTo(7.0f, 16.052f, 7.448f, 16.5f, 8.0f, 16.5f)
                close()
            }
        }
        .build()
        return _sortNumberAsc!!
    }

private var _sortNumberAsc: ImageVector? = null
