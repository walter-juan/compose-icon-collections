package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.BookAiLine: ImageVector
    get() {
        if (_bookAiLine != null) {
            return _bookAiLine!!
        }
        _bookAiLine = Builder(name = "BookAiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 4.0f, 5.0f, 4.448f, 5.0f, 5.0f)
                verticalLineTo(15.337f)
                curveTo(5.455f, 15.121f, 5.963f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 22.0f, 3.0f, 20.433f, 3.0f, 18.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.343f, 4.343f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.672f, 17.0f, 5.0f, 17.672f, 5.0f, 18.5f)
                curveTo(5.0f, 19.328f, 5.672f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(18.529f, 0.329f)
                curveTo(18.706f, -0.096f, 19.294f, -0.097f, 19.471f, 0.329f)
                lineTo(19.724f, 0.941f)
                curveTo(20.156f, 1.983f, 20.962f, 2.816f, 21.975f, 3.267f)
                lineTo(22.692f, 3.586f)
                curveTo(23.103f, 3.769f, 23.103f, 4.366f, 22.692f, 4.549f)
                lineTo(21.933f, 4.887f)
                curveTo(20.945f, 5.326f, 20.153f, 6.129f, 19.714f, 7.138f)
                lineTo(19.467f, 7.703f)
                curveTo(19.286f, 8.117f, 18.714f, 8.117f, 18.533f, 7.703f)
                lineTo(18.287f, 7.138f)
                curveTo(17.848f, 6.129f, 17.055f, 5.326f, 16.067f, 4.887f)
                lineTo(15.308f, 4.549f)
                curveTo(14.897f, 4.366f, 14.897f, 3.769f, 15.308f, 3.586f)
                lineTo(16.025f, 3.267f)
                curveTo(17.038f, 2.816f, 17.844f, 1.983f, 18.276f, 0.941f)
                lineTo(18.529f, 0.329f)
                close()
            }
        }
        .build()
        return _bookAiLine!!
    }

private var _bookAiLine: ImageVector? = null
