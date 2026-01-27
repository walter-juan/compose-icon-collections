package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Sparkle24: ImageVector
    get() {
        if (_sparkle24 != null) {
            return _sparkle24!!
        }
        _sparkle24 = Builder(name = "Sparkle24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.191f, 0.565f)
                curveToRelative(0.275f, -0.754f, 1.342f, -0.753f, 1.618f, 0.0f)
                lineToRelative(1.918f, 5.238f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 3.47f, 3.47f)
                lineToRelative(5.237f, 1.918f)
                curveToRelative(0.755f, 0.275f, 0.755f, 1.342f, 0.0f, 1.618f)
                lineToRelative(-5.237f, 1.918f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, -3.47f, 3.47f)
                lineToRelative(-1.918f, 5.237f)
                curveToRelative(-0.276f, 0.755f, -1.343f, 0.755f, -1.618f, 0.0f)
                lineToRelative(-1.918f, -5.237f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, -3.47f, -3.47f)
                lineTo(0.565f, 12.809f)
                curveToRelative(-0.753f, -0.276f, -0.754f, -1.342f, 0.0f, -1.618f)
                lineToRelative(5.238f, -1.918f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 3.47f, -3.47f)
                lineTo(11.191f, 0.565f)
                close()
                moveTo(10.686f, 6.321f)
                arcToRelative(7.336f, 7.336f, 0.0f, false, true, -4.365f, 4.365f)
                lineTo(2.73f, 12.0f)
                lineToRelative(3.591f, 1.315f)
                arcToRelative(7.333f, 7.333f, 0.0f, false, true, 4.365f, 4.365f)
                lineTo(12.0f, 21.269f)
                lineToRelative(1.315f, -3.589f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, true, 4.365f, -4.365f)
                lineTo(21.269f, 12.0f)
                lineToRelative(-3.589f, -1.314f)
                arcToRelative(7.333f, 7.333f, 0.0f, false, true, -4.365f, -4.365f)
                lineTo(12.0f, 2.73f)
                lineToRelative(-1.314f, 3.591f)
                close()
            }
        }
        .build()
        return _sparkle24!!
    }

private var _sparkle24: ImageVector? = null
