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

public val Simpleicons.Fyle: ImageVector
    get() {
        if (_fyle != null) {
            return _fyle!!
        }
        _fyle = Builder(name = "Fyle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.024f, 0.0f)
                horizontalLineTo(1.241f)
                curveTo(0.56f, 0.0f, 0.0f, 0.56f, 0.0f, 1.243f)
                verticalLineToRelative(21.514f)
                curveTo(0.0f, 23.44f, 0.56f, 24.0f, 1.241f, 24.0f)
                horizontalLineToRelative(21.518f)
                arcTo(1.24f, 1.24f, 0.0f, false, false, 24.0f, 22.757f)
                verticalLineTo(1.243f)
                curveTo(24.0f, 0.56f, 23.44f, 0.0f, 22.759f, 0.0f)
                horizontalLineTo(11.675f)
                verticalLineToRelative(15.592f)
                curveToRelative(-0.04f, 0.775f, -0.29f, 1.397f, -0.761f, 1.865f)
                curveToRelative(-0.92f, 0.927f, -2.521f, 1.049f, -3.921f, 1.049f)
                curveToRelative(-1.891f, 0.0f, -4.432f, -0.244f, -4.862f, -2.273f)
                lineToRelative(-0.06f, -0.508f)
                curveToRelative(-0.02f, -0.101f, -0.02f, -0.387f, -0.02f, -1.131f)
                verticalLineTo(3.965f)
                curveToRelative(0.0f, -0.488f, 0.16f, -0.907f, 0.51f, -1.254f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 3.812f, 2.2f)
                lineToRelative(4.611f, 0.02f)
                lineToRelative(0.161f, 0.041f)
                verticalLineToRelative(1.562f)
                horizontalLineTo(3.962f)
                curveToRelative(-0.12f, 0.0f, -0.18f, 0.061f, -0.18f, 0.142f)
                verticalLineToRelative(3.484f)
                horizontalLineToRelative(3.491f)
                verticalLineToRelative(1.599f)
                horizontalLineTo(3.782f)
                verticalLineToRelative(6.566f)
                curveToRelative(0.04f, 1.15f, 1.74f, 1.375f, 3.181f, 1.375f)
                curveToRelative(0.64f, -0.021f, 1.991f, -0.021f, 2.601f, -0.632f)
                curveToRelative(0.16f, -0.165f, 0.32f, -0.471f, 0.46f, -0.928f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _fyle!!
    }

private var _fyle: ImageVector? = null
