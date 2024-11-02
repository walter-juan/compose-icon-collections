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

public val Simpleicons.E3: ImageVector
    get() {
        if (_e3 != null) {
            return _e3!!
        }
        _e3 = Builder(name = "E3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.068f, 16.518f)
                lineTo(4.772f, 16.518f)
                verticalLineToRelative(-2.674f)
                horizontalLineToRelative(6.261f)
                verticalLineToRelative(-3.757f)
                lineTo(4.772f, 10.088f)
                verticalLineToRelative(-2.64f)
                horizontalLineToRelative(6.261f)
                lineTo(11.034f, 3.691f)
                lineTo(0.0f, 3.691f)
                verticalLineToRelative(16.618f)
                horizontalLineToRelative(14.148f)
                curveToRelative(0.0f, -0.034f, -2.775f, -0.711f, -3.08f, -3.791f)
                close()
                moveTo(21.188f, 10.122f)
                curveToRelative(1.895f, 1.286f, 2.877f, 2.539f, 2.809f, 5.111f)
                curveToRelative(-0.068f, 2.674f, -2.775f, 5.043f, -5.72f, 5.043f)
                curveToRelative(-2.098f, 0.0f, -4.772f, -0.948f, -5.788f, -3.757f)
                lineToRelative(3.486f, -1.557f)
                curveToRelative(0.474f, 0.88f, 1.151f, 1.557f, 2.2f, 1.557f)
                curveToRelative(1.151f, 0.0f, 1.997f, -0.88f, 2.098f, -1.997f)
                curveToRelative(0.034f, -0.271f, -0.135f, -2.234f, -2.098f, -2.302f)
                lineToRelative(-2.2f, -0.237f)
                lineToRelative(2.809f, -4.535f)
                horizontalLineToRelative(-6.329f)
                verticalLineToRelative(-3.757f)
                horizontalLineToRelative(11.542f)
                close()
            }
        }
        .build()
        return _e3!!
    }

private var _e3: ImageVector? = null
