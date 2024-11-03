package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PlugFill: ImageVector
    get() {
        if (_plugFill != null) {
            return _plugFill!!
        }
        _plugFill = Builder(name = "PlugFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 10.0f)
                curveToRelative(-0.002f, 0.434f, -0.01f, 0.845f, -0.04f, 1.22f)
                curveToRelative(-0.041f, 0.514f, -0.126f, 1.003f, -0.317f, 1.424f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, -0.97f, 1.028f)
                curveTo(6.725f, 13.9f, 6.169f, 14.0f, 5.5f, 14.0f)
                curveToRelative(-0.998f, 0.0f, -1.61f, 0.33f, -1.974f, 0.718f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, -0.616f, 0.232f, -1.367f, 0.797f, -1.968f)
                curveTo(3.374f, 13.42f, 4.261f, 13.0f, 5.5f, 13.0f)
                curveToRelative(0.581f, 0.0f, 0.962f, -0.088f, 1.218f, -0.219f)
                curveToRelative(0.241f, -0.123f, 0.4f, -0.3f, 0.514f, -0.55f)
                curveToRelative(0.121f, -0.266f, 0.193f, -0.621f, 0.23f, -1.09f)
                curveToRelative(0.027f, -0.34f, 0.035f, -0.718f, 0.037f, -1.141f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 6.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 0.0f)
            }
        }
        .build()
        return _plugFill!!
    }

private var _plugFill: ImageVector? = null
