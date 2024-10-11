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

public val LogosGroup.VisaLine: ImageVector
    get() {
        if (_visaLine != null) {
            return _visaLine!!
        }
        _visaLine = Builder(name = "VisaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.222f, 15.768f)
                lineTo(21.997f, 14.643f)
                lineTo(19.483f, 14.643f)
                lineTo(19.084f, 15.76f)
                lineTo(17.068f, 15.764f)
                curveTo(18.363f, 12.651f, 19.325f, 10.345f, 19.952f, 8.847f)
                curveTo(20.116f, 8.455f, 20.407f, 8.255f, 20.836f, 8.258f)
                curveTo(21.164f, 8.261f, 21.699f, 8.261f, 22.442f, 8.259f)
                lineTo(24.0f, 15.765f)
                lineTo(22.222f, 15.768f)
                close()
                moveTo(20.049f, 13.102f)
                horizontalLineTo(21.669f)
                lineTo(21.064f, 10.282f)
                lineTo(20.049f, 13.102f)
                close()
                moveTo(7.061f, 8.257f)
                lineTo(9.087f, 8.259f)
                lineTo(5.955f, 15.768f)
                lineTo(3.904f, 15.767f)
                curveTo(3.21f, 13.09f, 2.701f, 11.104f, 2.376f, 9.811f)
                curveTo(2.276f, 9.415f, 2.078f, 9.138f, 1.697f, 9.007f)
                curveTo(1.357f, 8.89f, 0.792f, 8.71f, 0.0f, 8.466f)
                verticalLineTo(8.259f)
                curveTo(1.48f, 8.259f, 2.559f, 8.259f, 3.237f, 8.259f)
                curveTo(3.797f, 8.26f, 4.124f, 8.53f, 4.229f, 9.086f)
                curveTo(4.335f, 9.644f, 4.601f, 11.062f, 5.029f, 13.34f)
                lineTo(7.061f, 8.257f)
                close()
                moveTo(11.87f, 8.259f)
                lineTo(10.269f, 15.768f)
                lineTo(8.341f, 15.765f)
                curveTo(8.379f, 15.582f, 8.912f, 13.08f, 9.94f, 8.257f)
                lineTo(11.87f, 8.259f)
                close()
                moveTo(15.781f, 8.12f)
                curveTo(16.358f, 8.12f, 17.085f, 8.299f, 17.503f, 8.466f)
                lineTo(17.165f, 10.022f)
                curveTo(16.787f, 9.87f, 16.166f, 9.665f, 15.642f, 9.673f)
                curveTo(14.881f, 9.685f, 14.412f, 10.004f, 14.412f, 10.311f)
                curveTo(14.412f, 10.808f, 15.228f, 11.059f, 16.068f, 11.603f)
                curveTo(17.027f, 12.224f, 17.153f, 12.78f, 17.141f, 13.386f)
                curveTo(17.128f, 14.641f, 16.068f, 15.88f, 13.832f, 15.88f)
                curveTo(12.811f, 15.865f, 12.444f, 15.779f, 11.612f, 15.484f)
                lineTo(11.964f, 13.859f)
                curveTo(12.811f, 14.214f, 13.17f, 14.327f, 13.894f, 14.327f)
                curveTo(14.557f, 14.327f, 15.126f, 14.059f, 15.131f, 13.592f)
                curveTo(15.135f, 13.26f, 14.932f, 13.095f, 14.187f, 12.685f)
                curveTo(13.443f, 12.274f, 12.399f, 11.706f, 12.413f, 10.563f)
                curveTo(12.43f, 9.101f, 13.815f, 8.12f, 15.781f, 8.12f)
                close()
            }
        }
        .build()
        return _visaLine!!
    }

private var _visaLine: ImageVector? = null
