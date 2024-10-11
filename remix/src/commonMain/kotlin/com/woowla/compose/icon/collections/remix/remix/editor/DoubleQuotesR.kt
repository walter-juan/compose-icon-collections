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

public val EditorGroup.DoubleQuotesR: ImageVector
    get() {
        if (_doubleQuotesR != null) {
            return _doubleQuotesR!!
        }
        _doubleQuotesR = Builder(name = "DoubleQuotesR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.417f, 6.679f)
                curveTo(20.447f, 7.773f, 21.0f, 9.0f, 21.0f, 10.99f)
                curveTo(21.0f, 14.489f, 18.544f, 17.626f, 14.969f, 19.177f)
                lineTo(14.077f, 17.799f)
                curveTo(17.412f, 15.995f, 18.064f, 13.654f, 18.324f, 12.178f)
                curveTo(17.788f, 12.456f, 17.084f, 12.553f, 16.395f, 12.49f)
                curveTo(14.591f, 12.322f, 13.169f, 10.841f, 13.169f, 9.0f)
                curveTo(13.169f, 7.067f, 14.736f, 5.5f, 16.669f, 5.5f)
                curveTo(17.742f, 5.5f, 18.768f, 5.99f, 19.417f, 6.679f)
                close()
                moveTo(9.417f, 6.679f)
                curveTo(10.447f, 7.773f, 11.0f, 9.0f, 11.0f, 10.99f)
                curveTo(11.0f, 14.489f, 8.544f, 17.626f, 4.97f, 19.177f)
                lineTo(4.077f, 17.799f)
                curveTo(7.412f, 15.995f, 8.064f, 13.654f, 8.324f, 12.178f)
                curveTo(7.787f, 12.456f, 7.085f, 12.553f, 6.395f, 12.49f)
                curveTo(4.591f, 12.322f, 3.169f, 10.841f, 3.169f, 9.0f)
                curveTo(3.169f, 7.067f, 4.736f, 5.5f, 6.669f, 5.5f)
                curveTo(7.742f, 5.5f, 8.768f, 5.99f, 9.417f, 6.679f)
                close()
            }
        }
        .build()
        return _doubleQuotesR!!
    }

private var _doubleQuotesR: ImageVector? = null
