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

public val SolidGroup.Aquarius: ImageVector
    get() {
        if (_aquarius != null) {
            return _aquarius!!
        }
        _aquarius = Builder(name = "Aquarius", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(401.7f, 291.4f)
                curveToRelative(9.0f, -4.5f, 19.6f, -4.5f, 28.6f, 0.0f)
                lineToRelative(128.0f, 64.0f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineTo(416.0f, 355.8f)
                lineTo(302.3f, 412.6f)
                curveToRelative(-9.0f, 4.5f, -19.6f, 4.5f, -28.6f, 0.0f)
                lineTo(160.0f, 355.8f)
                lineTo(46.3f, 412.6f)
                curveToRelative(-15.8f, 7.9f, -35.0f, 1.5f, -42.9f, -14.3f)
                reflectiveCurveToRelative(-1.5f, -35.0f, 14.3f, -42.9f)
                lineToRelative(128.0f, -64.0f)
                curveToRelative(9.0f, -4.5f, 19.6f, -4.5f, 28.6f, 0.0f)
                lineTo(288.0f, 348.2f)
                lineTo(401.7f, 291.4f)
                close()
                moveTo(405.1f, 97.9f)
                curveToRelative(8.2f, -3.0f, 17.3f, -2.5f, 25.2f, 1.5f)
                lineToRelative(128.0f, 64.0f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineTo(416.0f, 163.8f)
                lineTo(302.3f, 220.6f)
                curveToRelative(-9.0f, 4.5f, -19.6f, 4.5f, -28.6f, 0.0f)
                lineTo(160.0f, 163.8f)
                lineTo(46.3f, 220.6f)
                curveToRelative(-15.8f, 7.9f, -35.0f, 1.5f, -42.9f, -14.3f)
                reflectiveCurveToRelative(-1.5f, -35.0f, 14.3f, -42.9f)
                lineToRelative(128.0f, -64.0f)
                lineToRelative(3.4f, -1.5f)
                curveToRelative(8.2f, -3.0f, 17.3f, -2.5f, 25.2f, 1.5f)
                lineToRelative(113.7f, 56.8f)
                lineToRelative(113.7f, -56.8f)
                lineToRelative(3.4f, -1.5f)
                close()
            }
        }
        .build()
        return _aquarius!!
    }

private var _aquarius: ImageVector? = null
