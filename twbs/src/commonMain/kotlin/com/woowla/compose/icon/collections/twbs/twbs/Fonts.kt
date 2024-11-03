package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Fonts: ImageVector
    get() {
        if (_fonts != null) {
            return _fonts!!
        }
        _fonts = Builder(name = "Fonts", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.258f, 3.0f)
                horizontalLineToRelative(-8.51f)
                lineToRelative(-0.083f, 2.46f)
                horizontalLineToRelative(0.479f)
                curveToRelative(0.26f, -1.544f, 0.758f, -1.783f, 2.693f, -1.845f)
                lineToRelative(0.424f, -0.013f)
                verticalLineToRelative(7.827f)
                curveToRelative(0.0f, 0.663f, -0.144f, 0.82f, -1.3f, 0.923f)
                verticalLineToRelative(0.52f)
                horizontalLineToRelative(4.082f)
                verticalLineToRelative(-0.52f)
                curveToRelative(-1.162f, -0.103f, -1.306f, -0.26f, -1.306f, -0.923f)
                verticalLineTo(3.602f)
                lineToRelative(0.431f, 0.013f)
                curveToRelative(1.934f, 0.062f, 2.434f, 0.301f, 2.693f, 1.846f)
                horizontalLineToRelative(0.479f)
                close()
            }
        }
        .build()
        return _fonts!!
    }

private var _fonts: ImageVector? = null
