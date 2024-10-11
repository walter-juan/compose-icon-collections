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

public val EditorGroup.Number9: ImageVector
    get() {
        if (_number9 != null) {
            return _number9!!
        }
        _number9 = Builder(name = "Number9", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(15.59f, 1.5f, 18.5f, 4.41f, 18.5f, 8.0f)
                curveTo(18.5f, 9.192f, 18.179f, 10.309f, 17.619f, 11.27f)
                lineTo(11.423f, 21.999f)
                horizontalLineTo(9.114f)
                lineTo(13.553f, 14.313f)
                curveTo(13.055f, 14.435f, 12.535f, 14.5f, 12.0f, 14.5f)
                curveTo(8.41f, 14.5f, 5.5f, 11.59f, 5.5f, 8.0f)
                curveTo(5.5f, 4.41f, 8.41f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(9.515f, 3.5f, 7.5f, 5.515f, 7.5f, 8.0f)
                curveTo(7.5f, 10.485f, 9.515f, 12.5f, 12.0f, 12.5f)
                curveTo(14.485f, 12.5f, 16.5f, 10.485f, 16.5f, 8.0f)
                curveTo(16.5f, 5.515f, 14.485f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _number9!!
    }

private var _number9: ImageVector? = null
