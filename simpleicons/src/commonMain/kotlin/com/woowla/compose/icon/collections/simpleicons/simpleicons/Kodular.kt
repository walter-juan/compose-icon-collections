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

public val Simpleicons.Kodular: ImageVector
    get() {
        if (_kodular != null) {
            return _kodular!!
        }
        _kodular = Builder(name = "Kodular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.612f, 0.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 5.6f, 5.6f)
                verticalLineToRelative(4.934f)
                lineToRelative(2.44f, -2.44f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 6.336f, 0.0f)
                lineToRelative(-6.095f, 6.096f)
                lineToRelative(8.495f, 8.495f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -6.336f, 0.0f)
                lineToRelative(-4.84f, -4.84f)
                verticalLineTo(24.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -5.6f, -5.6f)
                close()
            }
        }
        .build()
        return _kodular!!
    }

private var _kodular: ImageVector? = null
