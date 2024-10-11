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

public val BusinessGroup.MailDownloadFill: ImageVector
    get() {
        if (_mailDownloadFill != null) {
            return _mailDownloadFill!!
        }
        _mailDownloadFill = Builder(name = "MailDownloadFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.803f)
                curveTo(21.118f, 12.292f, 20.093f, 12.0f, 19.0f, 12.0f)
                curveTo(15.686f, 12.0f, 13.0f, 14.686f, 13.0f, 18.0f)
                curveTo(13.0f, 19.093f, 13.292f, 20.118f, 13.803f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(12.803f)
                close()
                moveTo(12.061f, 11.683f)
                lineTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.073f, 14.317f)
                lineTo(19.654f, 7.756f)
                lineTo(18.346f, 6.244f)
                lineTo(12.061f, 11.683f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 22.0f)
                lineTo(15.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _mailDownloadFill!!
    }

private var _mailDownloadFill: ImageVector? = null
