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

public val Simpleicons.Chromewebstore: ImageVector
    get() {
        if (_chromewebstore != null) {
            return _chromewebstore!!
        }
        _chromewebstore = Builder(name = "Chromewebstore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.637f)
                verticalLineToRelative(19.09f)
                curveToRelative(0.0f, 0.9f, 0.736f, 1.636f, 1.636f, 1.636f)
                horizontalLineToRelative(0.131f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, -0.13f, -1.636f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, 1.667f, -5.64f)
                lineToRelative(4.202f, 7.276f)
                horizontalLineToRelative(1.128f)
                arcTo(3.77f, 3.77f, 0.0f, false, true, 12.0f, 16.958f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, 3.366f, 5.406f)
                horizontalLineToRelative(1.048f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -1.587f, -5.406f)
                horizontalLineToRelative(6.83f)
                arcToRelative(10.34f, 10.34f, 0.0f, false, true, 0.577f, 5.406f)
                horizontalLineToRelative(0.13f)
                curveToRelative(0.9f, 0.0f, 1.636f, -0.737f, 1.636f, -1.637f)
                lineTo(24.0f, 1.637f)
                close()
                moveTo(9.273f, 3.818f)
                horizontalLineToRelative(5.454f)
                arcToRelative(1.09f, 1.09f, 0.0f, true, true, 0.0f, 2.182f)
                lineTo(9.273f, 6.0f)
                arcToRelative(1.09f, 1.09f, 0.0f, true, true, 0.0f, -2.182f)
                moveTo(12.0f, 10.364f)
                arcToRelative(10.36f, 10.36f, 0.0f, false, true, 9.233f, 5.652f)
                lineTo(12.0f, 16.016f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, false, -4.677f, 4.149f)
                lineTo(3.91f, 14.25f)
                arcTo(10.34f, 10.34f, 0.0f, false, true, 12.0f, 10.364f)
            }
        }
        .build()
        return _chromewebstore!!
    }

private var _chromewebstore: ImageVector? = null
