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

public val Simpleicons.Servbay: ImageVector
    get() {
        if (_servbay != null) {
            return _servbay!!
        }
        _servbay = Builder(name = "Servbay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.201f, 0.028f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, 0.643f, 0.313f)
                curveToRelative(0.04f, 0.11f, 0.043f, 0.23f, 0.006f, 0.341f)
                lineToRelative(-2.258f, 6.356f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, -0.319f, 0.302f)
                lineTo(1.0f, 11.168f)
                lineToRelative(2.665f, -7.33f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, 0.319f, -0.302f)
                lineTo(14.2f, 0.028f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(1.0f, 11.757f)
                lineToRelative(2.776f, 4.05f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.622f, 0.227f)
                lineToRelative(5.12f, -1.892f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, false, 0.29f, -0.653f)
                lineToRelative(-0.03f, -0.063f)
                lineTo(7.412f, 9.62f)
                lineTo(1.0f, 11.756f)
                close()
                moveTo(9.799f, 23.972f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, -0.643f, -0.312f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, -0.006f, -0.342f)
                lineToRelative(2.235f, -6.365f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, 0.319f, -0.3f)
                lineTo(23.0f, 12.832f)
                lineToRelative(-2.665f, 7.33f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.318f, 0.3f)
                lineToRelative(-10.218f, 3.51f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(20.437f, 8.079f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.622f, -0.226f)
                lineToRelative(-5.12f, 1.893f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, false, -0.29f, 0.65f)
                lineToRelative(0.03f, 0.064f)
                lineToRelative(2.336f, 3.85f)
                lineToRelative(6.215f, -2.12f)
                lineToRelative(-2.55f, -4.11f)
                horizontalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _servbay!!
    }

private var _servbay: ImageVector? = null
