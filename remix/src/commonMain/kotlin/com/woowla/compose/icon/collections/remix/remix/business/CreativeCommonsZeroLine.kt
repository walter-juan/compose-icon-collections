package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CreativeCommonsZeroLine: ImageVector
    get() {
        if (_creativeCommonsZeroLine != null) {
            return _creativeCommonsZeroLine!!
        }
        _creativeCommonsZeroLine = Builder(name = "CreativeCommonsZeroLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 8.686f, 14.762f, 6.0f, 12.0f, 6.0f)
                curveTo(9.239f, 6.0f, 7.0f, 8.686f, 7.0f, 12.0f)
                curveTo(7.0f, 15.314f, 9.239f, 18.0f, 12.0f, 18.0f)
                curveTo(14.762f, 18.0f, 17.0f, 15.314f, 17.0f, 12.0f)
                close()
                moveTo(10.763f, 15.645f)
                lineTo(14.325f, 9.472f)
                curveTo(14.747f, 10.161f, 15.0f, 11.041f, 15.0f, 12.0f)
                curveTo(15.0f, 14.209f, 13.657f, 16.0f, 12.0f, 16.0f)
                curveTo(11.559f, 16.0f, 11.14f, 15.873f, 10.763f, 15.645f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 9.791f, 10.343f, 8.0f, 12.0f, 8.0f)
                curveTo(12.441f, 8.0f, 12.86f, 8.127f, 13.237f, 8.355f)
                lineTo(9.675f, 14.528f)
                curveTo(9.253f, 13.839f, 9.0f, 12.959f, 9.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(9.24f, 2.0f, 6.739f, 3.121f, 4.93f, 4.93f)
                curveTo(3.121f, 6.739f, 2.0f, 9.24f, 2.0f, 12.0f)
                curveTo(2.0f, 14.76f, 3.121f, 17.261f, 4.93f, 19.07f)
                curveTo(6.739f, 20.879f, 9.24f, 22.0f, 12.0f, 22.0f)
                curveTo(14.76f, 22.0f, 17.261f, 20.879f, 19.07f, 19.07f)
                curveTo(20.879f, 17.261f, 22.0f, 14.76f, 22.0f, 12.0f)
                curveTo(22.0f, 9.24f, 20.879f, 6.739f, 19.07f, 4.93f)
                curveTo(17.261f, 3.121f, 14.76f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.344f, 6.344f)
                curveTo(7.794f, 4.895f, 9.792f, 4.0f, 12.0f, 4.0f)
                curveTo(14.208f, 4.0f, 16.206f, 4.895f, 17.656f, 6.344f)
                curveTo(19.105f, 7.794f, 20.0f, 9.792f, 20.0f, 12.0f)
                curveTo(20.0f, 14.208f, 19.105f, 16.206f, 17.656f, 17.656f)
                curveTo(16.206f, 19.105f, 14.208f, 20.0f, 12.0f, 20.0f)
                curveTo(9.792f, 20.0f, 7.794f, 19.105f, 6.344f, 17.656f)
                curveTo(4.895f, 16.206f, 4.0f, 14.208f, 4.0f, 12.0f)
                curveTo(4.0f, 9.792f, 4.895f, 7.794f, 6.344f, 6.344f)
                close()
            }
        }
        .build()
        return _creativeCommonsZeroLine!!
    }

private var _creativeCommonsZeroLine: ImageVector? = null
