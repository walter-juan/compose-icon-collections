package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Exclamation24: ImageVector
    get() {
        if (_exclamation24 != null) {
            return _exclamation24!!
        }
        _exclamation24 = Builder(name = "Exclamation24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, 3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 18.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineTo(15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _exclamation24!!
    }

private var _exclamation24: ImageVector? = null
