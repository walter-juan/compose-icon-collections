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

public val Simpleicons.Daisyui: ImageVector
    get() {
        if (_daisyui != null) {
            return _daisyui!!
        }
        _daisyui = Builder(name = "Daisyui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.828f, 0.001f, 4.396f, 3.433f, 4.395f, 7.605f)
                curveToRelative(0.001f, 4.172f, 3.433f, 7.604f, 7.605f, 7.605f)
                curveToRelative(4.172f, -0.001f, 7.604f, -3.433f, 7.605f, -7.605f)
                curveTo(19.604f, 3.433f, 16.172f, 0.001f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 0.286f)
                curveToRelative(4.016f, 0.0f, 7.32f, 3.304f, 7.32f, 7.32f)
                curveToRelative(-0.001f, 4.015f, -3.305f, 7.318f, -7.32f, 7.318f)
                curveToRelative(-4.015f, 0.0f, -7.319f, -3.304f, -7.32f, -7.319f)
                curveToRelative(0.0f, -4.016f, 3.304f, -7.32f, 7.32f, -7.32f)
                close()
                moveTo(12.0f, 4.326f)
                arcToRelative(3.294f, 3.294f, 0.0f, false, false, -3.279f, 3.279f)
                verticalLineToRelative(0.001f)
                arcTo(3.296f, 3.296f, 0.0f, false, false, 12.0f, 10.884f)
                arcToRelative(3.294f, 3.294f, 0.0f, false, false, 3.279f, -3.279f)
                arcTo(3.294f, 3.294f, 0.0f, false, false, 12.0f, 4.326f)
                close()
                moveTo(8.34f, 16.681f)
                horizontalLineToRelative(-0.008f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -3.652f, 3.652f)
                verticalLineToRelative(0.015f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 8.332f, 24.0f)
                horizontalLineToRelative(7.336f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, 3.652f, -3.652f)
                verticalLineToRelative(-0.016f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -3.652f, -3.652f)
                horizontalLineToRelative(-0.008f)
                close()
            }
        }
        .build()
        return _daisyui!!
    }

private var _daisyui: ImageVector? = null
