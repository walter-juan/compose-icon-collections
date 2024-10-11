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

public val DocumentGroup.ClipboardFill: ImageVector
    get() {
        if (_clipboardFill != null) {
            return _clipboardFill!!
        }
        _clipboardFill = Builder(name = "ClipboardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 4.0f, 21.0f, 4.445f, 21.0f, 4.993f)
                verticalLineTo(21.007f)
                curveTo(21.0f, 21.555f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.555f, 3.0f, 21.007f)
                verticalLineTo(4.993f)
                curveTo(3.0f, 4.445f, 3.445f, 4.0f, 3.993f, 4.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _clipboardFill!!
    }

private var _clipboardFill: ImageVector? = null
