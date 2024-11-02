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

public val Simpleicons.Geopandas: ImageVector
    get() {
        if (_geopandas != null) {
            return _geopandas!!
        }
        _geopandas = Builder(name = "Geopandas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 0.0f)
                curveTo(5.391f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.611f, 5.383f, 12.0f, 12.004f, 12.0f)
                curveTo(18.626f, 24.0f, 24.0f, 18.611f, 24.0f, 12.0f)
                curveToRelative(0.0f, -6.62f, -5.382f, -12.0f, -11.996f, -12.0f)
                close()
                moveTo(21.833f, 12.0f)
                arcToRelative(9.734f, 9.734f, 0.0f, false, true, -0.823f, 3.925f)
                verticalLineToRelative(-7.85f)
                curveToRelative(0.529f, 1.196f, 0.823f, 2.53f, 0.823f, 3.925f)
                close()
                moveTo(17.733f, 19.98f)
                verticalLineToRelative(-1.872f)
                horizontalLineToRelative(-2.089f)
                verticalLineToRelative(3.015f)
                arcToRelative(9.795f, 9.795f, 0.0f, false, true, -3.64f, 0.702f)
                curveToRelative(-0.303f, 0.0f, -0.607f, -0.017f, -0.91f, -0.043f)
                lineTo(11.094f, 9.193f)
                lineTo(9.005f, 9.193f)
                verticalLineToRelative(12.165f)
                curveToRelative(-3.961f, -1.274f, -6.839f, -4.991f, -6.839f, -9.366f)
                curveToRelative(0.0f, -5.424f, 4.412f, -9.834f, 9.837f, -9.834f)
                curveToRelative(2.696f, 0.0f, 5.148f, 1.092f, 6.925f, 2.859f)
                verticalLineToRelative(13.889f)
                horizontalLineToRelative(0.061f)
                curveToRelative(-0.39f, 0.399f, -0.815f, 0.754f, -1.257f, 1.074f)
                close()
                moveTo(15.645f, 9.201f)
                horizontalLineToRelative(2.089f)
                verticalLineToRelative(4.332f)
                horizontalLineToRelative(-2.089f)
                close()
                moveTo(12.36f, 14.539f)
                horizontalLineToRelative(2.089f)
                verticalLineToRelative(4.332f)
                horizontalLineToRelative(-2.089f)
                close()
                moveTo(12.36f, 5.632f)
                horizontalLineToRelative(2.089f)
                verticalLineToRelative(4.332f)
                horizontalLineToRelative(-2.089f)
                close()
                moveTo(15.645f, 14.799f)
                horizontalLineToRelative(2.089f)
                verticalLineToRelative(2.045f)
                horizontalLineToRelative(-2.089f)
                close()
                moveTo(12.36f, 11.229f)
                horizontalLineToRelative(2.089f)
                verticalLineToRelative(2.045f)
                horizontalLineToRelative(-2.089f)
                close()
            }
        }
        .build()
        return _geopandas!!
    }

private var _geopandas: ImageVector? = null
