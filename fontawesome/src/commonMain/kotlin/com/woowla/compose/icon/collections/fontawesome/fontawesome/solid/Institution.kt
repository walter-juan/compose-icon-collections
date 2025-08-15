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

public val SolidGroup.Institution: ImageVector
    get() {
        if (_institution != null) {
            return _institution!!
        }
        _institution = Builder(name = "Institution", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(271.9f, 20.2f)
                curveToRelative(-9.8f, -5.6f, -21.9f, -5.6f, -31.8f, 0.0f)
                lineToRelative(-224.0f, 128.0f)
                curveToRelative(-12.6f, 7.2f, -18.8f, 22.0f, -15.1f, 36.0f)
                reflectiveCurveTo(17.5f, 208.0f, 32.0f, 208.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-51.2f, 38.4f)
                curveTo(4.7f, 460.4f, 0.0f, 469.9f, 0.0f, 480.0f)
                curveTo(0.0f, 497.7f, 14.3f, 512.0f, 32.0f, 512.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -10.1f, -4.7f, -19.6f, -12.8f, -25.6f)
                lineToRelative(-51.2f, -38.4f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(14.5f, 0.0f, 27.2f, -9.8f, 30.9f, -23.8f)
                reflectiveCurveToRelative(-2.5f, -28.8f, -15.1f, -36.0f)
                lineToRelative(-224.0f, -128.0f)
                close()
                moveTo(400.0f, 208.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(288.0f, 208.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(176.0f, 208.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(256.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _institution!!
    }

private var _institution: ImageVector? = null
