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

public val BusinessGroup.MailSendFill: ImageVector
    get() {
        if (_mailSendFill != null) {
            return _mailSendFill!!
        }
        _mailSendFill = Builder(name = "MailSendFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.5f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.3f)
                lineTo(12.0f, 14.5f)
                lineTo(2.0f, 5.5f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(0.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mailSendFill!!
    }

private var _mailSendFill: ImageVector? = null