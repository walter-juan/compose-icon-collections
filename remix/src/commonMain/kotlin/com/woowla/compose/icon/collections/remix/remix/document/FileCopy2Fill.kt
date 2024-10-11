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

public val DocumentGroup.FileCopy2Fill: ImageVector
    get() {
        if (_fileCopy2Fill != null) {
            return _fileCopy2Fill!!
        }
        _fileCopy2Fill = Builder(name = "FileCopy2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.448f, 7.448f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 17.552f, 20.552f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.999f)
                curveTo(17.0f, 21.552f, 16.55f, 22.0f, 15.993f, 22.0f)
                horizontalLineTo(4.007f)
                curveTo(3.451f, 22.0f, 3.0f, 21.555f, 3.0f, 20.999f)
                lineTo(3.003f, 7.001f)
                curveTo(3.003f, 6.448f, 3.453f, 6.0f, 4.009f, 6.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fileCopy2Fill!!
    }

private var _fileCopy2Fill: ImageVector? = null
