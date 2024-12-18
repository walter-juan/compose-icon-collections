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

public val LogosGroup.PixLine: ImageVector
    get() {
        if (_pixLine != null) {
            return _pixLine!!
        }
        _pixLine = Builder(name = "PixLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.473f, 1.745f)
                lineTo(22.251f, 9.523f)
                curveTo(23.618f, 10.89f, 23.618f, 13.106f, 22.251f, 14.473f)
                lineTo(14.473f, 22.251f)
                curveTo(13.106f, 23.618f, 10.89f, 23.618f, 9.523f, 22.251f)
                lineTo(1.745f, 14.473f)
                curveTo(0.378f, 13.106f, 0.378f, 10.89f, 1.745f, 9.523f)
                lineTo(9.523f, 1.745f)
                curveTo(10.89f, 0.378f, 13.106f, 0.378f, 14.473f, 1.745f)
                close()
                moveTo(11.998f, 14.827f)
                lineTo(9.523f, 17.302f)
                curveTo(9.143f, 17.681f, 8.698f, 17.955f, 8.224f, 18.124f)
                lineTo(10.937f, 20.837f)
                curveTo(11.523f, 21.423f, 12.473f, 21.423f, 13.059f, 20.837f)
                lineTo(15.772f, 18.124f)
                curveTo(15.297f, 17.955f, 14.852f, 17.681f, 14.473f, 17.302f)
                lineTo(11.998f, 14.827f)
                close()
                moveTo(5.988f, 8.108f)
                lineTo(3.159f, 10.938f)
                curveTo(2.573f, 11.523f, 2.573f, 12.473f, 3.159f, 13.059f)
                lineTo(5.988f, 15.887f)
                curveTo(6.573f, 16.473f, 7.523f, 16.473f, 8.109f, 15.887f)
                lineTo(10.584f, 13.412f)
                curveTo(11.365f, 12.631f, 12.631f, 12.631f, 13.412f, 13.412f)
                lineTo(15.887f, 15.887f)
                curveTo(16.473f, 16.473f, 17.422f, 16.473f, 18.008f, 15.887f)
                lineTo(20.837f, 13.059f)
                curveTo(21.423f, 12.473f, 21.423f, 11.523f, 20.837f, 10.938f)
                lineTo(18.008f, 8.109f)
                curveTo(17.423f, 7.524f, 16.472f, 7.524f, 15.887f, 8.109f)
                lineTo(13.412f, 10.584f)
                curveTo(12.631f, 11.365f, 11.365f, 11.365f, 10.584f, 10.584f)
                lineTo(8.109f, 8.109f)
                curveTo(7.523f, 7.524f, 6.574f, 7.523f, 5.988f, 8.108f)
                close()
                moveTo(10.937f, 3.159f)
                lineTo(8.224f, 5.872f)
                curveTo(8.698f, 6.041f, 9.143f, 6.315f, 9.523f, 6.695f)
                lineTo(11.998f, 9.17f)
                lineTo(14.473f, 6.695f)
                curveTo(14.852f, 6.315f, 15.297f, 6.041f, 15.772f, 5.872f)
                lineTo(13.059f, 3.159f)
                curveTo(12.473f, 2.574f, 11.523f, 2.574f, 10.937f, 3.159f)
                close()
            }
        }
        .build()
        return _pixLine!!
    }

private var _pixLine: ImageVector? = null
