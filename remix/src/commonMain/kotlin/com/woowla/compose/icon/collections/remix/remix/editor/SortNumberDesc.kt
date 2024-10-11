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

public val EditorGroup.SortNumberDesc: ImageVector
    get() {
        if (_sortNumberDesc != null) {
            return _sortNumberDesc!!
        }
        _sortNumberDesc = Builder(name = "SortNumberDesc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineTo(9.001f, 3.0f)
                horizontalLineTo(7.313f)
                lineTo(5.0f, 3.62f)
                verticalLineTo(5.949f)
                lineTo(7.0f, 5.41f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(18.0f, 3.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(8.0f, 16.5f)
                curveTo(7.448f, 16.5f, 7.0f, 16.052f, 7.0f, 15.5f)
                curveTo(7.0f, 14.948f, 7.448f, 14.5f, 8.0f, 14.5f)
                curveTo(8.552f, 14.5f, 9.0f, 14.948f, 9.0f, 15.5f)
                curveTo(9.0f, 16.052f, 8.552f, 16.5f, 8.0f, 16.5f)
                close()
                moveTo(10.573f, 17.044f)
                curveTo(10.844f, 16.593f, 11.0f, 16.065f, 11.0f, 15.5f)
                curveTo(11.0f, 13.843f, 9.657f, 12.5f, 8.0f, 12.5f)
                curveTo(6.343f, 12.5f, 5.0f, 13.843f, 5.0f, 15.5f)
                curveTo(5.0f, 16.969f, 6.057f, 18.192f, 7.452f, 18.45f)
                lineTo(5.979f, 21.0f)
                horizontalLineTo(8.289f)
                lineTo(10.573f, 17.044f)
                close()
            }
        }
        .build()
        return _sortNumberDesc!!
    }

private var _sortNumberDesc: ImageVector? = null
