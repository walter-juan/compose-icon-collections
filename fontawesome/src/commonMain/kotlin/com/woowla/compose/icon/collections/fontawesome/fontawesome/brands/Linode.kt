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
                moveTo(366.04f, 186.87f)
                lineToRelative(-59.5f, 36.87f)
                lineToRelative(-0.84f, 36.87f)
                lineToRelative(-29.33f, -19.27f)
                lineToRelative(-39.38f, 24.3f)
                curveToRelative(2.24f, 55.21f, 2.48f, 59.27f, 2.51f, 59.5f)
                lineToRelative(-97.2f, 65.36f)
                lineTo(127.21f, 285.75f)
                lineToRelative(108.1f, -62.01f)
                lineTo(195.09f, 197.76f)
                lineToRelative(-75.42f, 38.55f)
                lineTo(98.72f, 93.01f)
                lineTo(227.77f, 43.57f)
                lineTo(136.43f, 0.0f)
                lineTo(10.74f, 39.38f)
                lineTo(38.39f, 174.3f)
                lineToRelative(41.9f, 32.68f)
                lineTo(48.44f, 222.06f)
                lineTo(69.39f, 323.46f)
                lineTo(98.72f, 351.11f)
                lineTo(77.77f, 363.68f)
                lineToRelative(16.76f, 78.77f)
                lineTo(160.73f, 512.0f)
                curveToRelative(-10.8f, -74.84f, -11.66f, -78.64f, -11.73f, -78.77f)
                lineToRelative(77.93f, -55.3f)
                curveToRelative(16.76f, -12.57f, 15.08f, -10.89f, 15.08f, -10.89f)
                lineToRelative(0.84f, 24.3f)
                lineToRelative(33.52f, 28.49f)
                lineToRelative(-0.84f, -77.09f)
                lineToRelative(46.93f, -33.52f)
                lineToRelative(26.82f, -18.43f)
                lineToRelative(-2.51f, 36.03f)
                lineToRelative(25.14f, 17.6f)
                lineToRelative(6.7f, -74.58f)
                lineToRelative(58.66f, -43.58f)
                close()
            }
        }
        .build()
        return _linode!!
    }

private var _linode: ImageVector? = null
