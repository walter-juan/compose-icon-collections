package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBluetooth: ImageVector
    get() {
        if (_bxBluetooth != null) {
            return _bxBluetooth!!
        }
        _bxBluetooth = Builder(name = "BxBluetooth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.41f, 16.192f)
                lineToRelative(1.18f, 1.615f)
                lineTo(10.0f, 14.584f)
                lineTo(10.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.541f, 0.841f)
                lineToRelative(7.0f, -4.5f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.049f, -1.649f)
                lineTo(13.537f, 12.0f)
                lineToRelative(5.053f, -3.692f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.049f, -1.65f)
                lineToRelative(-7.0f, -4.5f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -1.021f, -0.037f)
                curveToRelative(-0.32f, 0.176f, -0.52f, 0.513f, -0.52f, 0.879f)
                verticalLineToRelative(6.416f)
                lineTo(5.59f, 6.192f)
                lineTo(4.41f, 7.808f)
                lineTo(10.0f, 11.893f)
                verticalLineToRelative(0.215f)
                lineToRelative(-5.59f, 4.084f)
                close()
                moveTo(12.0f, 4.832f)
                lineToRelative(4.232f, 2.721f)
                lineTo(12.0f, 10.646f)
                lineTo(12.0f, 4.832f)
                close()
                moveTo(12.0f, 13.354f)
                lineTo(16.232f, 16.447f)
                lineTo(12.0f, 19.168f)
                verticalLineToRelative(-5.814f)
                close()
            }
        }
        .build()
        return _bxBluetooth!!
    }

private var _bxBluetooth: ImageVector? = null
