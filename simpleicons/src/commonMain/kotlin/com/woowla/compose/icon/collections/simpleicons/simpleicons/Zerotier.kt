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

public val Simpleicons.Zerotier: ImageVector
    get() {
        if (_zerotier != null) {
            return _zerotier!!
        }
        _zerotier = Builder(name = "Zerotier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.01f, 0.0f)
                arcTo(3.999f, 3.999f, 0.0f, false, false, 0.014f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.209f, 1.79f, 4.0f, 3.996f, 4.0f)
                horizontalLineToRelative(15.98f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, false, 3.996f, -4.0f)
                lineTo(23.986f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.79f, -4.0f, -3.996f, -4.0f)
                close()
                moveTo(3.338f, 2.834f)
                horizontalLineToRelative(17.326f)
                arcToRelative(0.568f, 0.568f, 0.0f, true, true, 0.0f, 1.137f)
                horizontalLineToRelative(-8.129f)
                curveToRelative(0.021f, 0.059f, 0.033f, 0.123f, 0.033f, 0.19f)
                verticalLineToRelative(1.804f)
                arcTo(6.06f, 6.06f, 0.0f, false, true, 18.057f, 12.0f)
                curveToRelative(0.0f, 3.157f, -2.41f, 5.75f, -5.489f, 6.037f)
                verticalLineToRelative(2.56f)
                arcToRelative(0.568f, 0.568f, 0.0f, true, true, -1.136f, 0.0f)
                verticalLineToRelative(-2.56f)
                arcTo(6.061f, 6.061f, 0.0f, false, true, 5.943f, 12.0f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, true, 5.489f, -6.035f)
                lineTo(11.432f, 4.16f)
                curveToRelative(0.0f, -0.066f, 0.012f, -0.13f, 0.033f, -0.19f)
                lineTo(3.338f, 3.97f)
                arcToRelative(0.568f, 0.568f, 0.0f, true, true, 0.0f, -1.136f)
                close()
                moveTo(11.432f, 7.141f)
                arcTo(4.89f, 4.89f, 0.0f, false, false, 7.113f, 12.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 4.319f, 4.86f)
                close()
                moveTo(12.568f, 7.141f)
                verticalLineToRelative(9.718f)
                arcTo(4.892f, 4.892f, 0.0f, false, false, 16.888f, 12.0f)
                arcToRelative(4.892f, 4.892f, 0.0f, false, false, -4.32f, -4.86f)
                close()
            }
        }
        .build()
        return _zerotier!!
    }

private var _zerotier: ImageVector? = null
