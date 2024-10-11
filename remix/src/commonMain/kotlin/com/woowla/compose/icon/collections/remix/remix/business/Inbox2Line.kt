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

public val BusinessGroup.Inbox2Line: ImageVector
    get() {
        if (_inbox2Line != null) {
            return _inbox2Line!!
        }
        _inbox2Line = Builder(name = "Inbox2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.024f, 3.783f)
                curveTo(4.125f, 3.326f, 4.531f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.469f, 3.0f, 19.875f, 3.326f, 19.976f, 3.783f)
                lineTo(21.976f, 12.783f)
                curveTo(21.992f, 12.854f, 22.0f, 12.927f, 22.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 12.927f, 2.008f, 12.854f, 2.024f, 12.783f)
                lineTo(4.024f, 3.783f)
                close()
                moveTo(5.802f, 5.0f)
                lineTo(4.247f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                horizontalLineTo(19.753f)
                lineTo(18.198f, 5.0f)
                horizontalLineTo(5.802f)
                close()
                moveTo(16.584f, 14.0f)
                curveTo(15.812f, 15.766f, 14.05f, 17.0f, 12.0f, 17.0f)
                curveTo(9.95f, 17.0f, 8.188f, 15.766f, 7.416f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.584f)
                close()
            }
        }
        .build()
        return _inbox2Line!!
    }

private var _inbox2Line: ImageVector? = null
