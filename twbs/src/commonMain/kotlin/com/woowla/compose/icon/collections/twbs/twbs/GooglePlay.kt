package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.222f, 9.374f)
                curveToRelative(1.037f, -0.61f, 1.037f, -2.137f, 0.0f, -2.748f)
                lineTo(11.528f, 5.04f)
                lineTo(8.32f, 8.0f)
                lineToRelative(3.207f, 2.96f)
                close()
                moveTo(10.627f, 11.49f)
                lineTo(7.583f, 8.68f)
                lineTo(1.03f, 14.73f)
                curveToRelative(0.201f, 1.029f, 1.36f, 1.61f, 2.303f, 1.055f)
                close()
                moveTo(1.0f, 13.396f)
                lineTo(1.0f, 2.603f)
                lineTo(6.846f, 8.0f)
                close()
                moveTo(1.03f, 1.27f)
                lineToRelative(6.553f, 6.05f)
                lineToRelative(3.044f, -2.81f)
                lineTo(3.333f, 0.215f)
                curveTo(2.39f, -0.341f, 1.231f, 0.24f, 1.03f, 1.27f)
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
