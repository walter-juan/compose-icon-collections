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

public val Simpleicons.Viaplay: ImageVector
    get() {
        if (_viaplay != null) {
            return _viaplay!!
        }
        _viaplay = Builder(name = "Viaplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.277f, 6.638f)
                curveTo(0.474f, 8.243f, 0.0f, 10.067f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.474f, 3.757f, 1.277f, 5.362f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(9.046f, 0.0f, 6.346f, 1.058f, 4.231f, 2.845f)
                lineToRelative(12.547f, 6.748f)
                verticalLineToRelative(4.815f)
                lineTo(4.231f, 21.155f)
                curveTo(6.31f, 22.942f, 9.046f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.638f, 0.0f, 12.0f, -5.362f, 12.0f, -12.0f)
                reflectiveCurveTo(18.638f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _viaplay!!
    }

private var _viaplay: ImageVector? = null
