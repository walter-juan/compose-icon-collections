package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Odido: ImageVector
    get() {
        if (_odido != null) {
            return _odido!!
        }
        _odido = Builder(name = "Odido", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.923f, 15.077f)
                arcToRelative(3.077f, 3.077f, 0.0f, true, false, 0.0f, -6.154f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, false, 0.0f, 6.154f)
                moveToRelative(-17.846f, 0.0f)
                arcToRelative(3.077f, 3.077f, 0.0f, true, false, 0.0f, -6.154f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, false, 0.0f, 6.154f)
                moveToRelative(3.692f, 0.0f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, false, 0.0f, -6.154f)
                close()
                moveTo(17.231f, 15.077f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, true, 0.0f, -6.154f)
                close()
                moveTo(13.538f, 8.923f)
                horizontalLineToRelative(-3.077f)
                verticalLineToRelative(6.154f)
                horizontalLineToRelative(3.077f)
                close()
            }
        }
        .build()
        return _odido!!
    }

private var _odido: ImageVector? = null
