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

public val BusinessGroup.InboxArchiveFill: ImageVector
    get() {
        if (_inboxArchiveFill != null) {
            return _inboxArchiveFill!!
        }
        _inboxArchiveFill = Builder(name = "InboxArchiveFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(7.004f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 18.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(19.764f, 7.0f)
                lineTo(18.764f, 5.0f)
                horizontalLineTo(5.237f)
                lineTo(4.237f, 7.0f)
                horizontalLineTo(19.764f)
                close()
            }
        }
        .build()
        return _inboxArchiveFill!!
    }

private var _inboxArchiveFill: ImageVector? = null
