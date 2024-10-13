package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlTelegram: ImageVector
    get() {
        if (_bxlTelegram != null) {
            return _bxlTelegram!!
        }
        _bxlTelegram = Builder(name = "BxlTelegram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.665f, 3.717f)
                lineToRelative(-17.73f, 6.837f)
                curveToRelative(-1.21f, 0.486f, -1.203f, 1.161f, -0.222f, 1.462f)
                lineToRelative(4.552f, 1.42f)
                lineToRelative(10.532f, -6.645f)
                curveToRelative(0.498f, -0.303f, 0.953f, -0.14f, 0.579f, 0.192f)
                lineToRelative(-8.533f, 7.701f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(-0.314f, 4.692f)
                curveToRelative(0.46f, 0.0f, 0.663f, -0.211f, 0.921f, -0.46f)
                lineToRelative(2.211f, -2.15f)
                lineToRelative(4.599f, 3.397f)
                curveToRelative(0.848f, 0.467f, 1.457f, 0.227f, 1.668f, -0.785f)
                lineToRelative(3.019f, -14.228f)
                curveToRelative(0.309f, -1.239f, -0.473f, -1.8f, -1.282f, -1.434f)
                close()
            }
        }
        .build()
        return _bxlTelegram!!
    }

private var _bxlTelegram: ImageVector? = null
