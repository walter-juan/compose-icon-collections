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

public val BrandsGroup.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(name = "CreativeCommons", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.8f, 214.9f)
                lineToRelative(-33.2f, 17.3f)
                curveToRelative(-9.4f, -19.6f, -25.2f, -19.9f, -27.5f, -19.9f)
                curveToRelative(-22.1f, 0.0f, -33.2f, 14.6f, -33.2f, 43.8f)
                curveToRelative(0.0f, 23.6f, 9.2f, 43.8f, 33.2f, 43.8f)
                curveToRelative(14.5f, 0.0f, 24.6f, -7.1f, 30.6f, -21.3f)
                lineToRelative(30.6f, 15.5f)
                curveToRelative(-6.2f, 11.5f, -25.7f, 39.0f, -65.1f, 39.0f)
                curveToRelative(-22.6f, 0.0f, -74.0f, -10.3f, -74.0f, -77.0f)
                curveToRelative(0.0f, -58.7f, 43.0f, -77.1f, 72.6f, -77.1f)
                curveToRelative(30.7f, 0.0f, 52.7f, 11.9f, 66.0f, 35.9f)
                close()
                moveTo(396.8f, 214.9f)
                lineToRelative(-32.8f, 17.3f)
                curveToRelative(-9.5f, -19.8f, -25.7f, -19.9f, -27.9f, -19.9f)
                curveToRelative(-22.1f, 0.0f, -33.2f, 14.6f, -33.2f, 43.8f)
                curveToRelative(0.0f, 23.5f, 9.2f, 43.8f, 33.2f, 43.8f)
                curveToRelative(14.4f, 0.0f, 24.6f, -7.1f, 30.5f, -21.3f)
                lineToRelative(31.0f, 15.5f)
                curveToRelative(-2.1f, 3.8f, -21.4f, 39.0f, -65.1f, 39.0f)
                curveToRelative(-22.7f, 0.0f, -74.0f, -9.9f, -74.0f, -77.0f)
                curveToRelative(0.0f, -58.7f, 43.0f, -77.1f, 72.6f, -77.1f)
                curveToRelative(30.7f, 0.0f, 52.6f, 11.9f, 65.6f, 35.9f)
                close()
                moveTo(255.6f, 8.0f)
                curveTo(112.7f, 8.0f, 8.0f, 123.1f, 8.0f, 256.1f)
                curveTo(8.0f, 394.5f, 121.6f, 504.1f, 255.6f, 504.1f)
                curveTo(385.5f, 504.1f, 504.0f, 403.2f, 504.0f, 256.1f)
                curveTo(504.0f, 118.2f, 397.4f, 8.0f, 255.6f, 8.0f)
                close()
                moveTo(256.5f, 458.8f)
                curveToRelative(-112.5f, 0.0f, -203.7f, -93.0f, -203.7f, -202.8f)
                curveToRelative(0.0f, -105.4f, 85.4f, -203.3f, 203.7f, -203.3f)
                curveToRelative(112.5f, 0.0f, 202.8f, 89.5f, 202.8f, 203.3f)
                curveToRelative(0.0f, 121.7f, -99.7f, 202.8f, -202.8f, 202.8f)
                close()
            }
        }
        .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
