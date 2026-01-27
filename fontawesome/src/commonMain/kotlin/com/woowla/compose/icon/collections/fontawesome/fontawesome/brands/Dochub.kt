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

public val BrandsGroup.Dochub: ImageVector
    get() {
        if (_dochub != null) {
            return _dochub!!
        }
        _dochub = Builder(name = "Dochub", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.9f, 160.0f)
                lineTo(272.0f, 160.0f)
                lineTo(272.0f, 19.6f)
                lineTo(413.9f, 160.0f)
                close()
                moveTo(320.0f, 192.0f)
                lineToRelative(0.0f, 130.0f)
                curveToRelative(0.0f, 66.8f, -36.5f, 100.1f, -113.3f, 100.1f)
                lineToRelative(-94.7f, 0.0f)
                lineToRelative(0.0f, -337.3f)
                lineToRelative(94.7f, 0.0f)
                curveToRelative(12.0f, 0.0f, 23.1f, 0.8f, 33.1f, 2.5f)
                lineToRelative(0.0f, -84.0f)
                curveTo(228.9f, 1.1f, 217.4f, 0.0f, 205.2f, 0.0f)
                lineTo(16.0f, 0.0f)
                lineTo(16.0f, 512.0f)
                lineTo(205.2f, 512.0f)
                curveTo(345.7f, 512.0f, 416.0f, 447.4f, 416.0f, 318.1f)
                lineToRelative(0.0f, -126.1f)
                lineToRelative(-96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dochub!!
    }

private var _dochub: ImageVector? = null
