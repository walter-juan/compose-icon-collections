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

public val FoodGroup.KnifeLine: ImageVector
    get() {
        if (_knifeLine != null) {
            return _knifeLine!!
        }
        _knifeLine = Builder(name = "KnifeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.343f, 1.408f)
                lineTo(22.374f, 19.439f)
                curveTo(22.96f, 20.025f, 22.96f, 20.975f, 22.374f, 21.561f)
                curveTo(21.789f, 22.146f, 20.839f, 22.146f, 20.253f, 21.561f)
                lineTo(15.657f, 16.965f)
                lineTo(12.121f, 20.5f)
                lineTo(4.343f, 12.722f)
                curveTo(1.278f, 9.657f, 1.22f, 4.723f, 4.17f, 1.587f)
                lineTo(4.343f, 1.408f)
                close()
                moveTo(4.584f, 4.478f)
                lineTo(4.533f, 4.588f)
                curveTo(3.564f, 6.727f, 3.918f, 9.315f, 5.581f, 11.123f)
                lineTo(5.757f, 11.308f)
                lineTo(12.121f, 17.672f)
                lineTo(14.949f, 14.843f)
                lineTo(4.584f, 4.478f)
                close()
            }
        }
        .build()
        return _knifeLine!!
    }

private var _knifeLine: ImageVector? = null
