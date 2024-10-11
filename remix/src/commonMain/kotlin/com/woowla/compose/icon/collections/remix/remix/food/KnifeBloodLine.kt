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

public val FoodGroup.KnifeBloodLine: ImageVector
    get() {
        if (_knifeBloodLine != null) {
            return _knifeBloodLine!!
        }
        _knifeBloodLine = Builder(name = "KnifeBloodLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.343f, 1.408f)
                lineTo(22.374f, 19.439f)
                curveTo(22.96f, 20.025f, 22.96f, 20.975f, 22.374f, 21.561f)
                curveTo(21.789f, 22.146f, 20.839f, 22.146f, 20.253f, 21.561f)
                lineTo(15.657f, 16.965f)
                lineTo(12.121f, 20.5f)
                lineTo(8.001f, 16.379f)
                lineTo(8.001f, 19.0f)
                curveTo(8.001f, 19.552f, 7.554f, 20.0f, 7.001f, 20.0f)
                curveTo(6.449f, 20.0f, 6.001f, 19.552f, 6.001f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(6.001f, 14.448f, 5.554f, 14.0f, 5.001f, 14.0f)
                curveTo(4.488f, 14.0f, 4.066f, 14.386f, 4.008f, 14.884f)
                lineTo(4.001f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(4.001f, 16.552f, 3.554f, 17.0f, 3.001f, 17.0f)
                curveTo(2.449f, 17.0f, 2.001f, 16.552f, 2.001f, 16.0f)
                lineTo(2.001f, 7.214f)
                curveTo(1.964f, 5.194f, 2.687f, 3.164f, 4.17f, 1.587f)
                lineTo(4.343f, 1.408f)
                close()
                moveTo(4.584f, 4.478f)
                lineTo(4.533f, 4.588f)
                curveTo(4.23f, 5.258f, 4.056f, 5.971f, 4.011f, 6.691f)
                lineTo(4.001f, 7.0f)
                lineTo(4.0f, 7.12f)
                curveTo(4.014f, 8.559f, 4.541f, 9.993f, 5.581f, 11.123f)
                lineTo(5.757f, 11.308f)
                lineTo(12.121f, 17.672f)
                lineTo(14.949f, 14.843f)
                lineTo(4.584f, 4.478f)
                close()
            }
        }
        .build()
        return _knifeBloodLine!!
    }

private var _knifeBloodLine: ImageVector? = null
