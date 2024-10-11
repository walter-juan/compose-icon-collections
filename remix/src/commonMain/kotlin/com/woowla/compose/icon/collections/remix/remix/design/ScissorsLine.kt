package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.ScissorsLine: ImageVector
    get() {
        if (_scissorsLine != null) {
            return _scissorsLine!!
        }
        _scissorsLine = Builder(name = "ScissorsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.446f, 8.029f)
                lineTo(12.0f, 10.583f)
                lineTo(18.728f, 3.855f)
                curveTo(19.509f, 3.074f, 20.775f, 3.074f, 21.556f, 3.855f)
                lineTo(9.446f, 15.965f)
                curveTo(9.798f, 16.56f, 10.0f, 17.255f, 10.0f, 17.997f)
                curveTo(10.0f, 20.206f, 8.209f, 21.997f, 6.0f, 21.997f)
                curveTo(3.791f, 21.997f, 2.0f, 20.206f, 2.0f, 17.997f)
                curveTo(2.0f, 15.788f, 3.791f, 13.997f, 6.0f, 13.997f)
                curveTo(6.742f, 13.997f, 7.436f, 14.199f, 8.032f, 14.55f)
                lineTo(10.586f, 11.997f)
                lineTo(8.032f, 9.443f)
                curveTo(7.436f, 9.795f, 6.742f, 9.997f, 6.0f, 9.997f)
                curveTo(3.791f, 9.997f, 2.0f, 8.206f, 2.0f, 5.997f)
                curveTo(2.0f, 3.788f, 3.791f, 1.997f, 6.0f, 1.997f)
                curveTo(8.209f, 1.997f, 10.0f, 3.788f, 10.0f, 5.997f)
                curveTo(10.0f, 6.739f, 9.798f, 7.433f, 9.446f, 8.029f)
                close()
                moveTo(14.825f, 13.408f)
                lineTo(21.556f, 20.139f)
                curveTo(20.775f, 20.92f, 19.509f, 20.92f, 18.728f, 20.139f)
                lineTo(13.411f, 14.822f)
                lineTo(14.825f, 13.408f)
                close()
                moveTo(7.414f, 16.583f)
                curveTo(7.052f, 16.221f, 6.552f, 15.997f, 6.0f, 15.997f)
                curveTo(4.895f, 15.997f, 4.0f, 16.892f, 4.0f, 17.997f)
                curveTo(4.0f, 19.101f, 4.895f, 19.997f, 6.0f, 19.997f)
                curveTo(7.105f, 19.997f, 8.0f, 19.101f, 8.0f, 17.997f)
                curveTo(8.0f, 17.444f, 7.776f, 16.944f, 7.414f, 16.583f)
                close()
                moveTo(7.414f, 7.411f)
                curveTo(7.776f, 7.049f, 8.0f, 6.549f, 8.0f, 5.997f)
                curveTo(8.0f, 4.892f, 7.105f, 3.997f, 6.0f, 3.997f)
                curveTo(4.895f, 3.997f, 4.0f, 4.892f, 4.0f, 5.997f)
                curveTo(4.0f, 7.101f, 4.895f, 7.997f, 6.0f, 7.997f)
                curveTo(6.552f, 7.997f, 7.052f, 7.773f, 7.414f, 7.411f)
                close()
            }
        }
        .build()
        return _scissorsLine!!
    }

private var _scissorsLine: ImageVector? = null
