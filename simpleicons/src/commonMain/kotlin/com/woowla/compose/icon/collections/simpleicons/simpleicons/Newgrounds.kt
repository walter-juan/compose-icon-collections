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

public val Simpleicons.Newgrounds: ImageVector
    get() {
        if (_newgrounds != null) {
            return _newgrounds!!
        }
        _newgrounds = Builder(name = "Newgrounds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.187f, 3.236f)
                curveTo(0.397f, 3.966f, 0.002f, 4.876f, 0.002f, 5.97f)
                verticalLineToRelative(15.584f)
                curveToRelative(-0.02f, 0.243f, 0.101f, 0.364f, 0.365f, 0.364f)
                horizontalLineTo(3.07f)
                curveToRelative(0.243f, 0.0f, 0.365f, -0.121f, 0.365f, -0.364f)
                verticalLineTo(6.03f)
                curveToRelative(0.0f, -0.405f, 0.212f, -0.608f, 0.638f, -0.608f)
                horizontalLineTo(6.29f)
                curveToRelative(0.405f, 0.0f, 0.608f, 0.203f, 0.608f, 0.608f)
                verticalLineToRelative(15.523f)
                curveToRelative(0.0f, 0.243f, 0.142f, 0.364f, 0.425f, 0.364f)
                horizontalLineToRelative(2.643f)
                curveToRelative(0.243f, 0.0f, 0.374f, -0.121f, 0.395f, -0.364f)
                verticalLineTo(5.97f)
                curveToRelative(-0.02f, -1.093f, -0.415f, -2.005f, -1.185f, -2.734f)
                arcTo(4.047f, 4.047f, 0.0f, false, false, 6.29f, 2.082f)
                horizontalLineTo(4.073f)
                curveToRelative(-1.134f, 0.0f, -2.096f, 0.385f, -2.886f, 1.154f)
                moveToRelative(20.9f, 18.105f)
                curveToRelative(0.263f, -0.162f, 0.506f, -0.344f, 0.728f, -0.547f)
                curveToRelative(0.79f, -0.77f, 1.185f, -1.68f, 1.185f, -2.734f)
                verticalLineToRelative(-5.62f)
                curveToRelative(-0.02f, -0.263f, -0.152f, -0.394f, -0.395f, -0.394f)
                horizontalLineToRelative(-4.374f)
                curveToRelative(-0.263f, 0.0f, -0.395f, 0.131f, -0.395f, 0.394f)
                verticalLineToRelative(2.522f)
                curveToRelative(0.0f, 0.263f, 0.132f, 0.395f, 0.395f, 0.395f)
                horizontalLineToRelative(0.941f)
                curveToRelative(0.244f, 0.0f, 0.365f, 0.141f, 0.365f, 0.425f)
                verticalLineToRelative(2.278f)
                curveToRelative(0.0f, 0.385f, -0.192f, 0.577f, -0.577f, 0.577f)
                horizontalLineToRelative(-2.248f)
                curveToRelative(-0.425f, 0.0f, -0.638f, -0.192f, -0.638f, -0.577f)
                verticalLineTo(6.03f)
                curveToRelative(0.0f, -0.404f, 0.213f, -0.607f, 0.638f, -0.607f)
                horizontalLineToRelative(2.248f)
                curveToRelative(0.385f, 0.0f, 0.577f, 0.203f, 0.577f, 0.608f)
                verticalLineTo(8.34f)
                curveToRelative(-0.02f, 0.243f, 0.111f, 0.374f, 0.395f, 0.394f)
                horizontalLineToRelative(2.673f)
                curveToRelative(0.243f, -0.02f, 0.375f, -0.151f, 0.395f, -0.394f)
                verticalLineTo(5.97f)
                curveToRelative(0.0f, -1.073f, -0.395f, -1.984f, -1.185f, -2.734f)
                curveToRelative(-0.81f, -0.77f, -1.762f, -1.154f, -2.855f, -1.154f)
                horizontalLineToRelative(-2.248f)
                curveToRelative(-1.114f, 0.0f, -2.066f, 0.385f, -2.855f, 1.154f)
                curveToRelative(-0.83f, 0.75f, -1.236f, 1.66f, -1.216f, 2.734f)
                verticalLineToRelative(12.09f)
                curveToRelative(-0.02f, 1.053f, 0.385f, 1.965f, 1.216f, 2.734f)
                curveToRelative(0.222f, 0.203f, 0.465f, 0.385f, 0.729f, 0.547f)
                curveToRelative(0.627f, 0.385f, 1.336f, 0.577f, 2.126f, 0.577f)
                horizontalLineToRelative(2.248f)
                curveToRelative(0.79f, 0.0f, 1.498f, -0.192f, 2.126f, -0.577f)
                close()
            }
        }
        .build()
        return _newgrounds!!
    }

private var _newgrounds: ImageVector? = null
