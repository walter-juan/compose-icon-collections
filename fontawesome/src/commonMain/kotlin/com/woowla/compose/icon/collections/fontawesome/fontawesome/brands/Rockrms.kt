package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Rockrms: ImageVector
    get() {
        if (_rockrms != null) {
            return _rockrms!!
        }
        _rockrms = Builder(name = "Rockrms", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(413.4f, 427.5f)
                lineToRelative(-90.0f, 0.0f)
                lineToRelative(-112.0f, -131.3f)
                curveToRelative(-17.9f, -20.4f, -3.9f, -56.1f, 26.6f, -56.1f)
                lineToRelative(75.3f, 0.0f)
                lineToRelative(-84.6f, -99.3f)
                lineToRelative(-84.3f, 98.9f)
                lineToRelative(-90.0f, 0.0f)
                lineToRelative(147.1f, -172.5f)
                curveToRelative(14.4f, -18.4f, 41.3f, -17.3f, 54.5f, 0.0f)
                lineTo(413.7f, 252.3f)
                curveToRelative(19.0f, 22.8f, 2.0f, 57.2f, -27.6f, 56.1f)
                curveToRelative(-0.6f, 0.0f, -74.2f, 0.2f, -74.2f, 0.2f)
                lineTo(413.4f, 427.5f)
                close()
            }
        }
        .build()
        return _rockrms!!
    }

private var _rockrms: ImageVector? = null
