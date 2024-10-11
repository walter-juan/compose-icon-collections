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

public val LogosGroup.AndroidFill: ImageVector
    get() {
        if (_androidFill != null) {
            return _androidFill!!
        }
        _androidFill = Builder(name = "AndroidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.382f, 3.968f)
                curveTo(7.922f, 2.736f, 9.875f, 2.0f, 12.0f, 2.0f)
                curveTo(14.125f, 2.0f, 16.078f, 2.736f, 17.618f, 3.968f)
                lineTo(19.071f, 2.515f)
                lineTo(20.485f, 3.929f)
                lineTo(19.032f, 5.382f)
                curveTo(20.264f, 6.922f, 21.0f, 8.875f, 21.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 8.875f, 3.736f, 6.922f, 4.968f, 5.382f)
                lineTo(3.515f, 3.929f)
                lineTo(4.929f, 2.515f)
                lineTo(6.382f, 3.968f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(9.552f, 9.0f, 10.0f, 8.552f, 10.0f, 8.0f)
                curveTo(10.0f, 7.448f, 9.552f, 7.0f, 9.0f, 7.0f)
                curveTo(8.448f, 7.0f, 8.0f, 7.448f, 8.0f, 8.0f)
                curveTo(8.0f, 8.552f, 8.448f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.552f, 9.0f, 16.0f, 8.552f, 16.0f, 8.0f)
                curveTo(16.0f, 7.448f, 15.552f, 7.0f, 15.0f, 7.0f)
                curveTo(14.448f, 7.0f, 14.0f, 7.448f, 14.0f, 8.0f)
                curveTo(14.0f, 8.552f, 14.448f, 9.0f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _androidFill!!
    }

private var _androidFill: ImageVector? = null
