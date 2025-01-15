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

public val Simpleicons.V0: ImageVector
    get() {
        if (_v0 != null) {
            return _v0!!
        }
        _v0 = Builder(name = "V0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.066f, 6.028f)
                verticalLineToRelative(2.22f)
                horizontalLineToRelative(5.729f)
                quadToRelative(0.075f, -0.001f, 0.148f, 0.005f)
                lineToRelative(-5.853f, 5.752f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.024f, -0.309f)
                verticalLineTo(8.247f)
                horizontalLineToRelative(-2.353f)
                verticalLineToRelative(5.45f)
                curveToRelative(0.0f, 2.322f, 1.935f, 4.222f, 4.258f, 4.222f)
                horizontalLineToRelative(5.675f)
                verticalLineToRelative(-2.22f)
                horizontalLineToRelative(-5.675f)
                quadToRelative(-0.03f, 0.0f, -0.059f, -0.003f)
                lineToRelative(5.729f, -5.629f)
                quadToRelative(0.006f, 0.082f, 0.006f, 0.166f)
                verticalLineToRelative(5.465f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-5.465f)
                arcToRelative(4.204f, 4.204f, 0.0f, false, false, -4.205f, -4.205f)
                close()
                moveTo(0.0f, 8.245f)
                lineToRelative(8.28f, 9.266f)
                curveToRelative(0.839f, 0.94f, 2.396f, 0.346f, 2.396f, -0.914f)
                verticalLineTo(8.245f)
                horizontalLineTo(8.19f)
                verticalLineToRelative(5.44f)
                lineToRelative(-4.86f, -5.44f)
                close()
            }
        }
        .build()
        return _v0!!
    }

private var _v0: ImageVector? = null
