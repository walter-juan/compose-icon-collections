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

public val DocumentGroup.Certificate2Line: ImageVector
    get() {
        if (_certificate2Line != null) {
            return _certificate2Line!!
        }
        _certificate2Line = Builder(name = "Certificate2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(21.209f, 12.0f, 23.0f, 13.791f, 23.0f, 16.0f)
                curveTo(23.0f, 17.263f, 22.414f, 18.388f, 21.5f, 19.121f)
                verticalLineTo(23.5f)
                lineTo(19.0f, 22.0f)
                lineTo(16.5f, 23.5f)
                verticalLineTo(19.121f)
                curveTo(15.586f, 18.388f, 15.0f, 17.263f, 15.0f, 16.0f)
                curveTo(15.0f, 13.791f, 16.791f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(20.0f, 2.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(17.895f, 14.0f, 17.0f, 14.895f, 17.0f, 16.0f)
                curveTo(17.0f, 17.105f, 17.895f, 18.0f, 19.0f, 18.0f)
                curveTo(20.105f, 18.0f, 21.0f, 17.105f, 21.0f, 16.0f)
                curveTo(21.0f, 14.895f, 20.105f, 14.0f, 19.0f, 14.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _certificate2Line!!
    }

private var _certificate2Line: ImageVector? = null
