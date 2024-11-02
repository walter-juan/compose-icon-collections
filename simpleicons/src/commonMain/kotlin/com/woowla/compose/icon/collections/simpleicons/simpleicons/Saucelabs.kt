package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Saucelabs: ImageVector
    get() {
        if (_saucelabs != null) {
            return _saucelabs!!
        }
        _saucelabs = Builder(name = "Saucelabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.434f, 7.344f)
                curveToRelative(-0.564f, -0.766f, -1.469f, -1.22f, -2.434f, -1.22f)
                lineTo(13.999f, 6.124f)
                lineTo(11.999f, 12.0f)
                horizontalLineToRelative(4.838f)
                lineToRelative(-2.0f, 5.876f)
                lineTo(10.0f, 17.875f)
                lineToRelative(-2.0f, 5.876f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.291f, 0.0f, 2.438f, -0.809f, 2.847f, -2.009f)
                lineTo(23.846f, 9.992f)
                curveToRelative(0.305f, -0.896f, 0.152f, -1.881f, -0.412f, -2.647f)
                close()
                moveTo(10.0f, 11.999f)
                lineTo(7.162f, 11.999f)
                lineToRelative(2.0f, -5.876f)
                horizontalLineToRelative(4.838f)
                lineToRelative(2.001f, -5.874f)
                lineTo(7.0f, 0.249f)
                curveToRelative(-1.291f, 0.0f, -2.438f, 0.809f, -2.847f, 2.009f)
                lineTo(0.154f, 14.008f)
                curveToRelative(-0.305f, 0.896f, -0.152f, 1.881f, 0.412f, 2.647f)
                curveToRelative(0.564f, 0.766f, 1.469f, 1.22f, 2.434f, 1.22f)
                horizontalLineToRelative(7.0f)
                lineToRelative(2.0f, -5.876f)
                lineTo(10.001f, 11.999f)
                close()
            }
        }
        .build()
        return _saucelabs!!
    }

private var _saucelabs: ImageVector? = null
