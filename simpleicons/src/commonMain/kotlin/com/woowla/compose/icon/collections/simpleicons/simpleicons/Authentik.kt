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

public val Simpleicons.Authentik: ImageVector
    get() {
        if (_authentik != null) {
            return _authentik!!
        }
        _authentik = Builder(name = "Authentik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.96f, 9.01f)
                horizontalLineToRelative(-0.84f)
                lineTo(13.12f, 7.492f)
                horizontalLineToRelative(-1.234f)
                verticalLineToRelative(3.663f)
                lineTo(5.722f, 11.155f)
                curveToRelative(0.34f, 0.517f, 0.538f, 0.982f, 0.538f, 1.152f)
                curveToRelative(0.0f, 0.46f, -1.445f, 3.059f, -3.197f, 3.059f)
                curveTo(0.8f, 15.427f, -0.745f, 12.8f, 0.372f, 10.855f)
                arcToRelative(3.062f, 3.062f, 0.0f, false, true, 2.691f, -1.606f)
                curveToRelative(1.04f, 0.0f, 1.971f, 0.915f, 2.557f, 1.755f)
                lineTo(5.62f, 6.577f)
                arcToRelative(3.773f, 3.773f, 0.0f, false, true, 3.77f, -3.769f)
                horizontalLineToRelative(10.84f)
                curveTo(22.31f, 2.808f, 24.0f, 4.5f, 24.0f, 6.577f)
                verticalLineToRelative(10.845f)
                arcToRelative(3.773f, 3.773f, 0.0f, false, true, -3.77f, 3.769f)
                horizontalLineToRelative(-1.6f)
                lineTo(18.63f, 17.5f)
                horizontalLineToRelative(-7.64f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(3.773f, 3.773f, 0.0f, false, true, -3.77f, -3.769f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(12.114f)
                verticalLineToRelative(-6.52f)
                horizontalLineToRelative(-1.59f)
                verticalLineToRelative(0.893f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(-0.893f)
                lineTo(13.96f, 7.493f)
                verticalLineToRelative(1.516f)
                close()
                moveTo(4.004f, 10.855f)
                curveToRelative(-0.662f, -0.703f, -1.578f, -0.544f, -2.209f, 0.0f)
                curveToRelative(-2.105f, 2.054f, 1.338f, 5.553f, 3.302f, 1.447f)
                arcToRelative(5.395f, 5.395f, 0.0f, false, false, -1.093f, -1.447f)
                close()
            }
        }
        .build()
        return _authentik!!
    }

private var _authentik: ImageVector? = null
