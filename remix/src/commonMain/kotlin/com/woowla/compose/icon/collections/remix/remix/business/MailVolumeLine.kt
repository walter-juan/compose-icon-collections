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

public val BusinessGroup.MailVolumeLine: ImageVector
    get() {
        if (_mailVolumeLine != null) {
            return _mailVolumeLine!!
        }
        _mailVolumeLine = Builder(name = "MailVolumeLine", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.237f)
                lineTo(12.072f, 14.338f)
                lineTo(4.0f, 7.215f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
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
                moveTo(19.5f, 5.0f)
                horizontalLineTo(4.511f)
                lineTo(12.061f, 11.662f)
                lineTo(19.5f, 5.0f)
                close()
            }
        }
        .build()
        return _mailVolumeLine!!
    }

private var _mailVolumeLine: ImageVector? = null
