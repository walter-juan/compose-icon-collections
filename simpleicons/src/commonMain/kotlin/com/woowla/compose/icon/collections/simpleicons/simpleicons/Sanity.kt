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

public val Simpleicons.Sanity: ImageVector
    get() {
        if (_sanity != null) {
            return _sanity!!
        }
        _sanity = Builder(name = "Sanity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.327f, 15.205f)
                lineToRelative(-0.893f, -1.555f)
                lineToRelative(-4.321f, 2.632f)
                lineToRelative(4.799f, -6.11f)
                lineToRelative(0.726f, -0.426f)
                lineToRelative(-0.179f, -0.27f)
                lineToRelative(0.33f, -0.421f)
                lineToRelative(-1.515f, -1.261f)
                lineToRelative(-0.693f, 0.883f)
                lineToRelative(-13.992f, 8.186f)
                lineToRelative(5.173f, -6.221f)
                lineToRelative(9.636f, -5.282f)
                lineToRelative(-0.915f, -1.769f)
                lineToRelative(-5.248f, 2.876f)
                lineToRelative(2.584f, -3.106f)
                lineToRelative(-1.481f, -1.305f)
                lineToRelative(-5.816f, 6.994f)
                lineToRelative(-5.777f, 3.168f)
                lineToRelative(4.423f, -5.847f)
                lineToRelative(2.771f, -1.442f)
                lineToRelative(-0.88f, -1.789f)
                lineToRelative(-8.075f, 4.203f)
                lineTo(6.186f, 4.43f)
                lineTo(4.648f, 3.198f)
                lineTo(0.0f, 9.349f)
                lineToRelative(0.072f, 0.058f)
                lineToRelative(0.868f, 1.768f)
                lineToRelative(5.153f, -2.683f)
                lineToRelative(-4.696f, 6.207f)
                lineToRelative(0.77f, 0.617f)
                lineToRelative(0.458f, 0.885f)
                lineToRelative(5.425f, -2.974f)
                lineToRelative(-5.974f, 7.185f)
                lineToRelative(1.481f, 1.304f)
                lineToRelative(0.297f, -0.358f)
                lineToRelative(14.411f, -8.459f)
                lineToRelative(-4.785f, 6.094f)
                lineToRelative(0.078f, 0.065f)
                lineToRelative(-0.007f, 0.005f)
                lineToRelative(0.992f, 1.726f)
                lineToRelative(6.364f, -3.877f)
                lineToRelative(-2.451f, 3.954f)
                lineToRelative(1.642f, 1.077f)
                lineTo(24.0f, 15.648f)
                close()
            }
        }
        .build()
        return _sanity!!
    }

private var _sanity: ImageVector? = null
