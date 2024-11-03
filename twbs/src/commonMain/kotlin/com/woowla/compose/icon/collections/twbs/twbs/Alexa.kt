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

public val Twbs.Alexa: ImageVector
    get() {
        if (_alexa != null) {
            return _alexa!!
        }
        _alexa = Builder(name = "Alexa", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.996f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.93f, 7.93f)
                verticalLineToRelative(-1.613f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, -0.717f, -1.008f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 2.4f, 7.865f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 8.054f, 2.4f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 5.535f, 5.81f)
                lineToRelative(-0.002f, 0.046f)
                lineToRelative(-0.012f, 0.192f)
                lineToRelative(-0.005f, 0.061f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.033f, 0.284f)
                lineToRelative(-0.01f, 0.068f)
                curveToRelative(-0.685f, 4.516f, -6.564f, 7.054f, -6.596f, 7.068f)
                arcTo(7.998f, 7.998f, 0.0f, false, false, 15.992f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 7.996f, 0.001f)
                close()
            }
        }
        .build()
        return _alexa!!
    }

private var _alexa: ImageVector? = null
