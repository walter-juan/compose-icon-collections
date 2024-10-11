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

public val DocumentGroup.StickyNoteFill: ImageVector
    get() {
        if (_stickyNoteFill != null) {
            return _stickyNoteFill!!
        }
        _stickyNoteFill = Builder(name = "StickyNoteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineTo(14.883f, 14.007f)
                curveTo(14.424f, 14.06f, 14.06f, 14.424f, 14.007f, 14.883f)
                lineTo(14.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.998f)
                curveTo(3.447f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 3.0f, 21.0f, 3.447f, 21.0f, 3.999f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(16.0f, 20.997f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _stickyNoteFill!!
    }

private var _stickyNoteFill: ImageVector? = null
