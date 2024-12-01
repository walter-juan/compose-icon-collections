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

public val Simpleicons.Ce: ImageVector
    get() {
        if (_ce != null) {
            return _ce!!
        }
        _ce = Builder(name = "Ce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.53f)
                verticalLineToRelative(-2.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.857f, 0.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.862f, -4.714f)
                horizontalLineToRelative(5.005f)
                verticalLineToRelative(-2.571f)
                horizontalLineTo(17.28f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 6.06f)
                verticalLineTo(3.47f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.857f, -0.042f)
                arcToRelative(8.571f, 8.571f, 0.0f, true, false, 0.857f, 17.1f)
                moveTo(0.0f, 12.0f)
                arcToRelative(8.57f, 8.57f, 0.0f, false, false, 9.486f, 8.524f)
                verticalLineTo(17.93f)
                quadToRelative(-0.448f, 0.07f, -0.915f, 0.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.915f, -11.93f)
                verticalLineTo(3.477f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.915f, -0.048f)
                arcTo(8.57f, 8.57f, 0.0f, false, false, 0.0f, 12.0f)
            }
        }
        .build()
        return _ce!!
    }

private var _ce: ImageVector? = null
