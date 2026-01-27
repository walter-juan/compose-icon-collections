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

public val Simpleicons.Processon: ImageVector
    get() {
        if (_processon != null) {
            return _processon!!
        }
        _processon = Builder(name = "Processon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.91f, 12.058f)
                curveToRelative(0.0f, -2.504f, 1.175f, -4.546f, 3.37f, -4.546f)
                curveToRelative(2.216f, 0.0f, 3.352f, 2.167f, 3.352f, 4.46f)
                curveToRelative(0.0f, 2.542f, -1.203f, 4.526f, -3.351f, 4.526f)
                curveToRelative(-2.129f, 0.0f, -3.37f, -1.965f, -3.37f, -4.44f)
                moveToRelative(9.072f, -0.183f)
                curveToRelative(0.0f, -3.458f, -2.09f, -6.145f, -5.653f, -6.154f)
                curveToRelative(-3.419f, 0.0f, -5.769f, 2.629f, -5.769f, 6.366f)
                curveToRelative(0.0f, 3.573f, 2.167f, 6.192f, 5.596f, 6.192f)
                curveToRelative(3.351f, 0.0f, 5.826f, -2.33f, 5.826f, -6.404f)
                moveToRelative(1.503f, 0.038f)
                lineToRelative(0.01f, 6.183f)
                horizontalLineToRelative(2.234f)
                verticalLineToRelative(-5.162f)
                curveToRelative(0.0f, -0.25f, 0.02f, -0.52f, 0.087f, -0.722f)
                curveToRelative(0.24f, -0.665f, 0.847f, -1.3f, 1.733f, -1.3f)
                curveToRelative(1.204f, 0.0f, 1.676f, 0.953f, 1.676f, 2.215f)
                verticalLineToRelative(4.96f)
                horizontalLineToRelative(2.215f)
                verticalLineToRelative(-5.21f)
                curveToRelative(0.0f, -2.784f, -1.589f, -3.776f, -3.12f, -3.776f)
                curveToRelative(-1.454f, 0.0f, -2.418f, 0.828f, -2.793f, 1.512f)
                horizontalLineToRelative(-0.058f)
                lineToRelative(-0.106f, -1.32f)
                horizontalLineToRelative(-1.946f)
                curveToRelative(0.048f, 0.762f, 0.068f, 1.61f, 0.068f, 2.62f)
                moveTo(20.013f, 24.0f)
                horizontalLineTo(3.987f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 0.0f, 20.013f)
                verticalLineTo(3.987f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 3.987f, 0.0f)
                horizontalLineToRelative(16.026f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 24.0f, 3.987f)
                verticalLineToRelative(16.026f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 20.013f, 24.0f)
            }
        }
        .build()
        return _processon!!
    }

private var _processon: ImageVector? = null
