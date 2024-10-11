package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.CriminalLine: ImageVector
    get() {
        if (_criminalLine != null) {
            return _criminalLine!!
        }
        _criminalLine = Builder(name = "CriminalLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.029f, 21.0f, 11.0f)
                curveTo(21.0f, 13.203f, 20.208f, 15.221f, 18.894f, 16.786f)
                curveTo(20.149f, 17.616f, 20.927f, 18.675f, 20.995f, 19.835f)
                lineTo(21.0f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.005f, 19.835f)
                curveTo(3.072f, 18.676f, 3.851f, 17.616f, 5.106f, 16.786f)
                curveTo(3.792f, 15.222f, 3.0f, 13.204f, 3.0f, 11.0f)
                curveTo(3.0f, 6.029f, 7.029f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.134f, 5.0f, 11.0f)
                curveTo(5.0f, 12.567f, 5.514f, 14.05f, 6.445f, 15.261f)
                lineTo(6.637f, 15.5f)
                lineTo(8.08f, 17.217f)
                lineTo(6.118f, 18.516f)
                lineTo(5.981f, 18.613f)
                lineTo(12.0f, 19.951f)
                lineTo(18.018f, 18.613f)
                lineTo(17.969f, 18.577f)
                lineTo(17.791f, 18.454f)
                lineTo(15.92f, 17.217f)
                lineTo(17.363f, 15.499f)
                curveTo(18.415f, 14.247f, 19.0f, 12.671f, 19.0f, 11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.381f, 13.0f, 14.5f, 13.672f, 14.5f, 14.5f)
                curveTo(14.5f, 15.328f, 13.381f, 16.0f, 12.0f, 16.0f)
                curveTo(10.619f, 16.0f, 9.5f, 15.328f, 9.5f, 14.5f)
                curveTo(9.5f, 13.672f, 10.619f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(10.105f, 8.0f, 11.0f, 8.672f, 11.0f, 9.5f)
                curveTo(11.0f, 10.328f, 10.105f, 11.0f, 9.0f, 11.0f)
                curveTo(7.895f, 11.0f, 7.0f, 10.328f, 7.0f, 9.5f)
                curveTo(7.0f, 8.672f, 7.895f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveTo(16.105f, 8.0f, 17.0f, 8.672f, 17.0f, 9.5f)
                curveTo(17.0f, 10.328f, 16.105f, 11.0f, 15.0f, 11.0f)
                curveTo(13.895f, 11.0f, 13.0f, 10.328f, 13.0f, 9.5f)
                curveTo(13.0f, 8.672f, 13.895f, 8.0f, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _criminalLine!!
    }

private var _criminalLine: ImageVector? = null
