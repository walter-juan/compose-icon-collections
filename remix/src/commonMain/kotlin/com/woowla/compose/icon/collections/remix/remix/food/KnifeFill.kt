package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.KnifeFill: ImageVector
    get() {
        if (_knifeFill != null) {
            return _knifeFill!!
        }
        _knifeFill = Builder(name = "KnifeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.374f, 19.439f)
                curveTo(22.96f, 20.025f, 22.96f, 20.975f, 22.374f, 21.561f)
                curveTo(21.789f, 22.146f, 20.839f, 22.146f, 20.253f, 21.561f)
                lineTo(15.657f, 16.965f)
                lineTo(12.121f, 20.5f)
                lineTo(4.343f, 12.722f)
                curveTo(1.278f, 9.657f, 1.22f, 4.723f, 4.17f, 1.587f)
                lineTo(4.343f, 1.408f)
                lineTo(22.374f, 19.439f)
                close()
            }
        }
        .build()
        return _knifeFill!!
    }

private var _knifeFill: ImageVector? = null
