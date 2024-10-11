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

public val EditorGroup.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) {
            return _codeBlock!!
        }
        _codeBlock = Builder(name = "CodeBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.414f, 6.0f)
                lineTo(5.707f, 3.707f)
                lineTo(4.293f, 2.293f)
                lineTo(0.586f, 6.0f)
                lineTo(4.293f, 9.707f)
                lineTo(5.707f, 8.293f)
                lineTo(3.414f, 6.0f)
                close()
                moveTo(9.586f, 6.0f)
                lineTo(7.293f, 3.707f)
                lineTo(8.707f, 2.293f)
                lineTo(12.414f, 6.0f)
                lineTo(8.707f, 9.707f)
                lineTo(7.293f, 8.293f)
                lineTo(9.586f, 6.0f)
                close()
                moveTo(14.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
