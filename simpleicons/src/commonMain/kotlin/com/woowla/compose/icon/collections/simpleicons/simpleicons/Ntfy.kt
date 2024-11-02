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

public val Simpleicons.Ntfy: ImageVector
    get() {
        if (_ntfy != null) {
            return _ntfy!!
        }
        _ntfy = Builder(name = "Ntfy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.597f, 13.693f)
                verticalLineToRelative(2.156f)
                horizontalLineToRelative(6.205f)
                verticalLineToRelative(-2.156f)
                close()
                moveTo(5.183f, 6.549f)
                verticalLineToRelative(2.363f)
                lineToRelative(3.591f, 1.901f)
                lineToRelative(0.023f, 0.01f)
                lineToRelative(-0.023f, 0.009f)
                lineToRelative(-3.591f, 1.901f)
                verticalLineToRelative(2.35f)
                lineToRelative(0.386f, -0.211f)
                lineToRelative(5.456f, -2.969f)
                lineTo(11.025f, 9.729f)
                close()
                moveTo(3.659f, 2.037f)
                curveTo(1.915f, 2.037f, 0.42f, 3.41f, 0.42f, 5.154f)
                verticalLineToRelative(0.002f)
                lineTo(0.438f, 18.73f)
                lineTo(0.0f, 21.963f)
                lineToRelative(5.956f, -1.583f)
                horizontalLineToRelative(14.806f)
                curveToRelative(1.744f, 0.0f, 3.238f, -1.374f, 3.238f, -3.118f)
                lineTo(24.0f, 5.154f)
                curveToRelative(0.0f, -1.744f, -1.493f, -3.116f, -3.237f, -3.117f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(3.659f, 4.237f)
                horizontalLineToRelative(17.104f)
                curveToRelative(0.613f, 0.001f, 1.037f, 0.447f, 1.037f, 0.917f)
                verticalLineToRelative(12.108f)
                curveToRelative(0.0f, 0.47f, -0.424f, 0.916f, -1.038f, 0.916f)
                lineTo(5.633f, 18.178f)
                lineToRelative(-3.026f, 0.915f)
                lineToRelative(0.031f, -0.179f)
                lineToRelative(-0.017f, -13.76f)
                curveToRelative(0.0f, -0.47f, 0.424f, -0.917f, 1.038f, -0.917f)
                close()
            }
        }
        .build()
        return _ntfy!!
    }

private var _ntfy: ImageVector? = null
