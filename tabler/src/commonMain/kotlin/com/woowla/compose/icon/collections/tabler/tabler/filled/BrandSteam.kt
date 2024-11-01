package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) {
            return _brandSteam!!
        }
        _brandSteam = Builder(name = "BrandSteam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -0.309f, 10.992f)
                lineToRelative(-0.078f, -0.007f)
                lineToRelative(-3.646f, 2.524f)
                lineToRelative(-0.011f, 0.094f)
                curveToRelative(-0.267f, 1.775f, -1.707f, 3.18f, -3.571f, 3.38f)
                lineToRelative(-0.209f, 0.017f)
                horizontalLineToRelative(-0.176f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.756f, -2.623f)
                lineToRelative(-0.016f, -0.048f)
                lineToRelative(-2.122f, -0.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.599f, -0.8f)
                lineToRelative(-0.007f, -0.119f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.447f, -0.894f)
                lineToRelative(2.964f, 1.481f)
                lineToRelative(0.174f, -0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.15f, -0.482f)
                lineToRelative(0.166f, 0.014f)
                lineToRelative(2.126f, -2.977f)
                lineToRelative(-0.01f, -0.098f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.092f, -3.758f)
                lineToRelative(0.169f, -0.212f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 4.222f, -1.974f)
                moveToRelative(0.0f, 3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
