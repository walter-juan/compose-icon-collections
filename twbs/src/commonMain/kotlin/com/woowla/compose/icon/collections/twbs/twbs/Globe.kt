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

public val Twbs.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                moveToRelative(7.5f, -6.923f)
                curveToRelative(-0.67f, 0.204f, -1.335f, 0.82f, -1.887f, 1.855f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 5.145f, 4.0f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(4.09f, 4.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, 0.64f, -1.539f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.597f, -0.933f)
                arcTo(7.03f, 7.03f, 0.0f, false, false, 2.255f, 4.0f)
                close()
                moveTo(3.508f, 7.5f)
                curveToRelative(0.03f, -0.877f, 0.138f, -1.718f, 0.312f, -2.5f)
                lineTo(1.674f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.656f, 2.5f)
                close()
                moveTo(4.847f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -0.338f, 2.5f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 5.0f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.99f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -0.337f, -2.5f)
                close()
                moveTo(4.51f, 8.5f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 0.337f, 2.5f)
                lineTo(7.5f, 11.0f)
                lineTo(7.5f, 8.5f)
                close()
                moveTo(8.5f, 8.5f)
                lineTo(8.5f, 11.0f)
                horizontalLineToRelative(2.653f)
                curveToRelative(0.187f, -0.765f, 0.306f, -1.608f, 0.338f, -2.5f)
                close()
                moveTo(5.145f, 12.0f)
                quadToRelative(0.208f, 0.58f, 0.468f, 1.068f)
                curveToRelative(0.552f, 1.035f, 1.218f, 1.65f, 1.887f, 1.855f)
                lineTo(7.5f, 12.0f)
                close()
                moveTo(5.327f, 14.472f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.597f, -0.933f)
                arcTo(9.3f, 9.3f, 0.0f, false, true, 4.09f, 12.0f)
                lineTo(2.255f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 3.072f, 2.472f)
                moveTo(3.82f, 11.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -0.312f, -2.5f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(0.062f, 0.89f, 0.291f, 1.733f, 0.656f, 2.5f)
                close()
                moveTo(10.673f, 14.472f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 13.745f, 12.0f)
                lineTo(11.91f, 12.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, -0.64f, 1.539f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.597f, 0.933f)
                moveTo(8.5f, 12.0f)
                verticalLineToRelative(2.923f)
                curveToRelative(0.67f, -0.204f, 1.335f, -0.82f, 1.887f, -1.855f)
                quadToRelative(0.26f, -0.487f, 0.468f, -1.068f)
                close()
                moveTo(12.18f, 11.0f)
                horizontalLineToRelative(2.146f)
                curveToRelative(0.365f, -0.767f, 0.594f, -1.61f, 0.656f, -2.5f)
                horizontalLineToRelative(-2.49f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -0.312f, 2.5f)
                moveToRelative(2.802f, -3.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.656f, -2.5f)
                lineTo(12.18f, 5.0f)
                curveToRelative(0.174f, 0.782f, 0.282f, 1.623f, 0.312f, 2.5f)
                close()
                moveTo(11.27f, 2.461f)
                curveToRelative(0.247f, 0.464f, 0.462f, 0.98f, 0.64f, 1.539f)
                horizontalLineToRelative(1.835f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -3.072f, -2.472f)
                curveToRelative(0.218f, 0.284f, 0.418f, 0.598f, 0.597f, 0.933f)
                moveTo(10.855f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.468f, -1.068f)
                curveTo(9.835f, 1.897f, 9.17f, 1.282f, 8.5f, 1.077f)
                lineTo(8.5f, 4.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
