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

public val BrandsGroup.Linode: ImageVector
    get() {
        if (_linode != null) {
            return _linode!!
        }
        _linode = Builder(name = "Linode", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(366.3f, 186.9f)
                lineToRelative(-59.5f, 36.9f)
                lineToRelative(-0.8f, 36.9f)
                lineToRelative(-29.3f, -19.3f)
                lineToRelative(-39.4f, 24.3f)
                curveToRelative(2.2f, 55.2f, 2.5f, 59.3f, 2.5f, 59.5f)
                lineToRelative(-97.2f, 65.4f)
                lineToRelative(-15.1f, -104.7f)
                lineToRelative(108.1f, -62.0f)
                lineToRelative(-40.2f, -26.0f)
                lineToRelative(-75.4f, 38.5f)
                lineToRelative(-21.0f, -143.3f)
                lineToRelative(129.0f, -49.4f)
                lineToRelative(-91.3f, -43.6f)
                lineToRelative(-125.7f, 39.4f)
                lineToRelative(27.7f, 134.9f)
                lineToRelative(41.9f, 32.7f)
                lineToRelative(-31.8f, 15.1f)
                lineToRelative(20.9f, 101.4f)
                lineToRelative(29.3f, 27.7f)
                lineToRelative(-20.9f, 12.6f)
                lineToRelative(16.8f, 78.8f)
                lineToRelative(66.2f, 69.6f)
                curveToRelative(-10.8f, -74.8f, -11.7f, -78.6f, -11.7f, -78.8f)
                lineToRelative(77.9f, -55.3f)
                curveTo(244.0f, 365.4f, 242.3f, 367.0f, 242.3f, 367.0f)
                lineToRelative(0.8f, 24.3f)
                lineToRelative(33.5f, 28.5f)
                lineToRelative(-0.8f, -77.1f)
                lineToRelative(46.9f, -33.5f)
                lineToRelative(26.8f, -18.4f)
                lineToRelative(-2.5f, 36.0f)
                lineToRelative(25.1f, 17.6f)
                lineToRelative(6.7f, -74.6f)
                lineToRelative(58.7f, -43.6f)
                lineToRelative(-71.2f, -39.4f)
                close()
            }
        }
        .build()
        return _linode!!
    }

private var _linode: ImageVector? = null
