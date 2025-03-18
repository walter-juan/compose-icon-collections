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

public val Simpleicons.Pixiv: ImageVector
    get() {
        if (_pixiv != null) {
            return _pixiv!!
        }
        _pixiv = Builder(name = "Pixiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.94f, 0.0f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 0.0f, 4.94f)
                verticalLineToRelative(14.12f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 4.94f, 24.0f)
                horizontalLineToRelative(14.12f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 24.0f, 19.06f)
                curveToRelative(-0.014f, 1.355f, 0.0f, -14.12f, 0.0f, -14.12f)
                arcTo(4.953f, 4.953f, 0.0f, false, false, 19.06f, 0.0f)
                close()
                moveTo(6.723f, 5.465f)
                horizontalLineToRelative(0.904f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.31f, 0.17f)
                lineToRelative(0.752f, 1.17f)
                arcToRelative(6.172f, 6.172f, 0.0f, false, true, 10.01f, 4.834f)
                arcToRelative(6.172f, 6.172f, 0.0f, false, true, -9.394f, 5.265f)
                verticalLineToRelative(2.016f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.37f, 0.367f)
                lineTo(6.724f, 19.287f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.37f, -0.367f)
                lineTo(6.354f, 5.834f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.37f, -0.37f)
                moveToRelative(5.804f, 2.951f)
                arcToRelative(3.222f, 3.222f, 0.0f, true, false, -0.002f, 6.443f)
                arcToRelative(3.222f, 3.222f, 0.0f, false, false, 0.002f, -6.443f)
            }
        }
        .build()
        return _pixiv!!
    }

private var _pixiv: ImageVector? = null
