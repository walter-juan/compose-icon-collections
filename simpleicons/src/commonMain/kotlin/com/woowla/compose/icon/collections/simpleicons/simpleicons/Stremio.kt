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

public val Simpleicons.Stremio: ImageVector
    get() {
        if (_stremio != null) {
            return _stremio!!
        }
        _stremio = Builder(name = "Stremio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.85f, 0.354f)
                lineTo(0.353f, 11.15f)
                curveToRelative(-0.47f, 0.47f, -0.47f, 1.227f, 0.0f, 1.697f)
                lineTo(11.15f, 23.647f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 1.7f, 0.0f)
                lineToRelative(10.797f, -10.8f)
                curveToRelative(0.47f, -0.47f, 0.47f, -1.226f, 0.0f, -1.696f)
                lineTo(12.85f, 0.354f)
                arcTo(1.2f, 1.2f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(10.326f, 7.586f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.002f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.129f, 0.04f)
                lineToRelative(5.729f, 4.214f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.0f, 0.323f)
                lineToRelative(-5.73f, 4.213f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.317f, -0.16f)
                verticalLineToRelative(-8.43f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.187f, -0.2f)
                close()
            }
        }
        .build()
        return _stremio!!
    }

private var _stremio: ImageVector? = null
