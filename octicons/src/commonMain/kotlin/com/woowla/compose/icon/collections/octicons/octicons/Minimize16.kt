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

public val Octicons.Minimize16: ImageVector
    get() {
        if (_minimize16 != null) {
            return _minimize16!!
        }
        _minimize16 = Builder(name = "Minimize16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.668f, 8.583f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.13f, 0.012f)
                lineToRelative(0.017f, 0.003f)
                curveToRelative(0.01f, 0.002f, 0.02f, 0.007f, 0.031f, 0.01f)
                curveToRelative(0.036f, 0.009f, 0.073f, 0.017f, 0.108f, 0.032f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, true, 0.243f, 0.163f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, 0.126f, 0.176f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.036f, 0.067f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, true, 0.058f, 0.287f)
                lineToRelative(-0.001f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.188f)
                lineTo(2.53f, 14.53f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.387f, -3.387f)
                horizontalLineTo(2.666f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.002f)
                close()
                moveTo(13.47f, 1.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.385f, 3.386f)
                horizontalLineToRelative(2.188f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineToRelative(-4.0f, 0.001f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, -0.231f, -0.041f)
                curveToRelative(-0.019f, -0.006f, -0.038f, -0.01f, -0.056f, -0.017f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.067f, -0.036f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, -0.384f, -0.525f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.012f, -0.132f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.191f)
                lineTo(13.47f, 1.47f)
                close()
            }
        }
        .build()
        return _minimize16!!
    }

private var _minimize16: ImageVector? = null
