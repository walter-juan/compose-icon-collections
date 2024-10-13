package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPalette: ImageVector
    get() {
        if (_bxsPalette != null) {
            return _bxsPalette!!
        }
        _bxsPalette = Builder(name = "BxsPalette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.38f, 21.646f)
                arcTo(9.985f, 9.985f, 0.0f, false, false, 12.0f, 22.0f)
                lineToRelative(0.141f, -0.001f)
                arcToRelative(2.998f, 2.998f, 0.0f, false, false, 2.515f, -1.425f)
                curveToRelative(0.542f, -0.876f, 0.6f, -1.953f, 0.153f, -2.88f)
                lineToRelative(-0.198f, -0.415f)
                curveToRelative(-0.453f, -0.942f, -0.097f, -1.796f, 0.388f, -2.281f)
                curveToRelative(0.485f, -0.485f, 1.341f, -0.841f, 2.28f, -0.388f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.413f, 0.199f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 2.881f, -0.153f)
                arcTo(2.997f, 2.997f, 0.0f, false, false, 22.0f, 12.141f)
                arcToRelative(9.926f, 9.926f, 0.0f, false, false, -0.353f, -2.76f)
                curveToRelative(-1.038f, -3.827f, -4.353f, -6.754f, -8.246f, -7.285f)
                curveToRelative(-3.149f, -0.427f, -6.241f, 0.602f, -8.471f, 2.833f)
                reflectiveCurveTo(1.666f, 10.247f, 2.096f, 13.4f)
                curveToRelative(0.53f, 3.894f, 3.458f, 7.208f, 7.284f, 8.246f)
                close()
                moveTo(15.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(10.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(9.0f, 15.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(6.5f, 9.006f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 9.006f)
                close()
            }
        }
        .build()
        return _bxsPalette!!
    }

private var _bxsPalette: ImageVector? = null
