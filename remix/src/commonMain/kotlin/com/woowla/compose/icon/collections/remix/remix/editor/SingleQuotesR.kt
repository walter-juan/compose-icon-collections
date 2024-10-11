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

public val EditorGroup.SingleQuotesR: ImageVector
    get() {
        if (_singleQuotesR != null) {
            return _singleQuotesR!!
        }
        _singleQuotesR = Builder(name = "SingleQuotesR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.417f, 6.679f)
                curveTo(15.447f, 7.773f, 16.0f, 9.0f, 16.0f, 10.99f)
                curveTo(16.0f, 14.489f, 13.544f, 17.626f, 9.97f, 19.177f)
                lineTo(9.077f, 17.799f)
                curveTo(12.412f, 15.995f, 13.064f, 13.654f, 13.325f, 12.178f)
                curveTo(12.788f, 12.456f, 12.085f, 12.553f, 11.395f, 12.49f)
                curveTo(9.591f, 12.322f, 8.169f, 10.841f, 8.169f, 9.0f)
                curveTo(8.169f, 7.067f, 9.736f, 5.5f, 11.669f, 5.5f)
                curveTo(12.742f, 5.5f, 13.768f, 5.99f, 14.417f, 6.679f)
                close()
            }
        }
        .build()
        return _singleQuotesR!!
    }

private var _singleQuotesR: ImageVector? = null
