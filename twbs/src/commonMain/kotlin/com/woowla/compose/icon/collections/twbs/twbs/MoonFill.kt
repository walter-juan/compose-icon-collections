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

public val Twbs.MoonFill: ImageVector
    get() {
        if (_moonFill != null) {
            return _moonFill!!
        }
        _moonFill = Builder(name = "MoonFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.278f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, 0.08f, 0.858f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, -0.878f, 3.46f)
                curveToRelative(0.0f, 4.021f, 3.278f, 7.277f, 7.318f, 7.277f)
                quadToRelative(0.792f, -0.001f, 1.533f, -0.16f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.81f, 0.316f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.031f, 0.893f)
                arcTo(8.35f, 8.35f, 0.0f, false, true, 8.344f, 16.0f)
                curveTo(3.734f, 16.0f, 0.0f, 12.286f, 0.0f, 7.71f)
                curveTo(0.0f, 4.266f, 2.114f, 1.312f, 5.124f, 0.06f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 0.278f)
            }
        }
        .build()
        return _moonFill!!
    }

private var _moonFill: ImageVector? = null
