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

public val DeviceGroup.RssLine: ImageVector
    get() {
        if (_rssLine != null) {
            return _rssLine!!
        }
        _rssLine = Builder(name = "RssLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveTo(5.209f, 17.0f, 7.0f, 18.791f, 7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(9.075f, 10.0f, 14.0f, 14.925f, 14.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 16.029f, 7.971f, 12.0f, 3.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 3.0f)
                curveTo(12.941f, 3.0f, 21.0f, 11.059f, 21.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 12.163f, 11.837f, 5.0f, 3.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _rssLine!!
    }

private var _rssLine: ImageVector? = null
