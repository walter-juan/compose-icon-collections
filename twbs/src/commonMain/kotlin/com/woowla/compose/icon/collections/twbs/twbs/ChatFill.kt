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

public val Twbs.ChatFill: ImageVector
    get() {
        if (_chatFill != null) {
            return _chatFill!!
        }
        _chatFill = Builder(name = "ChatFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                curveToRelative(4.418f, 0.0f, 8.0f, -3.134f, 8.0f, -7.0f)
                reflectiveCurveToRelative(-3.582f, -7.0f, -8.0f, -7.0f)
                reflectiveCurveToRelative(-8.0f, 3.134f, -8.0f, 7.0f)
                curveToRelative(0.0f, 1.76f, 0.743f, 3.37f, 1.97f, 4.6f)
                curveToRelative(-0.097f, 1.016f, -0.417f, 2.13f, -0.771f, 2.966f)
                curveToRelative(-0.079f, 0.186f, 0.074f, 0.394f, 0.273f, 0.362f)
                curveToRelative(2.256f, -0.37f, 3.597f, -0.938f, 4.18f, -1.234f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 8.0f, 15.0f)
            }
        }
        .build()
        return _chatFill!!
    }

private var _chatFill: ImageVector? = null
