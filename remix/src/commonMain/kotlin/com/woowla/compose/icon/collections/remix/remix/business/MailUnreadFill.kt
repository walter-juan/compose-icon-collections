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

public val BusinessGroup.MailUnreadFill: ImageVector
    get() {
        if (_mailUnreadFill != null) {
            return _mailUnreadFill!!
        }
        _mailUnreadFill = Builder(name = "MailUnreadFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.803f, 8.493f)
                curveTo(19.466f, 8.818f, 20.212f, 9.0f, 21.0f, 9.0f)
                curveTo(21.343f, 9.0f, 21.677f, 8.966f, 22.0f, 8.9f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(16.1f)
                curveTo(16.034f, 3.323f, 16.0f, 3.658f, 16.0f, 4.0f)
                curveTo(16.0f, 5.237f, 16.449f, 6.369f, 17.193f, 7.241f)
                lineTo(12.061f, 11.683f)
                lineTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.073f, 14.317f)
                lineTo(18.803f, 8.493f)
                close()
                moveTo(21.0f, 7.0f)
                curveTo(19.343f, 7.0f, 18.0f, 5.657f, 18.0f, 4.0f)
                curveTo(18.0f, 2.343f, 19.343f, 1.0f, 21.0f, 1.0f)
                curveTo(22.657f, 1.0f, 24.0f, 2.343f, 24.0f, 4.0f)
                curveTo(24.0f, 5.657f, 22.657f, 7.0f, 21.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mailUnreadFill!!
    }

private var _mailUnreadFill: ImageVector? = null
