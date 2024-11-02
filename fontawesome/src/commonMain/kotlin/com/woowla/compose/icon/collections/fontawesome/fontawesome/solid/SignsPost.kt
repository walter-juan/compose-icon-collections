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

public val SolidGroup.SignsPost: ImageVector
    get() {
        if (_signsPost != null) {
            return _signsPost!!
        }
        _signsPost = Builder(name = "SignsPost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(377.4f, 0.0f)
                curveToRelative(4.2f, 0.0f, 8.3f, -1.7f, 11.3f, -4.7f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-48.0f, -48.0f)
                curveToRelative(-3.0f, -3.0f, -7.1f, -4.7f, -11.3f, -4.7f)
                lineTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(480.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(70.6f, 224.0f)
                curveToRelative(-4.2f, 0.0f, -8.3f, 1.7f, -11.3f, 4.7f)
                lineToRelative(-48.0f, 48.0f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(48.0f, 48.0f)
                curveToRelative(3.0f, 3.0f, 7.1f, 4.7f, 11.3f, 4.7f)
                lineTo(448.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(288.0f, 480.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _signsPost!!
    }

private var _signsPost: ImageVector? = null
