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

public val BusinessGroup.MailVolumeFill: ImageVector
    get() {
        if (_mailVolumeFill != null) {
            return _mailVolumeFill!!
        }
        _mailVolumeFill = Builder(name = "MailVolumeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.5f)
                verticalLineTo(23.5f)
                lineTo(16.667f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.667f)
                lineTo(20.0f, 14.5f)
                close()
                moveTo(21.0f, 3.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                lineTo(22.001f, 14.529f)
                curveTo(20.939f, 13.578f, 19.537f, 13.0f, 18.0f, 13.0f)
                curveTo(14.686f, 13.0f, 12.0f, 15.686f, 12.0f, 19.0f)
                curveTo(12.0f, 19.701f, 12.12f, 20.375f, 12.342f, 21.001f)
                lineTo(3.0f, 21.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 17.0f)
                curveTo(22.105f, 17.0f, 23.0f, 17.895f, 23.0f, 19.0f)
                curveTo(23.0f, 20.054f, 22.184f, 20.918f, 21.149f, 20.994f)
                lineTo(21.0f, 21.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.073f, 14.317f)
                lineTo(19.654f, 7.756f)
                lineTo(18.346f, 6.244f)
                lineTo(12.06f, 11.682f)
                lineTo(5.647f, 6.238f)
                close()
            }
        }
        .build()
        return _mailVolumeFill!!
    }

private var _mailVolumeFill: ImageVector? = null
