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

public val BusinessGroup.MailUnreadLine: ImageVector
    get() {
        if (_mailUnreadLine != null) {
            return _mailUnreadLine!!
        }
        _mailUnreadLine = Builder(name = "MailUnreadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1f, 3.0f)
                curveTo(16.034f, 3.323f, 16.0f, 3.658f, 16.0f, 4.0f)
                curveTo(16.0f, 4.342f, 16.034f, 4.677f, 16.1f, 5.0f)
                horizontalLineTo(4.511f)
                lineTo(12.062f, 11.662f)
                lineTo(17.11f, 7.141f)
                curveTo(17.536f, 7.669f, 18.068f, 8.108f, 18.673f, 8.427f)
                lineTo(12.072f, 14.338f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.9f)
                curveTo(20.323f, 8.966f, 20.657f, 9.0f, 21.0f, 9.0f)
                curveTo(21.343f, 9.0f, 21.677f, 8.966f, 22.0f, 8.9f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(16.1f)
                close()
                moveTo(21.0f, 1.0f)
                curveTo(22.657f, 1.0f, 24.0f, 2.343f, 24.0f, 4.0f)
                curveTo(24.0f, 5.657f, 22.657f, 7.0f, 21.0f, 7.0f)
                curveTo(19.343f, 7.0f, 18.0f, 5.657f, 18.0f, 4.0f)
                curveTo(18.0f, 2.343f, 19.343f, 1.0f, 21.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mailUnreadLine!!
    }

private var _mailUnreadLine: ImageVector? = null
