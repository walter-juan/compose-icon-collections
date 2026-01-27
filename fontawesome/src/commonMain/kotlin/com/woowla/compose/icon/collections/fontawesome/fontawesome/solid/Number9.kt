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

public val SolidGroup.Number9: ImageVector
    get() {
        if (_number9 != null) {
            return _number9!!
        }
        _number9 = Builder(name = "Number9", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 320.0f)
                curveToRelative(29.6f, 0.0f, 57.1f, -8.9f, 80.0f, -24.2f)
                lineToRelative(0.0f, 32.2f)
                curveToRelative(0.0f, 48.6f, -39.4f, 88.0f, -88.0f, 88.0f)
                lineTo(96.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(104.0f, 0.0f)
                curveToRelative(83.9f, 0.0f, 152.0f, -68.1f, 152.0f, -152.0f)
                lineToRelative(0.0f, -152.1f)
                curveTo(351.9f, 96.4f, 287.5f, 32.0f, 208.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                curveTo(80.5f, 32.0f, 16.0f, 96.5f, 16.0f, 176.0f)
                reflectiveCurveTo(80.5f, 320.0f, 160.0f, 320.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(288.0f, 176.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.8f, -80.0f, 80.0f, -80.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _number9!!
    }

private var _number9: ImageVector? = null
