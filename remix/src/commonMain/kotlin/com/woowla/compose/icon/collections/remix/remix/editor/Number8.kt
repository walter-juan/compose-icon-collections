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

public val EditorGroup.Number8: ImageVector
    get() {
        if (_number8 != null) {
            return _number8!!
        }
        _number8 = Builder(name = "Number8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(15.038f, 1.5f, 17.5f, 3.962f, 17.5f, 7.0f)
                curveTo(17.5f, 8.776f, 16.658f, 10.355f, 15.352f, 11.361f)
                curveTo(17.239f, 12.409f, 18.5f, 14.319f, 18.5f, 16.5f)
                curveTo(18.5f, 19.814f, 15.59f, 22.5f, 12.0f, 22.5f)
                curveTo(8.41f, 22.5f, 5.5f, 19.814f, 5.5f, 16.5f)
                curveTo(5.5f, 14.319f, 6.761f, 12.409f, 8.647f, 11.359f)
                curveTo(7.342f, 10.355f, 6.5f, 8.776f, 6.5f, 7.0f)
                curveTo(6.5f, 3.962f, 8.962f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 12.5f)
                curveTo(9.481f, 12.5f, 7.5f, 14.328f, 7.5f, 16.5f)
                curveTo(7.5f, 18.672f, 9.481f, 20.5f, 12.0f, 20.5f)
                curveTo(14.519f, 20.5f, 16.5f, 18.672f, 16.5f, 16.5f)
                curveTo(16.5f, 14.328f, 14.519f, 12.5f, 12.0f, 12.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7.0f)
                curveTo(8.5f, 8.933f, 10.067f, 10.5f, 12.0f, 10.5f)
                curveTo(13.933f, 10.5f, 15.5f, 8.933f, 15.5f, 7.0f)
                curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _number8!!
    }

private var _number8: ImageVector? = null
