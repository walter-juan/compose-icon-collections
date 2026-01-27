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

public val SolidGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 3.6f)
                curveToRelative(0.0f, 15.7f, -12.7f, 28.4f, -28.4f, 28.4f)
                lineToRelative(-135.1f, 0.0f)
                curveToRelative(-15.7f, 0.0f, -28.4f, -12.7f, -28.4f, -28.4f)
                lineToRelative(0.0f, -3.6f)
                close()
                moveTo(537.6f, 108.8f)
                curveToRelative(10.6f, 14.1f, 7.7f, 34.2f, -6.4f, 44.8f)
                lineToRelative(-97.8f, 73.3f)
                curveToRelative(5.3f, 8.9f, 9.3f, 18.7f, 11.8f, 29.1f)
                lineToRelative(98.8f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 2.6f, -0.1f, 5.3f, -0.2f, 7.9f)
                lineToRelative(83.4f, 62.5f)
                curveToRelative(14.1f, 10.6f, 17.0f, 30.7f, 6.4f, 44.8f)
                reflectiveCurveToRelative(-30.7f, 17.0f, -44.8f, 6.4f)
                lineToRelative(-63.1f, -47.3f)
                curveToRelative(-23.2f, 44.2f, -66.5f, 76.2f, -117.7f, 83.9f)
                lineTo(312.0f, 280.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 230.2f)
                curveToRelative(-51.2f, -7.7f, -94.5f, -39.7f, -117.7f, -83.9f)
                lineTo(83.2f, 473.6f)
                curveToRelative(-14.1f, 10.6f, -34.2f, 7.7f, -44.8f, -6.4f)
                reflectiveCurveToRelative(-7.7f, -34.2f, 6.4f, -44.8f)
                lineToRelative(83.4f, -62.5f)
                curveToRelative(-0.1f, -2.6f, -0.2f, -5.2f, -0.2f, -7.9f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(98.8f, 0.0f)
                curveToRelative(2.5f, -10.4f, 6.5f, -20.2f, 11.8f, -29.1f)
                lineTo(44.8f, 153.6f)
                curveToRelative(-14.1f, -10.6f, -17.0f, -30.7f, -6.4f, -44.8f)
                reflectiveCurveToRelative(30.7f, -17.0f, 44.8f, -6.4f)
                lineTo(192.0f, 184.0f)
                curveToRelative(12.3f, -5.1f, 25.8f, -8.0f, 40.0f, -8.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(14.2f, 0.0f, 27.7f, 2.8f, 40.0f, 8.0f)
                lineToRelative(108.8f, -81.6f)
                curveToRelative(14.1f, -10.6f, 34.2f, -7.7f, 44.8f, 6.4f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
