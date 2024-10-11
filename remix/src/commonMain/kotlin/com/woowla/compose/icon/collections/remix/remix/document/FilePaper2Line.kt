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

public val DocumentGroup.FilePaper2Line: ImageVector
    get() {
        if (_filePaper2Line != null) {
            return _filePaper2Line!!
        }
        _filePaper2Line = Builder(name = "FilePaper2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(21.657f, 2.0f, 23.0f, 3.343f, 23.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.657f, 19.657f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.343f, 22.0f, 1.0f, 20.657f, 1.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.513f, 17.386f, 19.935f, 17.883f, 19.993f)
                lineTo(18.0f, 20.0f)
                curveTo(18.513f, 20.0f, 18.935f, 19.614f, 18.993f, 19.117f)
                lineTo(19.0f, 19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.487f, 4.0f, 5.064f, 4.386f, 5.007f, 4.883f)
                lineTo(5.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.343f, 4.343f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _filePaper2Line!!
    }

private var _filePaper2Line: ImageVector? = null
