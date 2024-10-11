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

public val LogosGroup.CoreosLine: ImageVector
    get() {
        if (_coreosLine != null) {
            return _coreosLine!!
        }
        _coreosLine = Builder(name = "CoreosLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.454f, 4.414f)
                curveTo(8.317f, 4.795f, 7.249f, 5.438f, 6.343f, 6.343f)
                curveTo(3.219f, 9.467f, 3.219f, 14.533f, 6.343f, 17.657f)
                curveTo(9.467f, 20.781f, 14.533f, 20.781f, 17.657f, 17.657f)
                curveTo(18.621f, 16.693f, 19.287f, 15.544f, 19.656f, 14.325f)
                curveTo(16.256f, 15.783f, 12.408f, 16.305f, 8.111f, 15.889f)
                curveTo(7.4f, 11.764f, 7.847f, 7.938f, 9.454f, 4.414f)
                close()
                moveTo(11.902f, 4.001f)
                curveTo(11.227f, 5.216f, 10.713f, 6.472f, 10.361f, 7.769f)
                curveTo(11.853f, 7.801f, 13.336f, 8.386f, 14.475f, 9.525f)
                curveTo(15.549f, 10.6f, 16.131f, 11.98f, 16.22f, 13.386f)
                curveTo(17.549f, 13.045f, 18.809f, 12.567f, 20.0f, 11.953f)
                curveTo(19.992f, 10.642f, 19.664f, 9.332f, 19.016f, 8.152f)
                curveTo(18.657f, 7.498f, 18.202f, 6.888f, 17.657f, 6.343f)
                curveTo(17.083f, 5.769f, 16.437f, 5.295f, 15.744f, 4.928f)
                curveTo(14.547f, 4.294f, 13.223f, 3.985f, 11.902f, 4.001f)
                close()
                moveTo(4.929f, 19.071f)
                curveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f)
                curveTo(8.834f, 1.024f, 15.166f, 1.024f, 19.071f, 4.929f)
                curveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f)
                curveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f)
                close()
                moveTo(9.949f, 9.778f)
                curveTo(9.757f, 11.141f, 9.732f, 12.549f, 9.873f, 14.007f)
                curveTo(11.397f, 14.068f, 12.849f, 13.995f, 14.232f, 13.788f)
                curveTo(14.237f, 12.758f, 13.847f, 11.726f, 13.061f, 10.939f)
                curveTo(12.208f, 10.086f, 11.065f, 9.699f, 9.949f, 9.778f)
                close()
            }
        }
        .build()
        return _coreosLine!!
    }

private var _coreosLine: ImageVector? = null
