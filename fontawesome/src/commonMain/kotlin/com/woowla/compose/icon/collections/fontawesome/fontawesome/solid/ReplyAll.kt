package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.2f, 18.4f)
                curveToRelative(12.0f, 5.0f, 19.8f, 16.6f, 19.8f, 29.6f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, 78.8f, 176.0f, 176.0f)
                curveToRelative(0.0f, 113.3f, -81.5f, 163.9f, -100.2f, 174.1f)
                curveToRelative(-2.5f, 1.4f, -5.3f, 1.9f, -8.1f, 1.9f)
                curveToRelative(-10.9f, 0.0f, -19.7f, -8.9f, -19.7f, -19.7f)
                curveToRelative(0.0f, -7.5f, 4.3f, -14.4f, 9.8f, -19.5f)
                curveToRelative(9.4f, -8.8f, 22.2f, -26.4f, 22.2f, -56.7f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                reflectiveCurveToRelative(-25.7f, 2.2f, -34.9f, -6.9f)
                lineToRelative(-160.0f, -160.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(160.0f, -160.0f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                close()
                moveTo(205.6f, 23.1f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(54.6f, 208.0f)
                lineTo(205.6f, 358.9f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(10.0f, 231.2f)
                curveToRelative(-6.4f, -6.0f, -10.0f, -14.4f, -10.0f, -23.2f)
                reflectiveCurveToRelative(3.6f, -17.2f, 10.0f, -23.2f)
                lineTo(171.6f, 23.1f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
