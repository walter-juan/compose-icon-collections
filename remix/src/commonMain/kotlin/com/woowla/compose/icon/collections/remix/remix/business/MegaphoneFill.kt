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

public val BusinessGroup.MegaphoneFill: ImageVector
    get() {
        if (_megaphoneFill != null) {
            return _megaphoneFill!!
        }
        _megaphoneFill = Builder(name = "MegaphoneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.063f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(17.021f, 4.979f, 13.303f, 6.087f, 11.0f, 6.613f)
                verticalLineTo(17.387f)
                curveTo(13.303f, 17.913f, 17.021f, 19.021f, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(13.937f)
                curveTo(21.863f, 13.715f, 22.5f, 12.932f, 22.5f, 12.0f)
                curveTo(22.5f, 11.068f, 21.863f, 10.285f, 21.0f, 10.063f)
                close()
                moveTo(5.0f, 7.0f)
                curveTo(3.895f, 7.0f, 3.0f, 7.895f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.105f, 3.895f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _megaphoneFill!!
    }

private var _megaphoneFill: ImageVector? = null
