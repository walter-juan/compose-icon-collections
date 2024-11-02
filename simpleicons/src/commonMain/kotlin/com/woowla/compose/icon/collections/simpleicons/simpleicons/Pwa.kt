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

public val Simpleicons.Pwa: ImageVector
    get() {
        if (_pwa != null) {
            return _pwa!!
        }
        _pwa = Builder(name = "Pwa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.597f, 7.482f)
                lineTo(24.0f, 16.518f)
                horizontalLineToRelative(-2.51f)
                lineToRelative(-0.582f, -1.618f)
                horizontalLineToRelative(-3.245f)
                lineToRelative(0.693f, -1.753f)
                horizontalLineToRelative(2.002f)
                lineToRelative(-0.95f, -2.66f)
                lineToRelative(1.188f, -3.005f)
                close()
                moveTo(12.486f, 7.482f)
                lineToRelative(1.772f, 5.839f)
                lineTo(16.75f, 7.482f)
                horizontalLineToRelative(2.415f)
                lineToRelative(-3.643f, 9.036f)
                horizontalLineToRelative(-2.383f)
                lineToRelative(-1.64f, -5.237f)
                lineToRelative(-1.72f, 5.237f)
                horizontalLineToRelative(-2.377f)
                lineToRelative(-1.233f, -2.116f)
                lineToRelative(1.214f, -3.741f)
                lineToRelative(1.342f, 2.661f)
                lineToRelative(1.903f, -5.839f)
                horizontalLineToRelative(1.857f)
                close()
                moveTo(3.74f, 7.482f)
                curveToRelative(1.064f, 0.0f, 1.871f, 0.306f, 2.423f, 0.917f)
                arcToRelative(2.647f, 2.647f, 0.0f, false, true, 0.281f, 0.368f)
                lineToRelative(-1.075f, 3.313f)
                lineToRelative(-0.385f, 1.185f)
                curveToRelative(-0.352f, 0.101f, -0.753f, 0.151f, -1.204f, 0.151f)
                lineTo(2.293f, 13.416f)
                verticalLineToRelative(3.102f)
                lineTo(0.0f, 16.518f)
                lineTo(0.0f, 7.482f)
                close()
                moveTo(3.159f, 9.235f)
                horizontalLineToRelative(-0.866f)
                verticalLineToRelative(2.428f)
                horizontalLineToRelative(0.86f)
                curveToRelative(0.558f, 0.0f, 0.941f, -0.119f, 1.148f, -0.358f)
                curveToRelative(0.19f, -0.215f, 0.285f, -0.506f, 0.285f, -0.872f)
                curveToRelative(0.0f, -0.364f, -0.108f, -0.654f, -0.324f, -0.871f)
                curveToRelative(-0.216f, -0.217f, -0.583f, -0.326f, -1.103f, -0.326f)
                close()
            }
        }
        .build()
        return _pwa!!
    }

private var _pwa: ImageVector? = null
