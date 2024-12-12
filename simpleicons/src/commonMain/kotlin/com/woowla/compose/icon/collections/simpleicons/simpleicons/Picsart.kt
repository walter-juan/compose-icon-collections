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

public val Simpleicons.Picsart: ImageVector
    get() {
        if (_picsart != null) {
            return _picsart!!
        }
        _picsart = Builder(name = "Picsart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-2.21f, 0.0f, -4.3f, 0.863f, -5.888f, 2.432f)
                curveToRelative(-0.15f, 0.148f, -0.428f, 0.458f, -0.428f, 0.458f)
                curveToRelative(-0.096f, 0.11f, -0.188f, 0.22f, -0.276f, 0.334f)
                lineToRelative(-0.036f, 0.047f)
                arcToRelative(8.683f, 8.683f, 0.0f, false, false, -1.836f, 5.016f)
                verticalLineToRelative(15.41f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, 0.05f, 0.17f)
                arcToRelative(0.304f, 0.304f, 0.0f, false, false, 0.254f, 0.133f)
                horizontalLineToRelative(2.881f)
                arcToRelative(0.303f, 0.303f, 0.0f, false, false, 0.305f, -0.304f)
                verticalLineToRelative(-7.843f)
                curveToRelative(0.0f, -0.054f, 0.037f, -0.08f, 0.053f, -0.087f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.104f, 0.008f)
                arcToRelative(8.293f, 8.293f, 0.0f, false, false, 4.815f, 1.525f)
                curveToRelative(1.32f, 0.0f, 2.547f, -0.305f, 3.68f, -0.86f)
                curveToRelative(2.847f, -1.392f, 4.812f, -4.356f, 4.812f, -7.793f)
                curveToRelative(0.0f, -4.78f, -3.796f, -8.645f, -8.478f, -8.645f)
                close()
                moveTo(11.986f, 13.994f)
                curveToRelative(-2.841f, 0.0f, -5.152f, -2.396f, -5.152f, -5.34f)
                curveToRelative(0.0f, -2.946f, 2.31f, -5.342f, 5.152f, -5.342f)
                curveToRelative(2.841f, 0.0f, 5.152f, 2.396f, 5.152f, 5.341f)
                curveToRelative(0.0f, 2.945f, -2.31f, 5.341f, -5.152f, 5.341f)
                close()
            }
        }
        .build()
        return _picsart!!
    }

private var _picsart: ImageVector? = null
