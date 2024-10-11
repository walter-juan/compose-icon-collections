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

public val BusinessGroup.RecordMailFill: ImageVector
    get() {
        if (_recordMailFill != null) {
            return _recordMailFill!!
        }
        _recordMailFill = Builder(name = "RecordMailFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.743f, 15.0f)
                horizontalLineTo(14.257f)
                curveTo(13.472f, 14.049f, 13.0f, 12.83f, 13.0f, 11.5f)
                curveTo(13.0f, 8.462f, 15.462f, 6.0f, 18.5f, 6.0f)
                curveTo(21.538f, 6.0f, 24.0f, 8.462f, 24.0f, 11.5f)
                curveTo(24.0f, 14.538f, 21.538f, 17.0f, 18.5f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(2.462f, 17.0f, 0.0f, 14.538f, 0.0f, 11.5f)
                curveTo(0.0f, 8.462f, 2.462f, 6.0f, 5.5f, 6.0f)
                curveTo(8.538f, 6.0f, 11.0f, 8.462f, 11.0f, 11.5f)
                curveTo(11.0f, 12.83f, 10.528f, 14.049f, 9.743f, 15.0f)
                close()
                moveTo(5.5f, 13.0f)
                curveTo(6.328f, 13.0f, 7.0f, 12.328f, 7.0f, 11.5f)
                curveTo(7.0f, 10.672f, 6.328f, 10.0f, 5.5f, 10.0f)
                curveTo(4.672f, 10.0f, 4.0f, 10.672f, 4.0f, 11.5f)
                curveTo(4.0f, 12.328f, 4.672f, 13.0f, 5.5f, 13.0f)
                close()
                moveTo(18.5f, 13.0f)
                curveTo(19.328f, 13.0f, 20.0f, 12.328f, 20.0f, 11.5f)
                curveTo(20.0f, 10.672f, 19.328f, 10.0f, 18.5f, 10.0f)
                curveTo(17.672f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                curveTo(17.0f, 12.328f, 17.672f, 13.0f, 18.5f, 13.0f)
                close()
            }
        }
        .build()
        return _recordMailFill!!
    }

private var _recordMailFill: ImageVector? = null
