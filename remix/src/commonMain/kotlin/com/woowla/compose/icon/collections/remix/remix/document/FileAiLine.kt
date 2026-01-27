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

public val DocumentGroup.FileAiLine: ImageVector
    get() {
        if (_fileAiLine != null) {
            return _fileAiLine!!
        }
        _fileAiLine = Builder(name = "FileAiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 9.552f, 10.552f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.555f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.55f, 3.0f, 20.993f)
                verticalLineTo(8.0f)
                lineTo(9.0f, 2.003f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.829f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.831f)
                lineTo(5.829f, 8.0f)
                close()
                moveTo(19.471f, 0.329f)
                curveTo(19.294f, -0.096f, 18.706f, -0.096f, 18.529f, 0.329f)
                lineTo(18.276f, 0.941f)
                curveTo(17.844f, 1.983f, 17.038f, 2.816f, 16.025f, 3.267f)
                lineTo(15.308f, 3.586f)
                curveTo(14.897f, 3.769f, 14.898f, 4.366f, 15.308f, 4.549f)
                lineTo(16.067f, 4.887f)
                curveTo(17.055f, 5.326f, 17.848f, 6.129f, 18.287f, 7.138f)
                lineTo(18.533f, 7.703f)
                curveTo(18.714f, 8.118f, 19.286f, 8.118f, 19.467f, 7.703f)
                lineTo(19.714f, 7.138f)
                curveTo(20.153f, 6.129f, 20.945f, 5.326f, 21.933f, 4.887f)
                lineTo(22.692f, 4.549f)
                curveTo(23.103f, 4.366f, 23.103f, 3.769f, 22.692f, 3.586f)
                lineTo(21.975f, 3.267f)
                curveTo(20.962f, 2.816f, 20.156f, 1.983f, 19.724f, 0.941f)
                lineTo(19.471f, 0.329f)
                close()
            }
        }
        .build()
        return _fileAiLine!!
    }

private var _fileAiLine: ImageVector? = null
