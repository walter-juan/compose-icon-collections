package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FirebaseFill: ImageVector
    get() {
        if (_firebaseFill != null) {
            return _firebaseFill!!
        }
        _firebaseFill = Builder(name = "FirebaseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.757f, 1.501f)
                lineTo(4.0f, 18.5f)
                lineTo(4.0f, 18.5f)
                lineTo(9.473f, 4.816f)
                lineTo(7.695f, 1.353f)
                curveTo(7.474f, 0.924f, 6.834f, 1.025f, 6.757f, 1.501f)
                close()
                moveTo(11.564f, 4.318f)
                lineTo(4.0f, 18.5f)
                lineTo(4.0f, 18.5f)
                lineTo(13.84f, 6.949f)
                lineTo(12.441f, 4.327f)
                curveTo(12.255f, 3.977f, 11.756f, 3.974f, 11.564f, 4.318f)
                close()
                moveTo(10.94f, 22.837f)
                lineTo(4.0f, 18.5f)
                lineTo(17.31f, 5.665f)
                curveTo(17.604f, 5.395f, 18.083f, 5.563f, 18.142f, 5.961f)
                lineTo(20.0f, 18.5f)
                lineTo(13.06f, 22.837f)
                curveTo(12.411f, 23.243f, 11.589f, 23.243f, 10.94f, 22.837f)
                close()
            }
        }
        .build()
        return _firebaseFill!!
    }

private var _firebaseFill: ImageVector? = null
