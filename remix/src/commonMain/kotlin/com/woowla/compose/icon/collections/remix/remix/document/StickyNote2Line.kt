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

public val DocumentGroup.StickyNote2Line: ImageVector
    get() {
        if (_stickyNote2Line != null) {
            return _stickyNote2Line!!
        }
        _stickyNote2Line = Builder(name = "StickyNote2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.998f, 21.0f)
                curveTo(3.447f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 3.0f, 21.0f, 3.447f, 21.0f, 3.999f)
                verticalLineTo(16.0f)
                lineTo(15.997f, 21.0f)
                horizontalLineTo(3.998f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(15.169f)
                lineTo(19.0f, 15.171f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _stickyNote2Line!!
    }

private var _stickyNote2Line: ImageVector? = null
