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

public val DocumentGroup.FileForbidLine: ImageVector
    get() {
        if (_fileForbidLine != null) {
            return _fileForbidLine!!
        }
        _fileForbidLine = Builder(name = "FileForbidLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.29f, 20.0f)
                curveTo(11.505f, 20.722f, 11.833f, 21.396f, 12.255f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(11.674f)
                curveTo(20.378f, 11.378f, 19.706f, 11.172f, 19.0f, 11.071f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.29f)
                close()
                moveTo(18.0f, 23.0f)
                curveTo(15.239f, 23.0f, 13.0f, 20.761f, 13.0f, 18.0f)
                curveTo(13.0f, 15.239f, 15.239f, 13.0f, 18.0f, 13.0f)
                curveTo(20.761f, 13.0f, 23.0f, 15.239f, 23.0f, 18.0f)
                curveTo(23.0f, 20.761f, 20.761f, 23.0f, 18.0f, 23.0f)
                close()
                moveTo(16.707f, 20.708f)
                curveTo(17.098f, 20.895f, 17.537f, 21.0f, 18.0f, 21.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                curveTo(21.0f, 17.537f, 20.895f, 17.098f, 20.708f, 16.707f)
                lineTo(16.707f, 20.708f)
                close()
                moveTo(15.292f, 19.293f)
                lineTo(19.293f, 15.292f)
                curveTo(18.902f, 15.105f, 18.463f, 15.0f, 18.0f, 15.0f)
                curveTo(16.343f, 15.0f, 15.0f, 16.343f, 15.0f, 18.0f)
                curveTo(15.0f, 18.463f, 15.105f, 18.902f, 15.292f, 19.293f)
                close()
            }
        }
        .build()
        return _fileForbidLine!!
    }

private var _fileForbidLine: ImageVector? = null
