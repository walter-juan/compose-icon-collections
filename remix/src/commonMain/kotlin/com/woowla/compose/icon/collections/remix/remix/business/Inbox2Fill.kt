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

public val BusinessGroup.Inbox2Fill: ImageVector
    get() {
        if (_inbox2Fill != null) {
            return _inbox2Fill!!
        }
        _inbox2Fill = Builder(name = "Inbox2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(4.531f, 3.0f, 4.125f, 3.326f, 4.024f, 3.783f)
                lineTo(2.024f, 12.783f)
                curveTo(2.008f, 12.854f, 2.0f, 12.927f, 2.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 12.927f, 21.992f, 12.854f, 21.976f, 12.783f)
                lineTo(19.976f, 3.783f)
                curveTo(19.875f, 3.326f, 19.469f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.753f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                horizontalLineTo(4.247f)
                lineTo(5.802f, 5.0f)
                horizontalLineTo(18.198f)
                lineTo(19.753f, 12.0f)
                close()
            }
        }
        .build()
        return _inbox2Fill!!
    }

private var _inbox2Fill: ImageVector? = null
