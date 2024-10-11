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

public val DocumentGroup.FileShield2Fill: ImageVector
    get() {
        if (_fileShield2Fill != null) {
            return _fileShield2Fill!!
        }
        _fileShield2Fill = Builder(name = "FileShield2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.382f)
                curveTo(11.0f, 18.945f, 11.778f, 20.405f, 13.074f, 21.274f)
                lineTo(14.157f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.447f, 2.0f, 3.998f, 2.0f)
                horizontalLineTo(15.997f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.382f)
                curveTo(21.0f, 18.279f, 20.554f, 19.116f, 19.813f, 19.613f)
                lineTo(17.0f, 21.498f)
                lineTo(14.188f, 19.613f)
                curveTo(13.446f, 19.116f, 13.0f, 18.279f, 13.0f, 17.382f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _fileShield2Fill!!
    }

private var _fileShield2Fill: ImageVector? = null
