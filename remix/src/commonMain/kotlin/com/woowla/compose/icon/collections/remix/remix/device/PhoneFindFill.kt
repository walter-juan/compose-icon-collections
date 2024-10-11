package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.PhoneFindFill: ImageVector
    get() {
        if (_phoneFindFill != null) {
            return _phoneFindFill!!
        }
        _phoneFindFill = Builder(name = "PhoneFindFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(18.552f, 2.0f, 19.0f, 2.448f, 19.0f, 3.0f)
                lineTo(19.001f, 11.529f)
                curveTo(17.939f, 10.578f, 16.537f, 10.0f, 15.0f, 10.0f)
                curveTo(11.686f, 10.0f, 9.0f, 12.686f, 9.0f, 16.0f)
                curveTo(9.0f, 19.238f, 11.76f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.448f, 5.448f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(17.209f, 12.0f, 19.0f, 13.791f, 19.0f, 16.0f)
                curveTo(19.0f, 16.742f, 18.798f, 17.437f, 18.446f, 18.032f)
                lineTo(20.657f, 20.243f)
                lineTo(19.243f, 21.657f)
                lineTo(17.032f, 19.446f)
                curveTo(16.437f, 19.798f, 15.742f, 20.0f, 15.0f, 20.0f)
                curveTo(12.791f, 20.0f, 11.0f, 18.209f, 11.0f, 16.0f)
                curveTo(11.0f, 13.791f, 12.791f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(13.895f, 14.0f, 13.0f, 14.895f, 13.0f, 16.0f)
                curveTo(13.0f, 17.105f, 13.895f, 18.0f, 15.0f, 18.0f)
                curveTo(16.105f, 18.0f, 17.0f, 17.105f, 17.0f, 16.0f)
                curveTo(17.0f, 14.895f, 16.105f, 14.0f, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _phoneFindFill!!
    }

private var _phoneFindFill: ImageVector? = null
